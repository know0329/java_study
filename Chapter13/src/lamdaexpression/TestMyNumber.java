package lamdaexpression;

public class TestMyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mynumber maxNum = (x, y) ->(x >=y)? x:y;
		int max = maxNum.getMaxNumber(10, 20);
		System.out.println(max);
	}

}
