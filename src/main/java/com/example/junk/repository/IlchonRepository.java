package com.example.junk.repository;import com.example.junk.domain.Ilchon;import org.springframework.data.jpa.repository.JpaRepository;import org.springframework.stereotype.Repository;import java.util.List;@Repositorypublic interface IlchonRepository extends JpaRepository<Ilchon, Long> {    List<Ilchon> findByMe(String Me);}