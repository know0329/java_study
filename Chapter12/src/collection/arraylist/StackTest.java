package collection.arraylist;

import java.util.ArrayList;

class MyStack{
	
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	public String pop() {
		
		if(arrayStack.size() == 0) { //������ underflow error
			System.out.println("���ؿ� ����� �����Ͱ� �����ϴ�.");
			return null;
		}
		return arrayStack.remove(arrayStack.size()-1);
	}
	
	public String peek() {
		if(arrayStack.size() == 0) { //������ underflow error
			System.out.println("���ؿ� ����� �����Ͱ� �����ϴ�.");
			return null;
		}
		return arrayStack.get(arrayStack.size()-1);
	}
	
}

public class StackTest {

	public static void main(String[] args) {
	
		MyStack stack = new MyStack();
		
		stack.push("a");
		stack.push("b");
		stack.push("c");
		stack.push("d");
		stack.push("e");
		
		System.out.println("peek�� ������ : " + stack.peek());
		System.out.println("peek�� ������ : " + stack.peek());
		System.out.println("peek�� ������ : " + stack.peek());
		
		System.out.println("pop�� ������ : " + stack.pop());
		System.out.println("pop�� ������ : " + stack.pop());
		System.out.println("pop�� ������ : " + stack.pop());
		System.out.println("pop�� ������ : " + stack.pop());
		System.out.println("pop�� ������ : " + stack.pop());
		System.out.println("pop�� ������ : " + stack.pop());
		
		
		
	}
}
