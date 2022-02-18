package array;

import java.util.ArrayList;

/*
 <ArrayList>
 1.�ڹٿ��� �����Ǵ� ��ü �迭�� ������ Ŭ�����̴�.
 2.���� ���� ����ϴ� ��ü �迭 Ŭ����
 3.ArrayList<E>
 4.ArrayList �ֿ� �޼��� : 
 	4-1.boolean add(E e)
 	4-2.int size()
 	4-3.E get(int index)
 	4-4.E remove(int index)
 	4-5.boolean isEmpty()
 5.help�� �����ϸ� �ڼ��ϰ� �޼����� ���� �� ������ �� �� �ִ�.
 */
public class ArrayListTest {
	
		public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		for(String s: list) {
			System.out.println(s);
		}
		
		// or
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
