package collection;

import java.util.Comparator;

public class Member implements Comparable<Member>, Comparator<Member> {

	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public Member() {
	}
	
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String toString() {
		
		return memberName + " ȸ������ ���̵�� " + memberId + " �Դϴ�.";
	}

	//hashSet���� �ߺ��� �����ϱ� ���� �ʿ��� �κ� 1
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return memberId;
	}

	//hashSet���� �ߺ��� �����ϱ� ���� �ʿ��� �κ� 2
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Member) {
			Member member = (Member)obj;
			
			if(this.memberId == member.memberId) {
				return true;
			}
		}
		return false;
	}

	//treeSet�� ���� �ʿ��� �κ� Comparable
	@Override
	public int compareTo(Member member) {
		// TODO Auto-generated method stub
		
		// ID�� ���� : return (this.memberId - member.memberId); // ��������, �ݴ���ϸ� ��������
		return this.memberName.compareTo(member.memberName); // �̸����� ����
	}

	//treeSet�� ���� �ʿ��� �κ� Comparator, Comparator�� �� ��� ����Ʈ �����ڸ� �����ؾ� �Ѵ�.
	@Override
	public int compare(Member member1, Member member2) {
		// TODO Auto-generated method stub
		return (member1.memberId - member2.memberId);
		//member1�� �ڱ��ڽ�, member2�� �񱳴��
	}
	
	
}
