package witharraylist;

public class GoldCustomer extends Customer {

	double saleRatio;
	
	public GoldCustomer(int ID, String Name) {
		super(ID, Name);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
		
	}

	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		
		return super.calcPrice(price) - (int)(price * saleRatio);
		
	}
	
}
