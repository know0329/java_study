package interfaceex;
/*
<Interface>
1.추상 메서드로만 이루어짐(자바 8 이전)
2.설계용으로 사용함
3.인터페이스에서 선언된 변수의 default는 public static final(상수)이다.
4.하위 클래스가 상속 받을 때 여러 개의 인터페이스를 상속 받을 수 있다. 하지만 추상클래스나 기본 클래스들은 하나만 상속이 가능하다.
5.인터페이스는 Client Code와 서비스를 제공하는 객체 사이의 약속이다.
6.어떤 객체가 어떤 인터페이스 타입아라 함은 그 인터페이스가 제공하는 메서드를 구현했다는 의미이다.
7.Client는 어떻게 구현되었는지 상관없이 interface의 정의만 보고 사용할 수 있다.
8.인터페이스끼리도 상속이 이루어질 수 있다.
9.실제 프레임워크(ex.스프링, 안드로이드)를 사용하면 클래스를 상속받고 여러 인터페이스를 구현하는 경우가 종종있다.
<인터페이스 요소>
1.상수 : 인터페이스에 선언된 모든 변수
2.추상 메서드
3.디폴트 메서드 : 기본 구현으르 가지는 메서드, 구현 클래스에서 재정의 가능
4.정적 메서드 : 인스턴스 생성과 상관 없이 인터페이스 탕비으로 사용할 수 있는 메서드
5.private 메서드 : 인터페이스를 구현한 클래스에서 사용하거나 재정의 할 수 없음. 인터페이스 내부에서만 기능을 제공하기 위해 구현하는 메서드
*/
public interface Calc {
	
	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
	}
	
	static int total(int[] arr) {
		
		int total = 0;
		
		for(int i : arr) {
			total += i;
		}
		
		return total;
	}
	
	private void myMethod() {
		System.out.println("private 메서드 입니다.");
	}
	
	private static void myStaticMethod() {
		System.out.println("private static 메서드 입니다.");
	}
}
