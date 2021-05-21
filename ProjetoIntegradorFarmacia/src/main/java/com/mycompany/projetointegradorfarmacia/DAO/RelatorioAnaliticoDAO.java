/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetointegradorfarmacia.DAO;

import com.mycompany.projetointegradorfarmacia.model.Cliente;
import com.mycompany.projetointegradorfarmacia.model.RelatorioAnalitico;
import com.mycompany.projetointegradorfarmacia.utils.GerenciadorConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author vinic
 */
public class RelatorioAnaliticoDAO {
    
    public static ArrayList<RelatorioAnalitico> filtroIdVenda(int id) {
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
        ResultSet rs = null;

        ArrayList<RelatorioAnalitico> filtro = new ArrayList<>();

        try {

            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("select produto.nomeProduto, itemvenda.quantidade, produto.pVenda\n" +
                                                    "from itemvenda \n" +
                                                    "inner join produto \n" +
                                                    "on itemvenda.idProduto = produto.id\n" +
                                                    "where itemvenda.idVenda = ?;");
            instrucaoSQL.setInt(1, id);
            rs = instrucaoSQL.executeQuery();

            while (rs.next()) {
                RelatorioAnalitico c = new RelatorioAnalitico();
                c.setNomeProduto(rs.getString("nomeProduto"));
                c.setQtdProduto(rs.getInt("quantidade"));
                c.setPrecoUnitario(rs.getDouble("pVenda"));

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
