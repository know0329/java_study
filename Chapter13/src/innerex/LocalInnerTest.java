package innerex;


class Outer{
	
	int outNum = 100;
	static int sNum = 200;
	
	//Anonymous Inner Class : �� �ϳ��� �߻� Ŭ������ �������̽��� ������ �� �ִ�.
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
