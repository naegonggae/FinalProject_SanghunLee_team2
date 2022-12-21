package com.sanghunTeam2.controller;

import com.sanghunTeam2.domain.User;
import com.sanghunTeam2.domain.dto.UserJoinRequest;
import com.sanghunTeam2.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok().body("hello");
    }

    // 여기도 리턴 타입이랑 메소드 파라미터 뭐쓸지 고민돼.
    // 리턴타입 스트링으로 받고 회원가입 성공메세지만 받아야하나?
    // >>라고 생각했지만 result code를 받아되니까 Response 하나 파고 파라미터에 result값을 넣어줘야지

    @PostMapping("/users/join")
    public ResponseEntity<User> join(@RequestBody UserJoinRequest dto) {
        return ResponseEntity.ok().body(dto.toEntity());
    }
}