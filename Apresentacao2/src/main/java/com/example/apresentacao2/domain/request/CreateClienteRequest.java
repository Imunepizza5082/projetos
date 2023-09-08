package com.example.apresentacao2.domain.request;


import com.example.apresentacao2.entity.Cliente;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateClienteRequest {

    @JsonProperty("nome")
    @NotNull
    private String nome;

    @JsonProperty("cpf")
    private Long cpf;

    @JsonProperty("bairro")
    private String bairro;

    @JsonProperty("cidade")
    private String cidade;

    @JsonProperty("rua")
    private String rua;


    public Cliente toEntiye(){
        return Cliente.builder()
                .nome(nome)
                .cpf(cpf)
                .cidade(cidade)
                .bairro(bairro)
                .rua(rua)
                .build();
    }

}