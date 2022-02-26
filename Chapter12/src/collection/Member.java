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
		
		return memberName + " 회원님의 아이디는 " + memberId + " 입니다.";
	}

	//hashSet에서 중복을 방지하기 위해 필요한 부분 1
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return memberId;
	}

	//hashSet에서 중복을 방지하기 위해 필요한 부분 2
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

	//treeSet을 위해 필요한 부분 Comparable
	@Override
	public int compareTo(Member member) {
		// TODO Auto-generated method stub
		
		// ID로 정렬 : return (this.memberId - member.memberId); // 오름차순, 반대로하면 내림차순
		return this.memberName.compareTo(member.memberName); // 이름으로 정렬
	}

	//treeSet을 위해 필요한 부분 Comparator, Comparator를 쓸 경우 디폴트 생성자를 정의해야 한다.
	@Override
	public int compare(Member member1, Member member2) {
		// TODO Auto-generated method stub
		return (member1.memberId - member2.memberId);
		//member1이 자기자신, member2가 비교대상
	}
	
	
}
