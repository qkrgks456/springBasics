package com.test.good;

import com.test.good.discount.DiscountPolicy;
import com.test.good.discount.RateDiscountPolicy;
import com.test.good.member.MemberService;
import com.test.good.order.OrderService;
import com.test.good.repository.MemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


public class AppConfig {

    public MemberService memberService() {
        return new MemberService(memberRepository());
    }


    public OrderService orderService() {
        return new OrderService(discountPolicy(), memberRepository());
    }


    public MemberRepository memberRepository() {
        return new MemberRepository();
    }


    public DiscountPolicy discountPolicy() {
        // return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }

}
