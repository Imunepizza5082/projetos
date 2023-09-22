package com.example.apresentacao2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "SACOLA")
@SuperBuilder
@NoArgsConstructor
public class Sacola {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SACOLA")
    private Long id;

    @Column(name = "ITEM_NAME")
    private String nome;

    @Column(name = "VALOR")
    private Double valor;

    @Column(name = "QTD")
    private Integer qtd;

    @Column(name = "TOTAL")
    private Double total;

    @OneToMany
    public List<ItemSacola> itens = new ArrayList<>();
}
