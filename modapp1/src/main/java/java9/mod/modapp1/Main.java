package java9.mod.modapp1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	private static List<StudentResult> convertToList(String roll) throws Exception
	{
		FileReader fileReader=new FileReader("StudentResult.txt");
		BufferedReader bufferedReader=new BufferedReader(fileReader);
		List<StudentResult> resultList=new ArrayList<StudentResult>();
		boolean flag=false;
        while(true)
        {
        	String str=bufferedReader.readLine();
            if(str==null)
            	break;
            String []arr=str.split("-");
            if(arr[0].equals(roll))
            	flag=true;
            StudentResult result=null;
            if(arr.length==3)
            	result=new StudentResult(arr[0],arr[1],Double.parseDouble(arr[2]));
            else if(arr.length==5)
            	result=new StudentResult(arr[0],arr[1],Double.parseDouble(arr[2]),Double.parseDouble(arr[3]),arr[4]);
            resultList.add(result);
        }
        fileReader.close();
        if(flag)
        	return resultList;
        else
        	return null;
		
	}

	public static void main(String[] args) throws Exception {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter student roll number");
		String roll=scanner.nextLine();
		List<StudentResult> resultList=convertToList(roll);
		if(resultList==null)
		{
			System.out.println("Student not found");
			System.exit(0);
		}
		FileWriter fileWriter=new FileWriter("f:/StudentResult.txt");
		BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
		//String str="";
		resultList.forEach((StudentResult result)->{
			String str="";
		   if(roll.equals(result.getRollNumber()))
		  {
			  System.out.println("The Student Name:"+result.getStudentName());
			  System.out.println("Enter English Marks(out of 100):");
			  double eng=Double.parseDouble(scanner.nextLine());
			  System.out.println("Enter Language Marks(out of 100):");
			  double lang=Double.parseDouble(scanner.nextLine());
			  System.out.println("Enter Mathematics Marks(out of 100):");
			  double math=Double.parseDouble(scanner.nextLine());
			  System.out.println("Enter Science Marks(out of 100):");
			  double sci=Double.parseDouble(scanner.nextLine());
			  System.out.println("Enter Social Study Marks(out of 100):");
			  double ss =Double.parseDouble(scanner.nextLine());
			  double annualTotal=eng+lang+math+sci+ss;
			  result.setAnnualTotal(annualTotal); 
			  String grade=ResultService.gradeCalculation(result);
			  result.setGrade(grade);
			  System.out.println(String.format("%-5s %-20s %-20s %-20s %5s","Roll","Name","Half Yearly Total","Annual Total","Grade"));
			  System.out.println(result);
			  }
		 if(result.getAnnualTotal()==null) 
			 str=result.getRollNumber()+"-"+result.getStudentName()+"-"+result.getHalfYearlyTotal();
		 else
			 str=result.getRollNumber()+"-"+result.getStudentName()+"-"+result.getHalfYearlyTotal()+"-"+result.getAnnualTotal()+"-"+result.getGrade();
		 try
		 {
		 bufferedWriter.write(str);
		 bufferedWriter.flush();
		 bufferedWriter.newLine();
		 }catch(Exception e) {}
	  }); // end of loop
	System.out.println("File Updated");
	}
}