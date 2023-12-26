package com.example.junk.repository;


import com.example.junk.domain.UserDotori;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDotori, Integer> {

}
