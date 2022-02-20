package witharraylist;

import java.util.ArrayList;
public class CustomerList {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLee = new Customer(10100, "이순신");
		Customer customerShin = new Customer(10011, "신사임당");
		GoldCustomer customerHong = new GoldCustomer(10012, "홍길동");
		GoldCustomer customerYul = new GoldCustomer(10013, "이율곡");
		VIPCustomer customerKim = new VIPCustomer(10014, "김유신",12345);
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYul);
		customerList.add(customerKim);
		
		System.out.println("========== 고객 정보 출력 ==============");
		
		for(Customer c : customerList) {
			
			System.out.println(c.showCustomerInfo());
		}
		
		System.out.println("\n========== 할인률과 보너스 포인트 결과 ==============");
		
		int price = 10000;
		
		for(Customer c : customerList) {
			int cost;
			cost = c.calcPrice(price);
			System.out.println(c.getCustomerName() + "님의 할인률은 " + (double)(price-cost)/price * 100 + "%이고" + "적립된 보너스 포인트는 " + c.getBonusPoint() + "포인트 입니다.");
		}
		
	}
}
