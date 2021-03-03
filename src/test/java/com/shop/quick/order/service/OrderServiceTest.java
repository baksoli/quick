package com.shop.quick.order.service;

import com.shop.quick.AppConfig;
import com.shop.quick.member.service.MemberService;
import org.junit.jupiter.api.BeforeEach;

public class OrderServiceTest {

    MemberService memberService;
    OrderService orderService;

    /*
    * @BeforeEach - 테스트 실행전 호출
    * */
    @BeforeEach
    public void beforeEach(){
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        orderService = appConfig.orderService();
    }
}
