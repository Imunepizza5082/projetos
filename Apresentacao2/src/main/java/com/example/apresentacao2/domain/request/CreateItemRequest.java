package com.example.apresentacao2.domain.request;


import com.example.apresentacao2.entity.Item;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.validation.annotation.Validated;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Validated
public class CreateItemRequest {

    @JsonProperty("nome")
    private String name;

    @JsonProperty("qtd")
    private Double qtd;

    @JsonProperty("min")
    private Integer min = 0;

    @JsonProperty("custo")
    private Double custo;

    @NotNull
    @JsonProperty("tipo")
    private String tipo;

    @JsonProperty("venda")
    private Double venda;


    public Item toEntity(){
        return Item.builder()
                .nome(name)
                .qtd(qtd)
                .min(min)
                .custo(custo)
                .tipo(tipo)
                .venda(custo * 2.2)
                .build();
    }

}
