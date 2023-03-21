package com.test.good;

import com.test.good.member.Grade;
import com.test.good.member.Member;
import com.test.good.member.MemberService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MemberApp implements InitializingBean, DisposableBean {
    public static void main(String[] args) {

        /*// AppConfig 통하여 객체 가져오기
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();

        // 로직
        Member member = new Member(1L, "박한마", Grade.VIP);
        memberService.join(member);

        Member fineMember = memberService.findMember(1L);
        System.out.println("기존 멤버 = " + member.getName());
        System.out.println("가입 멤버 = " + fineMember.getName());*/
    }

    @Override
    public void destroy() throws Exception {

    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
