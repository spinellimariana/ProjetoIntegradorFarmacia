/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetointegradorfarmacia.controller;

import com.mycompany.projetointegradorfarmacia.model.Cliente;
import com.mycompany.projetointegradorfarmacia.DAO.ClienteDAO;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class ClienteController {

    public static boolean salvar(String CPF, String nome, String genero, String estadoCivil, String telefone,
            String dtNascimento, String email, String endereco, String bairro, String cidade, String estado, String CEP) {

        Cliente objSalvar = new Cliente();

        objSalvar.setCPF(CPF);
        objSalvar.setNomeCliente(nome);
        objSalvar.setGeneroCliente(genero);
        objSalvar.setEstadoCivilCliente(estadoCivil);
        objSalvar.setTelCliente(telefone);
        objSalvar.setDataNascimento(dtNascimento);  //usar jCalendar
        objSalvar.setEmailCliente(email);
        objSalvar.setEnderecoCliente(endereco);
        objSalvar.setBairroCliente(bairro);
        objSalvar.setCidadeCliente(cidade);
        objSalvar.setEstadoCliente(estado);
        objSalvar.setCEPcliente(CEP);

        return ClienteDAO.salvar(objSalvar);
    }

    public static ArrayList<String[]> listarC() {
        ArrayList<Cliente> listaClientes = ClienteDAO.listarClientes();
        ArrayList<String[]> retorno = new ArrayList<>();

        for (Cliente item : listaClientes) {
            retorno.add(new String[]{String.valueOf(item.getId()), item.getNomeCliente(), item.getGeneroCliente(),
                item.getEstadoCivilCliente(), item.getTelCliente(), item.getDataNascimento(), item.getEmailCliente(),
                item.getEnderecoCliente(), item.getBairroCliente(), item.getCidadeCliente(), item.getEstadoCliente(),
                item.getCEPcliente()});

        }
        return retorno;
    }
}
