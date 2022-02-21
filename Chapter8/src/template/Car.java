package template;


/*
 <Template Method>
 1.abstact method나 구현된 메서드를 활용하여 전체 기능의 흐름(시나리오)을 정의하는 메서드
 2.final로 선언하면 하위 클래스에서 재정의 할 수 없음
 3.프레임워크에서 많이 사용되는 설계 패턴이다.
 4.abstract class로 선언된 상위 클래스에 템플릿 메서드를 활용하여 전체적인 흐름을 정의하고 하위 클래스에서 다르게 구현되어야하는 부분은 추상 메서드로 선언해서 하위 클래스가 구현되도록 함	
 */
public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	public void washCar() {} // 후문메서드 : 필요에 의해 하위클래스에서 재정의
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void endCar() {
		System.out.println("시동을 끕니다.");
	}

	//시니라오 - Overriding되면 안된다.
	public final void run() {
		startCar();
		drive();
		wiper();
		stop();
		endCar();
		washCar();
	}
}
