package com.wegroceries.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<Users, UUID> {

    // Find a user by username
    Optional<Users> findByUsername(String username);

    // Find a user by email
    Optional<Users> findByEmail(String email);

    // Check if a username exists
    boolean existsByUsername(String username);

    // Check if an email exists
    boolean existsByEmail(String email);
}

