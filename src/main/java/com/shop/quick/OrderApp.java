package com.shop.quick;

import com.shop.quick.member.entity.Grade;
import com.shop.quick.member.entity.Member;
import com.shop.quick.member.service.MemberService;
import com.shop.quick.order.entity.Order;
import com.shop.quick.order.service.OrderService;

public class OrderApp {

    public static void main(String[] args){
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);
    }
}
