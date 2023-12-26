package com.example.junk.repository;

import com.example.junk.domain.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;
@Transactional
public interface UserRepository2 extends JpaRepository<User, Long> {


    @Query(value="select * from H_MEMBER where userName = :userName", nativeQuery = true)
    Optional<User> findByUsername(@Param("userName") String userName);

    @Modifying
    @Query(value="update H_MEMBER" +
            "       set bamtori = :bamtori" +
            "       where user_id = :id", nativeQuery = true)
    void saveBamtori(@Param("id") long id, @Param("bamtori") int bamtori);
}
