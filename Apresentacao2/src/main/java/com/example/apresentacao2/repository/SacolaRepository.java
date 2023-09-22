package com.example.apresentacao2.repository;

import com.example.apresentacao2.entity.Sacola;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SacolaRepository extends JpaRepository<Sacola, Long> {
        boolean existsById(Long id);
}
