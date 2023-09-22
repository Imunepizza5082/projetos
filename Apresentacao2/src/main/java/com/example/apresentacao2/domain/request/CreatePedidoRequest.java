package com.example.apresentacao2.domain.request;

import com.example.apresentacao2.entity.Pedido;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Validated
public class CreatePedidoRequest {


    @JsonProperty("n_pedido")
    private Integer nPedido;

    @JsonProperty("qtd")
    private Double qtd;

    @JsonProperty("valor")
    private Double valor;

    @JsonProperty("total")
    private Double total;


    public Pedido toEntity(){
        return Pedido.builder()
                .nPedido(nPedido)
                .qtd(qtd)
                .valor(valor)
                .total(total)
        .build();
    }

}
