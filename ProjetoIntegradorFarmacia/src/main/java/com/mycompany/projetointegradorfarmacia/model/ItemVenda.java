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
    
    private int id;
    private Produto produtos;
    private Venda venda;
    private int quantidade;

    public ItemVenda(){
    //vazio
    }
    
    
    public ItemVenda(int pID, Produto pProdutos, Venda pVenda, int pQuantidade){
        this.id = pID;
        this.produtos = pProdutos;
        this.quantidade = pQuantidade;
        this.venda = pVenda;
    }
    

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Produto getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto produtos) {
        this.produtos = produtos;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
}
