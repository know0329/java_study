package singleton;


/*
 <static의 응용 : singleton 패턴>
 1. 디자인 패턴의 종류 중 하나이다.
 2. 인스턴스를 여러 개 생성하면 안될 때 사용 -> 시스템에서 단 하나의 인스턴스만 존재하도록 구현하는 방식
 
 */
public class Company {
	
	private static Company instance = new Company(); //private static으로 선언
	private Company(){}
	
	public static Company getInstance() { //생성자 대신 사용
		if(instance == null) 
			instance = new Company();
		
		return instance;
	}
}
