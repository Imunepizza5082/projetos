package com.example.apresentacao2.domain.response;

import com.example.apresentacao2.domain.response.CreateItemResponse;
import com.google.gson.Gson;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class VendasResponse {

    private List<CreateItemResponse> listaItens;


    public VendasResponse(List<CreateItemResponse> listaItens) {
        this.listaItens = listaItens;
    }

    public List<CreateItemResponse> emFalta() {
            return  listaItens.stream().filter(iten -> iten.getQtd() <= iten.getMinimo()).collect(Collectors.toList());
    }


    public double valorCompra(){
        return emFalta().stream().map(iten -> iten.getCusto() * iten.getQtd()).reduce(0d,(a , b)-> a + b);
        }

    public double valorVenda(){
        return listaItens.stream().map(itens -> itens.getCusto() * 2).reduce(0d, (a , b) -> a + b);
    }

     public double valorEstoque(){
        return listaItens.stream().map(itens -> itens.getVenda() * itens.getQtd()).reduce(0d, (a , b) -> a + b);
     }

     public double valorLucroEstoque(){
        return listaItens.stream().map(itens -> (itens.getVenda() - itens.getCusto()) * itens.getQtd()).reduce(0d, (a , b) -> a + b);
     }



    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }



}



