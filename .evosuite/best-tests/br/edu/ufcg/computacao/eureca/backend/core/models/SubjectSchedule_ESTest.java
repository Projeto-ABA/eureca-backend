/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 13 21:22:45 GMT 2022
 */

package br.edu.ufcg.computacao.eureca.backend.core.models;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import br.edu.ufcg.computacao.eureca.backend.core.models.ClassSchedule;
import br.edu.ufcg.computacao.eureca.backend.core.models.Schedule;
import br.edu.ufcg.computacao.eureca.backend.core.models.Subject;
import br.edu.ufcg.computacao.eureca.backend.core.models.SubjectSchedule;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SubjectSchedule_ESTest extends SubjectSchedule_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SubjectSchedule subjectSchedule0 = new SubjectSchedule((Subject) null, (Map<String, Schedule>) null);
      Subject subject0 = subjectSchedule0.getSubject();
      assertNull(subject0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      Subject subject0 = new Subject("WxM'`<-~DP|ZhE1.7d,", "", "WxM'`<-~DP|ZhE1.7d,", "", "", 1088, 1088, "", set0, 0, set0, set0);
      HashMap<String, Schedule> hashMap0 = new HashMap<String, Schedule>();
      SubjectSchedule subjectSchedule0 = new SubjectSchedule(subject0, hashMap0);
      Subject subject1 = subjectSchedule0.getSubject();
      assertEquals("WxM'`<-~DP|ZhE1.7d,", subject1.getCourseCode());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArrayList<String> arrayList0 = new ArrayList<String>();
      Subject subject0 = new Subject("br.edu.ufcg.computacao.eureca.backend.core.models.SubjectSchedule", (String) null, "", "", "", 0, 0, "x6-|:zAg", arrayList0, (-1974), arrayList0, arrayList0);
      HashMap<String, Schedule> hashMap0 = new HashMap<String, Schedule>();
      SubjectSchedule subjectSchedule0 = new SubjectSchedule(subject0, hashMap0);
      Subject subject1 = subjectSchedule0.getSubject();
      assertEquals("", subject1.getType());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Set<String> set0 = ZoneId.getAvailableZoneIds();
      Subject subject0 = new Subject("g0%_'qv2aJ6.~19T", "com.google.common.hash.BloomFilterStrategies", "", "g0%_'qv2aJ6.~19T", "7hv", 4718, 4718, "7hv", set0, 455, set0, set0);
      HashMap<String, Schedule> hashMap0 = new HashMap<String, Schedule>();
      SubjectSchedule subjectSchedule0 = new SubjectSchedule(subject0, hashMap0);
      Subject subject1 = subjectSchedule0.getSubject();
      assertEquals("com.google.common.hash.BloomFilterStrategies", subject1.getCurriculumCode());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SubjectSchedule subjectSchedule0 = new SubjectSchedule((Subject) null, (Map<String, Schedule>) null);
      Map<String, Schedule> map0 = subjectSchedule0.getSchedules();
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArrayList<String> arrayList0 = new ArrayList<String>();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Subject subject0 = new Subject("B&", "B&", "B&", "B&", "B&", 704, 704, "B&", arrayList0, 704, linkedHashSet0, linkedHashSet0);
      HashMap<String, Schedule> hashMap0 = new HashMap<String, Schedule>();
      TreeSet<ClassSchedule> treeSet0 = new TreeSet<ClassSchedule>();
      Schedule schedule0 = new Schedule(704, "B&", treeSet0);
      hashMap0.put("B&", schedule0);
      SubjectSchedule subjectSchedule0 = new SubjectSchedule(subject0, hashMap0);
      Map<String, Schedule> map0 = subjectSchedule0.getSchedules();
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      Subject subject0 = new Subject("WxM'`<-~DP|ZhE1.7d,", "", "WxM'`<-~DP|ZhE1.7d,", "", "", 1088, 1088, "", set0, 0, set0, set0);
      HashMap<String, Schedule> hashMap0 = new HashMap<String, Schedule>();
      Vector<ClassSchedule> vector0 = new Vector<ClassSchedule>();
      Schedule schedule0 = new Schedule(0, "", vector0);
      hashMap0.put("", schedule0);
      SubjectSchedule subjectSchedule0 = new SubjectSchedule(subject0, hashMap0);
      Schedule schedule1 = subjectSchedule0.getSchedule("");
      assertEquals("", schedule1.getClassCode());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<String, Schedule> hashMap0 = new HashMap<String, Schedule>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeSet<ClassSchedule> treeSet0 = new TreeSet<ClassSchedule>(comparator0);
      Schedule schedule0 = new Schedule(45, "DbL#", treeSet0);
      hashMap0.put("DbL#", schedule0);
      SubjectSchedule subjectSchedule0 = new SubjectSchedule((Subject) null, hashMap0);
      Schedule schedule1 = subjectSchedule0.getSchedule("DbL#");
      assertEquals(45, schedule1.getAvailability());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<String, Schedule> hashMap0 = new HashMap<String, Schedule>();
      SubjectSchedule subjectSchedule0 = new SubjectSchedule((Subject) null, hashMap0);
      Comparator<ClassSchedule> comparator0 = (Comparator<ClassSchedule>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeSet<ClassSchedule> treeSet0 = new TreeSet<ClassSchedule>(comparator0);
      Schedule schedule0 = new Schedule((-3635), "br.edu.ufcg.computacao.eureca.backend.core.models.SubjectSchedule", treeSet0);
      hashMap0.put("", schedule0);
      Schedule schedule1 = subjectSchedule0.getSchedule("");
      assertEquals("br.edu.ufcg.computacao.eureca.backend.core.models.SubjectSchedule", schedule1.getClassCode());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<String, Schedule> hashMap0 = new HashMap<String, Schedule>();
      SubjectSchedule subjectSchedule0 = new SubjectSchedule((Subject) null, hashMap0);
      Collection<Schedule> collection0 = subjectSchedule0.getAllSchedules();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Subject subject0 = new Subject(", schedules=", ", schedules=", ", schedules=", ", schedules=", "d|Ri/].T$+", (-372), 9, "kp", (Collection<String>) null, 0, (Collection<String>) null, (Collection<String>) null);
      SubjectSchedule subjectSchedule0 = new SubjectSchedule(subject0, (Map<String, Schedule>) null);
      // Undeclared exception!
      try { 
        subjectSchedule0.getSchedule((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("br.edu.ufcg.computacao.eureca.backend.core.models.SubjectSchedule", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SubjectSchedule subjectSchedule0 = new SubjectSchedule((Subject) null, (Map<String, Schedule>) null);
      // Undeclared exception!
      try { 
        subjectSchedule0.getClassCodes();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("br.edu.ufcg.computacao.eureca.backend.core.models.SubjectSchedule", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashMap<String, Schedule> hashMap0 = new HashMap<String, Schedule>();
      SubjectSchedule subjectSchedule0 = new SubjectSchedule((Subject) null, hashMap0);
      ArrayList<String> arrayList0 = new ArrayList<String>();
      Subject subject0 = new Subject((String) null, "5U?", "SubjectSchedule{subject=null, schedules={}}", "SubjectSchedule{subject=null, schedules={}}", "br.edu.ufcg.computacao.eureca.backend.core.models.SubjectSchedule", (-586), (-586), "", arrayList0, 0, arrayList0, arrayList0);
      SubjectSchedule subjectSchedule1 = new SubjectSchedule(subject0, hashMap0);
      // Undeclared exception!
      try { 
        subjectSchedule0.equals(subjectSchedule1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("br.edu.ufcg.computacao.eureca.backend.core.models.SubjectSchedule", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ArrayList<String> arrayList0 = new ArrayList<String>();
      Set<String> set0 = ZoneId.getAvailableZoneIds();
      Subject subject0 = new Subject("", "W'FY-m2Drg", "", "com.google.common.base.Functions$ConstantFunction", ", schedules=", 704, (-1043), "~qP<", arrayList0, 1076, set0, set0);
      HashMap<String, Schedule> hashMap0 = new HashMap<String, Schedule>();
      SubjectSchedule subjectSchedule0 = new SubjectSchedule(subject0, hashMap0);
      HashMap<String, Schedule> hashMap1 = new HashMap<String, Schedule>();
      hashMap1.put("", (Schedule) null);
      SubjectSchedule subjectSchedule1 = new SubjectSchedule(subject0, hashMap1);
      boolean boolean0 = subjectSchedule0.equals(subjectSchedule1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ArrayList<String> arrayList0 = new ArrayList<String>();
      Set<String> set0 = ZoneId.getAvailableZoneIds();
      Subject subject0 = new Subject("", "W'FY-m2Drg", "", "com.google.common.base.Functions$ConstantFunction", ", schedules=", 704, (-1043), "~qP<", arrayList0, 1076, set0, set0);
      HashMap<String, Schedule> hashMap0 = new HashMap<String, Schedule>();
      SubjectSchedule subjectSchedule0 = new SubjectSchedule(subject0, hashMap0);
      SubjectSchedule subjectSchedule1 = new SubjectSchedule(subject0, hashMap0);
      boolean boolean0 = subjectSchedule0.equals(subjectSchedule1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ArrayList<String> arrayList0 = new ArrayList<String>();
      Set<String> set0 = ZoneId.getAvailableZoneIds();
      Subject subject0 = new Subject("", "W'FY-m2Drg", "", "com.google.common.base.Functions$ConstantFunction", ", schedules=", 704, (-1043), "~qP<", arrayList0, 1076, set0, set0);
      HashMap<String, Schedule> hashMap0 = new HashMap<String, Schedule>();
      SubjectSchedule subjectSchedule0 = new SubjectSchedule(subject0, hashMap0);
      boolean boolean0 = subjectSchedule0.equals("~qP<");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Subject subject0 = new Subject((String) null, "yi|wZj[JG\"", "yi|wZj[JG\"", "|KGhCVT^%o", "yi|wZj[JG\"", 0, 0, "I}T>(+$9L4{s", (Collection<String>) null, 0, (Collection<String>) null, (Collection<String>) null);
      HashMap<String, Schedule> hashMap0 = new HashMap<String, Schedule>();
      SubjectSchedule subjectSchedule0 = new SubjectSchedule(subject0, hashMap0);
      boolean boolean0 = subjectSchedule0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ArrayList<String> arrayList0 = new ArrayList<String>();
      Set<String> set0 = ZoneId.getAvailableZoneIds();
      Subject subject0 = new Subject("", "W'FY-m2Drg", "", "com.google.common.base.Functions$ConstantFunction", ", schedules=", 704, (-1043), "~qP<", arrayList0, 1076, set0, set0);
      HashMap<String, Schedule> hashMap0 = new HashMap<String, Schedule>();
      SubjectSchedule subjectSchedule0 = new SubjectSchedule(subject0, hashMap0);
      boolean boolean0 = subjectSchedule0.equals(subjectSchedule0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Subject subject0 = new Subject("{_gs4'_}qC]", "{_gs4'_}qC]", "{_gs4'_}qC]", "{_gs4'_}qC]", "{_gs4'_}qC]", (-25), (-25), "{_gs4'_}qC]", linkedHashSet0, (-25), linkedHashSet0, linkedHashSet0);
      HashMap<String, Schedule> hashMap0 = new HashMap<String, Schedule>();
      SubjectSchedule subjectSchedule0 = new SubjectSchedule(subject0, hashMap0);
      Subject subject1 = new Subject("{_gs4'_}qC]", "SubjectSchedule{subject=Subject{courseCode='{_gs4'_}qC]', curriculumCode='{_gs4'_}qC]', subjectCode='{_gs4'_}qC]', academicUnit='{_gs4'_}qC]', type='{_gs4'_}qC]', credits=-25, hours=-25, name='{_gs4'_}qC]', equivalentCodesList=[], idealTerm=-25, preRequirementsList=[], coRequirementsList=[]}, schedules={}}", "{_gs4'_}qC]", "{_gs4'_}qC]", "{_gs4'_}qC]", (-25), (-25), "{_gs4'_}qC]", linkedHashSet0, (-25), linkedHashSet0, linkedHashSet0);
      SubjectSchedule subjectSchedule1 = new SubjectSchedule(subject1, hashMap0);
      boolean boolean0 = subjectSchedule0.equals(subjectSchedule1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Subject subject0 = new Subject("{_gs4'_}qC]", "{_gs4'_}qC]", "{_gs4'_}qC]", "{_gs4'_}qC]", "{_gs4'_}qC]", (-25), (-25), "{_gs4'_}qC]", linkedHashSet0, (-25), linkedHashSet0, linkedHashSet0);
      HashMap<String, Schedule> hashMap0 = new HashMap<String, Schedule>();
      SubjectSchedule subjectSchedule0 = new SubjectSchedule(subject0, hashMap0);
      Collection<String> collection0 = subjectSchedule0.getClassCodes();
      assertFalse(collection0.contains("{_gs4'_}qC]"));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ArrayList<String> arrayList0 = new ArrayList<String>();
      Set<String> set0 = ZoneId.getAvailableZoneIds();
      Subject subject0 = new Subject("", "W'FY-m2Drg", "", "com.google.common.base.Functions$ConstantFunction", ", schedules=", 704, (-1043), "~qP<", arrayList0, 1076, set0, set0);
      HashMap<String, Schedule> hashMap0 = new HashMap<String, Schedule>();
      SubjectSchedule subjectSchedule0 = new SubjectSchedule(subject0, hashMap0);
      subjectSchedule0.hashCode();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ArrayList<String> arrayList0 = new ArrayList<String>();
      Set<String> set0 = ZoneId.getAvailableZoneIds();
      Subject subject0 = new Subject("", "W'FY-m2Drg", "", "com.google.common.base.Functions$ConstantFunction", ", schedules=", 704, (-1043), "~qP<", arrayList0, 1076, set0, set0);
      HashMap<String, Schedule> hashMap0 = new HashMap<String, Schedule>();
      SubjectSchedule subjectSchedule0 = new SubjectSchedule(subject0, hashMap0);
      String string0 = subjectSchedule0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ArrayList<String> arrayList0 = new ArrayList<String>();
      Set<String> set0 = ZoneId.getAvailableZoneIds();
      Subject subject0 = new Subject("", "W'FY-m2Drg", "", "com.google.common.base.Functions$ConstantFunction", ", schedules=", 704, (-1043), "~qP<", arrayList0, 1076, set0, set0);
      HashMap<String, Schedule> hashMap0 = new HashMap<String, Schedule>();
      SubjectSchedule subjectSchedule0 = new SubjectSchedule(subject0, hashMap0);
      subjectSchedule0.setSchedules(hashMap0);
      assertTrue(hashMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ArrayList<String> arrayList0 = new ArrayList<String>();
      Set<String> set0 = ZoneId.getAvailableZoneIds();
      Subject subject0 = new Subject("", "W'FY-m2Drg", "", "com.google.common.base.Functions$ConstantFunction", ", schedules=", 704, (-1043), "~qP<", arrayList0, 1076, set0, set0);
      HashMap<String, Schedule> hashMap0 = new HashMap<String, Schedule>();
      SubjectSchedule subjectSchedule0 = new SubjectSchedule(subject0, hashMap0);
      Map<String, Schedule> map0 = subjectSchedule0.getSchedules();
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Subject subject0 = new Subject("{_gs4'_}qC]", "{_gs4'_}qC]", "{_gs4'_}qC]", "{_gs4'_}qC]", "{_gs4'_}qC]", (-25), (-25), "{_gs4'_}qC]", linkedHashSet0, (-25), linkedHashSet0, linkedHashSet0);
      HashMap<String, Schedule> hashMap0 = new HashMap<String, Schedule>();
      SubjectSchedule subjectSchedule0 = new SubjectSchedule(subject0, hashMap0);
      Subject subject1 = subjectSchedule0.getSubject();
      assertEquals("{_gs4'_}qC]", subject1.getType());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ArrayList<String> arrayList0 = new ArrayList<String>();
      Set<String> set0 = ZoneId.getAvailableZoneIds();
      Subject subject0 = new Subject("", "W'FY-m2Drg", "", "com.google.common.base.Functions$ConstantFunction", ", schedules=", 704, (-1043), "~qP<", arrayList0, 1076, set0, set0);
      HashMap<String, Schedule> hashMap0 = new HashMap<String, Schedule>();
      SubjectSchedule subjectSchedule0 = new SubjectSchedule(subject0, hashMap0);
      Schedule schedule0 = subjectSchedule0.getSchedule("~qP<");
      assertNull(schedule0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SubjectSchedule subjectSchedule0 = new SubjectSchedule((Subject) null, (Map<String, Schedule>) null);
      // Undeclared exception!
      try { 
        subjectSchedule0.getAllSchedules();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("br.edu.ufcg.computacao.eureca.backend.core.models.SubjectSchedule", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ArrayList<String> arrayList0 = new ArrayList<String>();
      Set<String> set0 = ZoneId.getAvailableZoneIds();
      Subject subject0 = new Subject("", "W'FY-m2Drg", "", "com.google.common.base.Functions$ConstantFunction", ", schedules=", 704, (-1043), "~qP<", arrayList0, 1076, set0, set0);
      HashMap<String, Schedule> hashMap0 = new HashMap<String, Schedule>();
      SubjectSchedule subjectSchedule0 = new SubjectSchedule(subject0, hashMap0);
      subjectSchedule0.setSubject(subject0);
      assertEquals("~qP<", subject0.getName());
  }
}
