package com.test.good.discount;

import com.test.good.member.Grade;
import com.test.good.member.Member;

public class RateDiscountPolicy implements DiscountPolicy {
    private int disCountPercent = 10;

    @Override
    public int disCount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return price * disCountPercent / 100;
        }
        return 0;
    }
}
