/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetointegradorfarmacia.utils;

/**
 * Classe responsável pela validação da entrada de dados digitados pelo usuário
 * na interface view.
 *
 * @author mariana.spinelli
 * @version 1.0
 * @since 2021.05.12
 *
 */
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Validadora {

    public ArrayList<String> mensagensErro = new ArrayList<>();

    /**
     * Método responsável pela validação de entrada CPF
     *
     * @param ftx JFormattedTextField
     * @return boolean - true se o campo estiver vazio | false se estiver
     * preenchido
     * @throws IllegalArgumentException se o campo não estiver preenchido
     */
    public void ValidarCPF(JFormattedTextField ftx) {

        try {

            if (ftx.getText().replace(".", "").replace("-", "").trim().equals("")) {
                throw new IllegalArgumentException();
            } else {
                ftx.setBackground(Color.WHITE);
            }

        } catch (IllegalArgumentException e) {
            this.mensagensErro.add("Digite um valor para o campo " + ftx.getName());
            ftx.setBackground(Color.red);
        } catch (Exception e) {
            this.mensagensErro.add("Ocorreu um erro inesperado no campo: " + ftx.getName());
            ftx.setText("");
        }

    }

    public void ValidarData(JFormattedTextField ftx) {

        try {

            if (ftx.getText().replace("/", "").replace("/", "").trim().equals("")) {
                throw new IllegalArgumentException();
            } else {
                ftx.setBackground(Color.WHITE);
            }

        } catch (IllegalArgumentException e) {
            this.mensagensErro.add("Digite um valor para o campo " + ftx.getName());
            ftx.setBackground(Color.red);
        } catch (Exception e) {
            this.mensagensErro.add("Ocorreu um erro inesperado no campo: " + ftx.getName());
            ftx.setText("");
        }
    }

    /**
     * Método para validar a entrada do código postal no padrão brasileiro
     *
     * @param ftx JFormattedTextField
     * @return boolean - true se o campo estiver vazio | false se estiver
     * preenchido
     * @throws IllegalArgumentException se o campo não estive preenchido
     */
    public void ValidarCEP(JFormattedTextField ftx) {

        try {

            if (ftx.getText().replace("-", "").trim().equals("")) {
                throw new IllegalArgumentException();
            } else {
                ftx.setBackground(Color.WHITE);
            }

        } catch (IllegalArgumentException e) {
            this.mensagensErro.add("Digite um valor para o campo " + ftx.getName());
            ftx.setBackground(Color.red);
        } catch (Exception e) {
            this.mensagensErro.add("Ocorreu um erro inesperado no campo: " + ftx.getName());
            ftx.setText("");
        }

    }

    /**
     * Método para validar a entrada de DDD + telefone
     *
     * @param ftx JFormattedTextField
     * @return boolean - true se o campo estiver vazio | false se estiver
     * preenchido
     * @throws IllegalArgumentException se o campo não estive preenchido
     */
    public void ValidarTelefone(JFormattedTextField ftx) {

        try {

            if (ftx.getText().replace("(", "").replace(")", "").replace("-", "").trim().equals("")) {
                throw new IllegalArgumentException();
            } else {
                ftx.setBackground(Color.WHITE);
            }

        } catch (IllegalArgumentException e) {
            this.mensagensErro.add("Digite um valor para o campo " + ftx.getName());
            ftx.setBackground(Color.red);
        } catch (Exception e) {
            this.mensagensErro.add("Ocorreu um erro inesperado no campo: " + ftx.getName());
            ftx.setText("");
        }
    }

    /**
     * Método para verificar se o ComboBox está selecionado
     *
     * @param cbo JComboBox
     * @return boolean - true: se o campo não tiver nenhuma opção selecionada
     * (==0), retornando uma mensagem de erro solicitando o preenchimento |
     * false se estiver selecionada uma opção (>0)
     *
     */
    public void ValidarComboBox(JComboBox cbo) {
        if (cbo.getSelectedIndex() == 0) {
            this.mensagensErro.add("Selecione uma opção no campo " + cbo.getName());
            cbo.setBackground(Color.RED);
        } else {
            cbo.setBackground(Color.WHITE);
        }
    }

    /**
     * Método para validar a entrada de números. Recebe um txt e tenta converter
     * para <b>inteiro<\b>
     *
     * @param txt JTextField
     * @throws NumberFormatException - se não conseguir converter o valor
     * digitado em inteiros IllegalArgumentException - caso o campo esteja vazio
     * sem nenhum dado digitado
     */
    public void ValidarNumero(JTextField txt) {
        try {
            if (txt.getText().trim().equals("")) {
                throw new IllegalArgumentException();
            }
            int valorConvertido = Integer.parseInt(txt.getText());
            txt.setBackground(Color.WHITE);

        } catch (NumberFormatException e) {
            this.mensagensErro.add("Digite apenas números no campo: " + txt.getName());
            txt.setText("");
            txt.setBackground(Color.red);
        } catch (IllegalArgumentException e) {
            this.mensagensErro.add("Digite um valor para o campo: " + txt.getName());
            txt.setText("");
            txt.setBackground(Color.red);
        }

    }

    /**
     * Método para validar a entrada de dados em formato texto
     *
     * @param txt JTextField
     * @throws IllegalArgumentException - caso o campo esteja vazio sem nenhum
     * dado digitado
     */
    public void ValidarTexto(JTextField txt) {
        try {
            if (txt.getText().trim().equals("")) {
                throw new IllegalArgumentException();
            } else {
                txt.setBackground(Color.WHITE);
            }
        } catch (IllegalArgumentException ex) {
            this.mensagensErro.add("Digite um valor para o campo: " + txt.getName());
            txt.setText("");
            txt.setBackground(Color.red);

        } catch (Exception e) {
            this.mensagensErro.add("Ocorreu um erro inesperado no campo: " + txt.getName());
            txt.setText("");
        }

    }


    /**
     * Método para validar a entrada de tipos float Tenta converter a String
     * digitada no campo txt em float
     *
     * @param txt JTextField
     * @throws NumberFormatException - caso não consiga converter o valor
     * digitado em tipo float IllegalArgumentException - caso o campo esteja
     * vazio sem nenhum dado digitado
     */
    public void ValidarFloat(JTextField txt) {
        try {
            if (txt.getText().trim().equals("")) {
                throw new IllegalArgumentException();
            }
            float valorConvertido = Float.parseFloat(txt.getText());
            txt.setBackground(Color.WHITE);
        } catch (NumberFormatException e) {
            this.mensagensErro.add("Falha ao converter o valor do campo " + txt.getName() + " em float");
            txt.setText("");
            txt.setBackground(Color.red);
        } catch (IllegalArgumentException e) {
            this.mensagensErro.add("Digite um valor para o campo " + txt.getName());
            txt.setText("");
            txt.setBackground(Color.red);
        }

    }

    public void limparMensagens() {
        this.mensagensErro.clear();
    }

    /**
     * Método para exibição de mensagens de erro na entrada de dados
     */
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

    /**
     * Método para armazenar as mensagens de erro
     *
     * @return String informando para o usuário quais campos estão incorretos
     */
    public String getMensagensErro() {
        String errosFormulario = "";
        for (String msg : this.mensagensErro) {
            errosFormulario += msg + "\n";
        }
        if (!errosFormulario.equals("")) {
            this.limparMensagens();
        }
        return errosFormulario;

    }

    /**
     * Método para verificar se existe erro no preenchimento dos campos
     *
     * @return true - para existência de erros | false - para ausência de erros
     */
    public boolean hasErro() {
        if (this.mensagensErro.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

}
