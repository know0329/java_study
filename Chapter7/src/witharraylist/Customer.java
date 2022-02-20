package witharraylist;

/*
 <상속>
 1.클래스를 정의할 때 이미 구현된 클래스를 상속 받아서 속성이나 기능이 확장되는 클래스를 구현할 수 있다.
 2.상속하는 클래스 : 상위 클래스, parent class, super class, 하위 클래스보다 일반적임(추상적임)
 3.상속받는 클래스 : 하위 클래스, child class, sub class, 상위 클래스보다 구체적임
 4.클래스 상속 문법
	class B extends A{
	
	}
	B가 sub A가 super이다.
 5. 자바는 single 상속만 지원한다.
 6. 주의사항 : 상속(is-a)은 어떤 클래스를 가져다가 재사용하는 것이 아님. 구현된 기능을 구체적으로 더 만들때 상속을 이용하는 것임.
 			그냥 코드를 재사용하는 것은 합성(has-a)이라고 함.
 */


/*
 <상속 클래스의 생성과정>
 하위 클래스가 생성되기 전에 항상 상위 클래스가 먼저 생성이 된다. <- 컴파일 단계에서 컴파일러가 super()[superclass의 default생성자를 호출]라는 메서드를 호출하여 상위 클래스를 생성한다.
 상위 클래스에서 생성자(construtor)를 새로 정의하였다면 정의한 매개변수와 동일하게 super()메서드에 매개변수를 추가하여 하위 클래스의 생성자에 넣어주어야 한다.
 */


/*
 <접근 제한자 가시성>
 				외부 클래스		하위 클래스		동일 패키지		내부 클래스
 public			   o			o			o			o
 protected		   x			o			o			o
 default		   x			x			o			o
 private		   x			x			x			o
 */


/*
 <업캐스팅>
 1.상위 클래스로의 묵시적 형 변환
 2.하위 클래스는 상위 클래스의 타입을 내포하고 있어 상위 클래스로 묵시적 형변환이 가능하다.
 3.Customer vc = new VIPCustomer();
 4.메모리는 하위 클래스 영역에 해당하는 부분까지 모두 차지하지만 타입은 상위 클래스이다.
 */

public class Customer {
	protected int customerID; // protected 변수 : 외부(다른 패키지)에서는 접근이 불가능하지만 같은 패기지내의 클래스나 상속관계의 클래스는 접근이 가능하다. 
	protected String customerName; // 상속관계의 클래스들이 소속된 패키지가 달라도 protected 변수는 접근이 가능하다.
	protected String customerGrade;
	int bonusPoint;// default는 패키지가 다르면 접근이 불가능하다.
	double bonusRatio;
	
	/*public Customer() {
		
		customerGrade = "SILBER";
		bonusRatio = 0.01;
	}
	*/
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILBER";
		bonusRatio = 0.01;
		
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price; 
	}
	
	public String showCustomerInfo() {
		
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + " 입니다.";
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}

	
}
