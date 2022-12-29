/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 13 21:28:56 GMT 2022
 */

package br.edu.ufcg.computacao.eureca.backend.api.http.response.students;

import org.junit.Test;
import static org.junit.Assert.*;
import br.edu.ufcg.computacao.eureca.backend.api.http.response.students.StudentCSV;
import br.edu.ufcg.computacao.eureca.backend.api.http.response.students.StudentsResponse;
import java.util.Collection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StudentsResponse_ESTest extends StudentsResponse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StudentsResponse studentsResponse0 = new StudentsResponse((Collection<StudentCSV>) null);
      studentsResponse0.setStudents((Collection<StudentCSV>) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StudentsResponse studentsResponse0 = new StudentsResponse((Collection<StudentCSV>) null);
      Collection<StudentCSV> collection0 = studentsResponse0.getStudents();
      assertNull(collection0);
  }
}