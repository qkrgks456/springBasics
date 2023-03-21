package com.test.good.member;

import com.test.good.repository.MemberRepository;

public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memoryMemberRepository) {
        this.memberRepository = memoryMemberRepository;
    }


    public void join(Member member) {
        memberRepository.save(member);
    }


    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
