package com.example.apresentacao2.repository;

import com.example.apresentacao2.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {


    Boolean existsByNomeEqualsIgnoreCase(String nome);
}






