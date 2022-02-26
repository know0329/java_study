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
		hashSet.add(member); //Member Class���� equals�� hashCode�� �����ؾ� �ߺ��� �˻��Ѵ�. 
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
		
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAll() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		
	
	}
	
}