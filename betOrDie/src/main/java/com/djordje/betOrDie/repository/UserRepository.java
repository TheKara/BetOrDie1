package com.djordje.betOrDie.repository;

import com.djordje.betOrDie.jpa.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
