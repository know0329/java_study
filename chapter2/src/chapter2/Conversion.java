package chapter2;

public class Conversion {

	

	/*
	 �� ��ȯ : �ٸ� �ڷ����� ���� ���� �ڷ����� ��ȭ�� �����.
	 
	 ����
	 1. ������ �� ��ȯ : ����ڰ� �ƴ� �ý��ۿ� ���� �ڿ������� �� ��ȯ�� �̷���� ���� ū ������ ���� ���ͷ��� ������ ��� �̷����
	 2. ����� �� ��ȯ : ����ڰ� ���������� �� ��ȯ�� ����Ŵ. ex) double dNum = 3.14;
	 												int num = (int)dNum; 
	 												�� ��� �ڷ��� �ս��� �߻���(ū ũ���� ���� ���� ���� �� ��ȯ�� �Ǿ)
	 */
	
	public static void main(String[] args) {
		
		//������ ����ȯ
		byte bNum = 10;
		int num = bNum;
		
		System.out.println(num);
		
		
		long lNum = 10;
		float fNum = lNum;
		System.out.println(fNum);
		
		
		//����� ����ȯ
		double dNum = 3.14;
		int num2 = (int)dNum; 
		System.out.println(num2);
	}
}
