package com.test.good;

import com.test.good.discount.DiscountPolicy;
import com.test.good.discount.FixDiscountPolicy;
import com.test.good.discount.RateDiscountPolicy;
import com.test.good.member.MemberRepo;
import com.test.good.member.MemberService;
import com.test.good.member.MemberServiceImpl;
import com.test.good.member.MemoryMemberRepo;
import com.test.good.order.OrderService;
import com.test.good.order.OrderServiceImpl;

public class AppConfig {
    public MemberService memberService() {
        return new MemberServiceImpl(getMemoryMemberRepo());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(getMemoryMemberRepo(), GetDiscountPolicy());
    }

    private MemberRepo getMemoryMemberRepo() {
        return new MemoryMemberRepo();
    }

    private DiscountPolicy GetDiscountPolicy() {
        return new FixDiscountPolicy();
    }
}
