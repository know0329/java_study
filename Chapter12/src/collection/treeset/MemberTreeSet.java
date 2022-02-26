package collection.treeset;




import java.util.Iterator;
import java.util.TreeSet;

import collection.Member;

public class MemberTreeSet {

private TreeSet<Member> treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>(new Member()); //comparator 방식
	}
	
	public void addMember(Member member) {
		treeSet.add(member); //Member Class에서 equals와 hashCode를 구현해야 중복을 검사한다. 
	}
	public boolean removeMember(int memberId){
		
		Iterator<Member> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Member member = iterator.next();
			if(member.getMemberId() == memberId) {
				treeSet.remove(member);
				return true;
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAll() {
		for(Member member : treeSet) {
			System.out.println(member);
		}
		
	
	}
	
}
