package com.shop.quick;

import com.shop.quick.member.entity.Grade;
import com.shop.quick.member.entity.Member;
import com.shop.quick.member.repository.MemberRepository;
import com.shop.quick.member.service.MemberService;
import com.shop.quick.member.service.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class QuickApplicationTests {

	MemberService memberService;

	@Test
	void join() {
		// given
		Member member = new Member(1L, "memberA", Grade.VIP);

		// when
		memberService.join(member);
		Member findMember = memberService.findMember(1L);

		//then
		Assertions.assertThat(member).isEqualTo(findMember);
	}

	@Test
	void contextLoads() {
	}

}
