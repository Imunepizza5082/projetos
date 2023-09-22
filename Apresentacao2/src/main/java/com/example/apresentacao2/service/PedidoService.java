package com.example.apresentacao2.service;

import com.example.apresentacao2.entity.Pedido;
import com.example.apresentacao2.repository.PedidoRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;




    public Pedido save(Pedido pedido){
        var pedidoExist = pedidoRepository.existsByPedido(pedido.getNPedido());
        if (pedidoExist){
            throw new RuntimeException("O pedido ja foi feito");
        }
        return pedidoRepository.save(pedido);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pedido> buscarPedidoPorId(@PathVariable Long id){
        Optional<Pedido> pedido = pedidoRepository.findById(id);

        if (pedido.isPresent()){
            return ResponseEntity.ok(pedido.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public List<Pedido> buscarMeusPedidos(){
        return pedidoRepository.findAll();
    }
}
