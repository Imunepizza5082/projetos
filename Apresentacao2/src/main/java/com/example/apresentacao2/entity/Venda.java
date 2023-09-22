package com.example.apresentacao2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "quantidade")
    private Integer qtdVenda;
    @Column(name = "valor")
    private Double valor;
    @Column(name = "data")
    private LocalDateTime dateTime;



}
