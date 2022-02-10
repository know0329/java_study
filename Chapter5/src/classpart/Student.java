package classpart;

public class Student {
	
	/*
	 ��� Ŭ������ main���� ���� �ʿ�� ����. JVM�� ���� main���� ����ȴ�.
	 class �̸��� ���� �빮�ڷ� ���
	 ��Ű��(=�ҽ��� ����, ������ ������ ǥ��) �̸��� �ҹ���, ��Ű���� �� Ȱ���ؾ� ������ ����. 
	 	-> �ҽ��ڵ带 ���������� �����ϱ� ���ؼ� ����Ѵ�
	 ���� �̸��� �ҹ��ڷ� �����ؼ� �ܾ �ٲ� �� �빮�� ���
	 Ŭ������ ��������� �޼���� �̷���� �ִ�.
	 */
	
	/*
	 �޼��� : �Լ�(= �ϳ��� ����� �����ϴ� �Ϸ��� �ڵ�)�� �������� ��ü�� ����� �����ϱ� ���� �����Ǿ�����.
	 */
	
	/*
	 Ŭ���� ����
	 Ŭ������ �����̸� = new ������; -> ���޸𸮿� Ŭ������ ������. �̋� ������ Ŭ������ �ν��Ͻ���� �Ѵ�.
	 Ŭ������ ������ ������ �ν��Ͻ��� ���� �� �� �ν��Ͻ��� �ڷ����� reference data type�̶�� �Ѵ�.
	 
	 ������ 
	 public Ŭ������(�Ķ����)
	 {
	 	������ ����
	 }
	 
	 Ŭ������ ���� �� �����ڸ� �������� �ʴ� ��� JVM���� default �����ڸ� �������ش�.
	 �����ڸ� ������ٸ� default �����ڴ� ���� ���Ѵ�.
	 ������ �̸��� ���� �����ڰ� ������ �� �ִ� - > ������ overloading
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
		studentLee.studentName = "�̼���";
		studentLee.address = "����� ���ʱ� ";
		
		studentLee.showStudentInfo();
		
		
	}
}
