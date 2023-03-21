package com.test.good.repository;

import com.test.good.member.Member;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository  {
    private static Map<Long, Member> store = new HashMap<>();


    public void save(Member member) {
        store.put(member.getId(), member);
    }


    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
