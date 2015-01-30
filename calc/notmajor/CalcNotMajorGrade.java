package calc.notmajor;

import student.ManagerStudentGrade;
import student.Student;
import calc.ICalcGrade;

public class CalcNotMajorGrade implements ICalcGrade{

	ManagerStudentGrade msg = ManagerStudentGrade.getInstance();

	@Override
	public void calcMathGrade(Student stu) {
		// TODO Auto-generated method stub
			if(stu.getMathScore() >= 90)
				stu.setMathGrade('A');
			else if(stu.getMathScore() >= 80)
				stu.setMathGrade('B');
			else if(stu.getMathScore() >= 70)
				stu.setMathGrade('C');
			else if(stu.getMathScore() >= 55)
				stu.setMathGrade('D');
			else
				stu.setMathGrade('F');
	}

	@Override
	public void calcEnglishGrade(Student stu) {
		// TODO Auto-generated method stub
			if(stu.getEnglishScore() >= 90)
				stu.setEnglishGrade('A');
			else if(stu.getEnglishScore() >= 80)
				stu.setEnglishGrade('B');
			else if(stu.getEnglishScore() >= 70)
				stu.setEnglishGrade('C');
			else if(stu.getEnglishScore() >= 55)
				stu.setEnglishGrade('D');
			else
				stu.setEnglishGrade('F');
	}

}
