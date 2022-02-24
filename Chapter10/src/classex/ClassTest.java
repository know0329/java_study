package classex;


/*
 <Class class>
 1.로컬에 없는 클래스들을 사용하여 프로그래밍(reflection programming)할 때 사용
  1.1.reflection programming : 클래스의 정보(생성자 멤버변수, 메서드)를 가져오고 이를 활용하며 인스턴스를 생성하고, 메서드를 호출하는 등의 프로그래밍 방식
 2.동적로딩 : 데이터타입이 컴파일 때가 아니라 런타임 때 데이터 타입을 알고 binding되는 방식
 */
public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		
		Person person = new Person();
		
		//Class class를 가져오는 3가지 방법
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		//1, 2번째 방법은 가져오려는 class가 컴파일되어 있어야 됨. - 정적로딩
		
		Class pClass3 = Class.forName("classex.Person");
		System.out.println(pClass3.getName());
		//동적 로딩
		
		Person p2 = (Person)pClass3.newInstance();
		System.out.println(p2);
		}

}
