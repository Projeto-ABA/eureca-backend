/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 05 23:48:06 GMT 2022
 */

package br.edu.ufcg.computacao.eureca.backend.api.http.response.retention.subject;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import br.edu.ufcg.computacao.eureca.backend.api.http.response.retention.subject.SubjectRetentionPerAdmissionTerm;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SubjectRetentionPerAdmissionTerm_ESTest extends SubjectRetentionPerAdmissionTerm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SubjectRetentionPerAdmissionTerm subjectRetentionPerAdmissionTerm0 = new SubjectRetentionPerAdmissionTerm("", 0, 0);
      subjectRetentionPerAdmissionTerm0.setAdmissionTerm("s`#q:P:");
      subjectRetentionPerAdmissionTerm0.getTerm();
      assertEquals(0, subjectRetentionPerAdmissionTerm0.getAdequate());
      assertEquals(0, subjectRetentionPerAdmissionTerm0.getPossible());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SubjectRetentionPerAdmissionTerm subjectRetentionPerAdmissionTerm0 = new SubjectRetentionPerAdmissionTerm("", 725, 0);
      subjectRetentionPerAdmissionTerm0.getTerm();
      assertEquals(0, subjectRetentionPerAdmissionTerm0.getPossible());
      assertEquals(725, subjectRetentionPerAdmissionTerm0.getAdequate());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SubjectRetentionPerAdmissionTerm subjectRetentionPerAdmissionTerm0 = new SubjectRetentionPerAdmissionTerm((String) null, (-964), (-1617));
      int int0 = subjectRetentionPerAdmissionTerm0.getPossible();
      assertEquals((-1617), int0);
      assertEquals((-964), subjectRetentionPerAdmissionTerm0.getAdequate());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SubjectRetentionPerAdmissionTerm subjectRetentionPerAdmissionTerm0 = new SubjectRetentionPerAdmissionTerm((String) null, (-964), (-1617));
      subjectRetentionPerAdmissionTerm0.getAdmissionTerm();
      assertEquals((-1617), subjectRetentionPerAdmissionTerm0.getPossible());
      assertEquals((-964), subjectRetentionPerAdmissionTerm0.getAdequate());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SubjectRetentionPerAdmissionTerm subjectRetentionPerAdmissionTerm0 = new SubjectRetentionPerAdmissionTerm("", 0, 0);
      subjectRetentionPerAdmissionTerm0.setAdmissionTerm("s`#q:P:");
      subjectRetentionPerAdmissionTerm0.getAdmissionTerm();
      assertEquals(0, subjectRetentionPerAdmissionTerm0.getAdequate());
      assertEquals(0, subjectRetentionPerAdmissionTerm0.getPossible());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SubjectRetentionPerAdmissionTerm subjectRetentionPerAdmissionTerm0 = new SubjectRetentionPerAdmissionTerm("", 0, 0);
      subjectRetentionPerAdmissionTerm0.setAdequate(20);
      int int0 = subjectRetentionPerAdmissionTerm0.getAdequate();
      assertEquals(20, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SubjectRetentionPerAdmissionTerm subjectRetentionPerAdmissionTerm0 = new SubjectRetentionPerAdmissionTerm("br.edu.ufcg.computacao.eureca.backend.api.http.response.retention.subject.SubjectRetentionPerAdmissionTerm", 0, 0);
      subjectRetentionPerAdmissionTerm0.setAdequate((-1837));
      int int0 = subjectRetentionPerAdmissionTerm0.getAdequate();
      assertEquals((-1837), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SubjectRetentionPerAdmissionTerm subjectRetentionPerAdmissionTerm0 = new SubjectRetentionPerAdmissionTerm("[r`<ui{hzyOQdf", 0, 0);
      subjectRetentionPerAdmissionTerm0.compareTo(subjectRetentionPerAdmissionTerm0);
      assertEquals(0, subjectRetentionPerAdmissionTerm0.getAdequate());
      assertEquals(0, subjectRetentionPerAdmissionTerm0.getPossible());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SubjectRetentionPerAdmissionTerm subjectRetentionPerAdmissionTerm0 = new SubjectRetentionPerAdmissionTerm("br.edu.ufcg.computacao.eureca.backend.api.http.response.retention.subject.SubjectRetentionPerAdmissionTerm", (-667), (-667));
      SubjectRetentionPerAdmissionTerm subjectRetentionPerAdmissionTerm1 = new SubjectRetentionPerAdmissionTerm("", 1, 0);
      int int0 = subjectRetentionPerAdmissionTerm0.compareTo(subjectRetentionPerAdmissionTerm1);
      assertEquals(106, int0);
      assertEquals((-667), subjectRetentionPerAdmissionTerm0.getPossible());
      assertEquals(0, subjectRetentionPerAdmissionTerm1.getPossible());
      assertEquals(1, subjectRetentionPerAdmissionTerm1.getAdequate());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SubjectRetentionPerAdmissionTerm subjectRetentionPerAdmissionTerm0 = new SubjectRetentionPerAdmissionTerm((String) null, 3525, 3525);
      subjectRetentionPerAdmissionTerm0.setAdmissionTerm("12fBMMTHAANh");
      SubjectRetentionPerAdmissionTerm subjectRetentionPerAdmissionTerm1 = new SubjectRetentionPerAdmissionTerm("D=%@vzg^3", 0, 1);
      int int0 = subjectRetentionPerAdmissionTerm0.compareTo(subjectRetentionPerAdmissionTerm1);
      assertEquals(0, subjectRetentionPerAdmissionTerm1.getAdequate());
      assertEquals(1, subjectRetentionPerAdmissionTerm1.getPossible());
      assertEquals(3525, subjectRetentionPerAdmissionTerm0.getAdequate());
      assertEquals((-19), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SubjectRetentionPerAdmissionTerm subjectRetentionPerAdmissionTerm0 = new SubjectRetentionPerAdmissionTerm("", 0, 0);
      // Undeclared exception!
      try { 
        subjectRetentionPerAdmissionTerm0.compareTo("");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to br.edu.ufcg.computacao.eureca.backend.api.http.response.retention.subject.SubjectRetentionPerAdmissionTerm
         //
         verifyException("br.edu.ufcg.computacao.eureca.backend.api.http.response.retention.subject.SubjectRetentionPerAdmissionTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SubjectRetentionPerAdmissionTerm subjectRetentionPerAdmissionTerm0 = new SubjectRetentionPerAdmissionTerm("", 0, 0);
      subjectRetentionPerAdmissionTerm0.getAdmissionTerm();
      assertEquals(0, subjectRetentionPerAdmissionTerm0.getPossible());
      assertEquals(0, subjectRetentionPerAdmissionTerm0.getAdequate());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SubjectRetentionPerAdmissionTerm subjectRetentionPerAdmissionTerm0 = new SubjectRetentionPerAdmissionTerm("", 0, 0);
      subjectRetentionPerAdmissionTerm0.incrementAdequate();
      assertEquals(1, subjectRetentionPerAdmissionTerm0.getAdequate());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SubjectRetentionPerAdmissionTerm subjectRetentionPerAdmissionTerm0 = new SubjectRetentionPerAdmissionTerm("", 0, 0);
      // Undeclared exception!
      try { 
        subjectRetentionPerAdmissionTerm0.compareTo((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("br.edu.ufcg.computacao.eureca.backend.api.http.response.retention.subject.SubjectRetentionPerAdmissionTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SubjectRetentionPerAdmissionTerm subjectRetentionPerAdmissionTerm0 = new SubjectRetentionPerAdmissionTerm("", 0, 0);
      subjectRetentionPerAdmissionTerm0.setPossible(116);
      int int0 = subjectRetentionPerAdmissionTerm0.getPossible();
      assertEquals(116, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SubjectRetentionPerAdmissionTerm subjectRetentionPerAdmissionTerm0 = new SubjectRetentionPerAdmissionTerm("", 0, 0);
      subjectRetentionPerAdmissionTerm0.incrementPossible();
      assertEquals(1, subjectRetentionPerAdmissionTerm0.getPossible());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SubjectRetentionPerAdmissionTerm subjectRetentionPerAdmissionTerm0 = new SubjectRetentionPerAdmissionTerm("", 0, 0);
      int int0 = subjectRetentionPerAdmissionTerm0.getAdequate();
      assertEquals(0, int0);
      assertEquals(0, subjectRetentionPerAdmissionTerm0.getPossible());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SubjectRetentionPerAdmissionTerm subjectRetentionPerAdmissionTerm0 = new SubjectRetentionPerAdmissionTerm((String) null, (-964), (-1617));
      subjectRetentionPerAdmissionTerm0.getTerm();
      assertEquals((-964), subjectRetentionPerAdmissionTerm0.getAdequate());
      assertEquals((-1617), subjectRetentionPerAdmissionTerm0.getPossible());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SubjectRetentionPerAdmissionTerm subjectRetentionPerAdmissionTerm0 = new SubjectRetentionPerAdmissionTerm("br.edu.ufcg.computacao.eureca.backend.api.http.response.retention.subject.SubjectRetentionPerAdmissionTerm", 0, 0);
      int int0 = subjectRetentionPerAdmissionTerm0.getPossible();
      assertEquals(0, int0);
      assertEquals(0, subjectRetentionPerAdmissionTerm0.getAdequate());
  }
}
