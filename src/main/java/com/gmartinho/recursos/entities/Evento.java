package com.gmartinho.recursos.entities;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "evento")
@PrimaryKeyJoinColumn (name = "id")
public class Evento extends Colecao {

    @DateTimeFormat (pattern = "yyyy-mm-dd")
    @Temporal (TemporalType.DATE)
    @Column (name = "data_inicio", nullable = false)
    private Date dataInicio;

    @DateTimeFormat (pattern = "yyyy-mm-dd")
    @Temporal (TemporalType.DATE)
    @Column (name = "data_fim", nullable = false)
    private Date dataFim;

    public Evento() {
    }

    public Evento(Date dataInicio, Date dataFim) {
        super();
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }
}
