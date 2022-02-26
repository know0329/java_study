package collection.hashset;

import java.util.HashSet;

/*
 <Set 인터페이스>
 1.Collection 하위의 인터페이스
 2.중복을 허용하지 않음
 3.아이디, 주민번호등 유일한 값이나 객체를 관리할 때 사용
 4.순서가 없음 -> 저장된 순서와 출력순서가 다를 수 있음
 5.get(i)메서드가 제공되지 않음
 */
public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		
		boolean b1 = set.add("aaa");
		System.out.println(b1);
		
		set.add("bbb");
		set.add("ccc");
		System.out.println(set);


		
		boolean b2 = set.add("aaa");
		System.out.println(b2); //false, 들어가지 않음
		System.out.println(set);
	}

}
