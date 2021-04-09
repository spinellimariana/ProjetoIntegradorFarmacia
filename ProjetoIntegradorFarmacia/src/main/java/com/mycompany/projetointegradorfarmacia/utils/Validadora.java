/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetointegradorfarmacia.utils;

/**
 *
 * @author Lenovo
 */
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Validadora {

    public ArrayList<String> mensagensErro = new ArrayList<>();

    //não está funcionando a validação em formatted text field
    //perguntar para o professor segunda
    public void ValidarCPF(JFormattedTextField ftx) {

        /*try {

            //Verifico se o campo está vazio
            if (ftx.getText().trim().equals("..-")) {
                throw new IllegalArgumentException();
            }

            int valorConvertido = Integer.parseInt(ftx.getText());
            ftx.setBackground(Color.WHITE);

        } catch (NumberFormatException e) {
            this.mensagensErro.add("Falha ao converter o valor do campo " + ftx.getName() + " em inteiro");
            ftx.setBackground(Color.red);
        } catch (IllegalArgumentException e) {
            this.mensagensErro.add("Digite um valor para o campo " + ftx.getName());
            ftx.setBackground(Color.red);
        }*/
    }

    public void ValidarComboBox(JComboBox cbo) {
        if (cbo.getSelectedIndex() == 0) {
            cbo.setBackground(Color.RED); //não está trocando a cor de fundo
            this.mensagensErro.add("Selecione uma opção no campo " + cbo.getName());

        }
    }

    public void ValidarNumero(JTextField txt) {

        try {

            //Verifico se o campo está vazio
            if (txt.getText().trim().equals("")) {
                throw new IllegalArgumentException();
            }

            int valorConvertido = Integer.parseInt(txt.getText());
            txt.setBackground(Color.WHITE);

        } catch (NumberFormatException e) {

            this.mensagensErro.add("Digite apenas números no campo: " + txt.getName());
            txt.setBackground(Color.red);
        } catch (IllegalArgumentException e) {
            this.mensagensErro.add("Digite um valor para o campo: " + txt.getName());
            txt.setBackground(Color.red);
        }

    }

    public void ValidarTexto(JTextField txt) {

        try {
            if (txt.getText().trim().equals("")) {
                throw new IllegalArgumentException();
            } else {
                txt.setBackground(Color.WHITE);
            }
        } catch (IllegalArgumentException ex) {
            this.mensagensErro.add("Digite um valor para o campo: " + txt.getName());
            txt.setBackground(Color.red);

        } catch (Exception e) {

            this.mensagensErro.add("Ocorreu um erro inesperado no campo: " + txt.getName());

        }

    }

    public void ValidarFloat(JTextField txt) {

        try {

            //Verifico se o campo está vazio
            if (txt.getText().trim().equals("")) {
                throw new IllegalArgumentException();
            }

            float valorConvertido = Float.parseFloat(txt.getText());
            txt.setBackground(Color.WHITE);

        } catch (NumberFormatException e) {

            this.mensagensErro.add("Falha ao converter o valor do campo " + txt.getName() + " em float");
            txt.setBackground(Color.red);
        } catch (IllegalArgumentException e) {
            this.mensagensErro.add("Digite um valor para o campo " + txt.getName());
            txt.setBackground(Color.red);
        }

    }

    //COLOCAR RESTO DAS VALIDAÇÕES AQUI
    public void limparMensagens() {

        this.mensagensErro.clear();
    }

    public void ExibirMensagensErro() {

        String errosFormulario = "";
        for (String msg : this.mensagensErro) {
            errosFormulario += msg + "\n";
        }

        if (!errosFormulario.equals("")) {
            JOptionPane.showMessageDialog(null, errosFormulario);
            this.limparMensagens();
        }

    }

    public String getMensagensErro() {

        String errosFormulario = "";

        //Percorro o arrayList e concateno na variável errosFormulario
        for (String msg : this.mensagensErro) {
            errosFormulario += msg + "\n";
        }

        if (!errosFormulario.equals("")) {
            this.limparMensagens();
        }

        return errosFormulario;

    }

    public boolean hasErro() {

        if (this.mensagensErro.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

}
