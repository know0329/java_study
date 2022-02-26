package collection.hashset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(101, "¿Ãº¯Ω≈");
		Member memberKim = new Member(102, "±Ë¿ØΩ≈");
		Member memberShin = new Member(103, "Ω≈ªÁ¿”¥Á");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberShin);
		memberHashSet.showAll();
		
		Member memberLee2 = new Member(101, "¿Ã∏˘∑Ê");
		memberHashSet.addMember(memberLee2);
		memberHashSet.showAll();
		
		memberHashSet.removeMember(101);
		memberHashSet.showAll();
	}

}
