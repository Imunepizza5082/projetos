package com.example.apresentacao2.controller;
import com.example.apresentacao2.entity.Venda;
import com.example.apresentacao2.service.VendaService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vendas")
@Getter
@Setter
public class VendaController {

    @Autowired
    private VendaService vendaService;

   private long id;
   private String nome;
   private Integer qtd;
   private Double custo;
   private String tipo;
   private Double venda;

   @PostMapping("/processar")
   public ResponseEntity<String> processarVenda(@RequestBody Venda venda){
       vendaService.processarVenda(venda);
       return ResponseEntity.ok("Venda feita");
   }
    public Double getLucro(){
        return vendaService.getLucro();
    }

}

