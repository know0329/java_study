package chapter2;

public class operator {
	/*
	 ���� ������ 
	 
	 ���� : ++, --
	 
	 val = ++num; : num�� ���� 1 ������Ų �� val�� ����
	 val = num++; : ���� num�� val�� ���� �� 1 ����
	 
	 val = --num; : num�� ���� 1 ���ҽ�Ų �� val�� ����
	 val = num--; : ���� num�� val�� ���� �� 1 ���� 
	 */
	
	
	/*
	 �� ������ : &&(AND), ||(OR), !(NOT)
	 
	 ���� 1 && ���� 2 :���� 1��  �����̸� �ڿ� ���� ������� �ʴ´�. -> �̹� �����̱� ������
	 ���� 1 || ���� 2 :���� 1��  ���̸� �ڿ� ���� ������� �ʴ´�. -> �̹� ���̱� ������
	 ex) if(((num = num + 10) < 15) && ((i = i + 1) > 500)){
	 		
	 		***
	 }
	 
	 */
	
	public static void main(String[] args) 
	{
		
		int num = 10;
		int num2 = 10;
		int val = num++;
		int val2 = ++num2;
		System.out.println(val); // �� ��� 10�� �����µ� ������ ���Կ������� �켱������ �� ���� �����̴�.
		System.out.println(val2);
		System.out.println(val++);
		System.out.println(val);
	
	
	}

}
