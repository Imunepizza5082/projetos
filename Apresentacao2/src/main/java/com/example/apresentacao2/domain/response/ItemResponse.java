package com.example.apresentacao2.domain.response;

public class ItemResponse {

    private Long id;
    private String nome;
    private Integer qtd;
    private Integer minimo;
    private Double custo;
    private String tipo;
    private Double venda;


    public ItemResponse(CreateItemResponse item){
        this.id = item.getId();
        this.nome = item.getNome();
        this.qtd = item.getQtd();
        this.minimo = item.getMinimo();
        this.custo = item.getCusto();
        this.tipo = item.getTipo();
        this.venda = item.getVenda();
    }
}
