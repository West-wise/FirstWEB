package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MemoryMemberRepositoryTest {
    MemoryMemberRepository repository = new MemoryMemberRepository();

    @AfterEach
    public void afterEach(){
        repository.clearStore();
    }
    @Test
    public void save(){
        Member member1 =new Member(); //member객체 생성
        member1.setName("spring1"); //이름 설정
        repository.save(member1); //저장

        Member member2 =new Member(); //member객체 생성
        member2.setName("spring2"); //이름 설정
        repository.save(member2); //저장
        Member result = repository.findByName("spring1").get();//db에서 꺼낸값
    }
    @Test
    public void findAll(){
        Member member1 =new Member(); //member객체 생성
        member1.setName("spring1"); //이름 설정
        repository.save(member1); //저장

        Member member =new Member(); //member객체 생성
        member.setName("spring"); //이름 설정
        repository.save(member); //저장

        List<Member> result = repository.findAll();



    }
}
