package com.plexobject.testplayer.marshal;

import junit.framework.TestCase;
// JUnitDoclet begin import
import com.plexobject.testplayer.marshal.XStreamMarshaller;
// JUnitDoclet end import

/**
* Generated by JUnitDoclet, a tool provided by
* ObjectFab GmbH under LGPL.
* Please see www.junitdoclet.org, www.gnu.org
* and www.objectfab.de for informations about
* the tool, the licence and the authors.
*/


public class XStreamMarshallerTest
// JUnitDoclet begin extends_implements
extends TestCase
// JUnitDoclet end extends_implements
{
  // JUnitDoclet begin class
  com.plexobject.testplayer.marshal.XStreamMarshaller xstreammarshaller = null;
  // JUnitDoclet end class
  
  public XStreamMarshallerTest(String name) {
    // JUnitDoclet begin method XStreamMarshallerTest
    super(name);
    // JUnitDoclet end method XStreamMarshallerTest
  }
  
  public com.plexobject.testplayer.marshal.XStreamMarshaller createInstance() throws Exception {
    // JUnitDoclet begin method testcase.createInstance
    return new com.plexobject.testplayer.marshal.XStreamMarshaller();
    // JUnitDoclet end method testcase.createInstance
  }
  
  protected void setUp() throws Exception {
    // JUnitDoclet begin method testcase.setUp
    super.setUp();
    xstreammarshaller = createInstance();
    // JUnitDoclet end method testcase.setUp
  }
  
  protected void tearDown() throws Exception {
    // JUnitDoclet begin method testcase.tearDown
    xstreammarshaller = null;
    super.tearDown();
    // JUnitDoclet end method testcase.tearDown
  }
  
  public void testMarshal() throws Exception {
    // JUnitDoclet begin method marshal
    // JUnitDoclet end method marshal
  }
  
  public void testUnmarshal() throws Exception {
    // JUnitDoclet begin method unmarshal
    // JUnitDoclet end method unmarshal
  }
  
  
  
  /**
  * JUnitDoclet moves marker to this method, if there is not match
  * for them in the regenerated code and if the marker is not empty.
  * This way, no test gets lost when regenerating after renaming.
  * Method testVault is supposed to be empty.
  */
  public void testVault() throws Exception {
    // JUnitDoclet begin method testcase.testVault
    // JUnitDoclet end method testcase.testVault
  }
  
  public static void main(String[] args) {
    // JUnitDoclet begin method testcase.main
    junit.textui.TestRunner.run(XStreamMarshallerTest.class);
    // JUnitDoclet end method testcase.main
  }
}
