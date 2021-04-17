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

    private String dataAnalitico;
    private int Codvenda;
    private String Produto;
    private int Codproduto;
    private int qtdProduto;
    private float valorUnitario;
    private float subTotal;

    public RelatorioAnalitico() {
        //criando construtor da classe
    }

    //abaixo todos os getters e setters
    public String getDataAnalitico() {
        return dataAnalitico;
    }

    public void setDataAnalitico(String dataAnalitico) {
        this.dataAnalitico = dataAnalitico;
    }

    public int getCodvenda() {
        return Codvenda;
    }

    public void setCodvenda(int Codvenda) {
        this.Codvenda = Codvenda;
    }

    public String getProduto() {
        return Produto;
    }

    public void setProduto(String Produto) {
        this.Produto = Produto;
    }

    public int getCodproduto() {
        return Codproduto;
    }

    public void setCodproduto(int Codproduto) {
        this.Codproduto = Codproduto;
    }

    public int getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
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
