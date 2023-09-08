package com.example.apresentacao2.service;


import com.example.apresentacao2.entity.Item;
import com.example.apresentacao2.repository.ItemRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
@Slf4j
@RequiredArgsConstructor
public class ItemService {

    @Autowired
    private ItemRepository repository;

    public Item save(Item item){
        var itemExists = repository.existsByNomeEqualsIgnoreCase(item.getNome());
        if (itemExists){
            throw new RuntimeException("o item ja esta cadastrado");
        }
        return repository.save(item);
    }

    public List<Item> buscarTodosItens() {
        return repository.findAll();
    }
}