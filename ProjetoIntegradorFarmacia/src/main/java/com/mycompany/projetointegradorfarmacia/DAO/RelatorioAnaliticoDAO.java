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
    
//    public static ArrayList<RelatorioAnalitico> filtroDatas(Date inicialDate, Date finalDate) {
//        Connection conexao = null;
//        PreparedStatement instrucaoSQL = null;
//        ResultSet rs = null;
//
//        ArrayList<String[]> filtro = new ArrayList<>();
//
//        try {
//
//            conexao = GerenciadorConexao.abrirConexao();
//            instrucaoSQL = conexao.prepareStatement("select produto.nomeProduto, itemvenda.quantidade, produto.pVenda, produto.pVenda * itemvenda.quantidade\n" +
//                                                     "from itemvenda \n" +
//                                                     "inner join produto \n" +
//                                                     "on itemvenda.idProduto = produto.id\n" +
//                                                     "where itemvenda.idVenda = ?;");
//            instrucaoSQL.setInt(1, id);
//            rs = instrucaoSQL.executeQuery();
//
//            while (rs.next()) {
//                String[] c = [];
//                c.setId(rs.getInt("id"));
//                c.setCPF(rs.getString("CPF"));
//                c.setNomeCliente(rs.getString("nome"));
//                c.setGeneroCliente(rs.getString("genero"));
//                c.setEstadoCivilCliente(rs.getString("estadoCivil"));
//                c.setTelCliente(rs.getString("telCliente"));
//                c.setDataNascimento(rs.getDate("dtNascimento"));
//                //c.setDataNascimento(rs.getString("dtNascimento"));
//                c.setEmailCliente(rs.getString("email"));
//                c.setEnderecoCliente(rs.getString("endereco"));
//                c.setBairroCliente(rs.getString("bairro"));
//                c.setCidadeCliente(rs.getString("cidade"));
//                c.setEstadoCliente(rs.getString("estado"));
//                c.setCEPcliente(rs.getString("CEP"));
//
//                filtro.add(c);
//
//            }
//
//        } catch (SQLException | ClassNotFoundException ex) {
//            System.out.println(ex.getMessage());
//            filtro = null;
//        } finally {
//
//            try {
//
//                if (rs != null) {
//                    rs.close();
//                }
//                if (instrucaoSQL != null) {
//                    instrucaoSQL.close();
//                }
//
//                GerenciadorConexao.fecharConexao();
//
//            } catch (SQLException ex) {
//
//            }
//        }
//
//        return filtro;
//    }
}
