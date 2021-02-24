package com.shop.quick.member.repository;

import com.shop.quick.member.entity.Member;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);
}
