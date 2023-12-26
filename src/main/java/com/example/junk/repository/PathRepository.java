package com.example.junk.repository;

import com.example.junk.domain.ImgPath;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PathRepository extends JpaRepository<ImgPath, Long> {
}
