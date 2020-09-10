package java9.mod.modapp1;




public class StudentResult {
	private String rollNumber;
	private String studentName;
	private Double halfYearlyTotal;
	private Double annualTotal;
	private String grade;
	
	public StudentResult() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public StudentResult(String rollNumber, String studentName, Double halfYearlyTotal, Double annualTotal,
			String grade) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.halfYearlyTotal = halfYearlyTotal;
		this.annualTotal = annualTotal;
		this.grade = grade;
	}


	public StudentResult(String rollNumber, String studentName, Double halfYearlyTotal) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.halfYearlyTotal = halfYearlyTotal;
	}
	
	public String getRollNumber() {
		return rollNumber;
	}


	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public Double getHalfYearlyTotal() {
		return halfYearlyTotal;
	}


	public void setHalfYearlyTotal(Double halfYearlyTotal) {
		this.halfYearlyTotal = halfYearlyTotal;
	}


	public Double getAnnualTotal() {
		return annualTotal;
	}


	public void setAnnualTotal(Double annualTotal) {
		this.annualTotal = annualTotal;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	@Override
	public String toString() {
		String output=String.format("%-5s %-20s %-20s %-20s %5s",rollNumber,studentName,halfYearlyTotal,annualTotal,grade);
		return output;
	}
	

}
