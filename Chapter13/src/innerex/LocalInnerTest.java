package innerex;


class Outer{
	
	int outNum = 100;
	static int sNum = 200;
	
	//Anonymous Inner Class : 단 하나의 추상 클래스나 인터페이스를 구현할 수 있다.
	Runnable runnable = new Runnable() {
		public void run() {
			System.out.println("runnable");
		
		}
	};
	
	
	public Runnable getRunnable() {
		
		int localNum = 100;
		// Local Inner Class
		class MyRunnable implements Runnable{

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(localNum);
			}
		}
		return new MyRunnable();
	}
}

public class LocalInnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer = new Outer();
		outer.getRunnable().run();
		
	}

}
