package com.test.good.order;

import com.test.good.discount.DiscountPolicy;
import com.test.good.member.Member;
import com.test.good.member.MemberRepo;
import com.test.good.member.MemoryMemberRepo;

public class OrderServiceImpl implements OrderService {
    private final MemberRepo memberRepo;
    private final DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepo memberRepo, DiscountPolicy discountPolicy) {
        this.memberRepo = memberRepo;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepo.findById(memberId);
        int disCountPrice = discountPolicy.disCount(member, itemPrice);
        return new Order(memberId, itemName, itemPrice, disCountPrice);
    }
}
