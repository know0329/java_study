package collection.treeset;

import java.util.TreeSet;

/*
 <TreeSet 클래스>
 1.객체의 정렬에 사용되는 클래스
 2.중복을 허용하지 않으면서 오름차순이나 내림차순으로 객체를 정렬함
 3.내부적으로 이진 검색 트리로 구현되어 있음
 4.이진 검색 트리에 자료가 저장 될 때 비교하여 저장될 위치를 정함
 5.객체 비교를 위해 Comparable이나 Comparator 인터페이스를 구현해야 함
 */


public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> tree = new TreeSet<String>();
		
		tree.add("aaa");
		tree.add("ccc");
		tree.add("bbb");
		
		System.out.println(tree);
	}

}
