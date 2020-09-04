package java9.mod.modapp1;

import static org.junit.Assert.*;
import org.junit.Test;
import static java9.mod.modapp1.TestUtils.*;
public class ResultServiceTest {

	@Test
	public void testGradeCalculation() throws Exception {
		StudentResult studentResult=new StudentResult("14","Bobita Ghosh",375.0);
		studentResult.setAnnualTotal(440.0);
		String value=ResultService.gradeCalculation(studentResult);
		yakshaAssert(currentTest(),(value.equals("V")?"true":"false"),businessTestFile);
	}

}
