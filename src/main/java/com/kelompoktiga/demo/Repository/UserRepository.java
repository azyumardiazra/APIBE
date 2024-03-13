package com.kelompoktiga.demo.Repository;

import com.kelompoktiga.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    List <User> findUsersByNameContainingIgnoreCase(String name);
}
