package collection.treemap;

import java.util.Iterator;
import java.util.TreeMap;

import collection.Member;

public class MemberTreeMap {

	private TreeMap<Integer, Member> treeMap;
	
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		treeMap.put(member.getMemberId(), member);
		
	}
	
	public boolean removeMember(int memberId) {
		
		//containsKey : key값에 대한 value가 Map안에 있는지 여부를 체크하여 true/false로 반환
		if(treeMap.containsKey(memberId)){
			treeMap.remove(memberId);
			return true;
		}
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir = treeMap.keySet().iterator();
		
		while(ir.hasNext()) {
			int key = ir.next();
			
			Member member = treeMap.get(key);
			System.out.println(member);
		}
	}
	
}
