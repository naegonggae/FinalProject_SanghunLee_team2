package com.sanghunTeam2.service;

import com.sanghunTeam2.domain.User;
import com.sanghunTeam2.domain.dto.UserJoinRequest;
import com.sanghunTeam2.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    // 큰 흐름은 알겠는데 리턴타입이랑 메소드 파라미터로 뭘 쓸지 모르겠다.
    // 리턴타입은 지금 스트링이지만 dto로 바뀌지 않을까?
    // 파라미터도 dto로 담지 않을까?
    public String join(String userName, String password) {
        // 중복체크
        userRepository.findByUserName(userName)
                .ifPresent(user -> {throw new RuntimeException("");
                });
        // 저장
        // 밑에 한거도 변환을 여기서 억지로 한 느낌이야 그냥 이렇게 할 수도 있구나 생각해야할듯
        User user = User.builder()
                .userName(userName)
                .password(password)
                .build();
        userRepository.save(user);
        return "SUCCESS";
    }
}
