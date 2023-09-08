package com.example.apresentacao2.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "ITENS")
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ITEM_ID")
    private Long id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "QTD")
    private Integer qtd;

    @Column(name = "MIN")
    private Integer min;

    @Column(name = "CUSTO")
    private Double custo;

    @Column(name = "TIPO")
    private String tipo;

    @Column(name = "VENDA")
    private Double venda = getCusto() * 2.2;


    public Double getCusto() {
        return custo != null ? custo : 0D;
    }
}
