package com.example.apresentacao2.domain.response;

import com.example.apresentacao2.entity.Pedido;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CreatePedidoResponse {

    private Integer nPedido;

    private String produto;

    private Double qtd;

    private Double valor;

    private Double total;


    public CreatePedidoResponse(Pedido pedido){
        this.nPedido = pedido.getNPedido();
        this.produto = pedido.getProduto();
        this.qtd = pedido.getQtd();
        this.valor = pedido.getValor();
        this.total = pedido.getTotal();
    }



}
