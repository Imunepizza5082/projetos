package com.example.apresentacao2.service;

import com.example.apresentacao2.entity.Item;
import com.example.apresentacao2.entity.Venda;
import com.example.apresentacao2.repository.ItemRepository;
import com.example.apresentacao2.repository.SacolaRepository;
import com.example.apresentacao2.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendaService {

    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private VendaRepository vendasRepository;
    @Autowired
    private SacolaRepository sacolaRepository;

    public void processarVenda(Venda venda){
        Item item  = itemRepository.findByNome(venda.getNome());
        if (item != null && item.getQtd() >= venda.getQtdVenda()){
            item.setQtd(item.getQtd() - venda.getQtdVenda());
            itemRepository.save(item);
            vendasRepository.save(venda);
        }   else {
                throw new RuntimeException("Quantidade indisponivel no estoque");
        }
    }
    public Double getLucro(){
        return 10d;
    }

}
