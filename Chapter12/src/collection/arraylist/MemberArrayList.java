package collection.arraylist;


/*
 ArrayList : �񵿱��
 Vector : ����� - ��Ƽ ������ ���¿��� ���ҽ��� ���� ����ȭ�� �ʿ��� ��� ���
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
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAll() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		
		//System.out.println(arrayList); 
	}
}
