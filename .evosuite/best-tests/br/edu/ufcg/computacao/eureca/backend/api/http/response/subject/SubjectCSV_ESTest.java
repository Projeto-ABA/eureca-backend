/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 13 21:27:11 GMT 2022
 */

package br.edu.ufcg.computacao.eureca.backend.api.http.response.subject;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import br.edu.ufcg.computacao.eureca.backend.api.http.response.subject.SubjectCSV;
import br.edu.ufcg.computacao.eureca.backend.api.http.response.subject.SubjectMetrics;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SubjectCSV_ESTest extends SubjectCSV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SubjectCSV subjectCSV0 = new SubjectCSV(", curriculumCode='", "(Y5", ", succeeded=", "^P%*(jwPxSisO~UR_T", "ow((lD[ie'M@V2y:D", (SubjectMetrics) null);
      String string0 = subjectCSV0.getTerm();
      assertEquals(", succeeded=", subjectCSV0.getSubjectCode());
      assertEquals("ow((lD[ie'M@V2y:D", string0);
      assertEquals("(Y5", subjectCSV0.getCurriculumCode());
      assertEquals(", curriculumCode='", subjectCSV0.getCourseCode());
      assertEquals("^P%*(jwPxSisO~UR_T", subjectCSV0.getSubjectName());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SubjectCSV subjectCSV0 = new SubjectCSV(", subjectCode='", "", "", "", "", (SubjectMetrics) null);
      String string0 = subjectCSV0.getTerm();
      assertEquals("", string0);
      assertEquals(", subjectCode='", subjectCSV0.getCourseCode());
      assertEquals("", subjectCSV0.getSubjectCode());
      assertEquals("", subjectCSV0.getSubjectName());
      assertEquals("", subjectCSV0.getCurriculumCode());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SubjectCSV subjectCSV0 = new SubjectCSV(", curriculumCode='", "(Y5", ", succeeded=", "^P%*(jwPxSisO~UR_T", "ow((lD[ie'M@V2y:D", (SubjectMetrics) null);
      String string0 = subjectCSV0.getSubjectName();
      assertEquals("(Y5", subjectCSV0.getCurriculumCode());
      assertEquals("^P%*(jwPxSisO~UR_T", string0);
      assertEquals(", curriculumCode='", subjectCSV0.getCourseCode());
      assertEquals("ow((lD[ie'M@V2y:D", subjectCSV0.getTerm());
      assertEquals(", succeeded=", subjectCSV0.getSubjectCode());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SubjectCSV subjectCSV0 = new SubjectCSV("", "", "", "", "", (SubjectMetrics) null);
      String string0 = subjectCSV0.getSubjectName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SubjectMetrics subjectMetrics0 = mock(SubjectMetrics.class, new ViolatedAssumptionAnswer());
      SubjectCSV subjectCSV0 = new SubjectCSV("", (String) null, (String) null, ", term='", ", failedDueToGrade=", subjectMetrics0);
      String string0 = subjectCSV0.getSubjectCode();
      assertEquals(", term='", subjectCSV0.getSubjectName());
      assertEquals("", subjectCSV0.getCourseCode());
      assertEquals(", failedDueToGrade=", subjectCSV0.getTerm());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SubjectCSV subjectCSV0 = new SubjectCSV(", subjectCode='", "", "", "", "", (SubjectMetrics) null);
      String string0 = subjectCSV0.getSubjectCode();
      assertEquals("", subjectCSV0.getTerm());
      assertEquals("", subjectCSV0.getSubjectName());
      assertEquals("", string0);
      assertEquals("", subjectCSV0.getCurriculumCode());
      assertEquals(", subjectCode='", subjectCSV0.getCourseCode());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SubjectMetrics subjectMetrics0 = mock(SubjectMetrics.class, new ViolatedAssumptionAnswer());
      SubjectCSV subjectCSV0 = new SubjectCSV(", exempted=", ", exempted=", ", exempted=", ", exempted=", ", exempted=", subjectMetrics0);
      subjectCSV0.setCurriculumCode((String) null);
      String string0 = subjectCSV0.getCurriculumCode();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SubjectCSV subjectCSV0 = new SubjectCSV(", subjectCode='", "", "", "", "", (SubjectMetrics) null);
      String string0 = subjectCSV0.getCurriculumCode();
      assertEquals("", subjectCSV0.getSubjectCode());
      assertEquals(", subjectCode='", subjectCSV0.getCourseCode());
      assertEquals("", subjectCSV0.getSubjectName());
      assertEquals("", string0);
      assertEquals("", subjectCSV0.getTerm());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SubjectCSV subjectCSV0 = new SubjectCSV("", "", "", "", "", (SubjectMetrics) null);
      subjectCSV0.setCourseCode((String) null);
      String string0 = subjectCSV0.getCourseCode();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SubjectMetrics subjectMetrics0 = mock(SubjectMetrics.class, new ViolatedAssumptionAnswer());
      SubjectCSV subjectCSV0 = new SubjectCSV("", (String) null, (String) null, ", term='", ", failedDueToGrade=", subjectMetrics0);
      String string0 = subjectCSV0.getCourseCode();
      assertEquals(", term='", subjectCSV0.getSubjectName());
      assertNotNull(string0);
      assertEquals(", failedDueToGrade=", subjectCSV0.getTerm());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SubjectCSV subjectCSV0 = new SubjectCSV("", ", metrics='", "", ", failedDueToGrade=", ", failedDueToGrade=", (SubjectMetrics) null);
      assertEquals("", subjectCSV0.getCourseCode());
      
      subjectCSV0.setCourseCode("39T!KA6yum:Gvb`G");
      SubjectCSV subjectCSV1 = new SubjectCSV(", metrics='", (String) null, "H^ETJ]]m-O*", ", metrics='", "", (SubjectMetrics) null);
      int int0 = subjectCSV0.compareTo(subjectCSV1);
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SubjectCSV subjectCSV0 = new SubjectCSV("", "", "", "", "", (SubjectMetrics) null);
      SubjectCSV subjectCSV1 = new SubjectCSV("':F _=? 5gBA", "':F _=? 5gBA", "", "", (String) null, (SubjectMetrics) null);
      int int0 = subjectCSV0.compareTo(subjectCSV1);
      assertEquals("", subjectCSV1.getSubjectName());
      assertEquals((-28), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SubjectMetrics subjectMetrics0 = mock(SubjectMetrics.class, new ViolatedAssumptionAnswer());
      SubjectCSV subjectCSV0 = new SubjectCSV(", subjectCode='", ", subjectCode='", "", "zLRvx", "WmruPL$~v", subjectMetrics0);
      // Undeclared exception!
      try { 
        subjectCSV0.compareTo((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("br.edu.ufcg.computacao.eureca.backend.api.http.response.subject.SubjectCSV", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SubjectCSV subjectCSV0 = new SubjectCSV("", ", metrics='", "", ", failedDueToGrade=", ", failedDueToGrade=", (SubjectMetrics) null);
      // Undeclared exception!
      try { 
        subjectCSV0.compareTo("");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to br.edu.ufcg.computacao.eureca.backend.api.http.response.subject.SubjectCSV
         //
         verifyException("br.edu.ufcg.computacao.eureca.backend.api.http.response.subject.SubjectCSV", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SubjectCSV subjectCSV0 = new SubjectCSV(", curriculumCode='", "(Y5", ", succeeded=", "^P%*(jwPxSisO~UR_T", "ow((lD[ie'M@V2y:D", (SubjectMetrics) null);
      String string0 = subjectCSV0.getSubjectCode();
      assertEquals(", succeeded=", string0);
      assertEquals("(Y5", subjectCSV0.getCurriculumCode());
      assertEquals(", curriculumCode='", subjectCSV0.getCourseCode());
      assertEquals("ow((lD[ie'M@V2y:D", subjectCSV0.getTerm());
      assertEquals("^P%*(jwPxSisO~UR_T", subjectCSV0.getSubjectName());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SubjectCSV subjectCSV0 = new SubjectCSV(", curriculumCode='", "(Y5", ", succeeded=", "^P%*(jwPxSisO~UR_T", "ow((lD[ie'M@V2y:D", (SubjectMetrics) null);
      String string0 = subjectCSV0.getCurriculumCode();
      assertEquals("(Y5", string0);
      assertEquals(", curriculumCode='", subjectCSV0.getCourseCode());
      assertEquals("ow((lD[ie'M@V2y:D", subjectCSV0.getTerm());
      assertEquals("^P%*(jwPxSisO~UR_T", subjectCSV0.getSubjectName());
      assertEquals(", succeeded=", subjectCSV0.getSubjectCode());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SubjectCSV subjectCSV0 = new SubjectCSV("/mN=6Cl<4lfngY(", "/mN=6Cl<4lfngY(", "8 d] W\"Z{zJ", "/mN=6Cl<4lfngY(", "/mN=6Cl<4lfngY(", (SubjectMetrics) null);
      String string0 = subjectCSV0.getCourseCode();
      assertEquals("/mN=6Cl<4lfngY(", subjectCSV0.getTerm());
      assertEquals("/mN=6Cl<4lfngY(", string0);
      assertEquals("8 d] W\"Z{zJ", subjectCSV0.getSubjectCode());
      assertEquals("/mN=6Cl<4lfngY(", subjectCSV0.getCurriculumCode());
      assertEquals("/mN=6Cl<4lfngY(", subjectCSV0.getSubjectName());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SubjectCSV subjectCSV0 = new SubjectCSV((String) null, (String) null, (String) null, (String) null, (String) null, (SubjectMetrics) null);
      String string0 = subjectCSV0.getSubjectName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SubjectMetrics subjectMetrics0 = mock(SubjectMetrics.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(subjectMetrics0).toString();
      SubjectCSV subjectCSV0 = new SubjectCSV("?GGv6", "0o 87-/bq", "?GGv6", "?GGv6", "?GGv6", subjectMetrics0);
      String string0 = subjectCSV0.toString();
      assertEquals("SubjectCSV{courseCode='?GGv6', curriculumCode='0o 87-/bq', subjectCode='?GGv6', subjectName='?GGv6', term='?GGv6', metrics='null'}", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SubjectCSV subjectCSV0 = new SubjectCSV((String) null, (String) null, (String) null, (String) null, (String) null, (SubjectMetrics) null);
      subjectCSV0.setTerm((String) null);
      assertNull(subjectCSV0.getTerm());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SubjectCSV subjectCSV0 = new SubjectCSV((String) null, (String) null, (String) null, (String) null, (String) null, (SubjectMetrics) null);
      subjectCSV0.setSubjectName((String) null);
      assertNull(subjectCSV0.getCurriculumCode());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SubjectCSV subjectCSV0 = new SubjectCSV((String) null, (String) null, (String) null, (String) null, (String) null, (SubjectMetrics) null);
      subjectCSV0.setMetrics((SubjectMetrics) null);
      assertNull(subjectCSV0.getSubjectCode());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SubjectCSV subjectCSV0 = new SubjectCSV((String) null, (String) null, (String) null, (String) null, (String) null, (SubjectMetrics) null);
      subjectCSV0.setSubjectCode((String) null);
      assertNull(subjectCSV0.getSubjectName());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SubjectMetrics subjectMetrics0 = mock(SubjectMetrics.class, new ViolatedAssumptionAnswer());
      SubjectCSV subjectCSV0 = new SubjectCSV("qp3@F", "qp3@F", "qp3@F", "qp3@F", "qp3@F", subjectMetrics0);
      int int0 = subjectCSV0.compareTo(subjectCSV0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SubjectCSV subjectCSV0 = new SubjectCSV((String) null, (String) null, (String) null, (String) null, (String) null, (SubjectMetrics) null);
      SubjectMetrics subjectMetrics0 = subjectCSV0.getMetrics();
      assertNull(subjectMetrics0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SubjectCSV subjectCSV0 = new SubjectCSV((String) null, (String) null, (String) null, (String) null, (String) null, (SubjectMetrics) null);
      String string0 = subjectCSV0.getTerm();
      assertNull(string0);
  }
}
