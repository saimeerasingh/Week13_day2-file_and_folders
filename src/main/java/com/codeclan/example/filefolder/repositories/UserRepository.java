package com.codeclan.example.filefolder.repositories;

import com.codeclan.example.filefolder.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
