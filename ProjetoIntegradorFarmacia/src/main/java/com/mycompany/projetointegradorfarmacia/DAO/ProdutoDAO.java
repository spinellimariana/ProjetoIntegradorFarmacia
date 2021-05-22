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

            instrucaoSQL = conexao.prepareStatement("INSERT INTO produto (nomeProduto, descricao, "
                    + "fabricante, quantProduto, valorVenda) VALUES (?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);

            //parametros para gravar
            instrucaoSQL.setString(1, p.getNomeProduto());
            instrucaoSQL.setString(2, p.getDescProduto());
            instrucaoSQL.setString(3, p.getFabricante());
            instrucaoSQL.setInt(4, (int) p.getQuantProd());
            instrucaoSQL.setDouble(5, p.getpVenda());

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
     * @param p obj Produto
     * @return true - para sucesso | false - para falha
     */
    public static boolean atualizar(Produto p) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {

            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("UPDATE produto SET nomeProduto=?, descricao=?, fabricante=?,"
                    + " quantProduto=?, valorVenda=? WHERE id=?");

            instrucaoSQL.setString(1, p.getNomeProduto());
            instrucaoSQL.setString(2, p.getDescProduto());
            instrucaoSQL.setString(3, p.getFabricante());
            instrucaoSQL.setInt(4, (int) p.getQuantProd());
            instrucaoSQL.setDouble(5, p.getpVenda());
            instrucaoSQL.setInt(6, p.getCodProd());

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
     * @return ArrayList da classe produto
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
                c.setNomeProduto(rs.getString("nomeProduto"));
                c.setDescProduto(rs.getString("descricao"));
                c.setFabricante(rs.getString("fabricante"));
                c.setQuantProd(rs.getInt("quantProduto"));
                c.setpVenda(rs.getDouble("valorVenda"));

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

    /**
     * Método para selecionar um produto pelo seu identificador no banco de dados.
     * 
     * @param id inteiro
     * @return obj Produto
     */
    public static Produto listarPorId(int id) { //método usado para venda view
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
                produto.setNomeProduto(rs.getString("nomeProduto"));
                produto.setDescProduto(rs.getString("descricao"));
                produto.setFabricante(rs.getString("fabricante"));
                produto.setQuantProd(rs.getInt("quantProduto"));
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

    /**
     * Método para selecionar um produto pelo seu identificador no banco de dados
     * @param ID inteiro
     * @return  ArrayList da classe Produto
     */
    public static ArrayList<Produto> filtroPorId(int ID) { //filtro para produto view
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
                c.setNomeProduto(rs.getString("nomeProduto"));
                c.setDescProduto(rs.getString("descricao"));
                c.setFabricante(rs.getString("fabricante"));
                c.setQuantProd(rs.getInt("quantProduto"));
                c.setpVenda(rs.getDouble("valorVenda"));

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

    /**
     * Método para selecionar um produto pelo seu nome no banco de dados
     * @param pNome String
     * @return ArrayList da classe Produtos
     */
    public static ArrayList<Produto> filtroNome(String pNome) { //filtro por nome produto view
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
        ResultSet rs = null;

        ArrayList<Produto> filtro = new ArrayList<Produto>();

        try {

            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM produto WHERE nomeProduto LIKE ?;");
            instrucaoSQL.setString(1, "%" + pNome + '%');
            rs = instrucaoSQL.executeQuery();

            while (rs.next()) {
                Produto c = new Produto();
                c.setCodProd(rs.getInt("id"));
                c.setNomeProduto(rs.getString("nomeProduto"));
                c.setDescProduto(rs.getString("descricao"));
                c.setFabricante(rs.getString("fabricante"));
                c.setQuantProd(rs.getInt("quantProduto"));
                c.setpVenda(rs.getDouble("valorVenda"));

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

    /**
     * Método usado para selecionar o produto pelo seu nome exato como cadastrado no banco de dados
     * @param nome String
     * @return obj da classe Produto
     */
    public static Produto fNome(String nome) { //método usado para vendas view
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        Produto produto = new Produto();

        try {
            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM produto WHERE nomeProduto=?;");
            instrucaoSQL.setString(1, nome);
            rs = instrucaoSQL.executeQuery(); //executar a query

            if (rs.next()) {
                produto.setCodProd(rs.getInt("id"));
                produto.setNomeProduto(rs.getString("nomeProduto"));
                produto.setDescProduto(rs.getString("descricao"));
                produto.setFabricante(rs.getString("fabricante"));
                produto.setQuantProd(rs.getInt("quantProduto"));
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

}
