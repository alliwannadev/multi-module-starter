package me.alliwannadev.coredomain.repository;

import me.alliwannadev.coredomain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<User, Long> {
}
