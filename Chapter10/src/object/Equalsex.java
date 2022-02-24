package object;


/*
 1.equals()�� �ν��Ͻ����� �ּҰ��� ���Ͽ� true/false���� ������.
 2.hashCode()�� �ν��Ͻ��� ����� �ּҸ� ��ȯ, �� �޸𸮿� �ν��Ͻ��� ����Ǵ� ����� hash�̴�.
 3.���� equals()�� �������ϸ� hashCode()�� �������Ѵ� hashCode�� ��ȯ���� ���� equal �������� �� ���� ��������� �̿��Ѵ�.
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
		
		System.out.println(str1 == str2); //������ ��(�ּҰ�)
		System.out.println(str1.equals(str2)); // ���� ��(�����ǵ�)
		
		Student std1 = new Student(10001, "Tomas");
		Student std2 = new Student(10001, "Tomas");
		
		System.out.println(std1 == std2);
		System.out.println(std1.equals(std2)); //������
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
	}
}
