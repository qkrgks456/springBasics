package com.test.good.discount;

import com.test.good.member.Grade;
import com.test.good.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {
    private int disCountFix = 1000;

    @Override
    public int disCount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return disCountFix;
        }
        return 0;
    }
}
