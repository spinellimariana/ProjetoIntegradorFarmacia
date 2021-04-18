/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetointegradorfarmacia;

import java.awt.List;

/**
 *
 * @author vinic
 */
public class Venda {
    
    private int id;
    private double valorFinal;
    private List item;
    private Cliente cliente;
    private int idProduto;
    
    
    public Venda(){
    //construtor vazio
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public List getItem() {
        return item;
    }

    public void setItem(List item) {
        this.item = item;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getIdProduto() {
        return idProduto;
    }

    //possibilidade de tabela explosão para as vendas.
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }
    
}
