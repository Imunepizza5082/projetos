package com.example.apresentacao2.repository;

import com.example.apresentacao2.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

    Boolean existsByPedido(Integer nPedido);
}
