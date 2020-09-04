package java9.mod.modapp1;

public class ResultService {
	public static String gradeCalculation(StudentResult result)
	{
		String grade="";
		double totalPercentage=((result.getHalfYearlyTotal()+result.getAnnualTotal())/1000.00)*100.00;
		if(totalPercentage>=90)
			grade="E";
		else if(totalPercentage>=75)
			grade="V";
		else if(totalPercentage>=60)
			grade="G";
		else if(totalPercentage>=45)
			grade="P";
		else 
			grade="F";
		return grade;
	}

}
