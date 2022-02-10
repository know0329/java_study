package hiding;



/*
 <1>
 java파일에는 public class는 하나만 존재햐야하고 java파일과 public class의 이름은 같아야 한다.
 java파일 안에는 public class를 제외한 일반적인 class들은 여러 개가 존재할 수 있다.
 
 <2>
 멤버변수의 형태 : default, public, private, protected
 
 default : 같은 패키지내에서 멤버변수의 젭근이 가능하다.
 public : 외부 클래스를 다 가져다 사용할 수 있다.
 private : 클래스 내에서만 멤버변수의 사용이 자유롭다.
 protected : 상속관계에서 사용
 	
 멤버변수를  public로 설정하면 무결성문제가 발생할 수 있다.
 
 private를 사용하면 멤버변수나 메소드의 정보를 숨길 수 있는 Information Hiding이 가능하다. 
 이떄 멤버변수를 초기화하고 싶다면, 초기화와 변경 기능을 하는 메서드를 만들어주어야 한다.
 
 
 <3>
 this의 역할 : 자신의 메모리(생선된 인스턴스의 메모리)를 가리킴, 생성자에서 다른 생성자를 호출(이떄 this앞에는 어떠한 statement도 존재할 수 없다.), 자신의 주소를 반환함.
 
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
				System.out.println("날짜 표기가 잘못 되었습니다.");
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
		
		System.out.println("생일은 " + getYear() + "년 " + getMonth() + "월 " + getDay() + "일 입니다.");
		
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
