package lamdaexpression;
/*
 <람다식>
 1.자바에서 함수형 프로그래밍을 구현하는 방식
 2.클래스를 생성하지 않고 함수의 호출만으로 기능을 수행
 3.ex) (x, y) -> {System.out.println(x + y);}
 <함수형 프로그래밍>
 1.순수 함수를 구현하고 호출함으로써 외부 자료에 부수적인 영향을 주지 않고 매개 변수만을 사용하도록 만든 함수 
 2.함수를 기반으로 구현
 3.입력 받은 자룔르 기반으로 수행되고 외부에 영향을 미치지 않으므로 병렬처리 등이 가능
 4.안정적인 확장성 있는 프로그래밍 방식
 */
interface PrintString{
	void showString(String str);
}
public class LambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			PrintString lambdaPrint = str->System.out.println(str);
			
			lambdaPrint.showString("test");
			
			showMyString(lambdaPrint);
			
			PrintString reStr = returnPrint();
			reStr.showString("hello");
	}
	
	public static void showMyString(PrintString lambda) {
		lambda.showString("test2");
	}
	
	public static PrintString returnPrint() {
		return s->System.out.println(s + "world");
	}
}
