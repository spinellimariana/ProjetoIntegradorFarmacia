package com.mycompany.projetointegradorfarmacia.model;

import java.util.Date;

/**
 * Classe model para definição de atributos, construtores e getters/setters dos
 * clientes
 *
 * @author mariana.spinelli
 * @version 1.0
 * @since 2021.05.12
 *
 *
 */
public class Cliente {

    private static int qtdClientesCadastrados;

    private int id;
    private String CPF;
    private String telCliente;
    private Date dataNascimento;
    private String CEPcliente;
    private String nomeCliente;
    private String generoCliente;
    private String estadoCivilCliente;
    private String emailCliente;
    private String enderecoCliente;
    private String bairroCliente;
    private String estadoCliente;
    private String cidadeCliente;

    public Cliente() { //construtor
        qtdClientesCadastrados++;
        this.id = qtdClientesCadastrados;
    }

    public Cliente(String pCPF, String pTelCliente, Date pDataNascimento,
            String pCEPcliente, String pNomeCliente, String pGeneroCliente, String pEstadoCivilCliente,
            String pEmailCliente, String pEnderecoCliente, String pBairroCliente, String pEstadoCliente,
            String pCidadeCliente) {

        qtdClientesCadastrados++;
        this.id = qtdClientesCadastrados;
        this.CPF = pCPF;
        this.telCliente = pTelCliente;
        this.dataNascimento = pDataNascimento;
        this.CEPcliente = pCEPcliente;
        this.nomeCliente = pNomeCliente;
        this.generoCliente = pGeneroCliente;
        this.estadoCivilCliente = pEstadoCivilCliente;
        this.emailCliente = pEmailCliente;
        this.enderecoCliente = pEnderecoCliente;
        this.bairroCliente = pBairroCliente;
        this.estadoCliente = pEstadoCliente;
        this.cidadeCliente = pCidadeCliente;

    }

    public Cliente(int pId, String pCPF, String pTelCliente, Date pDataNascimento,
            String pCEPcliente, String pNomeCliente, String pGeneroCliente, String pEstadoCivilCliente,
            String pEmailCliente, String pEnderecoCliente, String pBairroCliente, String pEstadoCliente,
            String pCidadeCliente) {
        this.id = pId;
        this.CPF = pCPF;
        this.telCliente = pTelCliente;
        this.dataNascimento = pDataNascimento;
        this.CEPcliente = pCEPcliente;
        this.nomeCliente = pNomeCliente;
        this.generoCliente = pGeneroCliente;
        this.estadoCivilCliente = pEstadoCivilCliente;
        this.emailCliente = pEmailCliente;
        this.enderecoCliente = pEnderecoCliente;
        this.bairroCliente = pBairroCliente;
        this.estadoCliente = pEstadoCliente;
        this.cidadeCliente = pCidadeCliente;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelCliente() {
        return telCliente;
    }

    public void setTelCliente(String telCliente) {
        this.telCliente = telCliente;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCEPcliente() {
        return CEPcliente;
    }

    public void setCEPcliente(String CEPcliente) {
        this.CEPcliente = CEPcliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getGeneroCliente() {
        return generoCliente;
    }

    public void setGeneroCliente(String generoCliente) {
        this.generoCliente = generoCliente;
    }

    public String getEstadoCivilCliente() {
        return estadoCivilCliente;
    }

    public void setEstadoCivilCliente(String estadoCivilCliente) {
        this.estadoCivilCliente = estadoCivilCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public String getBairroCliente() {
        return bairroCliente;
    }

    public void setBairroCliente(String bairroCliente) {
        this.bairroCliente = bairroCliente;
    }

    public String getEstadoCliente() {
        return estadoCliente;
    }

    public void setEstadoCliente(String estadoCliente) {
        this.estadoCliente = estadoCliente;
    }

    public String getCidadeCliente() {
        return cidadeCliente;
    }

    public void setCidadeCliente(String cidadeCliente) {
        this.cidadeCliente = cidadeCliente;
    }

}
