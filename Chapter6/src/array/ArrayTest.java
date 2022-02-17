package array;


/*
 <�迭>
 1.������ �ڷ����� ������ �Ѳ����� ���������� ������ �� ����Ѵ�.
 2.�����͵��� ������,�������� ���ӵǾ� ����.
 3.�迭�� index ���� : 0 ~ �迭�� ����-1
 4.�迭�� ������ �� ���̸� ���ؾ� ��(��������)
 5.�迭 ���� ������ ���̿� ����� ������ �ȵȴ�
 6.�ڷ���[] �����̸� = new �ڷ���[����]; or �ڷ��� �����̸�[] = new �ڷ���[����];
 */

/*
 <�迭 ����>
 1.System.arraycopy(������ �迭��, ������ ������ġ, ����Ǵ� �迭��, ����Ǵ� ������ġ, �������);
 */
public class ArrayTest {
	public static void main(String[] args) {
		
		int numbers[] = new int[] {0, 1, 2}; //�ʱ�ȭ�� ���� �̷�����ٸ� ������ ���̸� �����ϸ� �ȵȴ�.
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("numbers : " + numbers[i]);
		}
		
		int numbers2[] = new int[5]; //�ʱ�ȭ���� ������ default������ �ʱ�ȭ�� �����ش�.
		
		numbers2[0] = 40;
		numbers2[1] = 30;
		numbers2[2] = 20;
		numbers2[3] = 10;
		
		for(int i = 0; i < numbers2.length; i++) {
			System.out.println("numbers2 : " + numbers2[i]);
		}
		
		
		
		//�迭����
		System.arraycopy(numbers, 0, numbers2, 0, 3);
		System.out.println("�迭 ����");
		for(int i = 0; i < numbers2.length; i++) {
			System.out.println("numbers2 : " + numbers2[i]);
		}
		
		//�迭�� ��� entity�� Ȯ���� ��� ���� ���
		for(int i : numbers2) {
			System.out.println(i);
		}
	}
}
