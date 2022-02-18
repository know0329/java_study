package array;

public class TwoDimensionArray {

	
	public static void main(String[] args) {
		
		int [][] arr = new int[2][3];
		
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = count;
				count++;
			}
		}
		
		System.out.println(arr.length); //2°¡ ³ª¿È
		System.out.println(arr[0].length); //3ÀÌ ³ª¿È
		
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
}
