package string;


/*
 <String Class>
 1.String 변수는 2가지의 저장방식을 가지고 있다
  1.1.힙메모리 저장 - 일반 클래스와 마찬가지로 new를 사용하여 인스턴스를 만든다. 인스턴스마다 주소값이 다름
  1.2.상수폴(데이터 영역) 저장 - int, char같이 = 을 이용하여 값을 대입. 같은 값을 저장했다면 그 주소값은 같음
 2.한번 생성된 String값은 불변(immutable)
 3.문자열 연결을 계속하면 메모리에 garbage가 생길 수 있다. 문자열을 연결하면 기존의 문자열은 메모리에 있고 연결되어 생긴 문자열은 새로운 메모리에 저장되기 때문에
  3.1.문자열을 바꾼다면 문자열이 지워지는 것이아니라 가리키는 주소가 변경되는 것이다.
 4.3번과 같은 문제 때문에 문자열을 연결하는 작업에서는 StringBuilder나 StringBuffer를 사용한다.
 
 <StringBuilder, StringBuffer>
 1.내부적으로 가변적인 char[]배열을 가지고 있는 클래스
 2.기존 배열을 변경하므로 garbage가 생기지 않는다.
 3.StringBuffer는 멀티 쓰레드 프로그래밍에서 동기화를 보장(동기)
 4.STringBuilder는 단일 쓰레드 프로그램에서 사용을 권장한다(비동기)
 5.String Class가 아니기 때문에 toString()메서드로 String 반환
 6.문자열 연결시 append(Char[] chrs)를 사용한다.
 */
public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println(str1 == str2);
		
		String str3 = "abc";
		String str4 = "abc";
		System.out.println(str3 == str4);
		
		
		String str2_1 = new String("java");
		System.out.println(str2_1);
		System.out.println(System.identityHashCode(str2_1));
		
		StringBuilder buffer = new StringBuilder(str2_1);
		System.out.println(System.identityHashCode(buffer));
		
		buffer.append(" and");
		buffer.append(" android");
		System.out.println(System.identityHashCode(buffer));
		
		String str2_2 = buffer.toString();
		System.out.println(str2_2);
	}

}
