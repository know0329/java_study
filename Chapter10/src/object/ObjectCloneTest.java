package object;


/*
 clone() : �ν��Ͻ��� ������ �� �� ���̴� �޼����̴�. Information Hidding�� ������ �߻���ų �� �ֱ� ������
 ������ ����� Ŭ������ Cloneable�� implements �ؾ��Ѵ�.
 */
class Point{
	
	int x;
	int y;
	
	Point(int x, int y){
		
		this.x = x;
		this.y = y;
		
	}
	
	public String toString() {
		return "x = " + this.x + ", " + "y = " + this.y;
	}
}

class Circle implements Cloneable{
	
	Point point;
	private int radius;
	
	public Circle(int x, int y, int radius) {
		
		point = new Point(x, y);
		this.radius = radius;
	}
	
	public String toString() {
		
		return "������ " + point.toString() + "�̰�, " + "�������� " + this.radius + "�̴�.";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}
public class ObjectCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		Point point = new Point(1,5);
		Circle circle = new Circle(1,5,2);
		Circle cloneCircle = (Circle)circle.clone();
		
		
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(cloneCircle));
		
		System.out.println(circle.toString());
		System.out.println(cloneCircle.toString());
	}

}
