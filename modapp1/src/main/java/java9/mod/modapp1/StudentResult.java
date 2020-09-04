package java9.mod.modapp1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentResult {
	private String rollNumber;
	private String studentName;
	private Double halfYearlyTotal;
	private Double annualTotal;
	private String grade;
	public StudentResult(String rollNumber, String studentName, Double halfYearlyTotal) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.halfYearlyTotal = halfYearlyTotal;
	}
	@Override
	public String toString() {
		String output=String.format("%-5s %-20s %-20s %-20s %5s",rollNumber,studentName,halfYearlyTotal,annualTotal,grade);
		return output;
	}
	

}
