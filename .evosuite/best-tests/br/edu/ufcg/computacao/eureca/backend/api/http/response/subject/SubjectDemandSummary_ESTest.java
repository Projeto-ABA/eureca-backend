/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 13 21:37:18 GMT 2022
 */

package br.edu.ufcg.computacao.eureca.backend.api.http.response.subject;

import org.junit.Test;
import static org.junit.Assert.*;
import br.edu.ufcg.computacao.eureca.backend.api.http.response.preenrollment.DetailedSubjectDemand;
import br.edu.ufcg.computacao.eureca.backend.api.http.response.subject.SubjectDemandSummary;
import java.util.Collection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SubjectDemandSummary_ESTest extends SubjectDemandSummary_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SubjectDemandSummary subjectDemandSummary0 = new SubjectDemandSummary((Collection<DetailedSubjectDemand>) null, (Collection<DetailedSubjectDemand>) null, (Collection<DetailedSubjectDemand>) null, (Collection<DetailedSubjectDemand>) null);
      subjectDemandSummary0.setComplementaryDemand((Collection<DetailedSubjectDemand>) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SubjectDemandSummary subjectDemandSummary0 = new SubjectDemandSummary((Collection<DetailedSubjectDemand>) null, (Collection<DetailedSubjectDemand>) null, (Collection<DetailedSubjectDemand>) null, (Collection<DetailedSubjectDemand>) null);
      Collection<DetailedSubjectDemand> collection0 = subjectDemandSummary0.getMandatoryDemand();
      assertNull(collection0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SubjectDemandSummary subjectDemandSummary0 = new SubjectDemandSummary((Collection<DetailedSubjectDemand>) null, (Collection<DetailedSubjectDemand>) null, (Collection<DetailedSubjectDemand>) null, (Collection<DetailedSubjectDemand>) null);
      Collection<DetailedSubjectDemand> collection0 = subjectDemandSummary0.getElectiveDemand();
      assertNull(collection0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SubjectDemandSummary subjectDemandSummary0 = new SubjectDemandSummary((Collection<DetailedSubjectDemand>) null, (Collection<DetailedSubjectDemand>) null, (Collection<DetailedSubjectDemand>) null, (Collection<DetailedSubjectDemand>) null);
      String string0 = subjectDemandSummary0.toString();
      assertEquals("SubjectDemandSummary{mandatoryDemand=null, optionalDemand=null, complementaryDemand=null, electiveDemand=null}", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SubjectDemandSummary subjectDemandSummary0 = new SubjectDemandSummary((Collection<DetailedSubjectDemand>) null, (Collection<DetailedSubjectDemand>) null, (Collection<DetailedSubjectDemand>) null, (Collection<DetailedSubjectDemand>) null);
      subjectDemandSummary0.setElectiveDemand((Collection<DetailedSubjectDemand>) null);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SubjectDemandSummary subjectDemandSummary0 = new SubjectDemandSummary((Collection<DetailedSubjectDemand>) null, (Collection<DetailedSubjectDemand>) null, (Collection<DetailedSubjectDemand>) null, (Collection<DetailedSubjectDemand>) null);
      Collection<DetailedSubjectDemand> collection0 = subjectDemandSummary0.getComplementaryDemand();
      assertNull(collection0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SubjectDemandSummary subjectDemandSummary0 = new SubjectDemandSummary((Collection<DetailedSubjectDemand>) null, (Collection<DetailedSubjectDemand>) null, (Collection<DetailedSubjectDemand>) null, (Collection<DetailedSubjectDemand>) null);
      subjectDemandSummary0.setOptionalDemand((Collection<DetailedSubjectDemand>) null);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SubjectDemandSummary subjectDemandSummary0 = new SubjectDemandSummary((Collection<DetailedSubjectDemand>) null, (Collection<DetailedSubjectDemand>) null, (Collection<DetailedSubjectDemand>) null, (Collection<DetailedSubjectDemand>) null);
      Collection<DetailedSubjectDemand> collection0 = subjectDemandSummary0.getOptionalDemand();
      assertNull(collection0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      SubjectDemandSummary subjectDemandSummary0 = new SubjectDemandSummary((Collection<DetailedSubjectDemand>) null, (Collection<DetailedSubjectDemand>) null, (Collection<DetailedSubjectDemand>) null, (Collection<DetailedSubjectDemand>) null);
      subjectDemandSummary0.setMandatoryDemand((Collection<DetailedSubjectDemand>) null);
  }
}