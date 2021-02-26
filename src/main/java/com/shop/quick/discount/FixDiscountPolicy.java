package com.shop.quick.discount;

import com.shop.quick.member.entity.Grade;
import com.shop.quick.member.entity.Member;

public class FixDiscountPolicy implements DiscountPolicy {
    private int discountFixAmount = 1000; // 1000원 할인


    @Override
    public int discount(Member member, int price) {
        if (member.getGrade().equals(Grade.VIP)) {
            return discountFixAmount;
        } else {
            return 0;
        }
    }
}
