package com.salt.saltminiproject.repository;

import com.salt.saltminiproject.entity.Konsumen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KonsumenRepository extends JpaRepository<Konsumen, Long> {
}
