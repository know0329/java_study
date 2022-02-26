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
		
		//containsKey : key값에 대한 value가 Map안에 있는지 여부를 체크하여 true/false로 반환
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
