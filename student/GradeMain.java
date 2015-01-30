package student;

public class GradeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManagerStudentGrade msg = ManagerStudentGrade.getInstance();
		msg.addStudent(new Student("이승기", 141213, "수학", 95, 20));
		msg.addStudent(new Student("김수현", 141518, "영어", 90, 100));
		msg.addStudent(new Student("주원\t", 141230, "수학", 76, 60));
		msg.addStudent(new Student("김우빈", 141255, "수학", 85, 89));
		msg.addStudent(new Student("이민호", 141590, "영어", 90, 95));
		
		GradeReport gr = new GradeReport();
		gr.generateGradeReport();
		
		ShowGrade sg = new ShowGrade();
		sg.showGrade();

	}

}
