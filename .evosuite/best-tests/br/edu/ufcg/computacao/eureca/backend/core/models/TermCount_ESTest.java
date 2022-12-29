/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 13 21:29:22 GMT 2022
 */

package br.edu.ufcg.computacao.eureca.backend.core.models;

import org.junit.Test;
import static org.junit.Assert.*;
import br.edu.ufcg.computacao.eureca.backend.core.models.TermCount;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TermCount_ESTest extends TermCount_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TermCount termCount0 = new TermCount((-752), (String) null);
      termCount0.getTerm();
      assertEquals((-752), termCount0.getCount());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TermCount termCount0 = new TermCount(1648, "P/DG$=\"");
      termCount0.getTerm();
      assertEquals(1648, termCount0.getCount());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TermCount termCount0 = new TermCount(0, "TermCount{count=");
      int int0 = termCount0.getCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TermCount termCount0 = new TermCount(1920, (String) null);
      int int0 = termCount0.getCount();
      assertEquals(1920, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TermCount termCount0 = new TermCount((-5702), "");
      termCount0.setCount((-5702));
      assertEquals((-5702), termCount0.getCount());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TermCount termCount0 = new TermCount((-5702), "");
      termCount0.setTerm("");
      assertEquals((-5702), termCount0.getCount());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      TermCount termCount0 = new TermCount((-5702), "");
      termCount0.getTerm();
      assertEquals((-5702), termCount0.getCount());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      TermCount termCount0 = new TermCount((-5702), "");
      int int0 = termCount0.getCount();
      assertEquals((-5702), int0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      TermCount termCount0 = new TermCount((-5702), "");
      String string0 = termCount0.toString();
      assertEquals("TermCount{count=-5702, term=''}", string0);
  }
}