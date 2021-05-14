/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetointegradorfarmacia.DAO;

import com.mycompany.projetointegradorfarmacia.model.Login;
import com.mycompany.projetointegradorfarmacia.utils.GerenciadorConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * Classe responsável por promover a conexão ao banco de dados para consultar senhas e usuários
 * @author mariana.spinelli
 * @version 1.0
 * @since 2021.05.12
 * @see controller.LoginController
 * @see model.Login
 */

public class LoginDAO {
    
    /**
     * Método para consultar a existência de um usuário e sua senha no banco de dados
     * @param l objeto Login
     * @return true - para sucesso (o usuário/senha existe) | false - para falha (usuário não encontrado)
     */

    public static boolean usuarioExiste(Login l) {
        //usuario pifarmacia, senha admin

        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
        ResultSet rs = null;
        boolean retorno = false;

        try {
            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM Login WHERE usuario LIKE ? AND senha LIKE ?;");
            instrucaoSQL.setString(1, l.getUsuario());
            instrucaoSQL.setString(2, l.getSenha());

            rs = instrucaoSQL.executeQuery();

            while (rs.next()) {
                retorno = true;
            }

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            retorno = false;

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
        return retorno;

    }

}
