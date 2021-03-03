package com.shop.quick;

import com.shop.quick.discount.DiscountPolicy;
import com.shop.quick.discount.FixDiscountPolicy;
import com.shop.quick.discount.RateDiscountPolicy;
import com.shop.quick.member.repository.MemberRepository;
import com.shop.quick.member.repository.MemoryMemberRepository;
import com.shop.quick.member.service.MemberService;
import com.shop.quick.member.service.MemberServiceImpl;
import com.shop.quick.order.service.OrderService;
import com.shop.quick.order.service.OrderServiceImpl;

/*
* 구현 객체를 생성하고, 연결하는 책임을 가지는 별도의 설정 클래스
* */
public class AppConfig {

    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    public OrderService orderService(){
        return new OrderServiceImpl(
                memberRepository(),
                discountPolicy());
    }

    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }

    public DiscountPolicy discountPolicy(){
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }
}
