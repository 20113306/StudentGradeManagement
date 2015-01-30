package student;

public class ShowGrade {
	
	ManagerStudentGrade msg = ManagerStudentGrade.getInstance();
	
	public void showGrade(){
		StringBuffer buffer = new StringBuffer();
		buffer.append("-----------------------------------------------------------\n");
		buffer.append(" 이름\t\t   학번\t전공\t\t수학\t\t영어\n");
		buffer.append("-----------------------------------------------------------\n");
		
		for(Student stu : msg.getStudentList())
			buffer.append(stu.getName() + "\t" + stu.getStudentId() + "\t" + stu.getMajor() +
										"\t\t " + stu.getMathGrade() + "\t\t " + stu.getEnglishGrade() + "\n");
		
		String result = buffer.toString();
		System.out.println(result);
		
	}

}
