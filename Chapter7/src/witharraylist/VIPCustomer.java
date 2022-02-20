package witharraylist;

public class VIPCustomer extends Customer{
	
	private int agentID;
	private double saleRatio;
	
	public VIPCustomer(int ID, String name, int agentID) {
		super(ID, name);
		this.agentID = agentID;
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	
	public int getAgentID() {
		return agentID;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio); 
	}


	@Override
	public String showCustomerInfo() {
		// TODO Auto-generated method stub
		return super.showCustomerInfo() + " 또한 개인 상담원의 아이디는 " + agentID + " 입니다.";
	}
	
	
}
