/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 05 23:56:40 GMT 2022
 */

package br.edu.ufcg.computacao.eureca.backend.constants;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import br.edu.ufcg.computacao.eureca.backend.constants.Field;
import br.edu.ufcg.computacao.eureca.backend.constants.RetentionGlossaryFields;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RetentionGlossaryFields_ESTest extends RetentionGlossaryFields_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Field field0 = mock(Field.class, new ViolatedAssumptionAnswer());
      Field field1 = mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(field1).toString();
      RetentionGlossaryFields retentionGlossaryFields0 = new RetentionGlossaryFields(field0, field0, field0, field0, field0, field0, field0, field0, field0, field0, field0, field1);
      retentionGlossaryFields0.getTransferCount();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Field field0 = mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(field0).toString();
      RetentionGlossaryFields retentionGlossaryFields0 = new RetentionGlossaryFields(field0, field0, field0, field0, field0, field0, field0, field0, field0, field0, field0, field0);
      Field field1 = mock(Field.class, new ViolatedAssumptionAnswer());
      retentionGlossaryFields0.averageRisk = field1;
      Field field2 = retentionGlossaryFields0.getAverageTime();
      retentionGlossaryFields0.setDropoutCount(field2);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Field field0 = mock(Field.class, new ViolatedAssumptionAnswer());
      RetentionGlossaryFields retentionGlossaryFields0 = new RetentionGlossaryFields(field0, field0, field0, field0, field0, field0, field0, field0, field0, field0, field0, field0);
      Field field1 = mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(field1).toString();
      retentionGlossaryFields0.averageRisk = field1;
      retentionGlossaryFields0.setDropoutCount(retentionGlossaryFields0.averageRisk);
      retentionGlossaryFields0.getDropoutCount();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Field field0 = mock(Field.class, new ViolatedAssumptionAnswer());
      Field field1 = mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(field1).toString();
      RetentionGlossaryFields retentionGlossaryFields0 = new RetentionGlossaryFields(field0, field0, field0, field0, field0, field0, field1, field0, field1, field0, field1, field1);
      retentionGlossaryFields0.setCanceledCount(retentionGlossaryFields0.averageTime);
      Field field2 = retentionGlossaryFields0.getCanceledCount();
      assertNotNull(field2);
      assertSame(field2, field1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Field field0 = mock(Field.class, new ViolatedAssumptionAnswer());
      Field field1 = mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(field1).toString();
      RetentionGlossaryFields retentionGlossaryFields0 = new RetentionGlossaryFields(field0, field0, field0, field0, field0, field0, field0, field1, field0, field1, field1, field0);
      Field field2 = retentionGlossaryFields0.getCanceledCount();
      assertNotNull(field2);
      assertNotSame(field2, field0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Field field0 = mock(Field.class, new ViolatedAssumptionAnswer());
      Field field1 = mock(Field.class, new ViolatedAssumptionAnswer());
      RetentionGlossaryFields retentionGlossaryFields0 = new RetentionGlossaryFields(field0, field0, field0, field0, field0, field0, field0, field0, field0, field0, field0, field1);
      Field field2 = mock(Field.class, new ViolatedAssumptionAnswer());
      retentionGlossaryFields0.setRejoinCount(field2);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Field field0 = mock(Field.class, new ViolatedAssumptionAnswer());
      Field field1 = mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(field1).toString();
      Field field2 = mock(Field.class, new ViolatedAssumptionAnswer());
      RetentionGlossaryFields retentionGlossaryFields0 = new RetentionGlossaryFields(field0, field1, field1, field0, field1, field1, field0, field0, field1, field2, field0, field2);
      Field field3 = retentionGlossaryFields0.getRejoinCount();
      assertNotNull(field3);
      assertSame(field3, field1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Field field0 = mock(Field.class, new ViolatedAssumptionAnswer());
      Field field1 = mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(field1).toString();
      RetentionGlossaryFields retentionGlossaryFields0 = new RetentionGlossaryFields(field0, field0, field0, field0, field0, field0, field1, field0, field1, field0, field1, field1);
      Field field2 = mock(Field.class, new ViolatedAssumptionAnswer());
      retentionGlossaryFields0.averageTime = field2;
      Field field3 = retentionGlossaryFields0.getRejoinCount();
      assertSame(field3, field1);
      assertNotNull(field3);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Field field0 = mock(Field.class, new ViolatedAssumptionAnswer());
      RetentionGlossaryFields retentionGlossaryFields0 = new RetentionGlossaryFields(field0, field0, field0, field0, field0, field0, field0, field0, field0, field0, field0, field0);
      Field field1 = mock(Field.class, new ViolatedAssumptionAnswer());
      retentionGlossaryFields0.setAverageGpa(field1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Field field0 = mock(Field.class, new ViolatedAssumptionAnswer());
      Field field1 = mock(Field.class, new ViolatedAssumptionAnswer());
      RetentionGlossaryFields retentionGlossaryFields0 = new RetentionGlossaryFields(field0, field0, field0, field0, field0, field0, field0, field0, field0, field0, field0, field1);
      Field field2 = mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(field2).toString();
      retentionGlossaryFields0.averageGpa = field2;
      Field field3 = retentionGlossaryFields0.getAverageGpa();
      assertSame(field3, field2);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Field field0 = mock(Field.class, new ViolatedAssumptionAnswer());
      Field field1 = mock(Field.class, new ViolatedAssumptionAnswer());
      Field field2 = mock(Field.class, new ViolatedAssumptionAnswer());
      RetentionGlossaryFields retentionGlossaryFields0 = new RetentionGlossaryFields(field0, field0, field0, field0, field0, field0, field0, field1, field0, field0, field2, field2);
      Field field3 = mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(field3).toString();
      retentionGlossaryFields0.averageTime = field3;
      Field field4 = retentionGlossaryFields0.getAverageTime();
      assertSame(field4, field3);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Field field0 = mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(field0).toString();
      RetentionGlossaryFields retentionGlossaryFields0 = new RetentionGlossaryFields(field0, field0, field0, field0, field0, field0, field0, field0, field0, field0, field0, field0);
      Field field1 = mock(Field.class, new ViolatedAssumptionAnswer());
      retentionGlossaryFields0.averageRisk = field1;
      retentionGlossaryFields0.setStudentRetention(retentionGlossaryFields0.averageRisk);
      Field field2 = retentionGlossaryFields0.getAverageTime();
      assertNotNull(field2);
      assertNotSame(field2, field1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Field field0 = mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(field0).toString();
      RetentionGlossaryFields retentionGlossaryFields0 = new RetentionGlossaryFields(field0, field0, field0, field0, field0, field0, field0, field0, field0, field0, field0, field0);
      Field field1 = mock(Field.class, new ViolatedAssumptionAnswer());
      retentionGlossaryFields0.averageRisk = field1;
      Field field2 = retentionGlossaryFields0.getAverageTime();
      retentionGlossaryFields0.setAverageCost(field2);
      assertNull(field2.getDescription());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Field field0 = mock(Field.class, new ViolatedAssumptionAnswer());
      RetentionGlossaryFields retentionGlossaryFields0 = new RetentionGlossaryFields(field0, field0, field0, field0, field0, field0, field0, field0, field0, field0, field0, field0);
      Field field1 = mock(Field.class, new ViolatedAssumptionAnswer());
      retentionGlossaryFields0.averageRisk = field1;
      retentionGlossaryFields0.setAverageCost(retentionGlossaryFields0.averageRisk);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Field field0 = mock(Field.class, new ViolatedAssumptionAnswer());
      Field field1 = mock(Field.class, new ViolatedAssumptionAnswer());
      RetentionGlossaryFields retentionGlossaryFields0 = new RetentionGlossaryFields(field0, field0, field0, field0, field0, field0, field1, field0, field1, field0, field1, field1);
      Field field2 = mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(field2).toString();
      retentionGlossaryFields0.averageCost = field2;
      Field field3 = retentionGlossaryFields0.getAverageCost();
      assertSame(field3, field2);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Field field0 = mock(Field.class, new ViolatedAssumptionAnswer());
      RetentionGlossaryFields retentionGlossaryFields0 = new RetentionGlossaryFields(field0, field0, field0, field0, field0, field0, field0, field0, field0, field0, field0, field0);
      Field field1 = mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(field1).toString();
      retentionGlossaryFields0.setPredictedGraduation(field1);
      Field field2 = retentionGlossaryFields0.getPredictedGraduation();
      assertNotSame(field2, field0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Field field0 = mock(Field.class, new ViolatedAssumptionAnswer());
      Field field1 = mock(Field.class, new ViolatedAssumptionAnswer());
      RetentionGlossaryFields retentionGlossaryFields0 = new RetentionGlossaryFields(field0, field0, field0, field0, field0, field0, field1, field0, field1, field0, field1, field1);
      Field field2 = mock(Field.class, new ViolatedAssumptionAnswer());
      retentionGlossaryFields0.averageTime = field2;
      retentionGlossaryFields0.setSuccessRate(retentionGlossaryFields0.averageTime);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Field field0 = mock(Field.class, new ViolatedAssumptionAnswer());
      Field field1 = mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(field1).toString();
      Field field2 = mock(Field.class, new ViolatedAssumptionAnswer());
      Field field3 = mock(Field.class, new ViolatedAssumptionAnswer());
      RetentionGlossaryFields retentionGlossaryFields0 = new RetentionGlossaryFields(field0, field0, field1, field1, field2, field0, field3, field3, field1, field3, field3, field3);
      Field field4 = retentionGlossaryFields0.getSuccessRate();
      assertSame(field4, field1);
      assertNotNull(field4);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Field field0 = mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(field0).toString();
      RetentionGlossaryFields retentionGlossaryFields0 = new RetentionGlossaryFields(field0, field0, field0, field0, field0, field0, field0, field0, field0, field0, field0, field0);
      Field field1 = mock(Field.class, new ViolatedAssumptionAnswer());
      retentionGlossaryFields0.setAverageTime(field1);
      Field field2 = retentionGlossaryFields0.getSuccessRate();
      assertNotNull(field2);
      assertNotSame(field2, field1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Field field0 = mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(field0).toString();
      Field field1 = mock(Field.class, new ViolatedAssumptionAnswer());
      Field field2 = mock(Field.class, new ViolatedAssumptionAnswer());
      RetentionGlossaryFields retentionGlossaryFields0 = new RetentionGlossaryFields(field0, field1, field1, field0, field1, field1, field0, field0, field1, field2, field0, field2);
      Field field3 = retentionGlossaryFields0.getSuccessRate();
      assertNotNull(field3);
      assertSame(field3, field0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Field field0 = mock(Field.class, new ViolatedAssumptionAnswer());
      Field field1 = mock(Field.class, new ViolatedAssumptionAnswer());
      RetentionGlossaryFields retentionGlossaryFields0 = new RetentionGlossaryFields(field0, field0, field0, field0, field0, field0, field1, field0, field1, field0, field1, field1);
      retentionGlossaryFields0.averageLoad = null;
      Field field2 = retentionGlossaryFields0.getAverageLoad();
      assertNull(field2);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Field field0 = mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(field0).toString();
      Field field1 = mock(Field.class, new ViolatedAssumptionAnswer());
      RetentionGlossaryFields retentionGlossaryFields0 = new RetentionGlossaryFields(field0, field0, field0, field0, field0, field0, field1, field0, field1, field0, field1, field1);
      Field field2 = mock(Field.class, new ViolatedAssumptionAnswer());
      retentionGlossaryFields0.averageCost = field2;
      Field field3 = retentionGlossaryFields0.getAverageRisk();
      assertNotNull(field3);
      assertSame(field3, field0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Field field0 = mock(Field.class, new ViolatedAssumptionAnswer());
      Field field1 = mock(Field.class, new ViolatedAssumptionAnswer());
      RetentionGlossaryFields retentionGlossaryFields0 = new RetentionGlossaryFields(field0, field0, field0, field0, field0, field0, field1, field0, field1, field0, field1, field1);
      Field field2 = mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(field2).toString();
      retentionGlossaryFields0.averageCost = field2;
      retentionGlossaryFields0.setAverageRisk(retentionGlossaryFields0.averageCost);
      Field field3 = retentionGlossaryFields0.getAverageRisk();
      assertSame(field3, field2);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Field field0 = mock(Field.class, new ViolatedAssumptionAnswer());
      Field field1 = mock(Field.class, new ViolatedAssumptionAnswer());
      RetentionGlossaryFields retentionGlossaryFields0 = new RetentionGlossaryFields(field0, field0, field0, field0, field0, field0, field1, field0, field1, field0, field1, field1);
      Field field2 = mock(Field.class, new ViolatedAssumptionAnswer());
      retentionGlossaryFields0.averageCost = field2;
      retentionGlossaryFields0.setStudentRetention(retentionGlossaryFields0.averageCost);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Field field0 = mock(Field.class, new ViolatedAssumptionAnswer());
      RetentionGlossaryFields retentionGlossaryFields0 = new RetentionGlossaryFields(field0, field0, field0, field0, field0, field0, field0, field0, field0, field0, field0, field0);
      Field field1 = mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(field1).toString();
      retentionGlossaryFields0.studentRetention = field1;
      Field field2 = retentionGlossaryFields0.getStudentRetention();
      assertNotSame(field2, field0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RetentionGlossaryFields retentionGlossaryFields0 = new RetentionGlossaryFields((Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null);
      Field field0 = retentionGlossaryFields0.getTransferCount();
      assertNull(field0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RetentionGlossaryFields retentionGlossaryFields0 = new RetentionGlossaryFields((Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null);
      Field field0 = retentionGlossaryFields0.getSuccessRate();
      assertNull(field0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RetentionGlossaryFields retentionGlossaryFields0 = new RetentionGlossaryFields((Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null);
      Field field0 = retentionGlossaryFields0.getStudentRetention();
      assertNull(field0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RetentionGlossaryFields retentionGlossaryFields0 = new RetentionGlossaryFields((Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null);
      Field field0 = retentionGlossaryFields0.getRejoinCount();
      assertNull(field0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RetentionGlossaryFields retentionGlossaryFields0 = new RetentionGlossaryFields((Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null);
      Field field0 = retentionGlossaryFields0.getPredictedGraduation();
      assertNull(field0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RetentionGlossaryFields retentionGlossaryFields0 = new RetentionGlossaryFields((Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null);
      Field field0 = retentionGlossaryFields0.getDropoutCount();
      assertNull(field0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RetentionGlossaryFields retentionGlossaryFields0 = new RetentionGlossaryFields((Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null);
      Field field0 = retentionGlossaryFields0.getCanceledCount();
      assertNull(field0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RetentionGlossaryFields retentionGlossaryFields0 = new RetentionGlossaryFields((Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null);
      Field field0 = retentionGlossaryFields0.getAverageTime();
      assertNull(field0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RetentionGlossaryFields retentionGlossaryFields0 = new RetentionGlossaryFields((Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null);
      Field field0 = retentionGlossaryFields0.getAverageRisk();
      assertNull(field0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RetentionGlossaryFields retentionGlossaryFields0 = new RetentionGlossaryFields((Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null);
      Field field0 = retentionGlossaryFields0.getAverageGpa();
      assertNull(field0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RetentionGlossaryFields retentionGlossaryFields0 = new RetentionGlossaryFields((Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null, (Field) null);
      Field field0 = retentionGlossaryFields0.getAverageCost();
      assertNull(field0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Field field0 = mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(field0).toString();
      Field field1 = mock(Field.class, new ViolatedAssumptionAnswer());
      RetentionGlossaryFields retentionGlossaryFields0 = new RetentionGlossaryFields(field0, field0, field0, field0, field0, field0, field1, field0, field1, field0, field1, field1);
      Field field2 = retentionGlossaryFields0.getAverageLoad();
      assertNotNull(field2);
      assertNotSame(field2, field1);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Field field0 = mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(field0).toString();
      Field field1 = mock(Field.class, new ViolatedAssumptionAnswer());
      RetentionGlossaryFields retentionGlossaryFields0 = new RetentionGlossaryFields(field0, field0, field0, field0, field0, field0, field1, field0, field1, field0, field1, field1);
      Field field2 = retentionGlossaryFields0.getCanceledCount();
      assertNotNull(field2);
      assertNotSame(field2, field1);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Field field0 = mock(Field.class, new ViolatedAssumptionAnswer());
      Field field1 = mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(field1).toString();
      RetentionGlossaryFields retentionGlossaryFields0 = new RetentionGlossaryFields(field0, field0, field0, field0, field0, field0, field1, field0, field1, field0, field1, field1);
      Field field2 = retentionGlossaryFields0.getDropoutCount();
      assertNotSame(field2, field0);
      assertNotNull(field2);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Field field0 = mock(Field.class, new ViolatedAssumptionAnswer());
      Field field1 = mock(Field.class, new ViolatedAssumptionAnswer());
      RetentionGlossaryFields retentionGlossaryFields0 = new RetentionGlossaryFields(field0, field0, field0, field0, field0, field0, field1, field0, field1, field0, field1, field1);
      retentionGlossaryFields0.setAverageLoad(retentionGlossaryFields0.averageCost);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Field field0 = mock(Field.class, new ViolatedAssumptionAnswer());
      Field field1 = mock(Field.class, new ViolatedAssumptionAnswer());
      RetentionGlossaryFields retentionGlossaryFields0 = new RetentionGlossaryFields(field0, field0, field0, field0, field0, field0, field1, field0, field1, field0, field1, field1);
      retentionGlossaryFields0.setTransferCount(retentionGlossaryFields0.averageTime);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Field field0 = mock(Field.class, new ViolatedAssumptionAnswer());
      Field field1 = mock(Field.class, new ViolatedAssumptionAnswer());
      RetentionGlossaryFields retentionGlossaryFields0 = new RetentionGlossaryFields(field0, field0, field0, field1, field1, field0, field1, field0, field1, field0, field1, field1);
      Field field2 = mock(Field.class, new ViolatedAssumptionAnswer());
      retentionGlossaryFields0.setAverageRisk(field2);
  }
}
