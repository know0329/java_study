package witharraylist;

/*
 <���>
 1.Ŭ������ ������ �� �̹� ������ Ŭ������ ��� �޾Ƽ� �Ӽ��̳� ����� Ȯ��Ǵ� Ŭ������ ������ �� �ִ�.
 2.����ϴ� Ŭ���� : ���� Ŭ����, parent class, super class, ���� Ŭ�������� �Ϲ�����(�߻�����)
 3.��ӹ޴� Ŭ���� : ���� Ŭ����, child class, sub class, ���� Ŭ�������� ��ü����
 4.Ŭ���� ��� ����
	class B extends A{
	
	}
	B�� sub A�� super�̴�.
 5. �ڹٴ� single ��Ӹ� �����Ѵ�.
 6. ���ǻ��� : ���(is-a)�� � Ŭ������ �����ٰ� �����ϴ� ���� �ƴ�. ������ ����� ��ü������ �� ���鶧 ����� �̿��ϴ� ����.
 			�׳� �ڵ带 �����ϴ� ���� �ռ�(has-a)�̶�� ��.
 */


/*
 <��� Ŭ������ ��������>
 ���� Ŭ������ �����Ǳ� ���� �׻� ���� Ŭ������ ���� ������ �ȴ�. <- ������ �ܰ迡�� �����Ϸ��� super()[superclass�� default�����ڸ� ȣ��]��� �޼��带 ȣ���Ͽ� ���� Ŭ������ �����Ѵ�.
 ���� Ŭ�������� ������(construtor)�� ���� �����Ͽ��ٸ� ������ �Ű������� �����ϰ� super()�޼��忡 �Ű������� �߰��Ͽ� ���� Ŭ������ �����ڿ� �־��־�� �Ѵ�.
 */


/*
 <���� ������ ���ü�>
 				�ܺ� Ŭ����		���� Ŭ����		���� ��Ű��		���� Ŭ����
 public			   o			o			o			o
 protected		   x			o			o			o
 default		   x			x			o			o
 private		   x			x			x			o
 */


/*
 <��ĳ����>
 1.���� Ŭ�������� ������ �� ��ȯ
 2.���� Ŭ������ ���� Ŭ������ Ÿ���� �����ϰ� �־� ���� Ŭ������ ������ ����ȯ�� �����ϴ�.
 3.Customer vc = new VIPCustomer();
 4.�޸𸮴� ���� Ŭ���� ������ �ش��ϴ� �κб��� ��� ���������� Ÿ���� ���� Ŭ�����̴�.
 */

public class Customer {
	protected int customerID; // protected ���� : �ܺ�(�ٸ� ��Ű��)������ ������ �Ұ��������� ���� �б������� Ŭ������ ��Ӱ����� Ŭ������ ������ �����ϴ�. 
	protected String customerName; // ��Ӱ����� Ŭ�������� �Ҽӵ� ��Ű���� �޶� protected ������ ������ �����ϴ�.
	protected String customerGrade;
	int bonusPoint;// default�� ��Ű���� �ٸ��� ������ �Ұ����ϴ�.
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
		
		return customerName + "���� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + " �Դϴ�.";
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
