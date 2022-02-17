package staticValue;

public class StudentTest1 {
	
	public static void main(String[] args) {
		
		Student studentJ = new Student();
		System.out.println(studentJ.studentID);
		
		Student studentT = new Student();
		System.out.println(studentT.studentID);
		
		
		System.out.println(Student.getSerialNum()); // 인스턴스명.static변수'로 쓰지 않고 'class명.static변수'로 사용한다.
		System.out.println(Student.getSerialNum()); // 메서드도 마찬가지
		
	}

}
