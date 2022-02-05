package com.test.good;

import com.test.good.member.Grade;
import com.test.good.member.Member;
import com.test.good.member.MemberService;

public class MemberApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        Member member = new Member(1L, "박한마", Grade.VIP);
        memberService.join(member);

        Member fineMember = memberService.findMember(1L);
        System.out.println("기존 멤버 = " + member.getName());
        System.out.println("가입 멤버 = " + fineMember.getName());
    }
}
