/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 13 21:28:04 GMT 2022
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
      StudentsRetentionSummary studentsRetentionSummary0 = new StudentsRetentionSummary((String) null, "yLnLYe8(LPTI3", 0, (StudentMetricsSummary) null);
      studentsRetentionSummary0.setTo((String) null);
      studentsRetentionSummary0.getTo();
      assertEquals(0, studentsRetentionSummary0.getStudentsRetentionCount());
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
      StudentsRetentionSummary studentsRetentionSummary0 = new StudentsRetentionSummary("", "", 0, (StudentMetricsSummary) null);
      assertEquals(0, studentsRetentionSummary0.getStudentsRetentionCount());
      
      studentsRetentionSummary0.setStudentsRetentionCount(1);
      int int0 = studentsRetentionSummary0.getStudentsRetentionCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StudentsRetentionSummary studentsRetentionSummary0 = new StudentsRetentionSummary((String) null, "0:x=C'^}ZV.0;{s]{e", 0, (StudentMetricsSummary) null);
      String string0 = studentsRetentionSummary0.getFrom();
      assertNull(string0);
      assertEquals(0, studentsRetentionSummary0.getStudentsRetentionCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StudentsRetentionSummary studentsRetentionSummary0 = new StudentsRetentionSummary("", "UA:hV$h9&:Ty9?]`Gh", 7, (StudentMetricsSummary) null);
      String string0 = studentsRetentionSummary0.getFrom();
      assertEquals("UA:hV$h9&:Ty9?]`Gh", studentsRetentionSummary0.getTo());
      assertEquals("", string0);
      assertEquals(7, studentsRetentionSummary0.getStudentsRetentionCount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StudentsRetentionSummary studentsRetentionSummary0 = new StudentsRetentionSummary("br.edu.ufcg.computacao.eureca.backend.api.http.response.retention.student.StudentsRetentionSummary", "", (-2437), (StudentMetricsSummary) null);
      studentsRetentionSummary0.getAverage();
      assertEquals("br.edu.ufcg.computacao.eureca.backend.api.http.response.retention.student.StudentsRetentionSummary", studentsRetentionSummary0.getFrom());
      assertEquals((-2437), studentsRetentionSummary0.getStudentsRetentionCount());
      assertEquals("", studentsRetentionSummary0.getTo());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StudentMetricsSummary studentMetricsSummary0 = mock(StudentMetricsSummary.class, new ViolatedAssumptionAnswer());
      StudentsRetentionSummary studentsRetentionSummary0 = new StudentsRetentionSummary("-H)", "-H)", 1, studentMetricsSummary0);
      studentsRetentionSummary0.setFrom("-H)");
      assertEquals(1, studentsRetentionSummary0.getStudentsRetentionCount());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StudentMetricsSummary studentMetricsSummary0 = mock(StudentMetricsSummary.class, new ViolatedAssumptionAnswer());
      StudentsRetentionSummary studentsRetentionSummary0 = new StudentsRetentionSummary("-H)", "-H)", 1, studentMetricsSummary0);
      studentsRetentionSummary0.getFrom();
      assertEquals(1, studentsRetentionSummary0.getStudentsRetentionCount());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StudentMetricsSummary studentMetricsSummary0 = mock(StudentMetricsSummary.class, new ViolatedAssumptionAnswer());
      doReturn("-H)").when(studentMetricsSummary0).toString();
      StudentsRetentionSummary studentsRetentionSummary0 = new StudentsRetentionSummary("-H)", "-H)", 1, studentMetricsSummary0);
      StudentMetricsSummary studentMetricsSummary1 = studentsRetentionSummary0.getAverage();
      studentsRetentionSummary0.setAverage(studentMetricsSummary1);
      assertEquals(1, studentsRetentionSummary0.getStudentsRetentionCount());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StudentsRetentionSummary studentsRetentionSummary0 = new StudentsRetentionSummary("?G", "?G", (-4), (StudentMetricsSummary) null);
      int int0 = studentsRetentionSummary0.getStudentsRetentionCount();
      assertEquals((-4), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StudentMetricsSummary studentMetricsSummary0 = mock(StudentMetricsSummary.class, new ViolatedAssumptionAnswer());
      StudentsRetentionSummary studentsRetentionSummary0 = new StudentsRetentionSummary("-H)", "-H)", 1, studentMetricsSummary0);
      studentsRetentionSummary0.getTo();
      assertEquals(1, studentsRetentionSummary0.getStudentsRetentionCount());
  }
}
