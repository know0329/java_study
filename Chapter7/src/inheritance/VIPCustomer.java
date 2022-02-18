package inheritance;

public class VIPCustomer extends Customer{
	
	private int agentID;
	private double saleRatio;
	
	public VIPCustomer(int ID, String name) {
		super(ID, name);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	
	public int getAgentID() {
		return agentID;
	}
	
	
	
}
