/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 05 23:56:58 GMT 2022
 */

package br.edu.ufcg.computacao.eureca.backend.constants;

import org.junit.Test;
import static org.junit.Assert.*;
import br.edu.ufcg.computacao.eureca.backend.constants.SystemConstants;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SystemConstants_ESTest extends SystemConstants_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SystemConstants systemConstants0 = new SystemConstants();
      assertEquals(4, SystemConstants.CANCELLED_INDEX);
  }
}
