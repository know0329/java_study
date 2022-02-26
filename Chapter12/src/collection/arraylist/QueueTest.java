package collection.arraylist;

import java.util.ArrayList;

class MyQueue{
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	public String deQueue() {
		
		if(arrayQueue.size() == 0) { //������ underflow error
			System.out.println("ť�� ����� �����Ͱ� �����ϴ�.");
			return null;
		}
		return arrayQueue.remove(0);
	}
	
}

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue queue = new MyQueue();
		
		queue.enQueue("a");
		queue.enQueue("b");
		queue.enQueue("c");
		queue.enQueue("d");
		queue.enQueue("e");
		
		System.out.println("pop�� ������ : " + queue.deQueue());
		System.out.println("pop�� ������ : " + queue.deQueue());
		System.out.println("pop�� ������ : " + queue.deQueue());
		System.out.println("pop�� ������ : " + queue.deQueue());
		System.out.println("pop�� ������ : " + queue.deQueue());
		System.out.println("pop�� ������ : " + queue.deQueue());
		
	}

}
