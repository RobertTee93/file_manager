package com.codeclan.example.filesFolders.Repositories;

import com.codeclan.example.filesFolders.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
