package com.shop.quick;

import com.shop.quick.member.entity.Grade;
import com.shop.quick.member.entity.Member;
import com.shop.quick.member.repository.MemberRepository;
import com.shop.quick.member.service.MemberService;
import com.shop.quick.member.service.MemberServiceImpl;
import com.shop.quick.order.entity.Order;
import com.shop.quick.order.service.OrderService;
import com.shop.quick.order.service.OrderServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuickApplication {

	public static void main(String[] args) {

//		MemberRepository memberRepository = null;
//		MemberService memberService = new MemberServiceImpl(memberRepository);
//		OrderService orderService;

//		long memberId = 1L;
//
//		Member member = new Member(memberId, "memberA", Grade.VIP);
//		memberService.join(member);
//
//		Order order = orderService.createOrder(memberId, "itemA", 10000);
//		System.out.println("order = " + order);
//
		SpringApplication.run(QuickApplication.class, args);
	}

}
