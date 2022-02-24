package generics;

/*
 <Generics Class>
 1.C++의 템플릿과 흡사하다.
 2.사용할 문자(T, C, V 등등)가 Object으로 변환됨
 3.컴파일 과정에서 캐스팅이 일어남
 4.static은 사용이 불가능하다.
 5.T extends 클래스(M) : M을 상속받은 클래스만 사용이 가능하고 M에 정의된 메서드를 공유 할 수 있음. 
 6.<T, V>처럼 두 개를 사용할 수 있다.
 */
public class TreeDPrinterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeDPrinter<Powder> printer  = new TreeDPrinter<Powder>();
		printer.setMaterial(new Powder());
		
		Powder powder = printer.getMaterial();
		
		System.out.println(printer);
		
		TreeDPrinter<Plastic> plasticPrinter  = new TreeDPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		
		Plastic plastic = plasticPrinter.getMaterial();
		
		System.out.println(plasticPrinter);
		
		TreeDPrinter<Water> waterPrinter  = new TreeDPrinter<Water>();
		waterPrinter.setMaterial(new Water());
		
		Water water = waterPrinter.getMaterial();
		
		System.out.println(waterPrinter);
		
		
	}

}
