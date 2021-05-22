/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetointegradorfarmacia.DAO;

import com.mycompany.projetointegradorfarmacia.model.Analitico;
import com.mycompany.projetointegradorfarmacia.utils.GerenciadorConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Classe responsável por promover a conexão do relatório analítico com o banco de dados
 * @author vinicius.reis
 * @see RelatórioAnalíticoView
 */
public class AnaliticoDAO {
    
    /**
     * Método para selecionar uma venda específica no banco de dados e mostrar seus detalhes na tela de
     * relatório
     * @param id inteiro
     * @return  ArrayList da classe Relatório Analítico
     */
    public static ArrayList<Analitico> filtroIdVenda(int id) {
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
        ResultSet rs = null;

        ArrayList<Analitico> filtro = new ArrayList<>();

        try {

            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("select produto.nomeProduto, itemvenda.quantidade, produto.valorVenda\n" +
                                                    "from itemvenda \n" +
                                                    "inner join produto \n" +
                                                    "on itemvenda.idProduto = produto.id\n" +
                                                    "where itemvenda.idVenda = ?;");
            instrucaoSQL.setInt(1, id);
            rs = instrucaoSQL.executeQuery();

            while (rs.next()) {
                Analitico c = new Analitico();
                c.setNomeProduto(rs.getString("nomeProduto"));
                c.setQtdProduto(rs.getInt("quantidade"));
                c.setPrecoUnitario(rs.getDouble("valorVenda"));

                filtro.add(c);

            }

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            filtro = null;
        } finally {

            try {

                if (rs != null) {
                    rs.close();
                }
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }

                GerenciadorConexao.fecharConexao();

            } catch (SQLException ex) {

            }
        }

        return filtro;
    }
}
