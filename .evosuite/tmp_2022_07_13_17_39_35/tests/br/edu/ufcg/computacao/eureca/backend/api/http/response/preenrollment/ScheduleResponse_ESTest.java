/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 13 21:21:03 GMT 2022
 */

package br.edu.ufcg.computacao.eureca.backend.api.http.response.preenrollment;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import br.edu.ufcg.computacao.eureca.backend.api.http.response.preenrollment.ScheduleResponse;
import br.edu.ufcg.computacao.eureca.backend.core.models.ClassSchedule;
import br.edu.ufcg.computacao.eureca.backend.core.models.Schedule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Stack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ScheduleResponse_ESTest extends ScheduleResponse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ScheduleResponse scheduleResponse0 = new ScheduleResponse((String) null, (Schedule) null);
      String string0 = scheduleResponse0.getSubjectName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Stack<ClassSchedule> stack0 = new Stack<ClassSchedule>();
      Schedule schedule0 = new Schedule(0, "", stack0);
      ScheduleResponse scheduleResponse0 = new ScheduleResponse("", schedule0);
      String string0 = scheduleResponse0.getSubjectName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArrayList<ClassSchedule> arrayList0 = new ArrayList<ClassSchedule>();
      Schedule schedule0 = new Schedule(0, "y*%,rU:N!I1>g[!%h0", arrayList0);
      ScheduleResponse scheduleResponse0 = new ScheduleResponse("CharMatcher.ascii()", schedule0);
      Schedule schedule1 = scheduleResponse0.getSchedule();
      assertSame(schedule1, schedule0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ScheduleResponse scheduleResponse0 = new ScheduleResponse("", (Schedule) null);
      Schedule schedule0 = new Schedule((-1543), "", (Collection<ClassSchedule>) null);
      scheduleResponse0.setSchedule(schedule0);
      Schedule schedule1 = scheduleResponse0.getSchedule();
      assertEquals("", schedule1.getClassCode());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Schedule schedule0 = new Schedule(806, (String) null, (Collection<ClassSchedule>) null);
      ScheduleResponse scheduleResponse0 = new ScheduleResponse("", schedule0);
      ScheduleResponse scheduleResponse1 = new ScheduleResponse((String) null, schedule0);
      scheduleResponse0.setSubjectName((String) null);
      Schedule schedule1 = new Schedule(1866, "", (Collection<ClassSchedule>) null);
      scheduleResponse0.setSchedule(schedule1);
      // Undeclared exception!
      try { 
        scheduleResponse0.equals(scheduleResponse1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("br.edu.ufcg.computacao.eureca.backend.core.models.Schedule", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ScheduleResponse scheduleResponse0 = new ScheduleResponse("com.google.common.collect.Maps$EntryFunction", (Schedule) null);
      scheduleResponse0.setSubjectName("br.edu.ufcg.computacao.eureca.backend.api.http.response.preenrollment.ScheduleResponse");
      ScheduleResponse scheduleResponse1 = new ScheduleResponse("br.edu.ufcg.computacao.eureca.backend.api.http.response.preenrollment.ScheduleResponse", (Schedule) null);
      assertTrue(scheduleResponse1.equals((Object)scheduleResponse0));
      
      Schedule schedule0 = new Schedule(2034, "com.google.common.collect.Maps$EntryFunction", (Collection<ClassSchedule>) null);
      scheduleResponse1.setSchedule(schedule0);
      boolean boolean0 = scheduleResponse0.equals(scheduleResponse1);
      assertFalse(scheduleResponse1.equals((Object)scheduleResponse0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ScheduleResponse scheduleResponse0 = new ScheduleResponse((String) null, (Schedule) null);
      ScheduleResponse scheduleResponse1 = new ScheduleResponse((String) null, (Schedule) null);
      boolean boolean0 = scheduleResponse0.equals(scheduleResponse1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ScheduleResponse scheduleResponse0 = new ScheduleResponse("com.google.common.collect.Maps$EntryFunction", (Schedule) null);
      boolean boolean0 = scheduleResponse0.equals("br.edu.ufcg.computacao.eureca.backend.api.http.response.preenrollment.ScheduleResponse");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ScheduleResponse scheduleResponse0 = new ScheduleResponse("com.google.common.collect.Maps$EntryFunction", (Schedule) null);
      ScheduleResponse scheduleResponse1 = new ScheduleResponse((String) null, (Schedule) null);
      boolean boolean0 = scheduleResponse0.equals(scheduleResponse1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ScheduleResponse scheduleResponse0 = new ScheduleResponse("com.google.common.collect.Maps$EntryFunction", (Schedule) null);
      boolean boolean0 = scheduleResponse0.equals(scheduleResponse0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ScheduleResponse scheduleResponse0 = new ScheduleResponse("com.google.common.collect.Maps$EntryFunction", (Schedule) null);
      boolean boolean0 = scheduleResponse0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ScheduleResponse scheduleResponse0 = new ScheduleResponse("com.google.common.collect.Maps$EntryFunction", (Schedule) null);
      Schedule schedule0 = new Schedule(2034, "com.google.common.collect.Maps$EntryFunction", (Collection<ClassSchedule>) null);
      scheduleResponse0.setSchedule(schedule0);
      Schedule schedule1 = scheduleResponse0.getSchedule();
      assertEquals(2034, schedule1.getAvailability());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ScheduleResponse scheduleResponse0 = new ScheduleResponse("com.google.common.collect.Maps$EntryFunction", (Schedule) null);
      String string0 = scheduleResponse0.toString();
      assertEquals("ScheduleResponse{subjectName='com.google.common.collect.Maps$EntryFunction', schedule=null}", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ScheduleResponse scheduleResponse0 = new ScheduleResponse("com.google.common.collect.Maps$EntryFunction", (Schedule) null);
      scheduleResponse0.hashCode();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ScheduleResponse scheduleResponse0 = new ScheduleResponse("com.google.common.collect.Maps$EntryFunction", (Schedule) null);
      Schedule schedule0 = scheduleResponse0.getSchedule();
      assertNull(schedule0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ScheduleResponse scheduleResponse0 = new ScheduleResponse("The FileFilter must not be null", (Schedule) null);
      String string0 = scheduleResponse0.getSubjectName();
      assertEquals("The FileFilter must not be null", string0);
  }
}
