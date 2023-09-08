package com.example.apresentacao2.controller;
import com.example.apresentacao2.service.VendasService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Getter
@Setter
public class VendasController {

   private long id;
   private String nome;
   private Integer qtd;
   private Double custo;
   private String tipo;
   private Double venda;

    @Autowired
    private VendasService vendasService;


    public Double getLucro(){
        return vendasService.getLucro();
    }


}
