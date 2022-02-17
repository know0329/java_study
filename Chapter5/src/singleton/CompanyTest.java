package singleton;

public class CompanyTest {
	
	public static void main(String[] args) {
		
		Company kakao = Company.getInstance();
		Company naver = Company.getInstance();
		
		System.out.println(kakao);// 동일한 주소가 나온다.
		System.out.println(naver);

	}

}
