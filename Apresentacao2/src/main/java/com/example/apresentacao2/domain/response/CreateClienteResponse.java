package com.example.apresentacao2.domain.response;


import com.example.apresentacao2.entity.Cliente;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class CreateClienteResponse {

    private Long id;
    private String nome;
    private Long cpf;
    private String rua;
    private String bairro;
    private String cidade;

    public CreateClienteResponse(Cliente cliente){
        this.id = cliente.getId();
        this.nome = cliente.getNome();
        this.cpf = cliente.getCpf();
        this.rua = cliente.getRua();
        this.bairro = cliente.getBairro();
        this.cidade = cliente.getCidade();

    }

}
