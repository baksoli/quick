package com.shop.quick.member.service;

import com.shop.quick.member.entity.Member;
import com.shop.quick.member.repository.MemberRepository;
import com.shop.quick.member.repository.MemoryMemberRepository;

public class MemberServiceImpl implements MemberService{
    private final MemberRepository memberRepository = new MemoryMemberRepository();


    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

}
