package lamdaexpression;

public class TestStringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������� �������̽� ����
		StringConcatImpl sImpl = new StringConcatImpl();
		sImpl.makeString("Hello", "Java");
		
		//���ٽ�
		StringConcat concat = (s1, s2)->System.out.println(s1 + " "+ s2);
		concat.makeString("hello", "java");
	}

}
