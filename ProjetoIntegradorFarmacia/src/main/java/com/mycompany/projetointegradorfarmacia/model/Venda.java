/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetointegradorfarmacia.model;

import com.mycompany.projetointegradorfarmacia.model.Cliente;
import java.awt.List;
import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author vinic
 */
public class Venda {

    private int id;
    private double valorFinal;
    private ArrayList<ItemVenda> itemVenda;
    private int cliente;
    private Date dtvenda;

    public Venda() {
        //construtor vazio
    }

    public Venda(int id, double valorFinal, ArrayList<ItemVenda> itemVenda, int cliente, Date dtvenda) {
        this.id = id;
        this.valorFinal = valorFinal;
        this.itemVenda = itemVenda;
        this.cliente = cliente;
        this.dtvenda = dtvenda;
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

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public Date getDtvenda() {
        return dtvenda;
    }

    public void setDtvenda(Date dtvenda) {
        this.dtvenda = dtvenda;
    }

    public ArrayList<ItemVenda> getItemVenda() {
        return itemVenda;
    }

    public void setItemVenda(ArrayList<ItemVenda> itemVenda) {
        this.itemVenda = itemVenda;
    }

}
