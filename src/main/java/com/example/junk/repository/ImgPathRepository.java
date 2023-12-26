package com.example.junk.repository;

import com.example.junk.domain.ImgPath;
import com.example.junk.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImgPathRepository extends JpaRepository<ImgPath, Long> {
    ImgPath findByUser(User user);
}
