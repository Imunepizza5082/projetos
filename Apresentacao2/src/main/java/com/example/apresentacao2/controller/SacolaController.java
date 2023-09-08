package com.example.apresentacao2.controller;

import com.example.apresentacao2.service.SacolaService;
import org.springframework.beans.factory.annotation.Autowired;

public class SacolaController {

    private Long id;
    private String nome;
    private Integer qtd;
    private Double total;

    private SacolaService sacolaService;
}
