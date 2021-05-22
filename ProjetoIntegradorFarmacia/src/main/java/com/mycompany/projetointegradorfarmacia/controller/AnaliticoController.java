/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetointegradorfarmacia.controller;

import com.mycompany.projetointegradorfarmacia.DAO.AnaliticoDAO;
import com.mycompany.projetointegradorfarmacia.model.Analitico;
import java.text.ParseException;
import java.util.ArrayList;
/**
 *
 * @author vinic
 */
public class AnaliticoController {
    public static ArrayList<String[]> filtroById(int id) throws ParseException {
         
        ArrayList<Analitico> filtro = AnaliticoDAO.filtroIdVenda(id);
        ArrayList<String[]> listaFiltro = new ArrayList<>();

        for (Analitico item : filtro) {
            listaFiltro.add(new String[]{item.getNomeProduto(), String.valueOf(item.getQtdProduto()), String.valueOf(item.getPrecoUnitario()), String.valueOf(item.getQtdProduto() * item.getPrecoUnitario())});

        }

        return listaFiltro;
    }
}
