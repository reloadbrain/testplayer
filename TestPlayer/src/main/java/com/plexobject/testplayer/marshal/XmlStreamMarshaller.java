/* ===========================================================================
 * $RCS$
 * Version: $Id: XmlStreamMarshaller.java,v 2.4 2007/07/11 13:53:46 shahzad Exp $
 * ===========================================================================
 *
 * TestPlayer - an automated test harness builder
 *
 * Copyright (c) 2005-2006 Shahzad Bhatti (bhatti@plexobject.com)
 *
 * This program is free software; you can redistribute it and/or modify 
 * it under the terms of the GNU General Public License as published by 
 * the Free Software Foundation; either version 2 of the License, or 
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the 
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License 
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 * The author may be contacted at bhatti@plexobject.com 
 * See http://testplayer.dev.java.net/ for more details.
 *
 */

package com.plexobject.testplayer.marshal;
import com.plexobject.testplayer.tree.*;
import java.io.*;
import java.text.*;
import java.util.*;
import java.beans.*;
import java.lang.reflect.*;

/**
 * This class marshals and unmarshals java objects
 *
 * @author shahzad bhatti
 *
 * modification history
 * date         who             what
 * 1/11/06      SB              created.
 */
public class XmlStreamMarshaller implements IMarshaller {
  /**
   * marshal - serializes object into String
   * @param object - object to serialize
   * @return stringified serialization in XML format 
   */
  public String marshal(Object object) {
    try {
      ByteArrayOutputStream out = new ByteArrayOutputStream(512);
      XMLEncoder oout = new XMLEncoder(out);
      oout.writeObject(object);
      oout.close();
      String str = out.toString();
      StringBuilder sb = new StringBuilder();
      for (int i=0; i<str.length(); i++) {
        char ch = str.charAt(i);
        if (Character.isWhitespace(ch)) sb.append(' ');
        else if (ch == '"') sb.append("\\\"");
        else sb.append(ch);
      }
      return sb.toString();
    } catch (RuntimeException e) {
      throw e;
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  } 

  /**
   * marshal - deserializes string into object 
   * @param stringified serialization in XML format 
   * @return object - object 
   */
  public Object unmarshal(String xml) {
    try {
      //
      ByteArrayInputStream in = new ByteArrayInputStream(xml.getBytes());
      XMLDecoder iin = new XMLDecoder(in);
      return iin.readObject();
    } catch (RuntimeException e) {
      throw e;
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  } 
}
