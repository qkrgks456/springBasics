package com.test.good.order;

import com.test.good.AppConfig;
import com.test.good.member.Grade;
import com.test.good.member.Member;
import com.test.good.member.MemberService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {
    MemberService memberService;
    OrderService orderService;

    @BeforeEach
    public void before() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        orderService = appConfig.orderService();
    }

    @Test
    void createOrder() {
        Long memberId = 1L;
        Member member = new Member(memberId, "박한마", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "버섯", 10000);
        Assertions.assertEquals(order.getDisCountPrice(), 1000);
    }
}
