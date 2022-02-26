package collection.arraylist;

import java.util.ArrayList;

class MyStack{
	
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	public String pop() {
		
		if(arrayStack.size() == 0) { //없으면 underflow error
			System.out.println("스텍에 저장된 데이터가 없습니다.");
			return null;
		}
		return arrayStack.remove(arrayStack.size()-1);
	}
	
	public String peek() {
		if(arrayStack.size() == 0) { //없으면 underflow error
			System.out.println("스텍에 저장된 데이터가 없습니다.");
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
		
		System.out.println("peek한 데이터 : " + stack.peek());
		System.out.println("peek한 데이터 : " + stack.peek());
		System.out.println("peek한 데이터 : " + stack.peek());
		
		System.out.println("pop한 데이터 : " + stack.pop());
		System.out.println("pop한 데이터 : " + stack.pop());
		System.out.println("pop한 데이터 : " + stack.pop());
		System.out.println("pop한 데이터 : " + stack.pop());
		System.out.println("pop한 데이터 : " + stack.pop());
		System.out.println("pop한 데이터 : " + stack.pop());
		
		
		
	}
}
