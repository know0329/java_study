package array;


/*
 <객체배열>
 객체배열과 배열의 차이 : 배열은 선언만하면 바로 이용이 가능하나 객체배열의 경우 각각 인스턴스를 생성해서 넣어주어야한다.
 */
public class BookArray {

	public static void main(String[] args) {
		
		Book[] library =  new Book[5]; // 인스턴스가 5개 생성되는것이 아니라 인스턴스가 들어갈 주소가 5개 생성됨.
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		
		//할당된 주소에 인스턴스 생성 후 값 넣기 
		
		library[0] = new Book("카카오 취업하기", "카카오 저자");
		library[1] = new Book("네이버 취업하기", "네이버 저자");
		library[2] = new Book("쿠팡 취업하기", "쿠팡 저자");
		library[3] = new Book("라인 취업하기", "라인 저자");
		library[4] = new Book("배민 취업하기", "배민 저자");
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		
		for(int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}
		
		
		//객체 배열 복사(앝은 복사 : 객체의 주소가 복사됨, 인스턴스의 값을 변경하게 되면 두 인스턴스 모두 변경됨)
		Book[] libraryshallow = new Book[5];
		
		libraryshallow[0] = new Book("프론트엔드", "Front-end");
		libraryshallow[1] = new Book("백엔드", "Back-end");
		libraryshallow[2] = new Book("안드로이드", "Android");
		libraryshallow[3] = new Book("아이오에스", "IOS");
		libraryshallow[4] = new Book("게임", "Game");
		
		System.arraycopy(library, 0, libraryshallow, 0, 5);
		System.out.println("객체배열 복사");
		
		
		//객체 배열 복사(깊은 복사 : 인스턴스 값을 직접 복사, 두 개의 인스턴스 주소가 다름)
		
		Book[] librarydeep = new Book[5];
		
		for(int i = 0; i < librarydeep.length; i++) {
			librarydeep[i] = new Book();
		}
		
		for(int i = 0; i < librarydeep.length; i++) {
			librarydeep[i].setBookName(library[i].getBookName());
			librarydeep[i].setAuthor(library[i].getAuthor());
		}
		
		//앝은 복사와 깊은 복사 비교
		
		library[2].setBookName("책이름 변경");
		library[2].setAuthor("저자 변경");
		
		System.out.println("*******앝은 복사*******");
		for(int i = 0; i < library.length; i++) {
			libraryshallow[i].showBookInfo();
		}
		
		System.out.println("*******깊은 복사*******");
		for(int i = 0; i < library.length; i++) {
			librarydeep[i].showBookInfo();
		}
		
	}
	

}
