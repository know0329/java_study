package singleton;

public class CompanyTest {
	
	public static void main(String[] args) {
		
		Company kakao = Company.getInstance();
		Company naver = Company.getInstance();
		
		System.out.println(kakao);// ������ �ּҰ� ���´�.
		System.out.println(naver);

	}

}
