/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetointegradorfarmacia.DAO;

import com.mycompany.projetointegradorfarmacia.model.Cliente;
import com.mycompany.projetointegradorfarmacia.utils.GerenciadorConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Classe responsável por promover a conexão com o banco de dados. É possível
 * fazer inclusão, alteração, exclusão e manutenção de clientes.
 *
 * @author mariana.spinelli
 * @version 1.0
 * @since 2021.05.12
 * @see controller.ClienteController
 * @see model.Cliente
 */
public class ClienteDAO {

    /**
     * Método salvar para gravação de informações no banco de dados
     *
     * @param p obj Cliente
     * @return true - para sucesso | false - para falha
     *
     */
    public static boolean salvar(Cliente p) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
            conexao = GerenciadorConexao.abrirConexao();

            instrucaoSQL = conexao.prepareStatement("INSERT INTO cliente (CPF, nome, genero, estadoCivil, telCliente, "
                    + "dtNascimento, email, endereco, bairro, cidade, estado, CEP) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
                    + "?, ?)", Statement.RETURN_GENERATED_KEYS);

            //parametros para gravar
            instrucaoSQL.setString(1, p.getCPF());
            instrucaoSQL.setString(2, p.getNomeCliente());
            instrucaoSQL.setString(3, p.getGeneroCliente());
            instrucaoSQL.setString(4, p.getEstadoCivilCliente());
            instrucaoSQL.setString(5, p.getTelCliente());
            instrucaoSQL.setDate(6, new java.sql.Date(p.getDataNascimento().getTime()));

            instrucaoSQL.setString(7, p.getEmailCliente());
            instrucaoSQL.setString(8, p.getEnderecoCliente());
            instrucaoSQL.setString(9, p.getBairroCliente());
            instrucaoSQL.setString(10, p.getCidadeCliente());
            instrucaoSQL.setString(11, p.getEstadoCliente());
            instrucaoSQL.setString(12, p.getCEPcliente());

            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;

                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys(); //para recuperar o id do cliente
                if (generatedKeys.next()) {
                    p.setId(generatedKeys.getInt(1));
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
    public static boolean atualizar(Cliente p) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {

            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("UPDATE cliente SET CPF=?, nome=?, genero=?, estadoCivil=?, "
                    + "telCliente=?, dtNascimento=?, email=?, endereco=?, bairro=?, cidade=?, estado=?, CEP=?"
                    + "WHERE id=?");

            instrucaoSQL.setString(1, p.getCPF());
            instrucaoSQL.setString(2, p.getNomeCliente());
            instrucaoSQL.setString(3, p.getGeneroCliente());
            instrucaoSQL.setString(4, p.getEstadoCivilCliente());
            instrucaoSQL.setString(5, p.getTelCliente());
            instrucaoSQL.setDate(6, new java.sql.Date(p.getDataNascimento().getTime()));
            //instrucaoSQL.setString(6, p.getDataNascimento()); 
            instrucaoSQL.setString(7, p.getEmailCliente());
            instrucaoSQL.setString(8, p.getEnderecoCliente());
            instrucaoSQL.setString(9, p.getBairroCliente());
            instrucaoSQL.setString(10, p.getCidadeCliente());
            instrucaoSQL.setString(11, p.getEstadoCliente());
            instrucaoSQL.setString(12, p.getCEPcliente());
            instrucaoSQL.setInt(13, p.getId());

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
            instrucaoSQL = conexao.prepareStatement("DELETE FROM cliente WHERE id = ?");
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
    public static ArrayList<Cliente> listarClientes() {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        ArrayList<Cliente> listar = new ArrayList<Cliente>();

        try {
            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM cliente;");
            rs = instrucaoSQL.executeQuery(); //executar a query

            //percorrer o result set
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setId(rs.getInt("id"));
                c.setCPF(rs.getString("CPF"));
                c.setNomeCliente(rs.getString("nome"));
                c.setGeneroCliente(rs.getString("genero"));
                c.setEstadoCivilCliente(rs.getString("estadoCivil"));
                c.setTelCliente(rs.getString("telCliente"));
                c.setDataNascimento(rs.getDate("dtNascimento"));
                //c.setDataNascimento(rs.getString("dtNascimento")); //refazer usando aula 10 jCalendar
                c.setEmailCliente(rs.getString("email"));
                c.setEnderecoCliente(rs.getString("endereco"));
                c.setBairroCliente(rs.getString("bairro"));
                c.setCidadeCliente(rs.getString("cidade"));
                c.setEstadoCliente(rs.getString("estado"));
                c.setCEPcliente(rs.getString("CEP"));

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
     * Método para realizar a filtragem de dados inseridos no banco de dados
     * levando como parâmetro o nome do cliente
     *
     * @param pNome String
     * @return ArrayLyst da Classe Cliente
     *
     */
    public static ArrayList<Cliente> filtroNome(String pNome) {
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
        ResultSet rs = null;

        ArrayList<Cliente> filtro = new ArrayList<Cliente>();

        try {

            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM cliente WHERE nome LIKE ?;");
            instrucaoSQL.setString(1, "%" + pNome + '%');
            rs = instrucaoSQL.executeQuery();

            while (rs.next()) {
                Cliente c = new Cliente();
                c.setId(rs.getInt("id"));
                c.setCPF(rs.getString("CPF"));
                c.setNomeCliente(rs.getString("nome"));
                c.setGeneroCliente(rs.getString("genero"));
                c.setEstadoCivilCliente(rs.getString("estadoCivil"));
                c.setTelCliente(rs.getString("telCliente"));
                c.setDataNascimento(rs.getDate("dtNascimento"));

                c.setEmailCliente(rs.getString("email"));
                c.setEnderecoCliente(rs.getString("endereco"));
                c.setBairroCliente(rs.getString("bairro"));
                c.setCidadeCliente(rs.getString("cidade"));
                c.setEstadoCliente(rs.getString("estado"));
                c.setCEPcliente(rs.getString("CEP"));

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
     * Método para realizar a filtragem de dados inseridos no banco de dados
     * levando como parâmetro o CPF do cliente
     *
     * @param pCPF String
     * @return ArrayList da Classe Cliente
     */
    public static ArrayList<Cliente> filtroCPF(String pCPF) {
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
        ResultSet rs = null;

        ArrayList<Cliente> filtro = new ArrayList<Cliente>();

        try {

            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM cliente WHERE CPF LIKE ?;");
            instrucaoSQL.setString(1, "%" + pCPF + '%');
            rs = instrucaoSQL.executeQuery();

            while (rs.next()) {
                Cliente c = new Cliente();
                c.setId(rs.getInt("id"));
                c.setCPF(rs.getString("CPF"));
                c.setNomeCliente(rs.getString("nome"));
                c.setGeneroCliente(rs.getString("genero"));
                c.setEstadoCivilCliente(rs.getString("estadoCivil"));
                c.setTelCliente(rs.getString("telCliente"));
                c.setDataNascimento(rs.getDate("dtNascimento"));
                //c.setDataNascimento(rs.getString("dtNascimento"));
                c.setEmailCliente(rs.getString("email"));
                c.setEnderecoCliente(rs.getString("endereco"));
                c.setBairroCliente(rs.getString("bairro"));
                c.setCidadeCliente(rs.getString("cidade"));
                c.setEstadoCliente(rs.getString("estado"));
                c.setCEPcliente(rs.getString("CEP"));

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
