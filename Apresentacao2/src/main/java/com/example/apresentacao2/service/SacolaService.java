package com.example.apresentacao2.service;

import com.example.apresentacao2.entity.Item;
import com.example.apresentacao2.entity.Sacola;
import com.example.apresentacao2.repository.SacolaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SacolaService {

    @Autowired
    private SacolaRepository sacolaRepository;

        public Sacola saveSacola(Sacola sacola){
        var sacolaExist = sacolaRepository.existsById(sacola.getId());
        if (sacolaExist){
            throw new RuntimeException("A sacola já esta aberta");
        }
            return sacolaRepository.save(sacola);
    }

    public List<Sacola> buscarItensSacola() {
        return sacolaRepository.findAll();
    }


    public void removerItem(Long itemId){
        sacolaRepository.deleteById(itemId);
    }


}


