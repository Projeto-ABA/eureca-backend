/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 06 00:00:20 GMT 2022
 */

package br.edu.ufcg.computacao.eureca.backend.api.http.response.retention.student;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import br.edu.ufcg.computacao.eureca.backend.api.http.response.retention.student.StudentsRetentionPerTermSummary;
import br.edu.ufcg.computacao.eureca.backend.api.http.response.students.StudentMetricsSummary;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StudentsRetentionPerTermSummary_ESTest extends StudentsRetentionPerTermSummary_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StudentsRetentionPerTermSummary studentsRetentionPerTermSummary0 = new StudentsRetentionPerTermSummary("", (StudentMetricsSummary) null);
      studentsRetentionPerTermSummary0.setAdmissionTerm((String) null);
      String string0 = studentsRetentionPerTermSummary0.getTerm();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StudentsRetentionPerTermSummary studentsRetentionPerTermSummary0 = new StudentsRetentionPerTermSummary("Y90V", (StudentMetricsSummary) null);
      studentsRetentionPerTermSummary0.setAdmissionTerm("");
      String string0 = studentsRetentionPerTermSummary0.getTerm();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StudentsRetentionPerTermSummary studentsRetentionPerTermSummary0 = new StudentsRetentionPerTermSummary("{+Ostq&R96~?k", (StudentMetricsSummary) null);
      StudentMetricsSummary studentMetricsSummary0 = studentsRetentionPerTermSummary0.getMetricsSummary();
      assertNull(studentMetricsSummary0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StudentsRetentionPerTermSummary studentsRetentionPerTermSummary0 = new StudentsRetentionPerTermSummary("br.edu.ufcg.computacao.eureca.backend.api.http.response.students.StudentMetrics", (StudentMetricsSummary) null);
      studentsRetentionPerTermSummary0.setAdmissionTerm((String) null);
      String string0 = studentsRetentionPerTermSummary0.getAdmissionTerm();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StudentsRetentionPerTermSummary studentsRetentionPerTermSummary0 = new StudentsRetentionPerTermSummary("tgwUN/!I!g>XNQu", (StudentMetricsSummary) null);
      studentsRetentionPerTermSummary0.setAdmissionTerm("");
      String string0 = studentsRetentionPerTermSummary0.getAdmissionTerm();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StudentsRetentionPerTermSummary studentsRetentionPerTermSummary0 = new StudentsRetentionPerTermSummary(")P=a~ITZx!.W8x", (StudentMetricsSummary) null);
      studentsRetentionPerTermSummary0.setAdmissionTerm("898-Y@nt@RF`w!9$");
      StudentsRetentionPerTermSummary studentsRetentionPerTermSummary1 = new StudentsRetentionPerTermSummary(")P=a~ITZx!.W8x", (StudentMetricsSummary) null);
      int int0 = studentsRetentionPerTermSummary0.compareTo(studentsRetentionPerTermSummary1);
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StudentsRetentionPerTermSummary studentsRetentionPerTermSummary0 = new StudentsRetentionPerTermSummary("{+Ostq&R96~?k", (StudentMetricsSummary) null);
      StudentsRetentionPerTermSummary studentsRetentionPerTermSummary1 = new StudentsRetentionPerTermSummary(";KJ(oyn`vji>", (StudentMetricsSummary) null);
      int int0 = studentsRetentionPerTermSummary0.compareTo(studentsRetentionPerTermSummary1);
      assertEquals((-4), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StudentsRetentionPerTermSummary studentsRetentionPerTermSummary0 = new StudentsRetentionPerTermSummary("", (StudentMetricsSummary) null);
      // Undeclared exception!
      try { 
        studentsRetentionPerTermSummary0.compareTo((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("br.edu.ufcg.computacao.eureca.backend.api.http.response.retention.student.StudentsRetentionPerTermSummary", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StudentsRetentionPerTermSummary studentsRetentionPerTermSummary0 = new StudentsRetentionPerTermSummary("{+Ostq&R96~?k", (StudentMetricsSummary) null);
      String string0 = studentsRetentionPerTermSummary0.getAdmissionTerm();
      assertEquals("{+Ostq&R96~?k", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StudentMetricsSummary studentMetricsSummary0 = mock(StudentMetricsSummary.class, new ViolatedAssumptionAnswer());
      StudentsRetentionPerTermSummary studentsRetentionPerTermSummary0 = new StudentsRetentionPerTermSummary("AwiAUA>", studentMetricsSummary0);
      String string0 = studentsRetentionPerTermSummary0.getTerm();
      assertEquals("AwiAUA>", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StudentMetricsSummary studentMetricsSummary0 = mock(StudentMetricsSummary.class, new ViolatedAssumptionAnswer());
      StudentsRetentionPerTermSummary studentsRetentionPerTermSummary0 = new StudentsRetentionPerTermSummary("AwiAUA>", studentMetricsSummary0);
      int int0 = studentsRetentionPerTermSummary0.compareTo(studentsRetentionPerTermSummary0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StudentMetricsSummary studentMetricsSummary0 = mock(StudentMetricsSummary.class, new ViolatedAssumptionAnswer());
      StudentsRetentionPerTermSummary studentsRetentionPerTermSummary0 = new StudentsRetentionPerTermSummary("", studentMetricsSummary0);
      // Undeclared exception!
      try { 
        studentsRetentionPerTermSummary0.compareTo("");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to br.edu.ufcg.computacao.eureca.backend.api.http.response.retention.student.StudentsRetentionPerTermSummary
         //
         verifyException("br.edu.ufcg.computacao.eureca.backend.api.http.response.retention.student.StudentsRetentionPerTermSummary", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StudentMetricsSummary studentMetricsSummary0 = mock(StudentMetricsSummary.class, new ViolatedAssumptionAnswer());
      StudentsRetentionPerTermSummary studentsRetentionPerTermSummary0 = new StudentsRetentionPerTermSummary("", studentMetricsSummary0);
      StudentMetricsSummary studentMetricsSummary1 = mock(StudentMetricsSummary.class, new ViolatedAssumptionAnswer());
      studentsRetentionPerTermSummary0.setMetricsSummary(studentMetricsSummary1);
      assertEquals("", studentsRetentionPerTermSummary0.getTerm());
  }
}
