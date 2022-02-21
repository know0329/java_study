package abstractex;


/*
 <abstract method>
 1.메서드를 선언만 하여 내부에 아무런 구현이 없는 가상의 메서드이다. abstract 키워드를 넣어서 만든다.
 2.abstract method를 가진 class는 abstract class가 되어야 한다. abstract class는 모두 abstract method로 이루어지지 않는다. 기존 method도 가지고 있어도 상관없다.
 3.abstract class를 만드는 이유 : inheritance를 하기 위해 만든다.
 4.abstract method의 구현은 상속받은 하위클래스에서 구현한다. -> 하위 클래스에서 구현을 다 하지 않는다면 그 하위 클래스도 abstract class가 되어야 한다.
 5.abstract class는 인스턴스화될 수 없다.
 */

public abstract class Computer {


	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 킵니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
	
}
