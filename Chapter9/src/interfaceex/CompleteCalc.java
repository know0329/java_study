package interfaceex;

public class CompleteCalc extends Calcurator{

	@Override
	public int times(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}

	@Override
	public int divide(int num1, int num2) {
		// TODO Auto-generated method stub
		if(num2 != 0) {
			return num1/num2;
		}
		
		return ERROR;
	}
	
	public void showInfo() {
		System.out.println("Calc �������̽��� �����Ͽ����ϴ�.");
	}

	@Override
	public void description() {
		// TODO Auto-generated method stub
		System.out.println("�Ϻ��� ���� �Դϴ�.");
	}
	
	

}
