package student;

import java.util.ArrayList;

public class ManagerStudentGrade {
	
	private static ManagerStudentGrade instance = new ManagerStudentGrade();
	private ArrayList<Student> stuList;
	
	private ManagerStudentGrade(){
		stuList = new ArrayList<Student>();
	}
	
	public static ManagerStudentGrade getInstance(){
		return instance;
	}
	
	public void addStudent(Student stu){
		stuList.add(stu);
	}
	
	public ArrayList<Student> getStudentList(){
		return stuList;
	}

}
