package lamdaexpression;
/*
 <���ٽ�>
 1.�ڹٿ��� �Լ��� ���α׷����� �����ϴ� ���
 2.Ŭ������ �������� �ʰ� �Լ��� ȣ�⸸���� ����� ����
 3.ex) (x, y) -> {System.out.println(x + y);}
 <�Լ��� ���α׷���>
 1.���� �Լ��� �����ϰ� ȣ�������ν� �ܺ� �ڷῡ �μ����� ������ ���� �ʰ� �Ű� �������� ����ϵ��� ���� �Լ� 
 2.�Լ��� ������� ����
 3.�Է� ���� �ڷ㸣 ������� ����ǰ� �ܺο� ������ ��ġ�� �����Ƿ� ����ó�� ���� ����
 4.�������� Ȯ�强 �ִ� ���α׷��� ���
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
