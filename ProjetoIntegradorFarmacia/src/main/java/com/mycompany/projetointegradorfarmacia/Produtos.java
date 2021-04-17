/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetointegradorfarmacia;

/**
 *
 * @author Computador
 */
public class Produtos {
    
    private int codProd;
    private double pVenda;
    private double quantProd;
    private String descProduto;

    public Produtos() {
    }

    public Produtos(int codProd, double pVenda, double quantProd, String descProduto) {
        this.codProd = codProd;
        this.pVenda = pVenda;
        this.quantProd = quantProd;
        this.descProduto = descProduto;
    }

    public int getCodProd() {
        return codProd;
    }

    public void setCodProd(int codProd) {
        this.codProd = codProd;
    }

    public double getpVenda() {
        return pVenda;
    }

    public void setpVenda(double pVenda) {
        this.pVenda = pVenda;
    }

    public double getQuantProd() {
        return quantProd;
    }

    public void setQuantProd(double quantProd) {
        this.quantProd = quantProd;
    }

    public String getDescProduto() {
        return descProduto;
    }

    public void setDescProduto(String descProduto) {
        this.descProduto = descProduto;
    }


    
}

