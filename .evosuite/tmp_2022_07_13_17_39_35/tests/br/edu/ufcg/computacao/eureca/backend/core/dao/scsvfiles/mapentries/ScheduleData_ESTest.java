/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 13 21:24:36 GMT 2022
 */

package br.edu.ufcg.computacao.eureca.backend.core.dao.scsvfiles.mapentries;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import br.edu.ufcg.computacao.eureca.backend.core.dao.scsvfiles.mapentries.ScheduleData;
import br.edu.ufcg.computacao.eureca.backend.core.dao.scsvfiles.mapentries.ScheduleKey;
import br.edu.ufcg.computacao.eureca.backend.core.models.Schedule;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ScheduleData_ESTest extends ScheduleData_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ScheduleData scheduleData0 = new ScheduleData();
      scheduleData0.setSchedule("\"wtlJUy");
      String string0 = scheduleData0.getSchedule();
      assertEquals("\"wtlJUy", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Integer integer0 = new Integer(0);
      ScheduleData scheduleData0 = new ScheduleData(integer0, "");
      String string0 = scheduleData0.getSchedule();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ScheduleData scheduleData0 = new ScheduleData();
      Integer integer0 = new Integer(0);
      scheduleData0.setAvailability(integer0);
      Integer integer1 = scheduleData0.getAvailability();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ScheduleData scheduleData0 = new ScheduleData();
      Integer integer0 = new Integer(42);
      scheduleData0.setAvailability(integer0);
      Integer integer1 = scheduleData0.getAvailability();
      assertEquals(42, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Integer integer0 = new Integer((-3142));
      ScheduleData scheduleData0 = new ScheduleData(integer0, "");
      Integer integer1 = scheduleData0.getAvailability();
      assertEquals((-3142), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ScheduleData scheduleData0 = new ScheduleData();
      Integer integer0 = new Integer(0);
      scheduleData0.setAvailability(integer0);
      scheduleData0.setSchedule("@]ZO-C|>-tn>Cx");
      ScheduleKey scheduleKey0 = new ScheduleKey();
      Schedule schedule0 = scheduleData0.createSchedule(scheduleKey0);
      assertEquals(0, schedule0.getAvailability());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Integer integer0 = new Integer(5429);
      ScheduleData scheduleData0 = new ScheduleData(integer0, "");
      Integer integer1 = new Integer((-692));
      scheduleData0.setAvailability(integer1);
      scheduleData0.setSchedule(",");
      ScheduleKey scheduleKey0 = new ScheduleKey("@ya)e`e-o}l", "br.edu.ufcg.computacao.eureca.backend.core.dao.scsvfiles.mapentries.ScheduleKey", "@ya)e`e-o}l", "br.edu.ufcg.computacao.eureca.backend.core.dao.scsvfiles.mapentries.ScheduleKey", "DX\"bx *W7vJi9Qd");
      Schedule schedule0 = scheduleData0.createSchedule(scheduleKey0);
      assertEquals((-692), schedule0.getAvailability());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ScheduleData scheduleData0 = new ScheduleData();
      scheduleData0.setSchedule("\"wtlJUy");
      Integer integer0 = new Integer(0);
      scheduleData0.setAvailability(integer0);
      ScheduleKey scheduleKey0 = new ScheduleKey();
      // Undeclared exception!
      try { 
        scheduleData0.createSchedule(scheduleKey0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("br.edu.ufcg.computacao.eureca.backend.core.dao.scsvfiles.mapentries.ScheduleData", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ScheduleData scheduleData0 = new ScheduleData();
      String string0 = scheduleData0.getSchedule();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ScheduleData scheduleData0 = new ScheduleData();
      Integer integer0 = new Integer(42);
      scheduleData0.setAvailability(integer0);
      scheduleData0.setSchedule("@]|O-C|n-ts/>Cx");
      ScheduleKey scheduleKey0 = new ScheduleKey("@]|O-C|n-ts/>Cx", "@]|O-C|n-ts/>Cx", "@]|O-C|n-ts/>Cx", "@]|O-C|n-ts/>Cx", "@]|O-C|n-ts/>Cx");
      Schedule schedule0 = scheduleData0.createSchedule(scheduleKey0);
      assertEquals("@]|O-C|n-ts/>Cx", schedule0.getClassCode());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ScheduleData scheduleData0 = new ScheduleData();
      ScheduleKey scheduleKey0 = new ScheduleKey("@]|O-C|n-ts/>Cx", "@]|O-C|n-ts/>Cx", "@]|O-C|n-ts/>Cx", "@]|O-C|n-ts/>Cx", "@]|O-C|n-ts/>Cx");
      // Undeclared exception!
      try { 
        scheduleData0.createSchedule(scheduleKey0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("br.edu.ufcg.computacao.eureca.backend.core.dao.scsvfiles.mapentries.ScheduleData", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ScheduleData scheduleData0 = new ScheduleData();
      Integer integer0 = scheduleData0.getAvailability();
      assertNull(integer0);
  }
}