package inheritance;


/*
 Overriding : ���� Ŭ������ �޼��带 ���� Ŭ�������� ������ �ϴ� ��
 
 �����Լ�(virtual method) : ���α׷����� � ��ü�� ������ �޼����� ������ �� Ÿ�Կ� ���� �̷����.
 		 ���� �޼����� ���� Ÿ�԰� ������� ���� ������ �ν��Ͻ��� �޼��尡 ȣ�� �Ǵµ� �� ������ ����޼���� �Ѵ�.
 

 */
public class OverridingTest {

	public static void main(String[] args) {
		
		//�������̵�
		Customer customerLee =  new Customer(100010, "LEE");
		int price = customerLee.calcPrice(10000);
		System.out.println("���� �ݾ��� "+ price + " �Դϴ�.\n" + customerLee.showCustomerInfo());
		
		VIPCustomer customerKim =  new VIPCustomer(100011, "KIM",1000);
		int vipPrice = customerKim.calcPrice(10000);
		System.out.println("���� �ݾ��� "+ vipPrice + " �Դϴ�.\n" +customerKim.showCustomerInfo());

		
		//�����Լ�
		Customer customerWho = new VIPCustomer(100010, "WHO", 100);
		int whoPrice = customerWho.calcPrice(10000);
		System.out.println("���� �ݾ��� "+ whoPrice + " �Դϴ�.\n" + customerWho.showCustomerInfo());
		
	}

}
