package student;

import calc.ICalcGrade;
import calc.major.CalcMajorGrade;
import calc.notmajor.CalcNotMajorGrade;

public class GradeReport {
	
	ManagerStudentGrade msg = ManagerStudentGrade.getInstance();
	
	public void generateGradeReport(){
		ICalcGrade majorGrade = new CalcMajorGrade();
		ICalcGrade notMajorGrade = new CalcNotMajorGrade();
		
		for(Student stu : msg.getStudentList()){
			if(stu.getMajor().equals("수학")){
				majorGrade.calcMathGrade(stu);
				notMajorGrade.calcEnglishGrade(stu);
			}
			else if(stu.getMajor().equals("영어")){
				majorGrade.calcEnglishGrade(stu);
				notMajorGrade.calcMathGrade(stu);
			}
			else
				System.out.println("error!");
				
		}
		
	}

}
