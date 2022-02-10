package chapter2;

public class operator {
	/*
	 증감 연산자 
	 
	 종류 : ++, --
	 
	 val = ++num; : num의 값을 1 증가시킨 후 val에 대입
	 val = num++; : 기존 num을 val에 대입 후 1 증가
	 
	 val = --num; : num의 값을 1 감소시킨 후 val에 대입
	 val = num--; : 기존 num을 val에 대입 후 1 감소 
	 */
	
	
	/*
	 논리 연산자 : &&(AND), ||(OR), !(NOT)
	 
	 조건 1 && 조건 2 :조건 1이  거짓이면 뒤에 것은 실행되지 않는다. -> 이미 거짓이기 때문에
	 조건 1 || 조건 2 :조건 1이  참이면 뒤에 것은 실행되지 않는다. -> 이미 참이기 때문에
	 ex) if(((num = num + 10) < 15) && ((i = i + 1) > 500)){
	 		
	 		***
	 }
	 
	 */
	
	public static void main(String[] args) 
	{
		
		int num = 10;
		int num2 = 10;
		int val = num++;
		int val2 = ++num2;
		System.out.println(val); // 이 경우 10이 나오는데 이유는 대입연사자의 우선순위가 더 높기 때문이다.
		System.out.println(val2);
		System.out.println(val++);
		System.out.println(val);
	
	
	}

}
