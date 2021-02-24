package com.shop.quick.member.service;

import com.shop.quick.member.entity.Member;

public interface MemberService {
    void join(Member member);

    Member findMember(Long memberId);
}
