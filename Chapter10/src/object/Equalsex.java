package object;


/*
 1.equals()는 인스턴스들의 주소값을 비교하여 true/false값을 내보냄.
 2.hashCode()는 인스턴스가 저장된 주소를 반환, 힙 메모리에 인스턴스가 저장되는 방식이 hash이다.
 3.보통 equals()를 재정의하면 hashCode()도 재정의한다 hashCode의 반환값은 보통 equal 재정의할 때 쓰인 멤버변수를 이용한다.
 */

class Student{
	
	int studentID;
	String studentName;
	
	Student(int studentID, String studentName){
		this.studentID = studentID;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentID == std.studentID && this.studentName == std.studentName) {
				return true;
			}
			else
				return false;
		}
		return false;
	}
	
	public int hashCode() {
		return studentID;
	}
	
}
public class Equalsex {
	public static void main(String[] args) {
		
		String str1 = new String("test");
		String str2 = new String("test");
		
		System.out.println(str1 == str2); //물리적 비교(주소값)
		System.out.println(str1.equals(str2)); // 논리적 비교(재정의됨)
		
		Student std1 = new Student(10001, "Tomas");
		Student std2 = new Student(10001, "Tomas");
		
		System.out.println(std1 == std2);
		System.out.println(std1.equals(std2)); //재정의
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
	}
}
