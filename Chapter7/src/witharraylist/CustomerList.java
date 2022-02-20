package witharraylist;

import java.util.ArrayList;
public class CustomerList {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLee = new Customer(10100, "�̼���");
		Customer customerShin = new Customer(10011, "�Ż��Ӵ�");
		GoldCustomer customerHong = new GoldCustomer(10012, "ȫ�浿");
		GoldCustomer customerYul = new GoldCustomer(10013, "������");
		VIPCustomer customerKim = new VIPCustomer(10014, "������",12345);
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYul);
		customerList.add(customerKim);
		
		System.out.println("========== �� ���� ��� ==============");
		
		for(Customer c : customerList) {
			
			System.out.println(c.showCustomerInfo());
		}
		
		System.out.println("\n========== ���η��� ���ʽ� ����Ʈ ��� ==============");
		
		int price = 10000;
		
		for(Customer c : customerList) {
			int cost;
			cost = c.calcPrice(price);
			System.out.println(c.getCustomerName() + "���� ���η��� " + (double)(price-cost)/price * 100 + "%�̰�" + "������ ���ʽ� ����Ʈ�� " + c.getBonusPoint() + "����Ʈ �Դϴ�.");
		}
		
	}
}
