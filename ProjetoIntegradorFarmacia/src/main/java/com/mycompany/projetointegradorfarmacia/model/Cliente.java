package com.mycompany.projetointegradorfarmacia.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lenovo
 */
public class Cliente {

    private static int qtdClientesCadastrados;

    private int id;
    private String CPF;
    private String telCliente;
    private String dataNascimento;
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

    public Cliente(String pCPF, String pTelCliente, String pDataNascimento,
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

    public Cliente(int pId, String pCPF, String pTelCliente, String pDataNascimento,
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

    //abaixo todos os getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCPF() {
        return CPF;
    }

    public String getCPFSomenteNumeros() {
        return CPF.replace(".", "").replace("-", "");
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelCliente() {
        return telCliente;
    }

    public String getTelSomenteNumeros() {
        return telCliente.replace("(", "").replace(")", "").replace("-", "");
    }

    public void setTelCliente(String telCliente) {
        this.telCliente = telCliente;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }
    
    //TALVEZ NÃO PRECISE DEPOIS QUE UTILIZAR O ESTEQUEMA DE GRAVAR DATA DA AULA 10
    //VER AULA 10
    public String getDataSomenteNumeros(){
        return dataNascimento.replace("/", "").replace("/", "");
    
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCEPcliente() {
        return CEPcliente;
    }
    
    public String getCEPSomenteNumeros(){
        return CEPcliente.replace("-", "");
    
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
