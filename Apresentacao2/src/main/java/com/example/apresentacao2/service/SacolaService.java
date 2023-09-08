package com.example.apresentacao2.service;

import com.example.apresentacao2.entity.Item;
import com.example.apresentacao2.entity.Sacola;
import com.example.apresentacao2.repository.SacolaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SacolaService {

    @Autowired
    private SacolaRepository sacolaRepository;

    public Sacola saveItem(Sacola sacola){
        var sacolaExist = sacolaRepository.existsBySacola(sacola.getId());
        if (sacolaExist){
            throw new RuntimeException("A sacola ja esta aberta");
        }
        return sacolaRepository.save(sacola);
    }

    public List<Sacola> buscarSacola() {
        return sacolaRepository.findAll();
    }

    public Sacola adicionar(Sacola adicionar){
        return sacolaRepository.save(adicionar);
    }
}

