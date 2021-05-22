/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetointegradorfarmacia.DAO;

import com.mycompany.projetointegradorfarmacia.model.Produto;
import com.mycompany.projetointegradorfarmacia.utils.GerenciadorConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Computador
 */
public class ProdutoDAO {

    public static boolean salvar(Produto p) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
            conexao = GerenciadorConexao.abrirConexao();

            instrucaoSQL = conexao.prepareStatement("INSERT INTO produto (valorVenda, quantProduto, descricao, fabricante, nomeProduto) VALUES (?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);

            //parametros para gravar
            instrucaoSQL.setDouble(1, p.getpVenda());
            instrucaoSQL.setInt(2, (int) p.getQuantProd());
            instrucaoSQL.setString(3, p.getDescProduto());
            instrucaoSQL.setString(4, p.getFabricante());
            instrucaoSQL.setString(5, p.getNomeProduto());

            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;

                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys(); //para recuperar o id do cliente
                if (generatedKeys.next()) {
                    p.setCodProd(generatedKeys.getInt(1));
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
     * @param p obj Cliente
     * @return true - para sucesso | false - para falha
     */
    public static boolean atualizar(Produto p) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {

            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("UPDATE produto SET valorVenda=?, quantProduto=?, descricao=?, fabricante=?, nomeProduto=?");

            instrucaoSQL.setDouble(1, p.getpVenda());
            instrucaoSQL.setInt(2, (int) p.getQuantProd());
            instrucaoSQL.setString(3, p.getDescProduto());
            instrucaoSQL.setString(4, p.getFabricante());
            instrucaoSQL.setString(5, p.getNomeProduto());

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
            instrucaoSQL = conexao.prepareStatement("DELETE FROM produto WHERE id = ?");
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
     * @return ArrayList da classe cliente
     *
     */
    public static ArrayList<Produto> listarProdutos() {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        ArrayList<Produto> listar = new ArrayList<Produto>();

        try {
            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM produto;");
            rs = instrucaoSQL.executeQuery(); //executar a query

            //percorrer o result set
            while (rs.next()) {
                Produto c = new Produto();
                c.setCodProd(rs.getInt("id"));
                c.setpVenda(rs.getDouble("valorVenda"));
                c.setQuantProd(rs.getInt("quantProduto"));
                c.setDescProduto(rs.getString("descricao"));
                c.setFabricante(rs.getString("fabricante"));
                c.setNomeProduto(rs.getString("nomeProduto"));

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

    public static Produto listarPorId(int id) {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        Produto produto = new Produto();

        try {
            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM produto WHERE ID=?;");
            instrucaoSQL.setInt(1, id);
            rs = instrucaoSQL.executeQuery(); //executar a query

            if (rs.next()) {
                produto.setCodProd(rs.getInt("id"));
                produto.setDescProduto(rs.getString("descricao"));
                produto.setFabricante(rs.getString("fabricante"));
                produto.setNomeProduto(rs.getString("nomeProduto"));
                produto.setQuantProd(rs.getInt("QuantProduto"));
                produto.setpVenda(rs.getDouble("valorVenda"));

            }

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            produto = null;
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
        return produto;

    }

    public static ArrayList<Produto> listarProdutos(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static ArrayList<Produto> filtroPorId(int ID) {
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
        ResultSet rs = null;

        ArrayList<Produto> filtro = new ArrayList<Produto>();

        try {

            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM produto WHERE id LIKE ?;");
            instrucaoSQL.setString(1, "%" + ID + '%');
            rs = instrucaoSQL.executeQuery();

            while (rs.next()) {
                Produto c = new Produto();
                c.setCodProd(rs.getInt("id"));
                c.setDescProduto(rs.getString("Descricao"));
                c.setFabricante(rs.getString("fabricante"));
                c.setQuantProd(rs.getInt("quantProduto"));
                c.setpVenda(rs.getDouble("valorVenda"));
                c.setNomeProduto(rs.getString("nomeProduto"));

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
