package object;


/*
 clone() : 인스턴스를 복제를 할 때 쓰이는 메서드이다. Information Hidding에 문제를 발생시킬 수 있기 때문에
 복제를 허용할 클래스는 Cloneable를 implements 해야한다.
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
		
		return "원점은 " + point.toString() + "이고, " + "반지름은 " + this.radius + "이다.";
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
