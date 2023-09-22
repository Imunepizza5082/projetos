package com.example.apresentacao2.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "CLIENTES")
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDT_CLIENTE")
    private Long id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "CPF")
    private Long cpf;

    @Column(name = "BAIRRO")
    private String bairro;

    @Column(name = "CIDADE")
    private String cidade;

    @Column(name = "RUA")
    private String rua;

    @Column(name = "N_CASA")
    private String numeroCs;

    @Column(name = "CELULAR")
    private String celular;

}