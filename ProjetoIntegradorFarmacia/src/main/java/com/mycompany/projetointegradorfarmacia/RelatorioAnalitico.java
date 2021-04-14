/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetointegradorfarmacia;

/**
 *
 * @author Lenovo
 */
public class RelatorioAnalitico {
    
    private int IDproduto;
    private int qtdAnalitico;
    private String dataAnalitico;
    private String item;
    private float valorUnitario;
    private float subTotal;
    
    public RelatorioAnalitico(){
    //criando construtor da classe
    }
    
    //abaixo todos os getters e setters

    public int getIDproduto() {
        return IDproduto;
    }

    public void setIDproduto(int IDproduto) {
        this.IDproduto = IDproduto;
    }

    public int getQtdAnalitico() {
        return qtdAnalitico;
    }

    public void setQtdAnalitico(int qtdAnalitico) {
        this.qtdAnalitico = qtdAnalitico;
    }

    public String getDataAnalitico() {
        return dataAnalitico;
    }

    public void setDataAnalitico(String dataAnalitico) {
        this.dataAnalitico = dataAnalitico;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(float subTotal) {
        this.subTotal = subTotal;
    }
    
    
    
    
}
