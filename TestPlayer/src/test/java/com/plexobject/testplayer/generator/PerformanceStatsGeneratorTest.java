package com.plexobject.testplayer.generator;

import junit.framework.TestCase;
// JUnitDoclet begin import
import com.plexobject.testplayer.generator.PerformanceStatsGenerator;
// JUnitDoclet end import

/**
* Generated by JUnitDoclet, a tool provided by
* ObjectFab GmbH under LGPL.
* Please see www.junitdoclet.org, www.gnu.org
* and www.objectfab.de for informations about
* the tool, the licence and the authors.
*/


public class PerformanceStatsGeneratorTest
// JUnitDoclet begin extends_implements
extends TestCase
// JUnitDoclet end extends_implements
{
  // JUnitDoclet begin class
  com.plexobject.testplayer.generator.PerformanceStatsGenerator performancestatsgenerator = null;
  // JUnitDoclet end class
  
  public PerformanceStatsGeneratorTest(String name) {
    // JUnitDoclet begin method PerformanceStatsGeneratorTest
    super(name);
    // JUnitDoclet end method PerformanceStatsGeneratorTest
  }
  
  public com.plexobject.testplayer.generator.PerformanceStatsGenerator createInstance() throws Exception {
    // JUnitDoclet begin method testcase.createInstance
    return new com.plexobject.testplayer.generator.PerformanceStatsGenerator();
    // JUnitDoclet end method testcase.createInstance
  }
  
  protected void setUp() throws Exception {
    // JUnitDoclet begin method testcase.setUp
    super.setUp();
    performancestatsgenerator = createInstance();
    // JUnitDoclet end method testcase.setUp
  }
  
  protected void tearDown() throws Exception {
    // JUnitDoclet begin method testcase.tearDown
    performancestatsgenerator = null;
    super.tearDown();
    // JUnitDoclet end method testcase.tearDown
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
    junit.textui.TestRunner.run(PerformanceStatsGeneratorTest.class);
    // JUnitDoclet end method testcase.main
  }
}
