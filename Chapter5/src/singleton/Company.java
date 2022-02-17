package singleton;


/*
 <static�� ���� : singleton ����>
 1. ������ ������ ���� �� �ϳ��̴�.
 2. �ν��Ͻ��� ���� �� �����ϸ� �ȵ� �� ��� -> �ý��ۿ��� �� �ϳ��� �ν��Ͻ��� �����ϵ��� �����ϴ� ���
 
 */
public class Company {
	
	private static Company instance = new Company(); //private static���� ����
	private Company(){}
	
	public static Company getInstance() { //������ ��� ���
		if(instance == null) 
			instance = new Company();
		
		return instance;
	}
}
