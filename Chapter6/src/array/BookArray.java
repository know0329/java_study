package array;


/*
 <��ü�迭>
 ��ü�迭�� �迭�� ���� : �迭�� �����ϸ� �ٷ� �̿��� �����ϳ� ��ü�迭�� ��� ���� �ν��Ͻ��� �����ؼ� �־��־���Ѵ�.
 */
public class BookArray {

	public static void main(String[] args) {
		
		Book[] library =  new Book[5]; // �ν��Ͻ��� 5�� �����Ǵ°��� �ƴ϶� �ν��Ͻ��� �� �ּҰ� 5�� ������.
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		
		//�Ҵ�� �ּҿ� �ν��Ͻ� ���� �� �� �ֱ� 
		
		library[0] = new Book("īī�� ����ϱ�", "īī�� ����");
		library[1] = new Book("���̹� ����ϱ�", "���̹� ����");
		library[2] = new Book("���� ����ϱ�", "���� ����");
		library[3] = new Book("���� ����ϱ�", "���� ����");
		library[4] = new Book("��� ����ϱ�", "��� ����");
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		
		for(int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}
		
		
		//��ü �迭 ����(���� ���� : ��ü�� �ּҰ� �����, �ν��Ͻ��� ���� �����ϰ� �Ǹ� �� �ν��Ͻ� ��� �����)
		Book[] libraryshallow = new Book[5];
		
		libraryshallow[0] = new Book("����Ʈ����", "Front-end");
		libraryshallow[1] = new Book("�鿣��", "Back-end");
		libraryshallow[2] = new Book("�ȵ���̵�", "Android");
		libraryshallow[3] = new Book("���̿�����", "IOS");
		libraryshallow[4] = new Book("����", "Game");
		
		System.arraycopy(library, 0, libraryshallow, 0, 5);
		System.out.println("��ü�迭 ����");
		
		
		//��ü �迭 ����(���� ���� : �ν��Ͻ� ���� ���� ����, �� ���� �ν��Ͻ� �ּҰ� �ٸ�)
		
		Book[] librarydeep = new Book[5];
		
		for(int i = 0; i < librarydeep.length; i++) {
			librarydeep[i] = new Book();
		}
		
		for(int i = 0; i < librarydeep.length; i++) {
			librarydeep[i].setBookName(library[i].getBookName());
			librarydeep[i].setAuthor(library[i].getAuthor());
		}
		
		//���� ����� ���� ���� ��
		
		library[2].setBookName("å�̸� ����");
		library[2].setAuthor("���� ����");
		
		System.out.println("*******���� ����*******");
		for(int i = 0; i < library.length; i++) {
			libraryshallow[i].showBookInfo();
		}
		
		System.out.println("*******���� ����*******");
		for(int i = 0; i < library.length; i++) {
			librarydeep[i].showBookInfo();
		}
		
	}
	

}
