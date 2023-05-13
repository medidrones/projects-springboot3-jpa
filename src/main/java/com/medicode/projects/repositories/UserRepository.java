package com.medicode.projects.repositories;

import com.medicode.projects.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
