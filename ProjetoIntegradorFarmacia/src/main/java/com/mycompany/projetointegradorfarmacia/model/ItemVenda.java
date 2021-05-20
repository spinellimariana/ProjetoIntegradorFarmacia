/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetointegradorfarmacia.model;

/**
 *
 * @author vinic
 */
public class ItemVenda {
    
//    private int id;
    private int idProduto;
    private int idVenda;
    private int quantidade;

    public ItemVenda(){
    //vazio
    }
    
    
    public ItemVenda(int pID, int pProduto, int pVenda, int pQuantidade){
//        this.id = pID;
        this.idProduto = pProduto;
        this.quantidade = pQuantidade;
        this.idVenda = pVenda;
    }
    

    
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }

    public int getProdutos() {
        return idProduto;
    }

    public void setProdutos(int produtos) {
        this.idProduto = produtos;
    }

    public int getVenda() {
        return idVenda;
    }

    public void setVenda(int venda) {
        this.idVenda = venda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
}
