package com.plexobject.testplayer.fitnesse;

import junit.framework.TestCase;
// JUnitDoclet begin import
import com.plexobject.testplayer.fitnesse.PointableWriter;
// JUnitDoclet end import

/**
* Generated by JUnitDoclet, a tool provided by
* ObjectFab GmbH under LGPL.
* Please see www.junitdoclet.org, www.gnu.org
* and www.objectfab.de for informations about
* the tool, the licence and the authors.
*/


public class PointableWriterTest
// JUnitDoclet begin extends_implements
extends TestCase
// JUnitDoclet end extends_implements
{
  // JUnitDoclet begin class
  com.plexobject.testplayer.fitnesse.PointableWriter pointablewriter = null;
  // JUnitDoclet end class
  
  public PointableWriterTest(String name) {
    // JUnitDoclet begin method PointableWriterTest
    super(name);
    // JUnitDoclet end method PointableWriterTest
  }
  
  public com.plexobject.testplayer.fitnesse.PointableWriter createInstance() throws Exception {
    // JUnitDoclet begin method testcase.createInstance
    return new com.plexobject.testplayer.fitnesse.PointableWriter();
    // JUnitDoclet end method testcase.createInstance
  }
  
  protected void setUp() throws Exception {
    // JUnitDoclet begin method testcase.setUp
    super.setUp();
    pointablewriter = createInstance();
    // JUnitDoclet end method testcase.setUp
  }
  
  protected void tearDown() throws Exception {
    // JUnitDoclet begin method testcase.tearDown
    pointablewriter = null;
    super.tearDown();
    // JUnitDoclet end method testcase.tearDown
  }
  
  public void testSetGetPointer() throws Exception {
    // JUnitDoclet begin method setPointer getPointer
    int[] tests = {Integer.MIN_VALUE, -1, 0, 1, Integer.MAX_VALUE};
    
    for (int i = 0; i < tests.length; i++) {
      pointablewriter.setPointer(tests[i]);
      assertEquals(tests[i], pointablewriter.getPointer());
    }
    // JUnitDoclet end method setPointer getPointer
  }
  
  public void testSubstring() throws Exception {
    // JUnitDoclet begin method substring
    // JUnitDoclet end method substring
  }
  
  public void testWrite() throws Exception {
    // JUnitDoclet begin method write
    // JUnitDoclet end method write
  }
  
  public void testFlush() throws Exception {
    // JUnitDoclet begin method flush
    // JUnitDoclet end method flush
  }
  
  public void testClose() throws Exception {
    // JUnitDoclet begin method close
    // JUnitDoclet end method close
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
    junit.textui.TestRunner.run(PointableWriterTest.class);
    // JUnitDoclet end method testcase.main
  }
}
