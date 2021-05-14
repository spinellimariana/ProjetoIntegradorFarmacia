/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetointegradorfarmacia.controller;

import com.mycompany.projetointegradorfarmacia.DAO.LoginDAO;
import com.mycompany.projetointegradorfarmacia.model.Login;

/**
 * Classe responsável por promover a transmissão de dados coletados pela classe view.LoginView para
 * a classe DAO.LoginDAO obedecendo o padrão de design MVC.
 * @author mariana.spinelli
 * @version 1.0
 * @since 2021.05.12
 * @see DAO.LoginDAO
 * @see model.Login
 * @see view.LoginView
 */
public class LoginController {
/**
 * Método responsável por passar as informações a serem comparadas com o banco de dados para efetuar
 * o controle de acesso ao sistema
 * @param usuario String
 * @param senha String
 * @return true - para sucesso | false - para falha
 */
    public static boolean logar(String usuario, String senha) {
        Login obj = new Login();
        obj.setUsuario(usuario);
        obj.setSenha(senha);
        return LoginDAO.usuarioExiste(obj);
    }

}
