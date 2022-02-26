package collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import collection.Member;

public class MemberHashMap {

	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
		
	}
	
	public boolean removeMember(int memberId) {
		
		//containsKey : key���� ���� value�� Map�ȿ� �ִ��� ���θ� üũ�Ͽ� true/false�� ��ȯ
		if(hashMap.containsKey(memberId)){
			hashMap.remove(memberId);
			return true;
		}
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		
		while(ir.hasNext()) {
			int key = ir.next();
			
			Member member = hashMap.get(key);
			System.out.println(member);
		}
	}
	
}
