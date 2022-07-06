/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 05 23:04:24 GMT 2022
 */

package br.edu.ufcg.computacao.eureca.backend.api.http.response.retention.student;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import br.edu.ufcg.computacao.eureca.backend.api.http.response.retention.student.StudentsRetentionSummary;
import br.edu.ufcg.computacao.eureca.backend.api.http.response.students.StudentMetricsSummary;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StudentsRetentionSummary_ESTest extends StudentsRetentionSummary_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StudentMetricsSummary studentMetricsSummary0 = mock(StudentMetricsSummary.class, new ViolatedAssumptionAnswer());
      StudentsRetentionSummary studentsRetentionSummary0 = new StudentsRetentionSummary((String) null, (String) null, (-574), studentMetricsSummary0);
      studentsRetentionSummary0.getTo();
      assertEquals((-574), studentsRetentionSummary0.getStudentsRetentionCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StudentsRetentionSummary studentsRetentionSummary0 = new StudentsRetentionSummary("", "", 0, (StudentMetricsSummary) null);
      studentsRetentionSummary0.getTo();
      assertEquals(0, studentsRetentionSummary0.getStudentsRetentionCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StudentsRetentionSummary studentsRetentionSummary0 = new StudentsRetentionSummary("", "", 0, (StudentMetricsSummary) null);
      int int0 = studentsRetentionSummary0.getStudentsRetentionCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StudentsRetentionSummary studentsRetentionSummary0 = new StudentsRetentionSummary("\"$(l\"d8P]c'yo-4a", "\"$(l\"d8P]c'yo-4a", (-1), (StudentMetricsSummary) null);
      studentsRetentionSummary0.setStudentsRetentionCount(4494);
      int int0 = studentsRetentionSummary0.getStudentsRetentionCount();
      assertEquals(4494, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StudentMetricsSummary studentMetricsSummary0 = mock(StudentMetricsSummary.class, new ViolatedAssumptionAnswer());
      StudentsRetentionSummary studentsRetentionSummary0 = new StudentsRetentionSummary((String) null, (String) null, (-574), studentMetricsSummary0);
      studentsRetentionSummary0.getFrom();
      assertEquals((-574), studentsRetentionSummary0.getStudentsRetentionCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StudentMetricsSummary studentMetricsSummary0 = mock(StudentMetricsSummary.class, new ViolatedAssumptionAnswer());
      StudentsRetentionSummary studentsRetentionSummary0 = new StudentsRetentionSummary("", "", 2124, studentMetricsSummary0);
      studentsRetentionSummary0.getFrom();
      assertEquals(2124, studentsRetentionSummary0.getStudentsRetentionCount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StudentsRetentionSummary studentsRetentionSummary0 = new StudentsRetentionSummary("", "", 0, (StudentMetricsSummary) null);
      studentsRetentionSummary0.getAverage();
      assertEquals(0, studentsRetentionSummary0.getStudentsRetentionCount());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StudentMetricsSummary studentMetricsSummary0 = mock(StudentMetricsSummary.class, new ViolatedAssumptionAnswer());
      StudentsRetentionSummary studentsRetentionSummary0 = new StudentsRetentionSummary("|Wsm=B;7^WJ^0m", "|Wsm=B;7^WJ^0m", (-37), studentMetricsSummary0);
      studentsRetentionSummary0.setFrom("|Wsm=B;7^WJ^0m");
      assertEquals((-37), studentsRetentionSummary0.getStudentsRetentionCount());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StudentMetricsSummary studentMetricsSummary0 = mock(StudentMetricsSummary.class, new ViolatedAssumptionAnswer());
      StudentsRetentionSummary studentsRetentionSummary0 = new StudentsRetentionSummary("|Wsm=B;7^WJ^0m", "|Wsm=B;7^WJ^0m", (-37), studentMetricsSummary0);
      studentsRetentionSummary0.getFrom();
      assertEquals((-37), studentsRetentionSummary0.getStudentsRetentionCount());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StudentMetricsSummary studentMetricsSummary0 = mock(StudentMetricsSummary.class, new ViolatedAssumptionAnswer());
      doReturn("|Wsm=B;7^WJ^0m").when(studentMetricsSummary0).toString();
      StudentsRetentionSummary studentsRetentionSummary0 = new StudentsRetentionSummary("|Wsm=B;7^WJ^0m", "|Wsm=B;7^WJ^0m", (-37), studentMetricsSummary0);
      StudentMetricsSummary studentMetricsSummary1 = studentsRetentionSummary0.getAverage();
      studentsRetentionSummary0.setAverage(studentMetricsSummary1);
      assertEquals((-37), studentsRetentionSummary0.getStudentsRetentionCount());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StudentMetricsSummary studentMetricsSummary0 = mock(StudentMetricsSummary.class, new ViolatedAssumptionAnswer());
      StudentsRetentionSummary studentsRetentionSummary0 = new StudentsRetentionSummary("|Wsm=B;7^WJ^0m", "|Wsm=B;7^WJ^0m", (-37), studentMetricsSummary0);
      int int0 = studentsRetentionSummary0.getStudentsRetentionCount();
      assertEquals((-37), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StudentMetricsSummary studentMetricsSummary0 = mock(StudentMetricsSummary.class, new ViolatedAssumptionAnswer());
      StudentsRetentionSummary studentsRetentionSummary0 = new StudentsRetentionSummary("|Wsm=B;7^WJ^0m", "|Wsm=B;7^WJ^0m", (-37), studentMetricsSummary0);
      studentsRetentionSummary0.setTo("|Wsm=B;7^WJ^0m");
      assertEquals((-37), studentsRetentionSummary0.getStudentsRetentionCount());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StudentMetricsSummary studentMetricsSummary0 = mock(StudentMetricsSummary.class, new ViolatedAssumptionAnswer());
      StudentsRetentionSummary studentsRetentionSummary0 = new StudentsRetentionSummary("|Wsm=B;7^WJ^0m", "|Wsm=B;7^WJ^0m", (-37), studentMetricsSummary0);
      studentsRetentionSummary0.getTo();
      assertEquals((-37), studentsRetentionSummary0.getStudentsRetentionCount());
  }
}
