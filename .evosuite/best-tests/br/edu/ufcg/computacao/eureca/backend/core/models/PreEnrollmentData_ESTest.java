/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 05 23:16:55 GMT 2022
 */

package br.edu.ufcg.computacao.eureca.backend.core.models;

import org.junit.Test;
import static org.junit.Assert.*;
import br.edu.ufcg.computacao.eureca.backend.core.models.PreEnrollmentData;
import br.edu.ufcg.computacao.eureca.backend.core.models.SubjectSchedule;
import java.util.Collection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PreEnrollmentData_ESTest extends PreEnrollmentData_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PreEnrollmentData preEnrollmentData0 = new PreEnrollmentData((Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null);
      Collection<SubjectSchedule> collection0 = preEnrollmentData0.getAvailableComplementarySubjects();
      assertNull(collection0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PreEnrollmentData preEnrollmentData0 = new PreEnrollmentData((Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null);
      Collection<SubjectSchedule> collection0 = preEnrollmentData0.getAvailableElectiveSubjects();
      assertNull(collection0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PreEnrollmentData preEnrollmentData0 = new PreEnrollmentData((Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null);
      preEnrollmentData0.setPrioritizedElectiveSubjects((Collection<SubjectSchedule>) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PreEnrollmentData preEnrollmentData0 = new PreEnrollmentData((Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null);
      Collection<SubjectSchedule> collection0 = preEnrollmentData0.getPrioritizedMandatorySubjects();
      assertNull(collection0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PreEnrollmentData preEnrollmentData0 = new PreEnrollmentData((Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null);
      preEnrollmentData0.setAvailableOptionalSubjects((Collection<SubjectSchedule>) null);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PreEnrollmentData preEnrollmentData0 = new PreEnrollmentData((Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null);
      preEnrollmentData0.setPrioritizedMandatorySubjects((Collection<SubjectSchedule>) null);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PreEnrollmentData preEnrollmentData0 = new PreEnrollmentData((Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null);
      preEnrollmentData0.setAvailableMandatorySubjects((Collection<SubjectSchedule>) null);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PreEnrollmentData preEnrollmentData0 = new PreEnrollmentData((Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null);
      preEnrollmentData0.setAvailableElectiveSubjects((Collection<SubjectSchedule>) null);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PreEnrollmentData preEnrollmentData0 = new PreEnrollmentData((Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null);
      Collection<SubjectSchedule> collection0 = preEnrollmentData0.getPrioritizedElectiveSubjects();
      assertNull(collection0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PreEnrollmentData preEnrollmentData0 = new PreEnrollmentData((Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null);
      preEnrollmentData0.setPrioritizedOptionalSubjects((Collection<SubjectSchedule>) null);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PreEnrollmentData preEnrollmentData0 = new PreEnrollmentData((Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null);
      preEnrollmentData0.setPrioritizedComplementarySubjects((Collection<SubjectSchedule>) null);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PreEnrollmentData preEnrollmentData0 = new PreEnrollmentData((Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null);
      Collection<SubjectSchedule> collection0 = preEnrollmentData0.getPrioritizedComplementarySubjects();
      assertNull(collection0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PreEnrollmentData preEnrollmentData0 = new PreEnrollmentData((Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null);
      Collection<SubjectSchedule> collection0 = preEnrollmentData0.getAvailableMandatorySubjects();
      assertNull(collection0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PreEnrollmentData preEnrollmentData0 = new PreEnrollmentData((Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null);
      Collection<SubjectSchedule> collection0 = preEnrollmentData0.getPrioritizedOptionalSubjects();
      assertNull(collection0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PreEnrollmentData preEnrollmentData0 = new PreEnrollmentData((Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null);
      Collection<SubjectSchedule> collection0 = preEnrollmentData0.getAvailableOptionalSubjects();
      assertNull(collection0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PreEnrollmentData preEnrollmentData0 = new PreEnrollmentData((Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null, (Collection<SubjectSchedule>) null);
      preEnrollmentData0.setAvailableComplementarySubjects((Collection<SubjectSchedule>) null);
  }
}
