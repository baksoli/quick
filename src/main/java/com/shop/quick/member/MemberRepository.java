package com.shop.quick.member;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);
}
