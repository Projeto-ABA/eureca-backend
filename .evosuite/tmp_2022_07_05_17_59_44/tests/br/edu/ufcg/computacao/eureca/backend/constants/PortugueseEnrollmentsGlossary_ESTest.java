/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 05 23:42:49 GMT 2022
 */

package br.edu.ufcg.computacao.eureca.backend.constants;

import org.junit.Test;
import static org.junit.Assert.*;
import br.edu.ufcg.computacao.eureca.backend.constants.EnrollmentsGlossaryFields;
import br.edu.ufcg.computacao.eureca.backend.constants.PortugueseEnrollmentsGlossary;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PortugueseEnrollmentsGlossary_ESTest extends PortugueseEnrollmentsGlossary_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PortugueseEnrollmentsGlossary portugueseEnrollmentsGlossary0 = new PortugueseEnrollmentsGlossary();
      EnrollmentsGlossaryFields enrollmentsGlossaryFields0 = portugueseEnrollmentsGlossary0.getGlossary();
      assertNotNull(enrollmentsGlossaryFields0);
  }
}
