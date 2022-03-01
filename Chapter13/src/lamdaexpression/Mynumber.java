package lamdaexpression;

@FunctionalInterface
public interface Mynumber {

	int getMaxNumber(int num1, int num2);
	//메서드를 하나만 선언하여야 한다. 함수형 인터페이스는 함수 이름이 다르더라도 리턴값과 매개변수가 같으면 모호성을 주기 때문이다.
}
