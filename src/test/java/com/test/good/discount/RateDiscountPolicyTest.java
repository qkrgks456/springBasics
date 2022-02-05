package com.test.good.discount;

import com.test.good.member.Grade;
import com.test.good.member.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RateDiscountPolicyTest {

    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10% 할인 적용 되어야 한다")
    void vip() {
        //given
        Member member = new Member(1L, "박한마", Grade.VIP);
        //when
        int disCount = discountPolicy.disCount(member, 10000);
        //then
        assertEquals(disCount, 1000);
    }

    @Test
    @DisplayName("VIP가 아니면 할인 적용 x")
    void vip_x() {
        //given
        Member member = new Member(1L, "한솔박", Grade.BASIC);
        //when
        int disCount = discountPolicy.disCount(member, 10000);
        //then
        assertEquals(disCount, 0);
    }
}