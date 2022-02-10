package chapter2;

public class Conversion {

	

	/*
	 형 변환 : 다른 자료형의 값이 만나 자료형에 변화가 생긴다.
	 
	 종류
	 1. 묵시적 형 변환 : 사용자가 아닌 시스템에 의해 자연스럽게 형 변환이 이루어짐 보통 큰 변수에 작은 리터럴이 들어오는 경우 이루어짐
	 2. 명시적 형 변환 : 사용자가 강제적으로 형 변환을 일으킴. ex) double dNum = 3.14;
	 												int num = (int)dNum; 
	 												이 경우 자료의 손실이 발생함(큰 크기의 수기 작은 수로 형 변환이 되어서)
	 */
	
	public static void main(String[] args) {
		
		//묵시적 형변환
		byte bNum = 10;
		int num = bNum;
		
		System.out.println(num);
		
		
		long lNum = 10;
		float fNum = lNum;
		System.out.println(fNum);
		
		
		//명시적 형변환
		double dNum = 3.14;
		int num2 = (int)dNum; 
		System.out.println(num2);
	}
}
