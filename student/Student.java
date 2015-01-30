package student;

public class Student {
	
	private String name;
	private int studentId;
	private String major;
	private int mathScore;
	private int englishScore;
	private char mathGrade;
	private char englishGrade;

	public Student(String name, int studentId, String major, int mathScore, int englishScore){
		this.name = name;
		this.studentId = studentId;
		this.major = major;
		this.mathScore = mathScore;
		this.englishScore = englishScore;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	public int getEnglishScore() {
		return englishScore;
	}

	public void setEnglishScore(int englishScore) {
		this.englishScore = englishScore;
	}
	
	public char getMathGrade() {
		return mathGrade;
	}

	public void setMathGrade(char mathGrade) {
		this.mathGrade = mathGrade;
	}

	public char getEnglishGrade() {
		return englishGrade;
	}

	public void setEnglishGrade(char englishGrade) {
		this.englishGrade = englishGrade;
	}

}
