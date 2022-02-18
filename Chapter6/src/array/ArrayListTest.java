package array;

import java.util.ArrayList;

/*
 <ArrayList>
 1.자바에서 제공되는 객체 배열이 구현된 클래스이다.
 2.가장 많이 사용하는 객체 배열 클래스
 3.ArrayList<E>
 4.ArrayList 주요 메서드 : 
 	4-1.boolean add(E e)
 	4-2.int size()
 	4-3.E get(int index)
 	4-4.E remove(int index)
 	4-5.boolean isEmpty()
 5.help를 참고하면 자세하게 메서드의 설명 및 사용법을 알 수 있다.
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
