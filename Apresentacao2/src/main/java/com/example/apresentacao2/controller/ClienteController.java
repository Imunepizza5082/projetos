package com.example.apresentacao2.controller;



import com.example.apresentacao2.domain.request.CreateClienteRequest;
import com.example.apresentacao2.domain.request.CreateItemRequest;
import com.example.apresentacao2.domain.response.CreateClienteResponse;
import com.example.apresentacao2.domain.response.CreateItemResponse;
import com.example.apresentacao2.entity.Cliente;
import com.example.apresentacao2.service.ClienteService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("clientes")
@Validated
@Slf4j
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    ClienteController(ClienteService clienteService){
        this.clienteService = clienteService;

}
    @GetMapping
    public List<Cliente> buscarTodosClientes(){
        return clienteService.buscarTodosClientes();
    }

    @PostMapping()
    public CreateClienteResponse addCliente(
            @Valid
            @RequestBody CreateClienteRequest createClienteRequest
    ) {
        var cliente = createClienteRequest.toEntiye();
        var entity = clienteService.save(cliente);
        return new CreateClienteResponse(entity);
    }
    @PostMapping("/clientes")
    public ResponseEntity<Cliente> addCliente(@Valid @RequestBody Cliente cliente){
        clienteService.addCliente(cliente);
        return ResponseEntity.ok(cliente);
    }
    @PutMapping("/cliente")
    public ResponseEntity<String> atualizarCliente(@PathVariable Long id,@Valid @RequestBody Cliente novoCliente){
        return ResponseEntity.ok("Cliente atualizado com sucesso");
    }

}
