package hiding;



/*
 <1>
 java���Ͽ��� public class�� �ϳ��� ��������ϰ� java���ϰ� public class�� �̸��� ���ƾ� �Ѵ�.
 java���� �ȿ��� public class�� ������ �Ϲ����� class���� ���� ���� ������ �� �ִ�.
 
 <2>
 ��������� ���� : default, public, private, protected
 
 default : ���� ��Ű�������� ��������� ������ �����ϴ�.
 public : �ܺ� Ŭ������ �� ������ ����� �� �ִ�.
 private : Ŭ���� �������� ��������� ����� �����Ӵ�.
 protected : ��Ӱ��迡�� ���
 	
 ���������  public�� �����ϸ� ���Ἲ������ �߻��� �� �ִ�.
 
 private�� ����ϸ� ��������� �޼ҵ��� ������ ���� �� �ִ� Information Hiding�� �����ϴ�. 
 �̋� ��������� �ʱ�ȭ�ϰ� �ʹٸ�, �ʱ�ȭ�� ���� ����� �ϴ� �޼��带 ������־�� �Ѵ�.
 
 
 <3>
 this�� ���� : �ڽ��� �޸�(������ �ν��Ͻ��� �޸�)�� ����Ŵ, �����ڿ��� �ٸ� �����ڸ� ȣ��(�̋� this�տ��� ��� statement�� ������ �� ����.), �ڽ��� �ּҸ� ��ȯ��.
 
 */
class Birthday{
	
	private int day;
	private int month;
	private int year;

	
	
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		
		if(month == 2) {
			
			if(1 <= day && day <= 28) {
				
				this.day = day;
			}
			
			else {
				System.out.println("��¥ ǥ�Ⱑ �߸� �Ǿ����ϴ�.");
			}
			
		}
		
		
		else		
			this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public void showBirthdayInfo() {
		
		System.out.println("������ " + getYear() + "�� " + getMonth() + "�� " + getDay() + "�� �Դϴ�.");
		
	}
}

public class BirthdayTest {

	public static void main(String[] args) {
		
		Birthday day = new Birthday();
		day.setDay(9);
		day.setMonth(2);
		day.setYear(2022);
		
		
		day.showBirthdayInfo();
	}
}
