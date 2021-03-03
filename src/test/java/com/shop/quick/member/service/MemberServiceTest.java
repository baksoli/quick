package com.shop.quick.member.service;

import com.shop.quick.AppConfig;
import org.junit.jupiter.api.BeforeEach;

public class MemberServiceTest {

    MemberService memberService;

    /*
     * @BeforeEach - 테스트 실행전 호출
     * */
    @BeforeEach
    public void beforeEach(){
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }
}
