package com.example.apresentacao2.repository;

import com.example.apresentacao2.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Boolean existsByCpf(Long cpf);
}



