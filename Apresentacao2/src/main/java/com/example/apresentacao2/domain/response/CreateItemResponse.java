package com.example.apresentacao2.domain.response;

import com.example.apresentacao2.entity.Item;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
@Getter
@Setter
public class CreateItemResponse {


    private Long id;
    private String nome;
    private Double qtd;
    @NotNull
    @Min(value = 0)
    private Integer minimo;
    private Double custo;
    private String tipo;
    private Double venda;

    public CreateItemResponse(Item item) {
        this.id = item.getId();
        this.nome = item.getNome();
        this.qtd = item.getQtd();
        this.minimo = item.getMin();
        this.custo = item.getCusto();
        this.tipo = item.getTipo();
        this.venda = item.getVenda();
    }
}


