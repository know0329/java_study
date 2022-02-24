package collection.arraylist;


/*
 ArrayList : 비동기식
 Vector : 동기식 - 멀티 쓰레드 상태에서 리소스에 대한 동기화가 필요한 경우 사용
 */
import java.util.ArrayList;

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
		for(int i = 0; i < arrayList.size(); i++) {
			if(arrayList.get(i).getMemberId() == memberId) {
				arrayList.remove(i);
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
