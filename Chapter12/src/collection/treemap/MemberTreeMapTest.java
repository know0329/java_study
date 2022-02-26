package collection.treemap;

import collection.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		Member memberLee = new Member(102, "이순신");
		Member memberKim = new Member(101, "김유신");
		Member memberShin = new Member(103, "신사임당");
		
		memberTreeMap.addMember(memberLee);
		memberTreeMap.addMember(memberKim);
		memberTreeMap.addMember(memberShin);
		
		memberTreeMap.showAllMember();
		
		memberTreeMap.removeMember(memberLee.getMemberId());
		
		memberTreeMap.showAllMember();
		
	}

}
