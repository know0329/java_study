package generics;

/*
 <Generics Class>
 1.C++�� ���ø��� ����ϴ�.
 2.����� ����(T, C, V ���)�� Object���� ��ȯ��
 3.������ �������� ĳ������ �Ͼ
 4.static�� ����� �Ұ����ϴ�.
 5.T extends Ŭ����(M) : M�� ��ӹ��� Ŭ������ ����� �����ϰ� M�� ���ǵ� �޼��带 ���� �� �� ����. 
 6.<T, V>ó�� �� ���� ����� �� �ִ�.
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
