package com.umc.bwither.breeder.repository;

import com.umc.bwither.breeder.entity.Breeder;
import com.umc.bwither.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BreederRepository extends JpaRepository<Breeder, Long> {
}
