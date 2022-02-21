package template;


/*
 <Template Method>
 1.abstact method�� ������ �޼��带 Ȱ���Ͽ� ��ü ����� �帧(�ó�����)�� �����ϴ� �޼���
 2.final�� �����ϸ� ���� Ŭ�������� ������ �� �� ����
 3.�����ӿ�ũ���� ���� ���Ǵ� ���� �����̴�.
 4.abstract class�� ����� ���� Ŭ������ ���ø� �޼��带 Ȱ���Ͽ� ��ü���� �帧�� �����ϰ� ���� Ŭ�������� �ٸ��� �����Ǿ���ϴ� �κ��� �߻� �޼���� �����ؼ� ���� Ŭ������ �����ǵ��� ��	
 */
public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	public void washCar() {} // �Ĺ��޼��� : �ʿ信 ���� ����Ŭ�������� ������
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	
	public void endCar() {
		System.out.println("�õ��� ���ϴ�.");
	}

	//�ô϶�� - Overriding�Ǹ� �ȵȴ�.
	public final void run() {
		startCar();
		drive();
		wiper();
		stop();
		endCar();
		washCar();
	}
}
