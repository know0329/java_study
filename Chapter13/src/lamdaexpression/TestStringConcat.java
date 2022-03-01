package lamdaexpression;

public class TestStringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//전통적인 인터페이스 구현
		StringConcatImpl sImpl = new StringConcatImpl();
		sImpl.makeString("Hello", "Java");
		
		//람다식
		StringConcat concat = (s1, s2)->System.out.println(s1 + " "+ s2);
		concat.makeString("hello", "java");
	}

}
