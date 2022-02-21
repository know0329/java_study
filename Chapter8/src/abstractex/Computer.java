package abstractex;


/*
 <abstract method>
 1.�޼��带 ���� �Ͽ� ���ο� �ƹ��� ������ ���� ������ �޼����̴�. abstract Ű���带 �־ �����.
 2.abstract method�� ���� class�� abstract class�� �Ǿ�� �Ѵ�. abstract class�� ��� abstract method�� �̷������ �ʴ´�. ���� method�� ������ �־ �������.
 3.abstract class�� ����� ���� : inheritance�� �ϱ� ���� �����.
 4.abstract method�� ������ ��ӹ��� ����Ŭ�������� �����Ѵ�. -> ���� Ŭ�������� ������ �� ���� �ʴ´ٸ� �� ���� Ŭ������ abstract class�� �Ǿ�� �Ѵ�.
 5.abstract class�� �ν��Ͻ�ȭ�� �� ����.
 */

public abstract class Computer {


	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("������ ŵ�ϴ�.");
	}
	
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
	
	
}
