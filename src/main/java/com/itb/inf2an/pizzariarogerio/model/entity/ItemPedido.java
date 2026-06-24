package com.itb.inf2an.pizzariarogerio.model.entity;

import java.math.BigDecimal;

public class ItemPedido {

    private Long id;
    private int quantidadeItem;
    private BigDecimal valorUnitario;

    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public int getQuantidadeItem() {
        return quantidadeItem;
    }
    public void setQuantidadeItem(int quantidadeItem) {
        this.quantidadeItem = quantidadeItem;
    }
    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }
    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }


    

}
