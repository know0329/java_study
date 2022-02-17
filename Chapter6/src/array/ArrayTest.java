package array;


/*
 <배열>
 1.동일한 자료형의 변수를 한꺼번에 순차적으로 관리할 때 사용한다.
 2.데이터들이 물리적,논리적으로 연속되어 있음.
 3.배열의 index 범위 : 0 ~ 배열의 길이-1
 4.배열을 선언할 때 길이를 정해야 함(고정길이)
 5.배열 간의 데이터 사이에 비움이 있으면 안된다
 6.자료형[] 변수이름 = new 자료형[길이]; or 자료형 변수이름[] = new 자료형[길이];
 */

/*
 <배열 복사>
 1.System.arraycopy(복사할 배열명, 복사할 시작위치, 복사되는 배열명, 복사되는 시작위치, 복사길이);
 */
public class ArrayTest {
	public static void main(String[] args) {
		
		int numbers[] = new int[] {0, 1, 2}; //초기화가 같이 이루어진다면 변수의 길이를 정의하면 안된다.
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("numbers : " + numbers[i]);
		}
		
		int numbers2[] = new int[5]; //초기화하지 않으면 default값으로 초기화를 시켜준다.
		
		numbers2[0] = 40;
		numbers2[1] = 30;
		numbers2[2] = 20;
		numbers2[3] = 10;
		
		for(int i = 0; i < numbers2.length; i++) {
			System.out.println("numbers2 : " + numbers2[i]);
		}
		
		
		
		//배열복사
		System.arraycopy(numbers, 0, numbers2, 0, 3);
		System.out.println("배열 복사");
		for(int i = 0; i < numbers2.length; i++) {
			System.out.println("numbers2 : " + numbers2[i]);
		}
		
		//배열의 모든 entity를 확인할 경우 편리한 기술
		for(int i : numbers2) {
			System.out.println(i);
		}
	}
}
