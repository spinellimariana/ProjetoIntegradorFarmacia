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

    public void ValidarComboBox(JComboBox cbo) {
        if (cbo.getSelectedIndex() == 0) {
            //não está trocando a cor de fundo
            this.mensagensErro.add("Selecione uma opção no campo " + cbo.getName());
            cbo.setBackground(Color.RED);
        }else{
            cbo.setBackground(Color.WHITE);
        }
    }

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
