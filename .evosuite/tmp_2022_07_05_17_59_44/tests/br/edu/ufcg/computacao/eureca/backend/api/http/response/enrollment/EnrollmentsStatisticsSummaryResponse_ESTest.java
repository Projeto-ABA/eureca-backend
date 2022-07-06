/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 05 23:41:16 GMT 2022
 */

package br.edu.ufcg.computacao.eureca.backend.api.http.response.enrollment;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import br.edu.ufcg.computacao.eureca.backend.api.http.response.enrollment.EnrollmentsStatisticsSummaryResponse;
import br.edu.ufcg.computacao.eureca.backend.api.http.response.enrollment.EnrollmentsSummary;
import br.edu.ufcg.computacao.eureca.backend.constants.EnrollmentsGlossaryFields;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EnrollmentsStatisticsSummaryResponse_ESTest extends EnrollmentsStatisticsSummaryResponse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EnrollmentsStatisticsSummaryResponse enrollmentsStatisticsSummaryResponse0 = new EnrollmentsStatisticsSummaryResponse(">ra8bK>am2i4", ">ra8bK>am2i4", (EnrollmentsSummary) null, (EnrollmentsSummary) null, (EnrollmentsSummary) null, (EnrollmentsSummary) null);
      EnrollmentsSummary enrollmentsSummary0 = enrollmentsStatisticsSummaryResponse0.getOptional();
      assertNull(enrollmentsSummary0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EnrollmentsStatisticsSummaryResponse enrollmentsStatisticsSummaryResponse0 = new EnrollmentsStatisticsSummaryResponse("", "", (EnrollmentsSummary) null, (EnrollmentsSummary) null, (EnrollmentsSummary) null, (EnrollmentsSummary) null);
      EnrollmentsSummary enrollmentsSummary0 = enrollmentsStatisticsSummaryResponse0.getMandatory();
      assertNull(enrollmentsSummary0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EnrollmentsStatisticsSummaryResponse enrollmentsStatisticsSummaryResponse0 = new EnrollmentsStatisticsSummaryResponse("", "", (EnrollmentsSummary) null, (EnrollmentsSummary) null, (EnrollmentsSummary) null, (EnrollmentsSummary) null);
      EnrollmentsSummary enrollmentsSummary0 = enrollmentsStatisticsSummaryResponse0.getElective();
      assertNull(enrollmentsSummary0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EnrollmentsSummary enrollmentsSummary0 = mock(EnrollmentsSummary.class, new ViolatedAssumptionAnswer());
      EnrollmentsSummary enrollmentsSummary1 = mock(EnrollmentsSummary.class, new ViolatedAssumptionAnswer());
      EnrollmentsStatisticsSummaryResponse enrollmentsStatisticsSummaryResponse0 = new EnrollmentsStatisticsSummaryResponse((String) null, (String) null, enrollmentsSummary0, enrollmentsSummary0, enrollmentsSummary0, enrollmentsSummary1);
      String string0 = enrollmentsStatisticsSummaryResponse0.getCurriculumCode();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EnrollmentsStatisticsSummaryResponse enrollmentsStatisticsSummaryResponse0 = new EnrollmentsStatisticsSummaryResponse("", "", (EnrollmentsSummary) null, (EnrollmentsSummary) null, (EnrollmentsSummary) null, (EnrollmentsSummary) null);
      String string0 = enrollmentsStatisticsSummaryResponse0.getCurriculumCode();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EnrollmentsSummary enrollmentsSummary0 = mock(EnrollmentsSummary.class, new ViolatedAssumptionAnswer());
      EnrollmentsStatisticsSummaryResponse enrollmentsStatisticsSummaryResponse0 = new EnrollmentsStatisticsSummaryResponse((String) null, (String) null, enrollmentsSummary0, enrollmentsSummary0, enrollmentsSummary0, enrollmentsSummary0);
      String string0 = enrollmentsStatisticsSummaryResponse0.getCourseCode();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EnrollmentsStatisticsSummaryResponse enrollmentsStatisticsSummaryResponse0 = new EnrollmentsStatisticsSummaryResponse("(TYf./Wpb_", "Hn2l5'", (EnrollmentsSummary) null, (EnrollmentsSummary) null, (EnrollmentsSummary) null, (EnrollmentsSummary) null);
      assertEquals("(TYf./Wpb_", enrollmentsStatisticsSummaryResponse0.getCourseCode());
      
      enrollmentsStatisticsSummaryResponse0.setCourseCode("");
      enrollmentsStatisticsSummaryResponse0.getCourseCode();
      assertEquals("Hn2l5'", enrollmentsStatisticsSummaryResponse0.getCurriculumCode());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EnrollmentsStatisticsSummaryResponse enrollmentsStatisticsSummaryResponse0 = new EnrollmentsStatisticsSummaryResponse(">ra8bK>am2i4", ">ra8bK>am2i4", (EnrollmentsSummary) null, (EnrollmentsSummary) null, (EnrollmentsSummary) null, (EnrollmentsSummary) null);
      EnrollmentsSummary enrollmentsSummary0 = enrollmentsStatisticsSummaryResponse0.getComplementary();
      assertNull(enrollmentsSummary0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EnrollmentsSummary enrollmentsSummary0 = mock(EnrollmentsSummary.class, new ViolatedAssumptionAnswer());
      EnrollmentsStatisticsSummaryResponse enrollmentsStatisticsSummaryResponse0 = new EnrollmentsStatisticsSummaryResponse("itH.C 60kH4HA#EK", "itH.C 60kH4HA#EK", enrollmentsSummary0, enrollmentsSummary0, enrollmentsSummary0, enrollmentsSummary0);
      EnrollmentsSummary enrollmentsSummary1 = mock(EnrollmentsSummary.class, new ViolatedAssumptionAnswer());
      enrollmentsStatisticsSummaryResponse0.setMandatory(enrollmentsSummary1);
      assertEquals("itH.C 60kH4HA#EK", enrollmentsStatisticsSummaryResponse0.getCurriculumCode());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EnrollmentsSummary enrollmentsSummary0 = mock(EnrollmentsSummary.class, new ViolatedAssumptionAnswer());
      EnrollmentsStatisticsSummaryResponse enrollmentsStatisticsSummaryResponse0 = new EnrollmentsStatisticsSummaryResponse("itH.C 60kH4HA#EK", "itH.C 60kH4HA#EK", enrollmentsSummary0, enrollmentsSummary0, enrollmentsSummary0, enrollmentsSummary0);
      enrollmentsStatisticsSummaryResponse0.setCurriculumCode("itH.C 60kH4HA#EK");
      assertEquals("itH.C 60kH4HA#EK", enrollmentsStatisticsSummaryResponse0.getCurriculumCode());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EnrollmentsSummary enrollmentsSummary0 = mock(EnrollmentsSummary.class, new ViolatedAssumptionAnswer());
      EnrollmentsStatisticsSummaryResponse enrollmentsStatisticsSummaryResponse0 = new EnrollmentsStatisticsSummaryResponse("eU.ICC01oxPR[!W", "eU.ICC01oxPR[!W", enrollmentsSummary0, enrollmentsSummary0, enrollmentsSummary0, enrollmentsSummary0);
      enrollmentsStatisticsSummaryResponse0.setGlossary((EnrollmentsGlossaryFields) null);
      assertEquals("eU.ICC01oxPR[!W", enrollmentsStatisticsSummaryResponse0.getCurriculumCode());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EnrollmentsSummary enrollmentsSummary0 = mock(EnrollmentsSummary.class, new ViolatedAssumptionAnswer());
      EnrollmentsStatisticsSummaryResponse enrollmentsStatisticsSummaryResponse0 = new EnrollmentsStatisticsSummaryResponse("eU.ICC01oxPR[!W", "eU.ICC01oxPR[!W", enrollmentsSummary0, enrollmentsSummary0, enrollmentsSummary0, enrollmentsSummary0);
      String string0 = enrollmentsStatisticsSummaryResponse0.getCurriculumCode();
      assertEquals("eU.ICC01oxPR[!W", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EnrollmentsSummary enrollmentsSummary0 = mock(EnrollmentsSummary.class, new ViolatedAssumptionAnswer());
      doReturn("itH.C 60kH4HA#EK").when(enrollmentsSummary0).toString();
      EnrollmentsStatisticsSummaryResponse enrollmentsStatisticsSummaryResponse0 = new EnrollmentsStatisticsSummaryResponse("itH.C 60kH4HA#EK", "itH.C 60kH4HA#EK", enrollmentsSummary0, enrollmentsSummary0, enrollmentsSummary0, enrollmentsSummary0);
      EnrollmentsSummary enrollmentsSummary1 = enrollmentsStatisticsSummaryResponse0.getOptional();
      assertSame(enrollmentsSummary1, enrollmentsSummary0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EnrollmentsSummary enrollmentsSummary0 = mock(EnrollmentsSummary.class, new ViolatedAssumptionAnswer());
      doReturn("itH.C 60kH4HA#EK", "itH.C 60kH4HA#EK", "itH.C 60kH4HA#EK", (String) null).when(enrollmentsSummary0).toString();
      EnrollmentsStatisticsSummaryResponse enrollmentsStatisticsSummaryResponse0 = new EnrollmentsStatisticsSummaryResponse("itH.C 60kH4HA#EK", "itH.C 60kH4HA#EK", enrollmentsSummary0, enrollmentsSummary0, enrollmentsSummary0, enrollmentsSummary0);
      String string0 = enrollmentsStatisticsSummaryResponse0.toString();
      assertEquals("EnrollmentsStatisticsSummaryResponse{courseCode='itH.C 60kH4HA#EK', curriculumCode='itH.C 60kH4HA#EK', mandatory=itH.C 60kH4HA#EK, optional=itH.C 60kH4HA#EK, elective=itH.C 60kH4HA#EK, complementary=null, glossary=null}", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EnrollmentsSummary enrollmentsSummary0 = mock(EnrollmentsSummary.class, new ViolatedAssumptionAnswer());
      EnrollmentsStatisticsSummaryResponse enrollmentsStatisticsSummaryResponse0 = new EnrollmentsStatisticsSummaryResponse("itH.C 60kH4HA#EK", "itH.C 60kH4HA#EK", enrollmentsSummary0, enrollmentsSummary0, enrollmentsSummary0, enrollmentsSummary0);
      EnrollmentsSummary enrollmentsSummary1 = mock(EnrollmentsSummary.class, new ViolatedAssumptionAnswer());
      enrollmentsStatisticsSummaryResponse0.setOptional(enrollmentsSummary1);
      assertEquals("itH.C 60kH4HA#EK", enrollmentsStatisticsSummaryResponse0.getCourseCode());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EnrollmentsSummary enrollmentsSummary0 = mock(EnrollmentsSummary.class, new ViolatedAssumptionAnswer());
      EnrollmentsStatisticsSummaryResponse enrollmentsStatisticsSummaryResponse0 = new EnrollmentsStatisticsSummaryResponse("itH.C 60kH4HA#EK", "itH.C 60kH4HA#EK", enrollmentsSummary0, enrollmentsSummary0, enrollmentsSummary0, enrollmentsSummary0);
      String string0 = enrollmentsStatisticsSummaryResponse0.getCourseCode();
      assertEquals("itH.C 60kH4HA#EK", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EnrollmentsSummary enrollmentsSummary0 = mock(EnrollmentsSummary.class, new ViolatedAssumptionAnswer());
      doReturn("itH.C 60kH4HA#EK").when(enrollmentsSummary0).toString();
      EnrollmentsStatisticsSummaryResponse enrollmentsStatisticsSummaryResponse0 = new EnrollmentsStatisticsSummaryResponse("itH.C 60kH4HA#EK", "itH.C 60kH4HA#EK", enrollmentsSummary0, enrollmentsSummary0, enrollmentsSummary0, enrollmentsSummary0);
      EnrollmentsSummary enrollmentsSummary1 = enrollmentsStatisticsSummaryResponse0.getMandatory();
      assertSame(enrollmentsSummary1, enrollmentsSummary0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EnrollmentsSummary enrollmentsSummary0 = mock(EnrollmentsSummary.class, new ViolatedAssumptionAnswer());
      EnrollmentsStatisticsSummaryResponse enrollmentsStatisticsSummaryResponse0 = new EnrollmentsStatisticsSummaryResponse("eU.ICC01oxPR[!W", "eU.ICC01oxPR[!W", enrollmentsSummary0, enrollmentsSummary0, enrollmentsSummary0, enrollmentsSummary0);
      EnrollmentsGlossaryFields enrollmentsGlossaryFields0 = enrollmentsStatisticsSummaryResponse0.getGlossary();
      assertNull(enrollmentsGlossaryFields0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EnrollmentsSummary enrollmentsSummary0 = mock(EnrollmentsSummary.class, new ViolatedAssumptionAnswer());
      doReturn("itH.C 60kH4HA#EK").when(enrollmentsSummary0).toString();
      EnrollmentsStatisticsSummaryResponse enrollmentsStatisticsSummaryResponse0 = new EnrollmentsStatisticsSummaryResponse("itH.C 60kH4HA#EK", "itH.C 60kH4HA#EK", enrollmentsSummary0, enrollmentsSummary0, enrollmentsSummary0, enrollmentsSummary0);
      EnrollmentsSummary enrollmentsSummary1 = enrollmentsStatisticsSummaryResponse0.getElective();
      enrollmentsStatisticsSummaryResponse0.setElective(enrollmentsSummary1);
      assertNull(enrollmentsSummary1.getFrom());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EnrollmentsSummary enrollmentsSummary0 = mock(EnrollmentsSummary.class, new ViolatedAssumptionAnswer());
      doReturn("eU.ICC01oxPR[!W").when(enrollmentsSummary0).toString();
      EnrollmentsStatisticsSummaryResponse enrollmentsStatisticsSummaryResponse0 = new EnrollmentsStatisticsSummaryResponse("eU.ICC01oxPR[!W", "eU.ICC01oxPR[!W", enrollmentsSummary0, enrollmentsSummary0, enrollmentsSummary0, enrollmentsSummary0);
      EnrollmentsSummary enrollmentsSummary1 = enrollmentsStatisticsSummaryResponse0.getComplementary();
      enrollmentsStatisticsSummaryResponse0.setComplementary(enrollmentsSummary1);
      assertEquals("eU.ICC01oxPR[!W", enrollmentsStatisticsSummaryResponse0.getCourseCode());
  }
}
