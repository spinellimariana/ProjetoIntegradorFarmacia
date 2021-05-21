/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetointegradorfarmacia.model;

/**
 *
 * @author Lenovo
 */
public class RelatorioAnalitico {
    
    private String nomeProduto;
    private int qtdProduto;
    private double precoUnitario;    

    public RelatorioAnalitico() {
        //criando construtor da classe
    }

    public RelatorioAnalitico(String nomeProduto, int qtdProduto, double precoUnitario) {
        this.nomeProduto = nomeProduto;
        this.qtdProduto = qtdProduto;
        this.precoUnitario = precoUnitario;
    }


    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
    
}
