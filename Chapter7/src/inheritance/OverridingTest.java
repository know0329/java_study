package inheritance;


/*
 Overriding : 상위 클래스의 메서드를 하위 클래스에서 재정의 하는 것
 
 가상함수(virtual method) : 프로그램에서 어떤 객체의 변수나 메서드의 참조는 그 타입에 따라 이루어짐.
 		 가상 메서드의 경우는 타입과 상관없이 실제 생성된 인스턴스의 메서드가 호출 되는데 이 원리를 가상메서드라 한다.
 

 */
public class OverridingTest {

	public static void main(String[] args) {
		
		//오버라이딩
		Customer customerLee =  new Customer(100010, "LEE");
		int price = customerLee.calcPrice(10000);
		System.out.println("지불 금액은 "+ price + " 입니다.\n" + customerLee.showCustomerInfo());
		
		VIPCustomer customerKim =  new VIPCustomer(100011, "KIM",1000);
		int vipPrice = customerKim.calcPrice(10000);
		System.out.println("지불 금액은 "+ vipPrice + " 입니다.\n" +customerKim.showCustomerInfo());

		
		//가상함수
		Customer customerWho = new VIPCustomer(100010, "WHO", 100);
		int whoPrice = customerWho.calcPrice(10000);
		System.out.println("지불 금액은 "+ whoPrice + " 입니다.\n" + customerWho.showCustomerInfo());
		
	}

}
