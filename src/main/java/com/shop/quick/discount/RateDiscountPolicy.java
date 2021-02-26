package com.shop.quick.discount;

import com.shop.quick.member.entity.Grade;
import com.shop.quick.member.entity.Member;

public class RateDiscountPolicy implements DiscountPolicy {

    private int discountPercent = 10; // 10% 할인


    @Override
    public int discount(Member member, int price) {
        if (member.getGrade().equals(Grade.VIP)) {
            return price * discountPercent / 100;
        } else {
            return 0;
        }
    }
}
