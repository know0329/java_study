package chapter2;



public class Constants {

	/*
	 상수의 특징  
	 1. 상수는 한번 선언하면 변할 수 없다.
	 2. 프로그램에서 수정에 용이하다. 조건문이나 반복문 같은 경우 리터럴를 사용했다면 그 조건을 바꾸기 위해 리터럴 값을 찾아서 바꿔야 하지만
	 	상수는 상수의 초기화 값만 바꾸면 된다.
	 3. 상수의 경우 대문자로 쓰는 경우가 많다.
	 
	  */
	 
	/*
	 리터럴 : 프로그램에서 쓰이는 모든 숫자, 값, 논리 값 ex) 1, 'A', true
	 리터럴에 해당하는 값은 특정 메모리 공간인 상수 풀(constant pool)에 있음
	 필요한 경우 상수 풀에서 가져와서 사용한다.
	 long,float 값으로 저장해야할 경우 식별자(long - L,l / float - F,f)를 붙여야 한다.
	 */
	
	 
	
	public static void main(String[] args){
		
		final int MAX_NUM = 100; // 자바에서 상수 선언은 final을 사용한다. 다른 언어와 마찬가지로 선언과 함께 초기화를 해야한다.
		final float PI = 3.14f; // float로 초기화를 하기 위해서는 숫자 뒤에 f를 써주어야 한다. 써주지 않으면 double로 받아드림.
		
		
		
		
	}
}
