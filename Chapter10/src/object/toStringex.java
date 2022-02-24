package object;


class Book{
	
	String title;
	String author;
	
	Book(String title, String author){
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return title + ", " + author ;
	}
	
	
}

public class toStringex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book("DOIT", "KIM");
		System.out.println(book);
		
		String str = new String("test");
		System.out.println(str);
	}

}
