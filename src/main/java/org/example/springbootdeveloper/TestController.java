package org.example.springbootdeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//import java.lang.reflect.Member;
import java.util.List;

@RestController
public class TestController {
    @Autowired   //TestController 빈 주입
    TestService testService;

    @GetMapping("/test")
    public List<Member> getAllMembers(){
        List<Member> members = testService.getAllMembers();
        return members;

    }
}

//유저 정보 수정

// 유저 탈퇴
// 북마크 관련 기능 (보기, 수정)
// 게시판, 댓글 - 다른 엔티티(설계 문제)


