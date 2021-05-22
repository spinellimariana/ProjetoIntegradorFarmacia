/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetointegradorfarmacia.controller;

import com.mycompany.projetointegradorfarmacia.DAO.VendaDAO;
import com.mycompany.projetointegradorfarmacia.model.ItemVenda;
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
    public static boolean salvar(Date dtVenda, Double valorFinal, int idCliente, ArrayList<String[]> itensVenda) {

        Venda objSalvar = new Venda();

        objSalvar.setValorFinal(valorFinal);
        objSalvar.setCliente(idCliente);
        objSalvar.setDtvenda(dtVenda);

        ArrayList<ItemVenda> listItem = new ArrayList<ItemVenda>();

        for (String[] item : itensVenda) {
            ItemVenda itemVenda = new ItemVenda();

            itemVenda.setProdutos(Integer.parseInt(item[0]));
            itemVenda.setQuantidade(Integer.parseInt(item[1]));

            listItem.add(itemVenda);
        }

        objSalvar.setItemVenda(listItem);

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
     * Método responsável por passar informações a serem excluídas do banco de
     * dados
     *
     * @param ID inteiro
     * @return true - para sucesso | false - para falha
     */
    public static boolean excluir(int ID) {
        return VendaDAO.excluir(ID);
    }

}
