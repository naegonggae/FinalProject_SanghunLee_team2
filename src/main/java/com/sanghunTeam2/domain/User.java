package com.sanghunTeam2.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
// 이건 보안상 컨트롤러나 서비스에 파라미터로 받으면 안돼
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String password;
}
