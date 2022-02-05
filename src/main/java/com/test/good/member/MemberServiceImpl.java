package com.test.good.member;

public class MemberServiceImpl implements MemberService {
    private MemberRepo memberRepo;

    public MemberServiceImpl(MemberRepo memoryMemberRepo) {
        this.memberRepo = memoryMemberRepo;
    }

    @Override
    public void join(Member member) {
        memberRepo.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepo.findById(memberId);
    }
}
