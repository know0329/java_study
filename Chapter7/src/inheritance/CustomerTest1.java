package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10100, "Lee");
		
		
		VIPCustomer customerKim = new VIPCustomer(10101, "Kim");
		
		customerKim.bonusPoint = 2430;
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.showCustomerInfo());
	}
}
