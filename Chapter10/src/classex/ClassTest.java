package classex;


/*
 <Class class>
 1.���ÿ� ���� Ŭ�������� ����Ͽ� ���α׷���(reflection programming)�� �� ���
  1.1.reflection programming : Ŭ������ ����(������ �������, �޼���)�� �������� �̸� Ȱ���ϸ� �ν��Ͻ��� �����ϰ�, �޼��带 ȣ���ϴ� ���� ���α׷��� ���
 2.�����ε� : ������Ÿ���� ������ ���� �ƴ϶� ��Ÿ�� �� ������ Ÿ���� �˰� binding�Ǵ� ���
 */
public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		
		Person person = new Person();
		
		//Class class�� �������� 3���� ���
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		//1, 2��° ����� ���������� class�� �����ϵǾ� �־�� ��. - �����ε�
		
		Class pClass3 = Class.forName("classex.Person");
		System.out.println(pClass3.getName());
		//���� �ε�
		
		Person p2 = (Person)pClass3.newInstance();
		System.out.println(p2);
		}

}
