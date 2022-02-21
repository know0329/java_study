package interfaceex;
/*
<Interface>
1.�߻� �޼���θ� �̷����(�ڹ� 8 ����)
2.��������� �����
3.�������̽����� ����� ������ default�� public static final(���)�̴�.
4.���� Ŭ������ ��� ���� �� ���� ���� �������̽��� ��� ���� �� �ִ�. ������ �߻�Ŭ������ �⺻ Ŭ�������� �ϳ��� ����� �����ϴ�.
5.�������̽��� Client Code�� ���񽺸� �����ϴ� ��ü ������ ����̴�.
6.� ��ü�� � �������̽� Ÿ�Ծƶ� ���� �� �������̽��� �����ϴ� �޼��带 �����ߴٴ� �ǹ��̴�.
7.Client�� ��� �����Ǿ����� ������� interface�� ���Ǹ� ���� ����� �� �ִ�.
8.�������̽������� ����� �̷���� �� �ִ�.
9.���� �����ӿ�ũ(ex.������, �ȵ���̵�)�� ����ϸ� Ŭ������ ��ӹް� ���� �������̽��� �����ϴ� ��찡 �����ִ�.
<�������̽� ���>
1.��� : �������̽��� ����� ��� ����
2.�߻� �޼���
3.����Ʈ �޼��� : �⺻ �������� ������ �޼���, ���� Ŭ�������� ������ ����
4.���� �޼��� : �ν��Ͻ� ������ ��� ���� �������̽� �������� ����� �� �ִ� �޼���
5.private �޼��� : �������̽��� ������ Ŭ�������� ����ϰų� ������ �� �� ����. �������̽� ���ο����� ����� �����ϱ� ���� �����ϴ� �޼���
*/
public interface Calc {
	
	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() {
		System.out.println("���� ���⸦ �����մϴ�.");
	}
	
	static int total(int[] arr) {
		
		int total = 0;
		
		for(int i : arr) {
			total += i;
		}
		
		return total;
	}
	
	private void myMethod() {
		System.out.println("private �޼��� �Դϴ�.");
	}
	
	private static void myStaticMethod() {
		System.out.println("private static �޼��� �Դϴ�.");
	}
}
