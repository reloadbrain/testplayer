package com.plexobject.testplayer.events;

import com.plexobject.testplayer.ApplicationContext;
import com.plexobject.testplayer.events.MethodPluginDispatcher;
import junit.framework.TestCase;

/**
 * Generated by JUnitDoclet, a tool provided by ObjectFab GmbH under LGPL. Please see www.junitdoclet.org, www.gnu.org and www.objectfab.de for informations about the tool, the licence and the authors.
 */


public class MethodPluginDispatcherTest
// JUnitDoclet begin extends_implements
extends TestCase
// JUnitDoclet end extends_implements
{
  // JUnitDoclet begin class
  com.plexobject.testplayer.events.MethodPluginDispatcher methodplugindispatcher = null;
  // JUnitDoclet end class
  
  public MethodPluginDispatcherTest(String name) {
    // JUnitDoclet begin method MethodPluginDispatcherTest
    super(name);
    // JUnitDoclet end method MethodPluginDispatcherTest
  }
  
  public com.plexobject.testplayer.events.MethodPluginDispatcher createInstance() throws Exception {
    // JUnitDoclet begin method testcase.createInstance
    return new com.plexobject.testplayer.events.MethodPluginDispatcher(new ApplicationContext());
    // JUnitDoclet end method testcase.createInstance
  }
  
  protected void setUp() throws Exception {
    // JUnitDoclet begin method testcase.setUp
    super.setUp();
    methodplugindispatcher = createInstance();
    // JUnitDoclet end method testcase.setUp
  }
  
  protected void tearDown() throws Exception {
    // JUnitDoclet begin method testcase.tearDown
    methodplugindispatcher = null;
    super.tearDown();
    // JUnitDoclet end method testcase.tearDown
  }
  
  public void testNotifyCall() throws Exception {
    // JUnitDoclet begin method notifyCall
    // JUnitDoclet end method notifyCall
  }
  
  public void testAddPlugin() throws Exception {
    // JUnitDoclet begin method addPlugin
    // JUnitDoclet end method addPlugin
  }
  
  public void testRemovePlugin() throws Exception {
    // JUnitDoclet begin method removePlugin
    // JUnitDoclet end method removePlugin
  }
  
  public void testCancel() throws Exception {
    // JUnitDoclet begin method cancel
    // JUnitDoclet end method cancel
  }
  
  public void testRun() throws Exception {
    // JUnitDoclet begin method run
    // JUnitDoclet end method run
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
    junit.textui.TestRunner.run(MethodPluginDispatcherTest.class);
    // JUnitDoclet end method testcase.main
  }
}
