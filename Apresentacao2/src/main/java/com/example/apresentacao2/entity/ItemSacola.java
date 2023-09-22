package com.example.apresentacao2.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Data
@NoArgsConstructor
@SuperBuilder
public class ItemSacola extends Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "nProduto")
    private String nPedido;

    @ManyToOne
    @Column(name = "pedido")
    private Pedido pedido;

    @Column(name = "quantidade")
    private Double qtd;

    @Column(name = "valor")
    private String valor;

    @Column(name = "total")
    private String total;

}
