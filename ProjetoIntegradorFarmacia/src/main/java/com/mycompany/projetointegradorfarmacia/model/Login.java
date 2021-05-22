/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetointegradorfarmacia.model;

/**
 * Classe model para controle de acesso ao sistema.
 * Define atributos, construtores e getters/setters
 * @author mariana.spinelli
 * @since 2021.05.12
 * @version 1.0
 * 
 */
public class Login {

    private static int qtdUsuariosCadastrados;
    private int id;
    private String usuario;
    private String senha;

    public Login() {
        qtdUsuariosCadastrados++;
        this.id = qtdUsuariosCadastrados;
    }

    public Login(int pID, String pUsuario, String pSenha) {
        qtdUsuariosCadastrados++;
        this.id = pID;
        this.usuario = pUsuario;
        this.senha = pSenha;

    }

    public Login(String pUsuario, String pSenha) {
        qtdUsuariosCadastrados++;
        this.id = qtdUsuariosCadastrados;
        this.usuario = pUsuario;
        this.senha = pSenha;

    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    

}
