package com.my.member.service;

import com.my.member.dto.MemberDto;
import com.my.member.entity.Member;
import com.my.member.repository.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService {
    // 리표지토리를 생성자 주입방법으로 가져오기
    private final MemberRepository repository;

    public MemberService(MemberRepository memberRepository, MemberRepository repository, MemberRepository repository1, MemberRepository repository2) {
        this.repository = repository2;


    }

    // 리포지토리 통해서 멤버리수투 가져오기
    public List<MemberDto> getAllList() {
        List<Member> memberList = repository.findAll();
        System.out.println(memberList);
        //비어있는 DTO List 만들기
//        List<MemberDto> dtoList = new ArrayList<>();
        //Entity List를 DTO List로 변환
//        for (int i = 0; i < memberList.size(); i++) {
//            //리스트에 있는 엔티티를 하나씩 일어서
//            //Dto에 다는다.
//            MemberDto dto = new MemberDto();
//            dto.setId((memberList.get(i).getId()));
//            dto.setName((memberList.get(i).getName()));
//            dto.setAge(memberList.get(i).getAge());
//            dto.setAddress(memberList.get(i).getAddress());
//            dtoList.add(dto);
//        }
        // fromMemberEntity 메서드로 작업하기
        return  memberList
                .stream()
                .map(x -> MemberDto.fromMemberEntity(x))
                .toList();
//        return dtoList;
    }
}
