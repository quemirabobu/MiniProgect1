package com.example.junk.repository;

import com.example.junk.domain.Likes;
import com.example.junk.domain.PhotoGallery;
import com.example.junk.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface LikesRepository extends JpaRepository<Likes, Long> {

    Optional<Likes> findByUserAndPhotoGallery(User user, PhotoGallery photoGallery);

    @Query(value = "select photo_id" +
            "   from likes" +
            "   where user_id = :userId", nativeQuery = true)
    List<Long> findPhotoIdByUserId(@Param("userId") Long id);


}
