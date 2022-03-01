package innerex;

/*
 <Inner Class>
 
 ����							������ġ						����� �� �ִ�			���� ���
 														�ܺ� Ŭ���� ����			
 -------------------------------------------------------------------------------------------------------------------------										
 Instance Inner Class 		�ܺ� Ŭ���� ��� ������ ����		�ܺ� �ν��Ͻ� ����		�ܺ� Ŭ���� ���� �� ���� Ŭ���� ����
 														�ܺ� ���� ����
 -------------------------------------------------------------------------------------------------------------------------														
 Static Inner Class			�ܺ� Ŭ���� ��� ������ ����		�ܺ� ���� ����			�ܺ� Ŭ������ �����ϰ� ����
 -------------------------------------------------------------------------------------------------------------------------
 Local Inner Class			�޼��� ���ο� ����				�ܺ� �ν��Ͻ� ����		�޼��带 ȣ���� �� ����
 														�ܺ� ���� ����
 -------------------------------------------------------------------------------------------------------------------------														
 Anonymous Inner Class		�޼��� ���ο� ����				�ܺ� �ν��Ͻ� ����		�޼��带 ȣ���� �� ���� �Ǵ�
							������ �����Ͽ� ���� ����			�ܺ� ���� ����			�������̽� Ÿ�� ������ ������ �� new ������� ����Ͽ� ����

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
			// num += 10; �ܺ� Ŭ������ ������ ������ �Ұ��� �ϴ�. ���� ���� Ŭ������ �ܺ� Ŭ������ ������ �����ϰ� �����Ǳ� ������
			sNum += 10; // �ܺ� Ŭ������ �������� ��������(Ŭ������ �������� �����ϱ� ������)�̱� ������ ����� �����ϴ�.
			System.out.println(sNum);
			System.out.println(iNum);
			System.out.println(sInNum);
			
		}
		
		static void sTest() {
			System.out.println(sNum);
			//System.out.println(iNum); ��� �Ұ� : sTest�� ���� �޼��� �̱� ������ ���� Ŭ������ �������� �����ϴ� 
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
