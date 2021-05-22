/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetointegradorfarmacia.DAO;

import com.mycompany.projetointegradorfarmacia.model.ItemVenda;
import com.mycompany.projetointegradorfarmacia.model.Produto;
import com.mycompany.projetointegradorfarmacia.model.Venda;
import com.mycompany.projetointegradorfarmacia.utils.GerenciadorConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *  Classe responsável pela conexão da parte de vendas do sistema com o banco de dados
 * @author vinicius.reis
 * @see ProdutoDAO
 * @see ClienteDAO
 * @see ClienteController, ProdutoController
 * 
 */
public class VendaDAO {

    /**
     * Método responsável por promover o cadastro de todas as vendas efetuadas no banco de dados
     * @param v obj da Classe Venda
     * @return boolean true para sucesso | false para falha
     */
    public static boolean salvar(Venda v) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
            conexao = GerenciadorConexao.abrirConexao();

            instrucaoSQL = conexao.prepareStatement("INSERT INTO venda (valorFinal, idCliente, dtVenda) VALUES (?, ?, ?)", Statement.RETURN_GENERATED_KEYS);

            //parametros para gravar
            instrucaoSQL.setDouble(1, v.getValorFinal());
            instrucaoSQL.setInt(2, v.getCliente());
            instrucaoSQL.setDate(3, new java.sql.Date(v.getDtvenda().getTime()));

            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;

                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys(); //para recuperar o id do cliente
                if (generatedKeys.next()) {
                    v.setId(generatedKeys.getInt(1));

                    for (ItemVenda item : v.getItemVenda()) {
                        instrucaoSQL = conexao.prepareStatement("INSERT INTO ItemVenda (quantidade, idVenda, idProduto) VALUES (?, ?, ?)", Statement.RETURN_GENERATED_KEYS);

                        //parametros para gravar
                        instrucaoSQL.setInt(1, item.getQuantidade());
                        instrucaoSQL.setInt(2, v.getId());
                        instrucaoSQL.setInt(3, item.getProdutos());

                        linhasAfetadas = instrucaoSQL.executeUpdate();
                    }

                } else {
                    throw new SQLException("Falha ao obter ID do cliente!");
                }
            } else {
                retorno = false;
            }

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            retorno = false;
        } finally {
            //liberar recursos da memória
            try {
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }

                GerenciadorConexao.fecharConexao();
            } catch (SQLException ex) {
            }
        }
        return retorno;
    }

    /**
     * Método atualizar para alteração de informações no banco de dados
     *
     * @param p obj Venda
     * @return true - para sucesso | false - para falha
     */
    public static boolean atualizar(Venda p) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {

            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("UPDATE venda SET valorFinal=?, idCliente=?, dtVenda=?");

            instrucaoSQL.setDouble(1, p.getValorFinal());
            instrucaoSQL.setInt(2, p.getCliente());
            instrucaoSQL.setDate(3, new java.sql.Date(p.getDtvenda().getTime()));

            int linhasAfetadas = instrucaoSQL.executeUpdate();
            if (linhasAfetadas > 0) {
                retorno = true;
            } else {
                retorno = false;
            }

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            retorno = false;
        } finally {

            try {

                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }

                GerenciadorConexao.fecharConexao();

            } catch (SQLException ex) {
            }
        }
        return retorno;
    }

    /**
     * Método para excluir informações da base de dados
     *
     * @param pID inteiro
     * @return true - para sucesso | false - falha
     *
     */
    public static boolean excluir(int pID) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("DELETE FROM venda WHERE id = ?");
            instrucaoSQL.setInt(1, pID);

            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;
            } else {
                retorno = false;
            }

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            retorno = false;
        } finally {

            try {
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }

                GerenciadorConexao.fecharConexao();
            } catch (SQLException ex) {
            }
        }

        return retorno;
    }

    /**
     * Método para listar toda a base de dados de uma só vez
     *
     * @return ArrayList da classe Produto
     *
     */
    public static ArrayList<Venda> listarProdutos() {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        ArrayList<Venda> listar = new ArrayList<Venda>();

        try {
            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM venda;");
            rs = instrucaoSQL.executeQuery(); //executar a query

            //percorrer o result set
            while (rs.next()) {
                Venda c = new Venda();
                c.setId(rs.getInt("id"));
                c.setValorFinal(rs.getDouble("pVenda"));
                c.setCliente(rs.getInt("idCLiente"));
                c.setDtvenda(rs.getDate("dtvenda"));

                listar.add(c);

            }

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            listar = null;
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
        return listar;
    }

}
