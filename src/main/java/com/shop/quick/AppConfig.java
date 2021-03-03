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
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
* 구현 객체를 생성하고, 연결하는 책임을 가지는 별도의 설정 클래스
* @Configuration - AppConfig에 설정을 구성한다.
* @Bean - 스프링 컨테이너에 스프링 빈으로 등록한다.
* */
@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(
                memberRepository(),
                discountPolicy());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }

    @Bean
    public DiscountPolicy discountPolicy(){
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }
}
