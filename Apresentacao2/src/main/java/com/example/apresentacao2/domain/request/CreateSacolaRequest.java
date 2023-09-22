package com.example.apresentacao2.domain.request;

import com.example.apresentacao2.entity.Sacola;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Validated
public class CreateSacolaRequest {

    @JsonProperty("item")
    private String item;
    @JsonProperty("Qtd")
    private Integer qtd;
    @JsonProperty("valor")
    private Double valor;
    @JsonProperty("total")
    private Double total;

    public Sacola toEntity(){
        return Sacola.builder()
                .nome(item)
                .qtd(qtd)
                .valor(valor)
                .total(total)
                .build();
    }

}
