package interfaceex;

public class CalcuratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1= 10;
		int num2 = 2;
		
		Calc calc = new CompleteCalc(); //타입상속
		
		System.out.println(calc.add(num1, num2));
		
		calc.description();
		
		int arr[] = {1, 2, 3, 4, 5};
		System.out.println(Calc.total(arr));
		
		
	}

}
