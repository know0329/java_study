package collection.hashset;

import java.util.HashSet;

/*
 <Set �������̽�>
 1.Collection ������ �������̽�
 2.�ߺ��� ������� ����
 3.���̵�, �ֹι�ȣ�� ������ ���̳� ��ü�� ������ �� ���
 4.������ ���� -> ����� ������ ��¼����� �ٸ� �� ����
 5.get(i)�޼��尡 �������� ����
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
		System.out.println(b2); //false, ���� ����
		System.out.println(set);
	}

}
