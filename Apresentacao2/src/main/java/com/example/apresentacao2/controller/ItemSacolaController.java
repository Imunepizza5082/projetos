package com.example.apresentacao2.controller;


import com.example.apresentacao2.entity.ItemSacola;
import com.example.apresentacao2.repository.ItemSacolaRepository;
import com.example.apresentacao2.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pedidos/{pedidoId}/itens")
public class ItemSacolaController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private ItemSacolaRepository itemSacolaRepository;

    @PostMapping
    public ResponseEntity<ItemSacola> adicionarItemAoPedido(@PathVariable Long pedidoId){
        return null;
    }

}
