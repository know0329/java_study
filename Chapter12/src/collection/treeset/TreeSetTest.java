package collection.treeset;

import java.util.TreeSet;

/*
 <TreeSet Ŭ����>
 1.��ü�� ���Ŀ� ���Ǵ� Ŭ����
 2.�ߺ��� ������� �����鼭 ���������̳� ������������ ��ü�� ������
 3.���������� ���� �˻� Ʈ���� �����Ǿ� ����
 4.���� �˻� Ʈ���� �ڷᰡ ���� �� �� ���Ͽ� ����� ��ġ�� ����
 5.��ü �񱳸� ���� Comparable�̳� Comparator �������̽��� �����ؾ� ��
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
