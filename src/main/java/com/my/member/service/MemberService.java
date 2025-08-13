package com.my.member.service;

import com.my.member.entity.Member;
import com.my.member.repository.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    // 리표지토리를 생성자 주입방법으로 가져오기
    private final MemberRepository repository;

    public MemberService(MemberRepository memberRepository, MemberRepository repository, MemberRepository repository1, MemberRepository repository2) {
        this.repository = repository2;


    }

    // 리포지토리 통해서 멤버리수투 가져오기
    public List<Member> getAllList() {
        List<Member> memberList = repository.findAll();
        System.out.println(memberList);
        return memberList;
    }
}
