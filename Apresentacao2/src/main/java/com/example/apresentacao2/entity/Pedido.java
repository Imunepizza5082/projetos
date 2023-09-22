package com.example.apresentacao2.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Table(name = "pedidos")
@Entity(name = "pedidos")
@Data
@NoArgsConstructor
@SuperBuilder
@EqualsAndHashCode(of = "id")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "N_Cliente")
    private String nCliente;

    @Column(name = "N_Pedido")
    private Integer nPedido;

    @Column(name = "Produto")
    private String produto;

    @Column(name = "qtd")
    private Double qtd;

    @Column(name = "Valor")
    private Double valor;

    @Column(name = "Total")
    private Double total;


    @OneToMany(cascade = CascadeType.ALL)

    private List<ItemSacola> itens;
    public void adicionarItem(ItemSacola itemSacola) {
    }
}
