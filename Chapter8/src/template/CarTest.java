package template;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new ManualCar();
		myCar.run();
		System.out.println("=============================");
		Car yourCar = new AICar();
		yourCar.run();
	}

}
