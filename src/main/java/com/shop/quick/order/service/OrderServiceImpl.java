package com.shop.quick.order.service;

import com.shop.quick.discount.DiscountPolicy;
import com.shop.quick.discount.FixDiscountPolicy;
import com.shop.quick.discount.RateDiscountPolicy;
import com.shop.quick.member.entity.Member;
import com.shop.quick.member.repository.MemberRepository;
import com.shop.quick.member.repository.MemoryMemberRepository;
import com.shop.quick.order.entity.Order;

public class OrderServiceImpl implements OrderService {

    //  인터페이스만 의존하도록 코드 변경
    private final MemberRepository memberRepository;
    private DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy){
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }


}
