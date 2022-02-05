package com.test.good;

import com.test.good.member.Grade;
import com.test.good.member.Member;
import com.test.good.member.MemberService;
import com.test.good.order.Order;
import com.test.good.order.OrderService;

public class OrderApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();
        Long memberId = 1L;
        Member member = new Member(memberId, "박한마", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "버섯", 10000);
        System.out.println("order = " + order);
        System.out.println("order 할인된 결과 금액 = " + order.resultPrice());
    }
}
