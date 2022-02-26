package collection.hashset;



import java.util.HashSet;
import java.util.Iterator;

import collection.Member;

public class MemberHashSet {

private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member member) {
		hashSet.add(member); //Member Class에서 equals와 hashCode를 구현해야 중복을 검사한다. 
	}
	public boolean removeMember(int memberId){
		
		Iterator<Member> iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			Member member = iterator.next();
			if(member.getMemberId() == memberId) {
				hashSet.remove(member);
				return true;
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAll() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		
	
	}
	
}
