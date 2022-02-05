package com.test.good.member;

import com.test.good.AppConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService;

    @BeforeEach
    public void before() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

    @Test
    void join() {
        //given
        Member member = new Member(1L, "박한마", Grade.VIP);
        //when
        memberService.join(member);
        Member fineMember = memberService.findMember(1L);
        //then
        Assertions.assertEquals(member, fineMember);
    }
}
