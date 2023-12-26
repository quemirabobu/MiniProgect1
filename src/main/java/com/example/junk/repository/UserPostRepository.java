package com.example.junk.repository;

import com.example.junk.domain.User;
import com.example.junk.domain.UserPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPostRepository extends JpaRepository<UserPost, Long> {
    UserPost findByUser(User user);

}
