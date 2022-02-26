package collection.arraylist;


/*
 ArrayList : 비동기식
 Vector : 동기식 - 멀티 쓰레드 상태에서 리소스에 대한 동기화가 필요한 경우 사용
 */
import java.util.ArrayList;
import java.util.Iterator;

import collection.Member;

public class MemberArrayList {

	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	public boolean removeMember(int memberId){
		
		/*<for문으로 element 찾기>
		for(int i = 0; i < arrayList.size(); i++) {
			if(arrayList.get(i).getMemberId() == memberId) {
				arrayList.remove(i);
				return true;
			}
			
		}
		*/
		//<iterator로 element 찾기> - 인덱스를 사용하지 않는(순서가 의미없는) 자료구조에서 사용한다 ex.HashSet
		Iterator<Member> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			Member member = iterator.next();
			if(member.getMemberId() == memberId) {
				arrayList.remove(member);
				return true;
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAll() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		
		//System.out.println(arrayList); 
	}
}
