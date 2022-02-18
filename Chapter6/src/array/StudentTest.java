package array;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(1000, "Lee");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 90);
		studentLee.addSubject("영어", 80);
		studentLee.showStudentInfo();
		
		Student studentKim = new Student(1001, "Kim");
		studentKim.addSubject("Java", 100);
		studentKim.addSubject("DataStruture", 80);
		studentKim.addSubject("ComputerArchitecture", 100);
		studentKim.showStudentInfo();
	}
	

}
