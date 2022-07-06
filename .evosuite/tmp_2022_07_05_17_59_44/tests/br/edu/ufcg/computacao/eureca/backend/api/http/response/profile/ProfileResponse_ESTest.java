/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 05 23:52:25 GMT 2022
 */

package br.edu.ufcg.computacao.eureca.backend.api.http.response.profile;

import org.junit.Test;
import static org.junit.Assert.*;
import br.edu.ufcg.computacao.eureca.backend.api.http.response.profile.ProfileResponse;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ProfileResponse_ESTest extends ProfileResponse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ProfileResponse profileResponse0 = new ProfileResponse((String) null, (String) null);
      String string0 = profileResponse0.getCourseName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ProfileResponse profileResponse0 = new ProfileResponse("B40", "B40");
      profileResponse0.setCourseName("");
      String string0 = profileResponse0.getCourseName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ProfileResponse profileResponse0 = new ProfileResponse("%", "%");
      profileResponse0.setCourseCode((String) null);
      String string0 = profileResponse0.getCourseCode();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ProfileResponse profileResponse0 = new ProfileResponse("B40", "B40");
      profileResponse0.setCourseCode("");
      String string0 = profileResponse0.getCourseCode();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ProfileResponse profileResponse0 = new ProfileResponse("%", "%");
      String string0 = profileResponse0.getCourseCode();
      assertEquals("%", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ProfileResponse profileResponse0 = new ProfileResponse("%", "%");
      String string0 = profileResponse0.getCourseName();
      assertEquals("%", string0);
  }
}
