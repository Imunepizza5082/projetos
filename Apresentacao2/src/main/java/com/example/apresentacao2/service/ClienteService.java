package com.example.apresentacao2.service;


import com.example.apresentacao2.entity.Cliente;
import com.example.apresentacao2.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Slf4j
@RequiredArgsConstructor
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente save(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public void addCliente(Cliente cliente){
        clienteRepository.save(cliente);
    }
    @Transactional
    public Cliente update(Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }

    public Boolean entityExists(Cliente cliente) {
        return clienteRepository.existsByCpf(cliente.getCpf());
    }


    public List<Cliente> buscarTodosClientes(){
        return clienteRepository.findAll();
    }
}
