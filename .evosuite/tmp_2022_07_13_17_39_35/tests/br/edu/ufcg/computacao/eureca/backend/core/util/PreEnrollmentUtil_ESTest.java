/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 13 20:44:56 GMT 2022
 */

package br.edu.ufcg.computacao.eureca.backend.core.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import br.edu.ufcg.computacao.eureca.backend.core.models.ClassSchedule;
import br.edu.ufcg.computacao.eureca.backend.core.models.Curriculum;
import br.edu.ufcg.computacao.eureca.backend.core.models.Schedule;
import br.edu.ufcg.computacao.eureca.backend.core.models.StudentCurriculumProgress;
import br.edu.ufcg.computacao.eureca.backend.core.models.Subject;
import br.edu.ufcg.computacao.eureca.backend.core.models.SubjectSchedule;
import br.edu.ufcg.computacao.eureca.backend.core.models.SubjectType;
import br.edu.ufcg.computacao.eureca.backend.core.util.PreEnrollmentUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PreEnrollmentUtil_ESTest extends PreEnrollmentUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int int0 = PreEnrollmentUtil.getNextTerm(9, 0, 9);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Curriculum curriculum0 = new Curriculum((String) null, (String) null, arrayList0, arrayList0, arrayList0, arrayList0, arrayList0, 2483, (-3837), (-1787), 1, 1342, 1548, 2483, 68, (-1), (-1787), linkedHashSet0, linkedHashSet0, linkedHashSet0, linkedHashSet0, linkedHashSet0);
      Integer integer0 = new Integer(1463);
      arrayList0.add(integer0);
      Integer integer1 = new Integer(3612);
      Map<SubjectType, Integer> map0 = PreEnrollmentUtil.getIdealCreditsPerSubjectType(curriculum0, integer1, 1);
      assertEquals(4, map0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer(68);
      arrayList0.add(integer0);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Curriculum curriculum0 = new Curriculum((String) null, (String) null, arrayList0, arrayList0, arrayList0, arrayList0, arrayList0, 2483, (-3837), (-1787), 1, 1342, 1548, 2483, 68, (-1), (-1787), linkedHashSet0, linkedHashSet0, linkedHashSet0, linkedHashSet0, linkedHashSet0);
      Integer integer1 = new Integer(3612);
      Map<SubjectType, Integer> map0 = PreEnrollmentUtil.getIdealCreditsPerSubjectType(curriculum0, integer1, 1);
      assertEquals(4, map0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer(8202);
      arrayList0.add(integer0);
      Curriculum curriculum0 = new Curriculum("4X3nSP", "4X3nSP", arrayList0, arrayList0, arrayList0, arrayList0, arrayList0, 8202, 18, 8202, 18, 18, 8202, 8202, 8202, 8202, (-16), (Collection<String>) null, (Collection<String>) null, (Collection<String>) null, (Collection<String>) null, (Collection<String>) null);
      Integer integer1 = new Integer(171);
      Map<SubjectType, Integer> map0 = PreEnrollmentUtil.getIdealCreditsPerSubjectType(curriculum0, integer1, 1);
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PriorityQueue<String> priorityQueue0 = new PriorityQueue<String>();
      Subject subject0 = new Subject(", maxNumberOfEnrolledCredits=", "br.edu.ufcg.computacao.eureca.backend.core.util.PreEnrollmentUtil", "", ", maxNumberOfEnrolledCredits=", "Funnels.byteArrayFunnel()", 65535, 41, "br.edu.ufcg.computacao.eureca.backend.core.util.PreEnrollmentUtil", priorityQueue0, 0, priorityQueue0, priorityQueue0);
      HashMap<String, Schedule> hashMap0 = new HashMap<String, Schedule>();
      SubjectSchedule subjectSchedule0 = new SubjectSchedule(subject0, hashMap0);
      TreeSet<ClassSchedule> treeSet0 = new TreeSet<ClassSchedule>();
      Schedule schedule0 = new Schedule(0, "Seg", treeSet0);
      hashMap0.put("@EPn6{,r{-M2:EbUvTg", schedule0);
      StudentCurriculumProgress studentCurriculumProgress0 = new StudentCurriculumProgress(40, (-1290), (-1545), 2965, 40);
      PreEnrollmentUtil.sanitizeSubject("Funnels.byteArrayFunnel()", "Funnels.byteArrayFunnel()", subjectSchedule0, studentCurriculumProgress0);
      assertEquals(40, studentCurriculumProgress0.getEnrolledCredits());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PriorityQueue<SubjectSchedule> priorityQueue0 = new PriorityQueue<SubjectSchedule>();
      HashSet<String> hashSet0 = new HashSet<String>();
      Subject subject0 = new Subject((String) null, "AP:)l1sxfU", (String) null, "V~8<=jqyQg@7d{:", (String) null, 962, 0, "AP:)l1sxfU", hashSet0, 0, hashSet0, hashSet0);
      SubjectSchedule subjectSchedule0 = new SubjectSchedule(subject0, (Map<String, Schedule>) null);
      priorityQueue0.add(subjectSchedule0);
      int int0 = PreEnrollmentUtil.getSubjectCreditsSum(priorityQueue0);
      assertEquals(962, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = PreEnrollmentUtil.getNextTerm(0, 3254, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      PriorityQueue<String> priorityQueue0 = new PriorityQueue<String>();
      Curriculum curriculum0 = new Curriculum("XW=&q9BhSoZ5_", "XW=&q9BhSoZ5_", arrayList0, arrayList0, arrayList0, arrayList0, arrayList0, (-2405), (-1865), (-1865), (-1865), (-1865), 0, (-2405), 8233, (-1865), 8233, priorityQueue0, priorityQueue0, priorityQueue0, priorityQueue0, priorityQueue0);
      StudentCurriculumProgress studentCurriculumProgress0 = new StudentCurriculumProgress(8233, 623, 0, (-2405), (-169));
      int int0 = PreEnrollmentUtil.getActualTerm(curriculum0, studentCurriculumProgress0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<String, Schedule> hashMap0 = new HashMap<String, Schedule>();
      SubjectSchedule subjectSchedule0 = new SubjectSchedule((Subject) null, hashMap0);
      // Undeclared exception!
      try { 
        PreEnrollmentUtil.sanitizeSubject("com.google.common.collect.FilteredEntryMultimap$Keys", "", subjectSchedule0, (StudentCurriculumProgress) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("br.edu.ufcg.computacao.eureca.backend.core.util.PreEnrollmentUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArrayList<SubjectSchedule> arrayList0 = new ArrayList<SubjectSchedule>();
      arrayList0.add((SubjectSchedule) null);
      SubjectType subjectType0 = SubjectType.OPTIONAL;
      // Undeclared exception!
      try { 
        PreEnrollmentUtil.getSubjectsPerTerm(arrayList0, subjectType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("br.edu.ufcg.computacao.eureca.backend.core.util.PreEnrollmentUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Vector<SubjectSchedule> vector0 = new Vector<SubjectSchedule>();
      vector0.add((SubjectSchedule) null);
      // Undeclared exception!
      try { 
        PreEnrollmentUtil.getSubjectCreditsSum(vector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("br.edu.ufcg.computacao.eureca.backend.core.util.PreEnrollmentUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        PreEnrollmentUtil.getIdealCreditsPerSubjectType((Curriculum) null, integer0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("br.edu.ufcg.computacao.eureca.backend.core.util.PreEnrollmentUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Curriculum curriculum0 = new Curriculum("=}YDFDV$=L$a", "=}YDFDV$=L$a", arrayList0, arrayList0, arrayList0, arrayList0, arrayList0, 0, 0, 0, (-263), 0, (-2750), (-2750), (-2750), 32, 0, (Collection<String>) null, (Collection<String>) null, (Collection<String>) null, (Collection<String>) null, (Collection<String>) null);
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        PreEnrollmentUtil.getIdealCreditsPerSubjectType(curriculum0, integer0, 1735);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1734, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>(3719);
      Locale locale0 = Locale.KOREA;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      Curriculum curriculum0 = new Curriculum("vkG j17-~'0~", "'G", arrayList0, arrayList0, arrayList0, arrayList0, arrayList0, 0, 0, (-542), 1583, 3719, 0, 1583, 0, 1, 1583, set0, set0, set0, set0, set0);
      Integer integer0 = new Integer((-542));
      // Undeclared exception!
      try { 
        PreEnrollmentUtil.getIdealCreditsPerSubjectType(curriculum0, integer0, (-1683));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1684
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StudentCurriculumProgress studentCurriculumProgress0 = new StudentCurriculumProgress((-4601), (-4601), (-4601), 0, (-4601));
      // Undeclared exception!
      try { 
        PreEnrollmentUtil.getActualTerm((Curriculum) null, studentCurriculumProgress0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("br.edu.ufcg.computacao.eureca.backend.core.util.PreEnrollmentUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedList<SubjectSchedule> linkedList0 = new LinkedList<SubjectSchedule>();
      // Undeclared exception!
      try { 
        PreEnrollmentUtil.excludeUnavailableSubjects((Collection<SubjectSchedule>) null, linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("br.edu.ufcg.computacao.eureca.backend.core.util.EurecaUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashMap<String, Schedule> hashMap0 = new HashMap<String, Schedule>();
      HashSet<SubjectSchedule> hashSet0 = new HashSet<SubjectSchedule>();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Subject subject0 = new Subject("-=", "", "Br", "", "Cf!c4CTUZ.Az", 8232, (-2477), "", linkedList0, 3552, linkedList0, linkedList0);
      SubjectSchedule subjectSchedule0 = new SubjectSchedule(subject0, hashMap0);
      hashSet0.add(subjectSchedule0);
      TreeSet<SubjectSchedule> treeSet0 = new TreeSet<SubjectSchedule>();
      // Undeclared exception!
      try { 
        PreEnrollmentUtil.excludeUnavailableSubjects(hashSet0, treeSet0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = PreEnrollmentUtil.getNextTerm((-263), 4445, 0);
      assertEquals((-262), int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int int0 = PreEnrollmentUtil.getNextTerm((-2750), (-2750), 1187);
      assertEquals((-2750), int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Curriculum curriculum0 = new Curriculum((String) null, (String) null, arrayList0, arrayList0, arrayList0, arrayList0, arrayList0, 2483, 18, (-1787), 1, 1342, 1548, 2483, 68, (-1), (-1787), linkedHashSet0, linkedHashSet0, linkedHashSet0, linkedHashSet0, linkedHashSet0);
      Integer integer0 = new Integer(3612);
      arrayList0.add(integer0);
      StudentCurriculumProgress studentCurriculumProgress0 = new StudentCurriculumProgress(1342, 1342, 1023, 18, 2222);
      int int0 = PreEnrollmentUtil.getActualTerm(curriculum0, studentCurriculumProgress0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Curriculum curriculum0 = new Curriculum("O", "O", arrayList0, arrayList0, arrayList0, arrayList0, arrayList0, 2483, 18, (-1787), 1, 1342, 1342, 2483, 68, 639, (-1787), linkedHashSet0, linkedHashSet0, linkedHashSet0, linkedHashSet0, linkedHashSet0);
      Integer integer0 = new Integer((-2686));
      arrayList0.add(integer0);
      StudentCurriculumProgress studentCurriculumProgress0 = new StudentCurriculumProgress(2376, 639, (-1547), 742, (-1355));
      // Undeclared exception!
      try { 
        PreEnrollmentUtil.getActualTerm(curriculum0, studentCurriculumProgress0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Curriculum curriculum0 = new Curriculum("=}YDFDV$=L$a", "=}YDFDV$=L$a", arrayList0, arrayList0, arrayList0, arrayList0, arrayList0, 0, 0, 0, (-263), 0, (-2750), (-2750), (-2750), 32, 0, (Collection<String>) null, (Collection<String>) null, (Collection<String>) null, (Collection<String>) null, (Collection<String>) null);
      StudentCurriculumProgress studentCurriculumProgress0 = new StudentCurriculumProgress((-2750), 32, 0, 0, (-1));
      int int0 = PreEnrollmentUtil.getActualTerm(curriculum0, studentCurriculumProgress0);
      assertEquals((-2750), int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Curriculum curriculum0 = new Curriculum((String) null, (String) null, arrayList0, arrayList0, arrayList0, arrayList0, arrayList0, 2483, (-3815), (-2686), (-3815), (-3815), 1548, 2483, 68, (-1), (-2686), linkedHashSet0, linkedHashSet0, linkedHashSet0, linkedHashSet0, linkedHashSet0);
      Integer integer0 = new Integer((-89));
      arrayList0.add(integer0);
      Map<SubjectType, Integer> map0 = PreEnrollmentUtil.getIdealCreditsPerSubjectType(curriculum0, (Integer) null, 1);
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PriorityQueue<String> priorityQueue0 = new PriorityQueue<String>();
      Subject subject0 = new Subject("Funnels.byteArrayFunnel()", "Funnels.byteArrayFunnel()", "Funnels.byteArrayFunnel()", "Funnels.byteArrayFunnel()", "Funnels.byteArrayFunnel()", 9, 9, "Funnels.byteArrayFunnel()", priorityQueue0, 9, priorityQueue0, priorityQueue0);
      HashMap<String, Schedule> hashMap0 = new HashMap<String, Schedule>();
      SubjectSchedule subjectSchedule0 = new SubjectSchedule(subject0, hashMap0);
      TreeSet<ClassSchedule> treeSet0 = new TreeSet<ClassSchedule>();
      Schedule schedule0 = new Schedule(9, "Funnels.byteArrayFunnel()", treeSet0);
      hashMap0.put("Funnels.byteArrayFunnel()", schedule0);
      StudentCurriculumProgress studentCurriculumProgress0 = new StudentCurriculumProgress(9, 9, 9, 9, 9);
      PreEnrollmentUtil.sanitizeSubject("Funnels.byteArrayFunnel()", "Funnels.byteArrayFunnel()", subjectSchedule0, studentCurriculumProgress0);
      assertEquals(9, studentCurriculumProgress0.getEnrolledCredits());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Integer integer0 = new Integer(40);
      PriorityQueue<String> priorityQueue0 = new PriorityQueue<String>();
      Subject subject0 = new Subject("Funnels.byteArrayFunnel()", "br.edu.ufcg.computacao.eureca.backend.core.util.PreEnrollmentUtil", "Funnels.byteArrayFunnel()", "Funnels.byteArrayFunnel()", "Funnels.byteArrayFunnel()", 40, (int) integer0, "br.edu.ufcg.computacao.eureca.backend.core.util.PreEnrollmentUtil", priorityQueue0, 0, priorityQueue0, priorityQueue0);
      HashMap<String, Schedule> hashMap0 = new HashMap<String, Schedule>();
      SubjectSchedule subjectSchedule0 = new SubjectSchedule(subject0, hashMap0);
      TreeSet<ClassSchedule> treeSet0 = new TreeSet<ClassSchedule>();
      Schedule schedule0 = new Schedule((-2909), "br.edu.ufcg.computacao.eureca.backend.core.util.PreEnrollmentUtil", treeSet0);
      hashMap0.put("br.edu.ufcg.computacao.eureca.backend.core.util.PreEnrollmentUtil", schedule0);
      StudentCurriculumProgress studentCurriculumProgress0 = new StudentCurriculumProgress(40, 40, (-1550), 0, 40);
      PreEnrollmentUtil.sanitizeSubject("Funnels.byteArrayFunnel()", "Funnels.byteArrayFunnel()", subjectSchedule0, studentCurriculumProgress0);
      assertEquals((-1510), studentCurriculumProgress0.getCompletedCredits());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Stack<SubjectSchedule> stack0 = new Stack<SubjectSchedule>();
      Locale locale0 = Locale.ITALY;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      Subject subject0 = new Subject("@jkc5<GPV_NC2!>T", "@jkc5<GPV_NC2!>T", "@jkc5<GPV_NC2!>T", "@jkc5<GPV_NC2!>T", "@jkc5<GPV_NC2!>T", (-4096), (-4096), "@jkc5<GPV_NC2!>T", set0, (-4096), set0, set0);
      HashMap<String, Schedule> hashMap0 = new HashMap<String, Schedule>();
      SubjectSchedule subjectSchedule0 = new SubjectSchedule(subject0, hashMap0);
      stack0.addElement(subjectSchedule0);
      int int0 = PreEnrollmentUtil.getSubjectCreditsSum(stack0);
      assertEquals((-4096), int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Stack<SubjectSchedule> stack0 = new Stack<SubjectSchedule>();
      int int0 = PreEnrollmentUtil.getSubjectCreditsSum(stack0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Stack<SubjectSchedule> stack0 = new Stack<SubjectSchedule>();
      Locale locale0 = Locale.ITALY;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      Subject subject0 = new Subject("@jkc5<GPV_NC2!>T", "@jkc5<GPV_NC2!>T", "@jkc5<GPV_NC2!>T", "@jkc5<GPV_NC2!>T", "@jkc5<GPV_NC2!>T", (-4096), (-4096), "@jkc5<GPV_NC2!>T", set0, (-4096), set0, set0);
      HashMap<String, Schedule> hashMap0 = new HashMap<String, Schedule>();
      SubjectSchedule subjectSchedule0 = new SubjectSchedule(subject0, hashMap0);
      stack0.addElement(subjectSchedule0);
      stack0.add(subjectSchedule0);
      SubjectType subjectType0 = SubjectType.MANDATORY;
      Map<Integer, Collection<SubjectSchedule>> map0 = PreEnrollmentUtil.getSubjectsPerTerm(stack0, subjectType0);
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ArrayList<SubjectSchedule> arrayList0 = new ArrayList<SubjectSchedule>();
      ArrayList<String> arrayList1 = new ArrayList<String>();
      Subject subject0 = new Subject("O", "O", "O", "O", "O", 639, 639, (String) null, arrayList1, 306, (Collection<String>) null, arrayList1);
      SubjectSchedule subjectSchedule0 = new SubjectSchedule(subject0, (Map<String, Schedule>) null);
      arrayList0.add(subjectSchedule0);
      SubjectType subjectType0 = SubjectType.OPTIONAL;
      Map<Integer, Collection<SubjectSchedule>> map0 = PreEnrollmentUtil.getSubjectsPerTerm(arrayList0, subjectType0);
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedList<SubjectSchedule> linkedList0 = new LinkedList<SubjectSchedule>();
      Collection<SubjectSchedule> collection0 = PreEnrollmentUtil.excludeUnavailableSubjects(linkedList0, linkedList0);
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ArrayList<String> arrayList0 = new ArrayList<String>();
      Subject subject0 = new Subject("ALL", "`CzKbX^kE", "ALL", "", "c?7uaV&|3DV.m", (-4075), 3084, (String) null, arrayList0, (-4075), arrayList0, arrayList0);
      HashMap<String, Schedule> hashMap0 = new HashMap<String, Schedule>();
      SubjectSchedule subjectSchedule0 = new SubjectSchedule(subject0, hashMap0);
      StudentCurriculumProgress studentCurriculumProgress0 = new StudentCurriculumProgress(39, 3084, 306654252, 39, 39);
      PreEnrollmentUtil.sanitizeSubject("", "", subjectSchedule0, studentCurriculumProgress0);
      assertEquals(39, studentCurriculumProgress0.getCompletedComplementaryCredits());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PreEnrollmentUtil preEnrollmentUtil0 = new PreEnrollmentUtil();
  }
}