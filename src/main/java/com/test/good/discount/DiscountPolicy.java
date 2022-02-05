package com.test.good.discount;

import com.test.good.member.Member;

public interface DiscountPolicy {
    /**
     * @return 할인금액
     */
    int disCount(Member member, int price);
}
