/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetointegradorfarmacia.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe para gerenciar a conexão com o banco de dados.
 * @author mariana.spinelli
 * @see pacote DAO
 * @version 1.0
 * @since 2021-11-02
 * 
 */
public class GerenciadorConexao {

    public static String STATUS = "Não conectado";
    public static String DRIVER = "com.mysql.cj.jdbc.Driver";  //A partir da versao 8.0, mudou para com.mysql.cj.jdbc.Driver (Connector/J)                   

    public static String SERVER = "localhost";
    public static String DATABASE = "farmacia";              //nome do seu banco de dados

    public static String LOGIN = "root";                     //nome de um usuário de seu BD      
    public static String SENHA = "VIni@612216";                         //sua senha de acesso

    public static String URL = "";

    public static Connection CONEXAO;

    /**
     * 
     * @param URL String
     * @param root String
     * @param string String
     * @return UnsupportedOperationException
     */
    public static Connection abrirConexao(String URL, String root, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public GerenciadorConexao() {
    }

    /**
     * Método para abrir conexão com o banco de dados
     * @return STATUS infornando se foi possível realizar a conexão
     * @throws ClassNotFoundException se o driver não for encontrado
     * @throws SQLException se houver falha na conexão
     */
    public static Connection abrirConexao() throws ClassNotFoundException, SQLException {

        URL = "jdbc:mysql://" + SERVER + ":3306/" + DATABASE + "?useTimezone=true&serverTimezone=UTC&useSSL=false";

        if (CONEXAO == null) {
            try {

                //Carrega a classe responsável pelo driver
                Class.forName(DRIVER);
                CONEXAO = DriverManager.getConnection(URL, LOGIN, SENHA);

                if (CONEXAO != null) {
                    STATUS = "Conexão realizada com sucesso!";
                } else {
                    STATUS = "Não foi possivel realizar a conexão";
                }

            } catch (ClassNotFoundException e) {  //Driver não encontrado

                throw new ClassNotFoundException("O driver expecificado não foi encontrado.");

            } catch (SQLException e) {  //Erro ao estabelecer a conexão (Ex: login ou senha errados)

                //Outra falha de conexão
                throw new SQLException("Erro ao estabelecer a conexão (Ex: login ou senha errados).");
            }

        } else {
            try {
                //Se a conexão estiver fechada, reabro a conexão
                if (CONEXAO.isClosed()) {
                    CONEXAO = DriverManager.getConnection(URL, LOGIN, SENHA);
                }
            } catch (SQLException ex) {
                throw new SQLException("Falha ao fechar a conexão.");
            }
        }
        return CONEXAO;
    }

    public static String getStatusConexao() {
        return STATUS;
    }
    
    /**
     * Método para fechar a conexão com o banco de dados
     * @return true se não conectado | false se houver erro no fechamento
     * @throws SQLException se houver erro no fechamento
     */

    public static boolean fecharConexao() throws SQLException {

        boolean retorno = false;

        try {
            if (CONEXAO != null) {
                if (!CONEXAO.isClosed()) {
                    CONEXAO.close();
                }
            }

            STATUS = "Não conectado";
            retorno = true;

        } catch (SQLException e) {
            retorno = false;
        }

        return retorno;
    }

}
