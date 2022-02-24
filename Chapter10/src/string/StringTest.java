package string;


/*
 <String Class>
 1.String ������ 2������ �������� ������ �ִ�
  1.1.���޸� ���� - �Ϲ� Ŭ������ ���������� new�� ����Ͽ� �ν��Ͻ��� �����. �ν��Ͻ����� �ּҰ��� �ٸ�
  1.2.�����(������ ����) ���� - int, char���� = �� �̿��Ͽ� ���� ����. ���� ���� �����ߴٸ� �� �ּҰ��� ����
 2.�ѹ� ������ String���� �Һ�(immutable)
 3.���ڿ� ������ ����ϸ� �޸𸮿� garbage�� ���� �� �ִ�. ���ڿ��� �����ϸ� ������ ���ڿ��� �޸𸮿� �ְ� ����Ǿ� ���� ���ڿ��� ���ο� �޸𸮿� ����Ǳ� ������
  3.1.���ڿ��� �ٲ۴ٸ� ���ڿ��� �������� ���̾ƴ϶� ����Ű�� �ּҰ� ����Ǵ� ���̴�.
 4.3���� ���� ���� ������ ���ڿ��� �����ϴ� �۾������� StringBuilder�� StringBuffer�� ����Ѵ�.
 
 <StringBuilder, StringBuffer>
 1.���������� �������� char[]�迭�� ������ �ִ� Ŭ����
 2.���� �迭�� �����ϹǷ� garbage�� ������ �ʴ´�.
 3.StringBuffer�� ��Ƽ ������ ���α׷��ֿ��� ����ȭ�� ����(����)
 4.STringBuilder�� ���� ������ ���α׷����� ����� �����Ѵ�(�񵿱�)
 5.String Class�� �ƴϱ� ������ toString()�޼���� String ��ȯ
 6.���ڿ� ����� append(Char[] chrs)�� ����Ѵ�.
 */
public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println(str1 == str2);
		
		String str3 = "abc";
		String str4 = "abc";
		System.out.println(str3 == str4);
		
		
		String str2_1 = new String("java");
		System.out.println(str2_1);
		System.out.println(System.identityHashCode(str2_1));
		
		StringBuilder buffer = new StringBuilder(str2_1);
		System.out.println(System.identityHashCode(buffer));
		
		buffer.append(" and");
		buffer.append(" android");
		System.out.println(System.identityHashCode(buffer));
		
		String str2_2 = buffer.toString();
		System.out.println(str2_2);
	}

}
