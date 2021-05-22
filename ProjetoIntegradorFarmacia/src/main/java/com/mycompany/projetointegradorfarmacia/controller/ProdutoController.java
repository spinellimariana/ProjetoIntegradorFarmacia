/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetointegradorfarmacia.controller;

import com.mycompany.projetointegradorfarmacia.DAO.ProdutoDAO;
import com.mycompany.projetointegradorfarmacia.model.Produto;
import java.util.ArrayList;

/**
 *
 * @author Computador
 */
public class ProdutoController {

    public static boolean Cadastrar(double pVenda, int QuantProd, String DescProduto, String Fabricante,
            String NomeProduto) {

        Produto objCadastrar = new Produto();

//        objCadastrar.setCodProd(CodProd);
        objCadastrar.setpVenda(pVenda);
        objCadastrar.setQuantProd(QuantProd);
        objCadastrar.setDescProduto(DescProduto);
        objCadastrar.setFabricante(Fabricante);
        objCadastrar.setNomeProduto(NomeProduto);

        return ProdutoDAO.salvar(objCadastrar);

    }

    public static boolean Alterar(int CodProd, double pVenda, int QuantProd, String DescProduto,
            String Fabricante, String NomeProduto) {

        Produto objAlterar = new Produto();

        objAlterar.setCodProd(CodProd);
        objAlterar.setpVenda(pVenda);
        objAlterar.setQuantProd(QuantProd);
        objAlterar.setDescProduto(DescProduto);
        objAlterar.setFabricante(Fabricante);
        objAlterar.setNomeProduto(NomeProduto);

        return ProdutoDAO.atualizar(objAlterar);
    }

    public static boolean Excluir(int CodProd) {
        return ProdutoDAO.excluir(CodProd);
    }

    public static ArrayList<String[]> listarProdutos() {
        ArrayList<Produto> listar = ProdutoDAO.listarProdutos();
        ArrayList<String[]> retorno = new ArrayList<>();

        for (Produto item : listar) {
            retorno.add(new String[]{String.valueOf(item.getCodProd()), item.getNomeProduto(), item.getDescProduto(),
                item.getFabricante(), String.valueOf(item.getQuantProd()), String.valueOf(item.getpVenda())});

        }

        return retorno;
    }

    public static ArrayList<String[]> filtroProduto(int ID) {
        ArrayList<Produto> filtro = ProdutoDAO.filtroPorId(ID);
        ArrayList<String[]> listaFiltro = new ArrayList<>();

        for (Produto item : filtro) {
            listaFiltro.add(new String[]{String.valueOf(item.getCodProd()), item.getNomeProduto(), item.getDescProduto(),
                item.getFabricante(), String.valueOf(item.getQuantProd()), String.valueOf(item.getpVenda())});

        }

        return listaFiltro;

    }

    public static ArrayList<String[]> filtroNome(String nome) {
        ArrayList<Produto> filtro = ProdutoDAO.filtroNome(nome);
        ArrayList<String[]> listaFiltro = new ArrayList<>();

        for (Produto item : filtro) {
            listaFiltro.add(new String[]{String.valueOf(item.getCodProd()), item.getNomeProduto(), item.getDescProduto(),
                item.getFabricante(), String.valueOf(item.getQuantProd()), String.valueOf(item.getpVenda())});

        }
        
        return listaFiltro;
    }
}
