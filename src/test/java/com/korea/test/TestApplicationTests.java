package com.korea.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class TestApplicationTests {
  @Autowired
  private PostRepository postRepository;

  @Test
  void testJpa() {
    Post p1 = new Post();
    p1.setTitle("sbb가 무엇인가요?");
    p1.setContent("sbb에 대해서 알고 싶습니다.");
    p1.setCreateDate(LocalDateTime.now());
    this.postRepository.save(p1);  // 첫번째 질문 저장

    Post p2 = new Post();
    p2.setTitle("sbb가 무엇인가요2?");
    p2.setContent("sbb에 대해서 알고 싶습니다2.");
    p2.setCreateDate(LocalDateTime.now());
    this.postRepository.save(p1);  // 첫번째 질문 저장
  }
}


