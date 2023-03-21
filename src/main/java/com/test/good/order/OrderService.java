package com.test.good.order;

import com.test.good.discount.DiscountPolicy;
import com.test.good.discount.RateDiscountPolicy;
import com.test.good.member.Member;
import com.test.good.repository.MemberRepository;

public class OrderService {
    private final DiscountPolicy discountPolicy;
    private final MemberRepository memberRepository;

    public OrderService(DiscountPolicy discountPolicy, MemberRepository memberRepository) {
        this.discountPolicy = discountPolicy;
        this.memberRepository = memberRepository;
    }

    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int disCountPrice = discountPolicy.disCount(member, itemPrice);
        return new Order(memberId, itemName, itemPrice, disCountPrice);
    }
}
