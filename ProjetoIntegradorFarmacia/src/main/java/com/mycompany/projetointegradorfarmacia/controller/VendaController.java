/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetointegradorfarmacia.controller;

import com.mycompany.projetointegradorfarmacia.DAO.ClienteDAO;
import com.mycompany.projetointegradorfarmacia.DAO.VendaDAO;
import com.mycompany.projetointegradorfarmacia.model.Cliente;
import com.mycompany.projetointegradorfarmacia.model.Venda;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author vinic
 */
public class VendaController {
    
    /**
     * Método responsável por passar informações a serem salvas
     * 
     * @param valorFinal Double
     * @return true - para sucesso | false - para falha
     */

    public static boolean salvar(Double valorFinal, int idCliente) {

        Venda objSalvar = new Venda();

        objSalvar.setValorFinal(valorFinal);
        objSalvar.setCliente(idCliente);

        return VendaDAO.salvar(objSalvar);
    }
    
        /**
     * Método responsável por passar informações a serem atualizadas
     * 
     * @param valorFinal Double
     * @param idCliente int
     * @return true - para sucesso | false - para falha
     */

    public static boolean atualizar(int ID, Double valorFinal, int idCliente) {

        Venda objAtualizar = new Venda();

        objAtualizar.setId(ID);
        objAtualizar.setValorFinal(valorFinal);
        objAtualizar.setCliente(idCliente);

        return VendaDAO.atualizar(objAtualizar);
    }

    /**
     * Método responsável por passar informações a serem excluídas do banco de dados
     * @param ID inteiro
     * @return true - para sucesso | false - para falha
     */
    public static boolean excluir(int ID) {
        return VendaDAO.excluir(ID);
    }

    /**
     * Método responsável por passar informações a serem listadas na tabela view
     * @return ArrayList String[]
     */
    public static ArrayList<String[]> listarV() {
        ArrayList<Venda> listaVendas = VendaDAO.listarProdutos();
        ArrayList<String[]> retorno = new ArrayList<>();

        for (Venda item : listaVendas) {
            Venda temp = new Venda();
            retorno.add(new String[]{String.valueOf(item.getId()), item.getValorFinal(), item.getCliente()});

        }
        return retorno;
    }

}
