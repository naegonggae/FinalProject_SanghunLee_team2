package com.sanghunTeam2.repository;

import com.sanghunTeam2.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    // 여기서 UserName 중복체크 해주는 기능을 서비스에서 쓸 수 있게 만들어야하는데...
    // >> 그럼 optional 써야지
    Optional<User> findByUserName(String userName);
}
