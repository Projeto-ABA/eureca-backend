/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 13 21:40:11 GMT 2022
 */

package br.edu.ufcg.computacao.eureca.backend.core.models;

import org.junit.Test;
import static org.junit.Assert.*;
import br.edu.ufcg.computacao.eureca.backend.core.dao.scsvfiles.mapentries.SubjectKey;
import br.edu.ufcg.computacao.eureca.backend.core.models.StudentCurriculumProgress;
import java.util.Collection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StudentCurriculumProgress_ESTest extends StudentCurriculumProgress_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StudentCurriculumProgress studentCurriculumProgress0 = new StudentCurriculumProgress(443, 0, 0, 0, 2);
      studentCurriculumProgress0.setOngoing((Collection<SubjectKey>) null);
      studentCurriculumProgress0.getOngoing();
      assertEquals(2, studentCurriculumProgress0.getEnrolledCredits());
      assertEquals(443, studentCurriculumProgress0.getCompletedTerms());
      assertEquals(0, studentCurriculumProgress0.getCompletedCredits());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StudentCurriculumProgress studentCurriculumProgress0 = new StudentCurriculumProgress(0, 0, 0, 0, 0);
      int int0 = studentCurriculumProgress0.getEnrolledCredits();
      assertEquals(0, studentCurriculumProgress0.getCompletedCredits());
      assertEquals(0, int0);
      assertEquals(0, studentCurriculumProgress0.getCompletedTerms());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StudentCurriculumProgress studentCurriculumProgress0 = new StudentCurriculumProgress((-305), (-1226), 0, 673, (-305));
      int int0 = studentCurriculumProgress0.getEnrolledCredits();
      assertEquals((-305), studentCurriculumProgress0.getCompletedTerms());
      assertEquals((-553), studentCurriculumProgress0.getCompletedCredits());
      assertEquals((-305), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StudentCurriculumProgress studentCurriculumProgress0 = new StudentCurriculumProgress(528, (-428), 528, 25, 1);
      studentCurriculumProgress0.setEnabled((Collection<SubjectKey>) null);
      studentCurriculumProgress0.getEnabled();
      assertEquals(1, studentCurriculumProgress0.getEnrolledCredits());
      assertEquals(528, studentCurriculumProgress0.getCompletedTerms());
      assertEquals(125, studentCurriculumProgress0.getCompletedCredits());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StudentCurriculumProgress studentCurriculumProgress0 = new StudentCurriculumProgress(0, 462, 462, 2500, 2500);
      studentCurriculumProgress0.setDisabled((Collection<SubjectKey>) null);
      studentCurriculumProgress0.getDisabled();
      assertEquals(2500, studentCurriculumProgress0.getEnrolledCredits());
      assertEquals(3424, studentCurriculumProgress0.getCompletedCredits());
      assertEquals(0, studentCurriculumProgress0.getCompletedTerms());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StudentCurriculumProgress studentCurriculumProgress0 = new StudentCurriculumProgress(0, 0, 0, 1, 1);
      studentCurriculumProgress0.setCompletedTerms(125);
      int int0 = studentCurriculumProgress0.getCompletedTerms();
      assertEquals(125, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StudentCurriculumProgress studentCurriculumProgress0 = new StudentCurriculumProgress((-1315), 0, 0, (-1315), (-4222));
      int int0 = studentCurriculumProgress0.getCompletedTerms();
      assertEquals((-1315), studentCurriculumProgress0.getCompletedCredits());
      assertEquals((-1315), int0);
      assertEquals((-4222), studentCurriculumProgress0.getEnrolledCredits());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StudentCurriculumProgress studentCurriculumProgress0 = new StudentCurriculumProgress(1, 1, 1, 0, 125);
      int int0 = studentCurriculumProgress0.getCompletedOptionalCredits();
      assertEquals(1, int0);
      assertEquals(1, studentCurriculumProgress0.getCompletedTerms());
      assertEquals(125, studentCurriculumProgress0.getEnrolledCredits());
      assertEquals(2, studentCurriculumProgress0.getCompletedCredits());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StudentCurriculumProgress studentCurriculumProgress0 = new StudentCurriculumProgress(443, 0, 0, 0, 2);
      studentCurriculumProgress0.setCompletedMandatoryCredits(1442);
      int int0 = studentCurriculumProgress0.getCompletedMandatoryCredits();
      assertEquals(1442, studentCurriculumProgress0.getCompletedCredits());
      assertEquals(1442, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StudentCurriculumProgress studentCurriculumProgress0 = new StudentCurriculumProgress(39, (-1289), (-1289), (-1289), 0);
      int int0 = studentCurriculumProgress0.getCompletedMandatoryCredits();
      assertEquals((-1289), int0);
      assertEquals((-3867), studentCurriculumProgress0.getCompletedCredits());
      assertEquals(39, studentCurriculumProgress0.getCompletedTerms());
      assertEquals(0, studentCurriculumProgress0.getEnrolledCredits());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StudentCurriculumProgress studentCurriculumProgress0 = new StudentCurriculumProgress(0, 0, 0, 0, 2);
      int int0 = studentCurriculumProgress0.getCompletedCredits();
      assertEquals(0, studentCurriculumProgress0.getCompletedTerms());
      assertEquals(2, studentCurriculumProgress0.getEnrolledCredits());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StudentCurriculumProgress studentCurriculumProgress0 = new StudentCurriculumProgress(0, 0, 0, 3795, 0);
      int int0 = studentCurriculumProgress0.getCompletedCredits();
      assertEquals(3795, int0);
      assertEquals(0, studentCurriculumProgress0.getCompletedTerms());
      assertEquals(0, studentCurriculumProgress0.getEnrolledCredits());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StudentCurriculumProgress studentCurriculumProgress0 = new StudentCurriculumProgress((-2317), 0, 0, 1, 0);
      int int0 = studentCurriculumProgress0.getCompletedComplementaryCredits();
      assertEquals(1, studentCurriculumProgress0.getCompletedCredits());
      assertEquals(0, studentCurriculumProgress0.getEnrolledCredits());
      assertEquals(1, int0);
      assertEquals((-2317), studentCurriculumProgress0.getCompletedTerms());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StudentCurriculumProgress studentCurriculumProgress0 = new StudentCurriculumProgress(443, 0, 0, 0, 2);
      studentCurriculumProgress0.setCompleted((Collection<SubjectKey>) null);
      studentCurriculumProgress0.getCompleted();
      assertEquals(2, studentCurriculumProgress0.getEnrolledCredits());
      assertEquals(443, studentCurriculumProgress0.getCompletedTerms());
      assertEquals(0, studentCurriculumProgress0.getCompletedCredits());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StudentCurriculumProgress studentCurriculumProgress0 = new StudentCurriculumProgress(0, 0, 0, 0, 2);
      studentCurriculumProgress0.setAdequate((Collection<SubjectKey>) null);
      studentCurriculumProgress0.getAdequate();
      assertEquals(2, studentCurriculumProgress0.getEnrolledCredits());
      assertEquals(0, studentCurriculumProgress0.getCompletedCredits());
      assertEquals(0, studentCurriculumProgress0.getCompletedTerms());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StudentCurriculumProgress studentCurriculumProgress0 = new StudentCurriculumProgress((-2269), (-2269), (-1110), (-1110), 1);
      Collection<SubjectKey> collection0 = studentCurriculumProgress0.getDisabled();
      studentCurriculumProgress0.setAdequate(collection0);
      assertEquals((-4489), studentCurriculumProgress0.getCompletedCredits());
      assertEquals(1, studentCurriculumProgress0.getEnrolledCredits());
      assertEquals((-2269), studentCurriculumProgress0.getCompletedTerms());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StudentCurriculumProgress studentCurriculumProgress0 = new StudentCurriculumProgress((-1192), 0, 0, 0, 0);
      studentCurriculumProgress0.getAdequate();
      assertEquals(0, studentCurriculumProgress0.getEnrolledCredits());
      assertEquals(0, studentCurriculumProgress0.getCompletedCredits());
      assertEquals((-1192), studentCurriculumProgress0.getCompletedTerms());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StudentCurriculumProgress studentCurriculumProgress0 = new StudentCurriculumProgress((-2269), (-2269), (-1110), (-1110), 1);
      studentCurriculumProgress0.setCompletedComplementaryCredits(0);
      int int0 = studentCurriculumProgress0.getCompletedComplementaryCredits();
      assertEquals((-3379), studentCurriculumProgress0.getCompletedCredits());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StudentCurriculumProgress studentCurriculumProgress0 = new StudentCurriculumProgress((-2269), (-2269), (-1110), (-1110), 1);
      int int0 = studentCurriculumProgress0.getCompletedComplementaryCredits();
      assertEquals((-1110), int0);
      assertEquals(1, studentCurriculumProgress0.getEnrolledCredits());
      assertEquals((-2269), studentCurriculumProgress0.getCompletedTerms());
      assertEquals((-4489), studentCurriculumProgress0.getCompletedCredits());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StudentCurriculumProgress studentCurriculumProgress0 = new StudentCurriculumProgress(0, 0, 0, 0, 0);
      studentCurriculumProgress0.getOngoing();
      assertEquals(0, studentCurriculumProgress0.getCompletedTerms());
      assertEquals(0, studentCurriculumProgress0.getCompletedCredits());
      assertEquals(0, studentCurriculumProgress0.getEnrolledCredits());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StudentCurriculumProgress studentCurriculumProgress0 = new StudentCurriculumProgress((-2269), (-2269), (-1110), (-1110), 1);
      studentCurriculumProgress0.setCompletedOptionalCredits(0);
      int int0 = studentCurriculumProgress0.getCompletedOptionalCredits();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StudentCurriculumProgress studentCurriculumProgress0 = new StudentCurriculumProgress((-2269), (-2269), (-1110), (-1110), 1);
      int int0 = studentCurriculumProgress0.getEnrolledCredits();
      assertEquals((-4489), studentCurriculumProgress0.getCompletedCredits());
      assertEquals((-2269), studentCurriculumProgress0.getCompletedTerms());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StudentCurriculumProgress studentCurriculumProgress0 = new StudentCurriculumProgress(1, 1, 1, 0, 125);
      studentCurriculumProgress0.getCompleted();
      assertEquals(2, studentCurriculumProgress0.getCompletedCredits());
      assertEquals(1, studentCurriculumProgress0.getCompletedTerms());
      assertEquals(125, studentCurriculumProgress0.getEnrolledCredits());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StudentCurriculumProgress studentCurriculumProgress0 = new StudentCurriculumProgress((-2269), (-2269), (-1110), (-1110), 1);
      studentCurriculumProgress0.setEnrolledCredits(1);
      assertEquals((-4489), studentCurriculumProgress0.getCompletedCredits());
      assertEquals(1, studentCurriculumProgress0.getEnrolledCredits());
      assertEquals((-2269), studentCurriculumProgress0.getCompletedTerms());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StudentCurriculumProgress studentCurriculumProgress0 = new StudentCurriculumProgress((-2269), (-2269), (-1110), (-1110), 1);
      int int0 = studentCurriculumProgress0.getCompletedOptionalCredits();
      assertEquals((-2269), studentCurriculumProgress0.getCompletedTerms());
      assertEquals((-4489), studentCurriculumProgress0.getCompletedCredits());
      assertEquals(1, studentCurriculumProgress0.getEnrolledCredits());
      assertEquals((-1110), int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StudentCurriculumProgress studentCurriculumProgress0 = new StudentCurriculumProgress(0, 0, 0, 0, 0);
      int int0 = studentCurriculumProgress0.getCompletedTerms();
      assertEquals(0, int0);
      assertEquals(0, studentCurriculumProgress0.getCompletedCredits());
      assertEquals(0, studentCurriculumProgress0.getEnrolledCredits());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StudentCurriculumProgress studentCurriculumProgress0 = new StudentCurriculumProgress((-1192), 0, 0, 0, 0);
      Collection<SubjectKey> collection0 = studentCurriculumProgress0.getEnabled();
      studentCurriculumProgress0.setEnabled(collection0);
      assertEquals(0, studentCurriculumProgress0.getEnrolledCredits());
      assertEquals((-1192), studentCurriculumProgress0.getCompletedTerms());
      assertEquals(0, studentCurriculumProgress0.getCompletedCredits());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StudentCurriculumProgress studentCurriculumProgress0 = new StudentCurriculumProgress((-2269), (-2269), (-1110), (-1110), 1);
      int int0 = studentCurriculumProgress0.getCompletedCredits();
      assertEquals((-4489), int0);
      assertEquals(1, studentCurriculumProgress0.getEnrolledCredits());
      assertEquals((-2269), studentCurriculumProgress0.getCompletedTerms());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StudentCurriculumProgress studentCurriculumProgress0 = new StudentCurriculumProgress((-1192), 0, 0, 0, 0);
      int int0 = studentCurriculumProgress0.getCompletedMandatoryCredits();
      assertEquals(0, studentCurriculumProgress0.getCompletedCredits());
      assertEquals(0, studentCurriculumProgress0.getEnrolledCredits());
      assertEquals((-1192), studentCurriculumProgress0.getCompletedTerms());
      assertEquals(0, int0);
  }
}
