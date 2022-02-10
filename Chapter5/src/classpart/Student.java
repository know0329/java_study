package classpart;

public class Student {
	
	/*
	 모든 클래스에 main문이 있을 필요는 없다. JVM에 의해 main문이 실행된다.
	 class 이름은 보통 대문자로 사용
	 패키지(=소스의 묶음, 묶음의 성격을 표현) 이름은 소문자, 패키지를 잘 활용해야 관리가 쉽다. 
	 	-> 소스코드를 계층구조로 관리하기 위해서 사용한다
	 변수 이름은 소문자로 시작해서 단어가 바뀔 때 대문자 사용
	 클래스는 멤버변수와 메서드로 이루어져 있다.
	 */
	
	/*
	 메서드 : 함수(= 하나의 기능을 수행하는 일련의 코드)의 일종으로 객체의 기능을 제공하기 위해 구현되어진다.
	 */
	
	/*
	 클래스 생성
	 클래스형 변수이름 = new 생성자; -> 힙메모리에 클래스가 생성됨. 이떄 생성된 클래스를 인스턴스라고 한다.
	 클래스를 변수로 가지는 인스턴스가 있을 때 그 인스턴스의 자료형을 reference data type이라고 한다.
	 
	 생성자 
	 public 클래스명(파라미터)
	 {
	 	수행할 문장
	 }
	 
	 클래스를 만들 때 생성자를 정의하지 않는 경우 JVM에서 default 생성자를 제공해준다.
	 생성자를 만들었다면 default 생성자는 쓰지 못한다.
	 동일한 이름을 가진 생성자가 존재할 수 있다 - > 생성자 overloading
	 */
	
	
	
	
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfo() {
		
		System.out.println(studentName + " " + address);
	}

	public static void main(String[] args) {
		
		Student studentLee = new Student();
		studentLee.studentName = "이순신";
		studentLee.address = "서울시 서초구 ";
		
		studentLee.showStudentInfo();
		
		
	}
}
