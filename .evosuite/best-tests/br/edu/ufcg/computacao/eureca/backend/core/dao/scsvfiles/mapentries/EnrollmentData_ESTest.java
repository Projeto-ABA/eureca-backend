/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 05 23:32:29 GMT 2022
 */

package br.edu.ufcg.computacao.eureca.backend.core.dao.scsvfiles.mapentries;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import br.edu.ufcg.computacao.eureca.backend.core.dao.scsvfiles.mapentries.EnrollmentData;
import br.edu.ufcg.computacao.eureca.backend.core.dao.scsvfiles.mapentries.RegistrationSubjectCodeTermKey;
import br.edu.ufcg.computacao.eureca.backend.core.models.Enrollment;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EnrollmentData_ESTest extends EnrollmentData_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EnrollmentData enrollmentData0 = new EnrollmentData("'^M1U~gZ", 0, 5432.32545198404, "");
      String string0 = enrollmentData0.getStatus();
      assertEquals(5432.32545198404, enrollmentData0.getGrade(), 0.01);
      assertEquals("", string0);
      assertEquals("'^M1U~gZ", enrollmentData0.getClassId());
      assertEquals(0, enrollmentData0.getCredits());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EnrollmentData enrollmentData0 = new EnrollmentData("Enrollment{registration='", (-2522), (-2522), "Enrollment{registration='");
      double double0 = enrollmentData0.getGrade();
      assertEquals((-2522.0), double0, 0.01);
      assertEquals((-2522), enrollmentData0.getCredits());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EnrollmentData enrollmentData0 = new EnrollmentData((String) null, 119, 119, "");
      int int0 = enrollmentData0.getCredits();
      assertEquals(119.0, enrollmentData0.getGrade(), 0.01);
      assertEquals(119, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EnrollmentData enrollmentData0 = new EnrollmentData();
      enrollmentData0.setCredits((-1024));
      int int0 = enrollmentData0.getCredits();
      assertEquals((-1024), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EnrollmentData enrollmentData0 = new EnrollmentData("", 0, 0, (String) null);
      String string0 = enrollmentData0.getClassId();
      assertEquals(0, enrollmentData0.getCredits());
      assertNotNull(string0);
      assertEquals(0.0, enrollmentData0.getGrade(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EnrollmentData enrollmentData0 = new EnrollmentData();
      RegistrationSubjectCodeTermKey registrationSubjectCodeTermKey0 = mock(RegistrationSubjectCodeTermKey.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(registrationSubjectCodeTermKey0).getRegistration();
      doReturn((String) null).when(registrationSubjectCodeTermKey0).getSubjectCode();
      doReturn((String) null).when(registrationSubjectCodeTermKey0).getTerm();
      Enrollment enrollment0 = enrollmentData0.createEnrollment(registrationSubjectCodeTermKey0);
      assertEquals(0, enrollment0.getCredits());
      assertEquals(0.0, enrollment0.getGrade(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EnrollmentData enrollmentData0 = new EnrollmentData((String) null, 119, 119, "");
      RegistrationSubjectCodeTermKey registrationSubjectCodeTermKey0 = mock(RegistrationSubjectCodeTermKey.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(registrationSubjectCodeTermKey0).getRegistration();
      doReturn((String) null).when(registrationSubjectCodeTermKey0).getSubjectCode();
      doReturn((String) null).when(registrationSubjectCodeTermKey0).getTerm();
      Enrollment enrollment0 = enrollmentData0.createEnrollment(registrationSubjectCodeTermKey0);
      assertEquals(119.0, enrollment0.getGrade(), 0.01);
      assertEquals(119, enrollment0.getCredits());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EnrollmentData enrollmentData0 = new EnrollmentData("Enrollment{registration='", (-2522), (-2522), "Enrollment{registration='");
      RegistrationSubjectCodeTermKey registrationSubjectCodeTermKey0 = mock(RegistrationSubjectCodeTermKey.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(registrationSubjectCodeTermKey0).getRegistration();
      doReturn((String) null).when(registrationSubjectCodeTermKey0).getSubjectCode();
      doReturn((String) null).when(registrationSubjectCodeTermKey0).getTerm();
      Enrollment enrollment0 = enrollmentData0.createEnrollment(registrationSubjectCodeTermKey0);
      assertEquals((-2522.0), enrollment0.getGrade(), 0.01);
      assertEquals((-2522), enrollment0.getCredits());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EnrollmentData enrollmentData0 = new EnrollmentData();
      enrollmentData0.setStatus("Enrollment{ classId=null, credits=-1024, grade='1.0', status='null'}");
      String string0 = enrollmentData0.getStatus();
      assertEquals("Enrollment{ classId=null, credits=-1024, grade='1.0', status='null'}", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EnrollmentData enrollmentData0 = new EnrollmentData();
      String string0 = enrollmentData0.getStatus();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EnrollmentData enrollmentData0 = new EnrollmentData();
      String string0 = enrollmentData0.getClassId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EnrollmentData enrollmentData0 = new EnrollmentData();
      enrollmentData0.setGrade(1.0);
      double double0 = enrollmentData0.getGrade();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EnrollmentData enrollmentData0 = new EnrollmentData();
      enrollmentData0.setClassId("Enrollment{ classId=null, credits=-1024, grade='1.0', status='null'}");
      String string0 = enrollmentData0.getClassId();
      assertEquals("Enrollment{ classId=null, credits=-1024, grade='1.0', status='null'}", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EnrollmentData enrollmentData0 = new EnrollmentData();
      double double0 = enrollmentData0.getGrade();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EnrollmentData enrollmentData0 = new EnrollmentData();
      int int0 = enrollmentData0.getCredits();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EnrollmentData enrollmentData0 = new EnrollmentData();
      // Undeclared exception!
      try { 
        enrollmentData0.createEnrollment((RegistrationSubjectCodeTermKey) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("br.edu.ufcg.computacao.eureca.backend.core.dao.scsvfiles.mapentries.EnrollmentData", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EnrollmentData enrollmentData0 = new EnrollmentData("0`Z}Lh/V}G6xJ/ie$", 2, 2, "0`Z}Lh/V}G6xJ/ie$");
      String string0 = enrollmentData0.toString();
      assertEquals("Enrollment{ classId=0`Z}Lh/V}G6xJ/ie$, credits=2, grade='2.0', status='0`Z}Lh/V}G6xJ/ie$'}", string0);
  }
}
