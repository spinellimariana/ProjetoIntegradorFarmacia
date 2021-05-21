/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetointegradorfarmacia.model;

import java.util.Date;

/**
 *
 * @author Matheus
 */
public class RelatorioSintetico{
    
    private int idVenda;
    private String nome;
    private Date dtCompra;
    private Double valorFinal;
    
    public RelatorioSintetico(){}

    public RelatorioSintetico(int idVenda, String nome, Date dtCompra, Double valorFinal) {
        this.idVenda = idVenda;
        this.nome = nome;
        this.dtCompra = dtCompra;
        this.valorFinal = valorFinal;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDtCompra() {
        return dtCompra;
    }

    public void setDtCompra(Date dtCompra) {
        this.dtCompra = dtCompra;
    }

    public Double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(Double valorFinal) {
        this.valorFinal = valorFinal;
    }

}