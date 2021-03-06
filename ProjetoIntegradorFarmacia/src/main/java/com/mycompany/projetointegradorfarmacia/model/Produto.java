/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetointegradorfarmacia.model;

/**
 *
 * @author Computador
 */
public class Produto {

    private static int qtdProdutos;

    private int codProd;
    private double pVenda;
    private int quantProd;
    private String descProduto;
    private String fabricante;
    private String nomeProduto;

    public Produto() {
        qtdProdutos++;
        this.codProd = qtdProdutos;
    }

    public Produto(double pPVenda, int pQuantProd, String pDescProduto,
            String pFabricante, String pNomeProduto) {

        qtdProdutos++;
        this.codProd = qtdProdutos;
        this.pVenda = pPVenda;
        this.quantProd = pQuantProd;
        this.descProduto = pDescProduto;
        this.fabricante = pFabricante;
        this.nomeProduto = pNomeProduto;
    }

    public Produto(int pCodProd, double pPVenda, int pQuantProd, String pDescProduto,
            String pFabricante, String pNomeProduto) {
        this.codProd = pCodProd;
        this.pVenda = pPVenda;
        this.quantProd = pQuantProd;
        this.descProduto = pDescProduto;
        this.fabricante = pFabricante;
        this.nomeProduto = pNomeProduto;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
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

    public int getQuantProd() {
        return quantProd;
    }

    public void setQuantProd(int quantProd) {
        this.quantProd = quantProd;
    }

    public String getDescProduto() {
        return descProduto;
    }

    public void setDescProduto(String descProduto) {
        this.descProduto = descProduto;
    }

}
