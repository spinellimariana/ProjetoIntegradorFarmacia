/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetointegradorfarmacia.model;

import com.mycompany.projetointegradorfarmacia.model.Cliente;
import java.awt.List;
import java.util.Date;


/**
 *
 * @author vinic
 */
public class Venda {

    private int id;
    private double valorFinal;
    private List item;
    private int cliente;
    private Date dtvenda;

    public Venda() {
        //construtor vazio
    }

    public Venda(int id, double valorFinal, List item, int cliente, Date dtvenda) {
        this.id = id;
        this.valorFinal = valorFinal;
        this.item = item;
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

    public List getItem() {
        return item;
    }

    public void setItem(List item) {
        this.item = item;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int idCliente) {
        this.cliente = cliente;
    }

    public Date getDtvenda() {
        return dtvenda;
    }

    public void setDtvenda(Date dtvenda) {
        this.dtvenda = dtvenda;
    }

}
