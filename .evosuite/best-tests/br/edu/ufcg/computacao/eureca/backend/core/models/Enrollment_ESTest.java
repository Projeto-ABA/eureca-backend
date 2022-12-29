/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 13 21:44:07 GMT 2022
 */

package br.edu.ufcg.computacao.eureca.backend.core.models;

import org.junit.Test;
import static org.junit.Assert.*;
import br.edu.ufcg.computacao.eureca.backend.core.models.Enrollment;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Enrollment_ESTest extends Enrollment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Enrollment enrollment0 = new Enrollment("", "", (String) null, "", 125, 125, (String) null);
      String string0 = enrollment0.getTerm();
      assertEquals(125.0, enrollment0.getGrade(), 0.01);
      assertEquals(125, enrollment0.getCredits());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Enrollment enrollment0 = new Enrollment("RI5_'ic1.H", "", "", "Enrollment{registration='", 1177, 1177, (String) null);
      String string0 = enrollment0.getTerm();
      assertEquals(1177.0, enrollment0.getGrade(), 0.01);
      assertEquals(1177, enrollment0.getCredits());
      assertEquals("", enrollment0.getCode());
      assertEquals("RI5_'ic1.H", enrollment0.getRegistration());
      assertNotNull(string0);
      assertEquals("Enrollment{registration='", enrollment0.getClassId());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Enrollment enrollment0 = new Enrollment("", "", (String) null, "", 125, 125, (String) null);
      String string0 = enrollment0.getStatus();
      assertEquals(125.0, enrollment0.getGrade(), 0.01);
      assertEquals(125, enrollment0.getCredits());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Enrollment enrollment0 = new Enrollment(", term='", (String) null, ", term='", ", credits=", 1446, 1957.2570643425577, (String) null);
      enrollment0.setStatus("");
      enrollment0.getStatus();
      assertEquals(1957.2570643425577, enrollment0.getGrade(), 0.01);
      assertEquals(", term='", enrollment0.getRegistration());
      assertEquals(", credits=", enrollment0.getClassId());
      assertEquals(", term='", enrollment0.getTerm());
      assertEquals(1446, enrollment0.getCredits());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Enrollment enrollment0 = new Enrollment(", term='", (String) null, ", term='", ", credits=", 1446, 1957.2570643425577, (String) null);
      assertEquals(", term='", enrollment0.getRegistration());
      
      enrollment0.setRegistration((String) null);
      enrollment0.getRegistration();
      assertEquals(", term='", enrollment0.getTerm());
      assertEquals(", credits=", enrollment0.getClassId());
      assertEquals(1446, enrollment0.getCredits());
      assertEquals(1957.2570643425577, enrollment0.getGrade(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Enrollment enrollment0 = new Enrollment("", "", "", "", 39, (-465.1795), "1fb$@|;;]!");
      String string0 = enrollment0.getRegistration();
      assertEquals(39, enrollment0.getCredits());
      assertEquals("", string0);
      assertEquals("1fb$@|;;]!", enrollment0.getStatus());
      assertEquals("", enrollment0.getTerm());
      assertEquals("", enrollment0.getClassId());
      assertEquals("", enrollment0.getCode());
      assertEquals((-465.1795), enrollment0.getGrade(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Enrollment enrollment0 = new Enrollment("", "", (String) null, "", 125, 125, (String) null);
      enrollment0.setGrade(0.0);
      double double0 = enrollment0.getGrade();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Enrollment enrollment0 = new Enrollment("", "", "", (String) null, 1829, 1829, "~nd@h@>MI");
      double double0 = enrollment0.getGrade();
      assertEquals("", enrollment0.getRegistration());
      assertEquals("", enrollment0.getTerm());
      assertEquals("~nd@h@>MI", enrollment0.getStatus());
      assertEquals(1829.0, double0, 0.01);
      assertEquals("", enrollment0.getCode());
      assertEquals(1829, enrollment0.getCredits());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Enrollment enrollment0 = new Enrollment("", "", "", "", 0, 0, "");
      int int0 = enrollment0.getCredits();
      assertEquals(0, int0);
      assertEquals(0.0, enrollment0.getGrade(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Enrollment enrollment0 = new Enrollment("", "", (String) null, "", 125, 125, (String) null);
      int int0 = enrollment0.getCredits();
      assertEquals(125, int0);
      assertEquals(125.0, enrollment0.getGrade(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Enrollment enrollment0 = new Enrollment(":(", (String) null, "", ", status='", 0, 0.0, "");
      String string0 = enrollment0.getCode();
      assertEquals("", enrollment0.getTerm());
      assertNull(string0);
      assertEquals(", status='", enrollment0.getClassId());
      assertEquals(":(", enrollment0.getRegistration());
      assertEquals(0, enrollment0.getCredits());
      assertEquals(0.0, enrollment0.getGrade(), 0.01);
      assertEquals("", enrollment0.getStatus());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Enrollment enrollment0 = new Enrollment("", "", "", "", 0, 0, "rMr EwugH' zaBo");
      String string0 = enrollment0.getCode();
      assertEquals(0.0, enrollment0.getGrade(), 0.01);
      assertEquals("rMr EwugH' zaBo", enrollment0.getStatus());
      assertEquals("", string0);
      assertEquals("", enrollment0.getRegistration());
      assertEquals(0, enrollment0.getCredits());
      assertEquals("", enrollment0.getTerm());
      assertEquals("", enrollment0.getClassId());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Enrollment enrollment0 = new Enrollment("RI5_'ic1.H", "", "", "Enrollment{registration='", 1177, 1177, (String) null);
      assertEquals("Enrollment{registration='", enrollment0.getClassId());
      
      enrollment0.setClassId((String) null);
      enrollment0.getClassId();
      assertEquals(1177, enrollment0.getCredits());
      assertEquals("", enrollment0.getCode());
      assertEquals("", enrollment0.getTerm());
      assertEquals(1177.0, enrollment0.getGrade(), 0.01);
      assertEquals("RI5_'ic1.H", enrollment0.getRegistration());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Enrollment enrollment0 = new Enrollment("", "", "", "", 0, 0, "");
      enrollment0.getClassId();
      assertEquals(0, enrollment0.getCredits());
      assertEquals(0.0, enrollment0.getGrade(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Enrollment enrollment0 = new Enrollment("0/gT{QC<a{", "0/gT{QC<a{", "0/gT{QC<a{", "0/gT{QC<a{", 2407, 2407, "0/gT{QC<a{");
      String string0 = enrollment0.toString();
      assertEquals("Enrollment{registration='0/gT{QC<a{', code='0/gT{QC<a{', term='0/gT{QC<a{', classId='0/gT{QC<a{', credits=2407, grade=2407.0, status='0/gT{QC<a{'}", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Enrollment enrollment0 = new Enrollment("JvE{[,h6+tUw'", "JvE{[,h6+tUw'", "JvE{[,h6+tUw'", "JvE{[,h6+tUw'", (-926), (-926), "JvE{[,h6+tUw'");
      int int0 = enrollment0.getCredits();
      assertEquals((-926.0), enrollment0.getGrade(), 0.01);
      assertEquals((-926), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Enrollment enrollment0 = new Enrollment("0/gT{QC<a{", "0/gT{QC<a{", "0/gT{QC<a{", "0/gT{QC<a{", 2407, 2407, "0/gT{QC<a{");
      enrollment0.setCredits(2407);
      assertEquals(2407.0, enrollment0.getGrade(), 0.01);
      assertEquals(2407, enrollment0.getCredits());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Enrollment enrollment0 = new Enrollment("JvE{[,h6+tUw'", "JvE{[,h6+tUw'", "JvE{[,h6+tUw'", "JvE{[,h6+tUw'", (-926), (-926), "JvE{[,h6+tUw'");
      enrollment0.setCode("JvE{[,h6+tUw'");
      assertEquals((-926), enrollment0.getCredits());
      assertEquals((-926.0), enrollment0.getGrade(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Enrollment enrollment0 = new Enrollment("JvE{[,h6+tUw'", "JvE{[,h6+tUw'", "JvE{[,h6+tUw'", "JvE{[,h6+tUw'", (-926), (-926), "JvE{[,h6+tUw'");
      enrollment0.getRegistration();
      assertEquals((-926), enrollment0.getCredits());
      assertEquals((-926.0), enrollment0.getGrade(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Enrollment enrollment0 = new Enrollment("JvE{[,h6+tUw'", "JvE{[,h6+tUw'", "JvE{[,h6+tUw'", "JvE{[,h6+tUw'", (-926), (-926), "JvE{[,h6+tUw'");
      enrollment0.getCode();
      assertEquals((-926.0), enrollment0.getGrade(), 0.01);
      assertEquals((-926), enrollment0.getCredits());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Enrollment enrollment0 = new Enrollment("JvE{[,h6+tUw'", "JvE{[,h6+tUw'", "JvE{[,h6+tUw'", "JvE{[,h6+tUw'", (-926), (-926), "JvE{[,h6+tUw'");
      enrollment0.getTerm();
      assertEquals((-926), enrollment0.getCredits());
      assertEquals((-926.0), enrollment0.getGrade(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Enrollment enrollment0 = new Enrollment("0/gT{QC<a{", "0/gT{QC<a{", "0/gT{QC<a{", "0/gT{QC<a{", 2407, 2407, "0/gT{QC<a{");
      enrollment0.setTerm("0/gT{QC<a{");
      assertEquals(2407.0, enrollment0.getGrade(), 0.01);
      assertEquals(2407, enrollment0.getCredits());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Enrollment enrollment0 = new Enrollment("0/gT{QC<a{", "0/gT{QC<a{", "0/gT{QC<a{", "0/gT{QC<a{", 2407, 2407, "0/gT{QC<a{");
      enrollment0.getStatus();
      assertEquals(2407, enrollment0.getCredits());
      assertEquals(2407.0, enrollment0.getGrade(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Enrollment enrollment0 = new Enrollment("0/gT{QC<a{", "0/gT{QC<a{", "0/gT{QC<a{", "0/gT{QC<a{", 2407, 2407, "0/gT{QC<a{");
      enrollment0.getClassId();
      assertEquals(2407, enrollment0.getCredits());
      assertEquals(2407.0, enrollment0.getGrade(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Enrollment enrollment0 = new Enrollment("JvE{[,h6+tUw'", "JvE{[,h6+tUw'", "JvE{[,h6+tUw'", "JvE{[,h6+tUw'", (-926), (-926), "JvE{[,h6+tUw'");
      double double0 = enrollment0.getGrade();
      assertEquals((-926), enrollment0.getCredits());
      assertEquals((-926.0), double0, 0.01);
  }
}