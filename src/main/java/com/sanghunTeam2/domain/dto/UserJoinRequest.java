package com.sanghunTeam2.domain.dto;

import com.sanghunTeam2.domain.User;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserJoinRequest {
    private String userName;
    private String password;
    private String message;

    // 꼭 변환해야하나
    public User toEntity() {
        return User.builder()
                .userName(this.userName)
                .password(this.password)
                .build();
    }
}
