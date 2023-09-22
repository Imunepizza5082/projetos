package com.example.apresentacao2.controller;


import com.example.apresentacao2.domain.response.CreateItemResponse;
import com.example.apresentacao2.domain.request.CreateItemRequest;
import com.example.apresentacao2.entity.Item;
import com.example.apresentacao2.repository.ItemRepository;
import com.example.apresentacao2.service.ItemService;
import jakarta.validation.Valid;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/itens")
@Validated
public class ItemController {

    private  ItemRepository itemRepository;
    @Autowired
    private ItemService itemService;

    @GetMapping
    public List<Item> buscarTodosItens() {
        return itemService.buscarTodosItens();
    }

    @PostMapping()
    public CreateItemResponse addItem(
        @Valid
        @RequestBody CreateItemRequest createItemRequest
    ) {
        var item = createItemRequest.toEntity();
        var entity = itemService.save(item);
        return new CreateItemResponse(entity);
    }

    @PutMapping("/atualizar:/{id}")
    public ResponseEntity<Item> atualizarItem(@PathVariable Long id, @RequestBody Item novoItem){
        Optional<Item> itemOptional = itemRepository.findById(id);

        if (itemOptional.isPresent()){
            Item item = itemOptional.get();
            item.setNome(novoItem.getNome());
            item.setVenda(novoItem.getVenda());
            Item itemAtualizado = itemRepository.save(item);
            return ResponseEntity.ok(itemAtualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
