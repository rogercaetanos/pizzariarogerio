package com.itb.inf2an.pizzariarogerio.model.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.itb.inf2an.pizzariarogerio.model.enums.StatusPedido;

public class Pedido {

    private Long id;
    private BigDecimal valorPedido;
    private LocalDateTime dataHoraPedido;
    private LocalDateTime dataHoraEntrega;
    private StatusPedido statusPedido;
    private boolean codStatus;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public BigDecimal getValorPedido() {
        return valorPedido;
    }
    public void setValorPedido(BigDecimal valorPedido) {
        this.valorPedido = valorPedido;
    }
    public LocalDateTime getDataHoraPedido() {
        return dataHoraPedido;
    }
    public void setDataHoraPedido(LocalDateTime dataHoraPedido) {
        this.dataHoraPedido = dataHoraPedido;
    }
    public LocalDateTime getDataHoraEntrega() {
        return dataHoraEntrega;
    }
    public void setDataHoraEntrega(LocalDateTime dataHoraEntrega) {
        this.dataHoraEntrega = dataHoraEntrega;
    }
    public StatusPedido getStatusPedido() {
        return statusPedido;
    }
    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }
    public boolean isCodStatus() {
        return codStatus;
    }
    public void setCodStatus(boolean codStatus) {
        this.codStatus = codStatus;
    }

    
}
