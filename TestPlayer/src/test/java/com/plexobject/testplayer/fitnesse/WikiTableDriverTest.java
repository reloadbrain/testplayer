package com.plexobject.testplayer.fitnesse;

import junit.framework.TestCase;
// JUnitDoclet begin import
import com.plexobject.testplayer.fitnesse.WikiTableDriver;
// JUnitDoclet end import

/**
* Generated by JUnitDoclet, a tool provided by
* ObjectFab GmbH under LGPL.
* Please see www.junitdoclet.org, www.gnu.org
* and www.objectfab.de for informations about
* the tool, the licence and the authors.
*/


public class WikiTableDriverTest
// JUnitDoclet begin extends_implements
extends TestCase
// JUnitDoclet end extends_implements
{
  // JUnitDoclet begin class
  com.plexobject.testplayer.fitnesse.WikiTableDriver wikitabledriver = null;
  // JUnitDoclet end class
  
  public WikiTableDriverTest(String name) {
    // JUnitDoclet begin method WikiTableDriverTest
    super(name);
    // JUnitDoclet end method WikiTableDriverTest
  }
  
  public com.plexobject.testplayer.fitnesse.WikiTableDriver createInstance() throws Exception {
    // JUnitDoclet begin method testcase.createInstance
    return new com.plexobject.testplayer.fitnesse.WikiTableDriver();
    // JUnitDoclet end method testcase.createInstance
  }
  
  protected void setUp() throws Exception {
    // JUnitDoclet begin method testcase.setUp
    super.setUp();
    wikitabledriver = createInstance();
    // JUnitDoclet end method testcase.setUp
  }
  
  protected void tearDown() throws Exception {
    // JUnitDoclet begin method testcase.tearDown
    wikitabledriver = null;
    super.tearDown();
    // JUnitDoclet end method testcase.tearDown
  }
  
  public void testTableToXml() throws Exception {
    // JUnitDoclet begin method tableToXml
    // JUnitDoclet end method tableToXml
  }
  
  public void testXmlToDocument() throws Exception {
    // JUnitDoclet begin method xmlToDocument
    // JUnitDoclet end method xmlToDocument
  }
  
  public void testCreateReader() throws Exception {
    // JUnitDoclet begin method createReader
    // JUnitDoclet end method createReader
  }
  
  public void testCreateWriter() throws Exception {
    // JUnitDoclet begin method createWriter
    // JUnitDoclet end method createWriter
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
    junit.textui.TestRunner.run(WikiTableDriverTest.class);
    // JUnitDoclet end method testcase.main
  }
}
