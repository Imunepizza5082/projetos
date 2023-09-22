package com.example.apresentacao2.controller;

import com.example.apresentacao2.entity.Item;
import com.example.apresentacao2.entity.ItemSacola;
import com.example.apresentacao2.entity.Sacola;
import com.example.apresentacao2.repository.ItemRepository;
import com.example.apresentacao2.repository.SacolaRepository;
import com.example.apresentacao2.service.SacolaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sacola")
public class SacolaController {

    private List<Sacola> sacolas = new ArrayList<>();
    private List<Item> sacola = new ArrayList<>();

    private SacolaService sacolaService;
    @Autowired
    private SacolaRepository sacolaRepository;

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping("/itens")
    public List<Sacola> listarItens(){
        return sacolaService.buscarItensSacola();
        }

    @PostMapping("/criar")
    public ResponseEntity<Sacola> criarSacola(@RequestBody Sacola sacola){
        sacola.setId(gerarId());
        sacolas.add(sacola);

        return new ResponseEntity<>(sacola, HttpStatus.CREATED);
    }
    private Long gerarId(){
        return Long.valueOf(sacola.size() + 1);
    }
    @PostMapping("/adicionar")
    public ResponseEntity<String> adicionarItem(
            @PathVariable Long id,
            @RequestBody ItemSacola itemSacola) {
        sacola.add(itemSacola);
        return ResponseEntity.ok("Item adicionado a sacola");
    }

    @DeleteMapping("/deletar/{sacolaId}")
    public void fecharSacola(@PathVariable Long sacolaId) {
        Optional<Sacola> optionalSacola = sacolaRepository.findById(sacolaId);
        if (optionalSacola.isEmpty()) {
             throw new RuntimeException("sacola não existe");
        }
         sacolaRepository.deleteById(sacolaId);
    }
}