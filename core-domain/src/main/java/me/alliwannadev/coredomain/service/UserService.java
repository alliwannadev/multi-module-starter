package me.alliwannadev.coredomain.service;

import lombok.RequiredArgsConstructor;
import me.alliwannadev.coredomain.model.User;
import me.alliwannadev.coredomain.repository.UserJpaRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserJpaRepository userJpaRepository;

    public void save(User user) {
        userJpaRepository.save(user);
    }
}
