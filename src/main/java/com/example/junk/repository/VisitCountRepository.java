package com.example.junk.repository;

import com.example.junk.domain.User;
import com.example.junk.domain.VisitCount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitCountRepository extends JpaRepository<VisitCount, Long> {
    VisitCount findByUser(User user);
}
