/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 05 23:19:43 GMT 2022
 */

package br.edu.ufcg.computacao.eureca.backend.api.http.response.active;

import org.junit.Test;
import static org.junit.Assert.*;
import br.edu.ufcg.computacao.eureca.backend.api.http.response.active.ActivesPerTermSummary;
import br.edu.ufcg.computacao.eureca.backend.api.http.response.active.ActivesStatisticsResponse;
import java.util.Collection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ActivesStatisticsResponse_ESTest extends ActivesStatisticsResponse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ActivesStatisticsResponse activesStatisticsResponse0 = new ActivesStatisticsResponse((Collection<ActivesPerTermSummary>) null, "br.edu.ufcg.computacao.eureca.backend.core.models.Range", (String) null, (String) null, (String) null);
      String string0 = activesStatisticsResponse0.getCurriculumCode();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ActivesStatisticsResponse activesStatisticsResponse0 = new ActivesStatisticsResponse((Collection<ActivesPerTermSummary>) null, "", "br.edu.ufcg.computacao.eureca.backend.api.http.response.active.ActivesStatisticsResponse", "br.edu.ufcg.computacao.eureca.backend.api.http.response.active.ActivesStatisticsResponse", "br.edu.ufcg.computacao.eureca.backend.api.http.response.active.ActivesStatisticsResponse");
      String string0 = activesStatisticsResponse0.getCurriculumCode();
      assertEquals("", activesStatisticsResponse0.getCourseCode());
      assertEquals("br.edu.ufcg.computacao.eureca.backend.api.http.response.active.ActivesStatisticsResponse", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ActivesStatisticsResponse activesStatisticsResponse0 = new ActivesStatisticsResponse((Collection<ActivesPerTermSummary>) null, (String) null, (String) null, "%\"?6IFw#X", "%\"?6IFw#X");
      String string0 = activesStatisticsResponse0.getCourseCode();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ActivesStatisticsResponse activesStatisticsResponse0 = new ActivesStatisticsResponse((Collection<ActivesPerTermSummary>) null, "_jA.(p?Bi>", ")0rku]w>F[=N+o{PL", "", ")0rku]w>F[=N+o{PL");
      String string0 = activesStatisticsResponse0.getCourseCode();
      assertEquals(")0rku]w>F[=N+o{PL", activesStatisticsResponse0.getCurriculumCode());
      assertEquals("_jA.(p?Bi>", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ActivesStatisticsResponse activesStatisticsResponse0 = new ActivesStatisticsResponse((Collection<ActivesPerTermSummary>) null, "", "", "", "");
      activesStatisticsResponse0.setCourseCode("");
      assertEquals("", activesStatisticsResponse0.getCourseCode());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ActivesStatisticsResponse activesStatisticsResponse0 = new ActivesStatisticsResponse((Collection<ActivesPerTermSummary>) null, "", "/N[V*qbX_aWp3KQ4SP4", "/N[V*qbX_aWp3KQ4SP4", "");
      activesStatisticsResponse0.getActivesPerTermSummaries();
      assertEquals("", activesStatisticsResponse0.getCourseCode());
      assertEquals("/N[V*qbX_aWp3KQ4SP4", activesStatisticsResponse0.getCurriculumCode());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ActivesStatisticsResponse activesStatisticsResponse0 = new ActivesStatisticsResponse((Collection<ActivesPerTermSummary>) null, "", "/N[V*qbX_aWp3KQ4SP4", "/N[V*qbX_aWp3KQ4SP4", "");
      assertEquals("/N[V*qbX_aWp3KQ4SP4", activesStatisticsResponse0.getCurriculumCode());
      
      activesStatisticsResponse0.setCurriculumCode(":x*+<0{?w`5s");
      assertEquals("", activesStatisticsResponse0.getCourseCode());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ActivesStatisticsResponse activesStatisticsResponse0 = new ActivesStatisticsResponse((Collection<ActivesPerTermSummary>) null, "", "/N[V*qbX_aWp3KQ4SP4", "/N[V*qbX_aWp3KQ4SP4", "");
      String string0 = activesStatisticsResponse0.getCourseCode();
      assertEquals("", string0);
      assertEquals("/N[V*qbX_aWp3KQ4SP4", activesStatisticsResponse0.getCurriculumCode());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ActivesStatisticsResponse activesStatisticsResponse0 = new ActivesStatisticsResponse((Collection<ActivesPerTermSummary>) null, "", "", "", "-L");
      activesStatisticsResponse0.setActivesPerTermSummaries((Collection<ActivesPerTermSummary>) null);
      assertEquals("", activesStatisticsResponse0.getCourseCode());
      assertEquals("", activesStatisticsResponse0.getCurriculumCode());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ActivesStatisticsResponse activesStatisticsResponse0 = new ActivesStatisticsResponse((Collection<ActivesPerTermSummary>) null, "", "", "", "");
      String string0 = activesStatisticsResponse0.getCurriculumCode();
      assertEquals("", string0);
  }
}
