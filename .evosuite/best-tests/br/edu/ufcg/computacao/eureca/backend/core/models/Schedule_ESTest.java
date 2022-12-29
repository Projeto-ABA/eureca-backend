/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 13 21:21:03 GMT 2022
 */

package br.edu.ufcg.computacao.eureca.backend.core.models;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import br.edu.ufcg.computacao.eureca.backend.core.models.ClassSchedule;
import br.edu.ufcg.computacao.eureca.backend.core.models.Schedule;
import br.edu.ufcg.computacao.eureca.backend.core.models.WeekDay;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Schedule_ESTest extends Schedule_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ArrayList<ClassSchedule> arrayList0 = new ArrayList<ClassSchedule>();
      Schedule schedule0 = new Schedule(1, "~Pb_c$+Ce.?#$SG", arrayList0);
      schedule0.getSchedule();
      assertEquals(1, schedule0.getAvailability());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<ClassSchedule> linkedList0 = new LinkedList<ClassSchedule>();
      Schedule schedule0 = new Schedule((-1553), (String) null, linkedList0);
      schedule0.getClassCode();
      assertEquals((-1553), schedule0.getAvailability());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashSet<ClassSchedule> hashSet0 = new HashSet<ClassSchedule>();
      Schedule schedule0 = new Schedule(0, "S4 tpZV.{", hashSet0);
      schedule0.setClassCode("");
      schedule0.getClassCode();
      assertEquals(0, schedule0.getAvailability());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ArrayDeque<ClassSchedule> arrayDeque0 = new ArrayDeque<ClassSchedule>();
      Schedule schedule0 = new Schedule(70, "com.google.common.base.Predicates$ObjectPredicate", arrayDeque0);
      int int0 = schedule0.getAvailability();
      assertEquals(70, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashSet<ClassSchedule> hashSet0 = new HashSet<ClassSchedule>();
      Schedule schedule0 = new Schedule(0, "S4 tpZV.{", hashSet0);
      schedule0.decrementAvailability();
      int int0 = schedule0.getAvailability();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Schedule schedule0 = new Schedule(1, "", (Collection<ClassSchedule>) null);
      // Undeclared exception!
      try { 
        schedule0.haveConflict(schedule0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("br.edu.ufcg.computacao.eureca.backend.core.util.EurecaUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      TreeSet<ClassSchedule> treeSet0 = new TreeSet<ClassSchedule>(comparator0);
      Schedule schedule0 = new Schedule((-2917), "com.google.common.collect.DiscreteDomain$LongDomain", treeSet0);
      TreeSet<ClassSchedule> treeSet1 = new TreeSet<ClassSchedule>();
      Schedule schedule1 = new Schedule((-2917), "com.google.common.collect.DiscreteDomain$LongDomain", treeSet1);
      WeekDay weekDay0 = WeekDay.TUESDAY;
      ClassSchedule classSchedule0 = new ClassSchedule(weekDay0, "nI`~NtTy", "nI`~NtTy");
      treeSet0.add(classSchedule0);
      // Undeclared exception!
      try { 
        schedule1.haveConflict(schedule0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // br.edu.ufcg.computacao.eureca.backend.core.models.ClassSchedule cannot be cast to java.lang.Comparable
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Schedule schedule0 = new Schedule(0, "", (Collection<ClassSchedule>) null);
      schedule0.getSchedule();
      assertEquals(0, schedule0.getAvailability());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArrayList<ClassSchedule> arrayList0 = new ArrayList<ClassSchedule>();
      Schedule schedule0 = new Schedule(0, "Vk", arrayList0);
      WeekDay weekDay0 = WeekDay.WEDNESDAY;
      ClassSchedule classSchedule0 = new ClassSchedule(weekDay0, "Vk", "Vk");
      arrayList0.add(0, classSchedule0);
      boolean boolean0 = schedule0.haveConflict(schedule0);
      assertEquals(0, schedule0.getAvailability());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Schedule schedule0 = new Schedule((-2313), (String) null, (Collection<ClassSchedule>) null);
      Schedule schedule1 = new Schedule((-2313), "7Oa", (Collection<ClassSchedule>) null);
      // Undeclared exception!
      try { 
        schedule0.equals(schedule1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("br.edu.ufcg.computacao.eureca.backend.core.models.Schedule", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Schedule schedule0 = new Schedule(50, "f", (Collection<ClassSchedule>) null);
      boolean boolean0 = schedule0.equals((Object) null);
      assertEquals(50, schedule0.getAvailability());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Schedule schedule0 = new Schedule((-2313), (String) null, (Collection<ClassSchedule>) null);
      boolean boolean0 = schedule0.equals(schedule0);
      assertTrue(boolean0);
      assertEquals((-2313), schedule0.getAvailability());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ArrayList<ClassSchedule> arrayList0 = new ArrayList<ClassSchedule>();
      Schedule schedule0 = new Schedule(0, "Vk", arrayList0);
      Object object0 = new Object();
      boolean boolean0 = schedule0.equals(object0);
      assertFalse(boolean0);
      assertEquals(0, schedule0.getAvailability());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ArrayList<ClassSchedule> arrayList0 = new ArrayList<ClassSchedule>();
      Schedule schedule0 = new Schedule(0, "Vk", arrayList0);
      int int0 = schedule0.getAvailability();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ArrayList<ClassSchedule> arrayList0 = new ArrayList<ClassSchedule>();
      Schedule schedule0 = new Schedule(0, "Vk", arrayList0);
      schedule0.hashCode();
      assertEquals(0, schedule0.getAvailability());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ArrayList<ClassSchedule> arrayList0 = new ArrayList<ClassSchedule>();
      Schedule schedule0 = new Schedule(0, "Vk", arrayList0);
      schedule0.setAvailability(0);
      assertEquals(0, schedule0.getAvailability());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ArrayList<ClassSchedule> arrayList0 = new ArrayList<ClassSchedule>();
      Schedule schedule0 = new Schedule(0, "Vk", arrayList0);
      schedule0.getClassCode();
      assertEquals(0, schedule0.getAvailability());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Schedule schedule0 = new Schedule((-2313), (String) null, (Collection<ClassSchedule>) null);
      schedule0.setSchedule((Collection<ClassSchedule>) null);
      assertEquals((-2313), schedule0.getAvailability());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ArrayList<ClassSchedule> arrayList0 = new ArrayList<ClassSchedule>();
      Schedule schedule0 = new Schedule(0, "Vk", arrayList0);
      boolean boolean0 = schedule0.haveConflict(schedule0);
      assertEquals(0, schedule0.getAvailability());
      assertFalse(boolean0);
  }
}