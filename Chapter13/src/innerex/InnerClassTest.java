package innerex;

/*
 <Inner Class>
 
 종류							구현위치						사용할 수 있는			생성 방법
 														외부 클래스 변수			
 -------------------------------------------------------------------------------------------------------------------------										
 Instance Inner Class 		외부 클래스 멤버 변수와 동일		외부 인스턴스 변수		외부 클래스 생성 후 내부 클래스 생성
 														외부 전역 변수
 -------------------------------------------------------------------------------------------------------------------------														
 Static Inner Class			외부 클래스 멤버 변수와 동일		외부 전역 변수			외부 클래스와 무관하게 생성
 -------------------------------------------------------------------------------------------------------------------------
 Local Inner Class			메서드 내부에 구현				외부 인스턴스 변수		메서드를 호출할 때 생성
 														외부 전역 변수
 -------------------------------------------------------------------------------------------------------------------------														
 Anonymous Inner Class		메서드 내부에 구현				외부 인스턴스 변수		메서드를 호출할 떄 생성 또는
							변수에 대입하여 직접 구현			외부 전역 변수			인터페이스 타입 변수에 대입할 때 new 예약어을 사용하여 생성

 */

class OutClass{
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	private class InClass{
		int inNum = 200;
	
		void inTest() {
			System.out.println(num);
			System.out.println(sNum);
		}
		
		static void sTest() {
			System.out.println();
		}
	}
	
	public void usingInTest() {
		inClass.inTest();
	}
	
	static class InStaticClass{
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			// num += 10; 외부 클래스의 변수는 생성이 불가능 하다. 정적 내부 클래스는 외부 클래스의 생성과 무관하게 생성되기 때문에
			sNum += 10; // 외부 클래스의 변수지만 정적변수(클래스의 생성과는 무관하기 떄문에)이기 때문에 사용이 가능하다.
			System.out.println(sNum);
			System.out.println(iNum);
			System.out.println(sInNum);
			
		}
		
		static void sTest() {
			System.out.println(sNum);
			//System.out.println(iNum); 사용 불가 : sTest는 정적 메서드 이기 때문에 정적 클래스의 생성과도 무관하다 
			System.out.println(sInNum);
		}
		
	}
}
public class InnerClassTest {
	public static void main(String[] args) {
		
		/*OutClass outClass = new OutClass();
		
		outClass.usingInTest();
		*/
		
		OutClass.InStaticClass.sTest();
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		
		
	}
}
