package com.example.apresentacao2.controller;

import com.example.apresentacao2.entity.ItemSacola;
import com.example.apresentacao2.entity.Pedido;
import com.example.apresentacao2.repository.PedidoRepository;
import com.example.apresentacao2.service.PedidoService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
@Data
public class PedidoController {

    @Autowired
    private PedidoRepository repository;
    @Autowired
    private PedidoService pedidoService;
    @Autowired
    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @GetMapping
    public List<Pedido> getAll(){
        List<Pedido> pedidoList = repository.findAll();
        return pedidoList;
    }



    @PostMapping("/{pedidoId}/adicionar-item")
    public ResponseEntity<Pedido> adicionarItemAoPedido(
            @PathVariable Long pedidoId,
            @RequestBody ItemSacola itemSacola) {

        Pedido pedido = pedidoService.buscarPedidoPorId(pedidoId).getBody();

        if (pedido == null) {
            return ResponseEntity.notFound().build();
        }
        pedido.adicionarItem(itemSacola);
        pedidoService.save(pedido);

        return null;
    }

        @PostMapping()
        public Pedido criarPedido (@RequestBody Pedido pedido) {
            pedido.setNPedido(1);
            pedido.setProduto("L");
            pedido.setQtd(12.0);
            pedido.setValor(1.2);
            pedido.setTotal(14.4);

            return null;
        }
}
