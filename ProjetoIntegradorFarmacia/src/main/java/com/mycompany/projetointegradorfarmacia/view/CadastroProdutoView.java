package com.mycompany.projetointegradorfarmacia.view;

import com.mycompany.projetointegradorfarmacia.DAO.ProdutoDAO;
import static com.mycompany.projetointegradorfarmacia.DAO.ProdutoDAO.listarProdutos;
import com.mycompany.projetointegradorfarmacia.controller.ProdutoController;
import com.mycompany.projetointegradorfarmacia.model.Produto;
import com.mycompany.projetointegradorfarmacia.utils.Validadora;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Computador
 */
public class CadastroProdutoView extends javax.swing.JFrame {

    public String modoTela = "Criação";
    Produto objProduto;

    public CadastroProdutoView() {
        initComponents();

        objProduto = new Produto();

        setLocationRelativeTo(null);

        listarProdutos();

//        //Inserindo icone na janela
//        URL url = this.getClass().getResource("/farmacia.png");
//        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
//        this.setIconImage(imagemTitulo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        lblCodProduto = new javax.swing.JLabel();
        lblNomeProduto = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        lblQtdEstoque = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        txtCampoConsulta = new javax.swing.JTextField();
        btnAlterar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        txtCodProduto = new javax.swing.JTextField();
        txtQtdEstoque = new javax.swing.JTextField();
        lblDescProduto = new javax.swing.JLabel();
        txtDescProduto = new javax.swing.JTextField();
        lblFabricante = new javax.swing.JLabel();
        txtFabricante = new javax.swing.JTextField();
        lblConsulta = new javax.swing.JLabel();
        lblPreco = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();
        txtPreco = new javax.swing.JTextField();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Rede Farmácia - Cadastro Produto");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Produto ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        lblCodProduto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCodProduto.setText("Código*:");

        lblNomeProduto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNomeProduto.setText("Produto*:");

        txtNomeProduto.setToolTipText("Insira a descrição do produto");
        txtNomeProduto.setName("PRODUTO"); // NOI18N

        lblQtdEstoque.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblQtdEstoque.setText("Quantidade*:");

        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save-icon.png"))); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete-icon.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        txtCampoConsulta.setName("CONSULTA"); // NOI18N
        txtCampoConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCampoConsultaActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Zoom-icon.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        txtCodProduto.setName("CÓDIGO"); // NOI18N
        txtCodProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodProdutoActionPerformed(evt);
            }
        });
        txtCodProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodProdutoKeyTyped(evt);
            }
        });

        txtQtdEstoque.setName("QUANTIDADE"); // NOI18N

        lblDescProduto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblDescProduto.setText("Descrição*:");

        txtDescProduto.setName("DESCRIÇÃO"); // NOI18N

        lblFabricante.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblFabricante.setText("Fabricante:");

        txtFabricante.setName("FABRICANTE"); // NOI18N

        lblConsulta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblConsulta.setText("Consulta:");

        lblPreco.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblPreco.setText("Preço*:");

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clear.png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimparMouseClicked(evt);
            }
        });
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Produto", "Descrição", "Fabricante", "Qtd.", "Preço"
            }
        ));
        tblProduto.setName("TABELA PRODUTOS"); // NOI18N
        jScrollPane1.setViewportView(tblProduto);

        txtPreco.setName("PREÇO"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescProduto, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(lblNomeProduto))
                            .addComponent(lblConsulta, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCodProduto, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblQtdEstoque)
                                .addGap(18, 18, 18)
                                .addComponent(txtQtdEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblPreco)
                                .addGap(18, 18, 18)
                                .addComponent(txtPreco))
                            .addComponent(txtNomeProduto)
                            .addComponent(txtDescProduto)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCampoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblFabricante)
                        .addGap(18, 18, 18)
                        .addComponent(txtFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblCodProduto, lblNomeProduto});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterar, btnCadastrar, btnExcluir, btnLimpar, btnPesquisar});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConsulta)
                    .addComponent(txtCampoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodProduto)
                    .addComponent(txtCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQtdEstoque)
                    .addComponent(txtQtdEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPreco)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeProduto)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescProduto)
                    .addComponent(txtDescProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFabricante)
                    .addComponent(txtFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnExcluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnLimpar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblCodProduto, lblNomeProduto});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAlterar, btnCadastrar, btnExcluir, btnLimpar, btnPesquisar});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtCampoConsulta, txtCodProduto, txtDescProduto, txtFabricante, txtNomeProduto, txtPreco, txtQtdEstoque});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCampoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCampoConsultaActionPerformed

    }//GEN-LAST:event_txtCampoConsultaActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (tblProduto.getRowCount() > 0) {

            int numeroLinha = tblProduto.getSelectedRow();

            if (numeroLinha < 0) {

                JOptionPane.showMessageDialog(this, "Selecione um produto para excluir!");

            } else {

                int cod = Integer.parseInt(tblProduto.getModel().getValueAt(numeroLinha, 0).toString());
                objProduto.setCodProd(cod);
                int id = objProduto.getCodProd();
                boolean retorno = ProdutoController.Excluir(id);

                if (retorno == true) {
                    JOptionPane.showMessageDialog(this, "Produto excluído com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(this, "Falha ao excluir Produto!");
                }

                listarProdutos();

            }
            
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um produto da tabela!");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        //listarProdutos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimparMouseClicked

        txtCodProduto.setText("");
        txtNomeProduto.setText("");
        txtQtdEstoque.setText("");
        txtCodProduto.grabFocus();

        DefaultTableModel tbm = (DefaultTableModel) tblProduto.getModel();
        for (int i = tbm.getRowCount() - 1; i >= 0; i--) {
            tbm.removeRow(i);
        }
        listarProdutos();
    }//GEN-LAST:event_btnLimparMouseClicked

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        Validadora validar = new Validadora();
        validar.ValidarTexto(txtCampoConsulta);
        if (validar.hasErro()) {
            JOptionPane.showMessageDialog(this, validar.getMensagensErro());
        } else {

            int id = Integer.parseInt(txtCampoConsulta.getText());

            ArrayList<String[]> filtro = ProdutoController.filtroProduto(id);

            DefaultTableModel modelo = (DefaultTableModel) tblProduto.getModel();
            modelo.setRowCount(0);

            for (String[] item : filtro) {
                modelo.addRow(item);
            }

        }


    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        CadastroProdutoView telaCadastro = new CadastroProdutoView();
        telaCadastro.setVisible(true);

        Validadora validar = new Validadora();

        validar.ValidarNumero(txtQtdEstoque);
//      validar.ValidarNumero(txtCodProduto);
        validar.ValidarTexto(txtDescProduto);
        validar.ValidarTexto(txtNomeProduto);
        validar.ValidarTexto(txtPreco);

        if (validar.hasErro()) {
            JOptionPane.showMessageDialog(this, validar.getMensagensErro());
        } else {

            if (modoTela == "Criação") {

                //implementar verificação de obrigatoriedade
                String NomeProduto = txtNomeProduto.getText();
                int quantProd = Integer.parseInt(txtQtdEstoque.getText());
                double pVenda = Double.parseDouble(txtPreco.getText());
                String DescProduto = txtDescProduto.getText();
                String Fabricante = txtFabricante.getText();

                //Passo as informações para o objeto produto (propriedade deste JFrame)
//                objProduto.setNomeProduto(NomeProduto);
//                objProduto.setQuantProd(quantProd);
//                objProduto.setpVenda(pVenda);
//                objProduto.setDescProduto(DescProduto);
//                objProduto.setFabricante(Fabricante);
                //Mando salvar no banco de dados usando a classe DAO
                boolean retorno = ProdutoController.Cadastrar(pVenda, quantProd, DescProduto, Fabricante, NomeProduto);

                if (retorno == true) {
                    JOptionPane.showMessageDialog(null, "Produto CADASTRADO com sucesso!",
                            "Cadastro realizado", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Falha no cadastro do Produto!",
                            "Falha", JOptionPane.ERROR_MESSAGE);
                }

            } else { //Modo de alteração

                int id = objProduto.getCodProd();

                //TODO: implementar verificação de obrigatoriedade
                String NomeProduto = txtNomeProduto.getText();
                int quantProd = Integer.parseInt(txtQtdEstoque.getText());
                double pVenda = Double.parseDouble(txtPreco.getText());
                String DescProduto = txtDescProduto.getText();
                String Fabricante = txtFabricante.getText();

                //Passo as informações para o objeto produto (propriedade deste JFrame)
                objProduto.setNomeProduto(NomeProduto);
//                objProduto.setCodProd(CodProd);
                objProduto.setQuantProd(quantProd);
                objProduto.setpVenda(pVenda);
                objProduto.setDescProduto(DescProduto);
                objProduto.setFabricante(Fabricante);

                //Mando salvar no banco de dados usando a classe DAO
                boolean retorno = ProdutoController.Alterar(id, pVenda, quantProd, DescProduto, Fabricante, NomeProduto);

                if (retorno == true) {

                    JOptionPane.showMessageDialog(this, "Produto cadastrado com sucesso!", "Produto Cadastrado", JOptionPane.INFORMATION_MESSAGE);
                    modoTela = "Criação";

                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao cadastrar na base de dados\n",
                            "Erro", JOptionPane.ERROR_MESSAGE);
                }

            }

    }//GEN-LAST:event_btnCadastrarActionPerformed
        listarProdutos();
    }

    private void txtCodProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodProdutoKeyTyped

    }//GEN-LAST:event_txtCodProdutoKeyTyped

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        if (tblProduto.getRowCount() > 0) {

            //Resgato o número da linha pelo JTable
            int numeroLinha = tblProduto.getSelectedRow();

            if (numeroLinha < 0) {
                JOptionPane.showMessageDialog(this, "Selecione um Produto da tabela!");

            } else {

                int idProduto = Integer.parseInt(tblProduto.getModel().getValueAt(numeroLinha, 0).toString());

                
                int CodProd = Integer.parseInt(tblProduto.getModel().getValueAt(numeroLinha, 0).toString());
                String pVenda = (tblProduto.getModel().getValueAt(numeroLinha, 1).toString());
                String quantProd = (tblProduto.getModel().getValueAt(numeroLinha, 2).toString());
                String DescProduto = tblProduto.getModel().getValueAt(numeroLinha, 3).toString();
                String Fabricante = tblProduto.getModel().getValueAt(numeroLinha, 4).toString();
                String NomeProduto = tblProduto.getModel().getValueAt(numeroLinha, 5).toString();

                objProduto.setCodProd(CodProd);
//                objProduto.setpVenda(pVenda);
//                objProduto.setQuantProd(quantProd);
                objProduto.setDescProduto(DescProduto);
                objProduto.setFabricante(Fabricante);
                objProduto.setNomeProduto(NomeProduto);

                objProduto.setCodProd(idProduto);

                //Passo o objeto para a tela de Cadastro informando que é alteração
                CadastroProdutoView telaCadastro = new CadastroProdutoView();
                telaCadastro.modoTela = "Alteração";

                //Exibir o JFrame
                telaCadastro.setVisible(true);

            }
    }//GEN-LAST:event_btnAlterarActionPerformed
    }

    private void txtCodProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodProdutoActionPerformed

//    public void CarregarJTable() {
//
//        int[] codProd = new int[5];
//        double[] pVenda = new double[5];
//        int[] QuantProd = new int[5];
//        String[] DescProduto = new String[5];
//        String[] Fabricante = new String[5];
//        String[] NomeProduto = new String[5];
//
//        ArrayList<Produto> listaProdutos = ProdutoDAO.listarProdutos("");
//
//        DefaultTableModel tmProdutos = new DefaultTableModel();
//        tmProdutos.addColumn("CodProd");
//        tmProdutos.addColumn("pVenda");
//        tmProdutos.addColumn("QuantProd");
//        tmProdutos.addColumn("DescProduto");
//        tmProdutos.addColumn("Fabricante");
//        tmProdutos.addColumn("NomeProduto");
//
//        //Defina sua estrutura com a estrutura tmClientes;
//        tblProduto.setModel(tmProdutos);
//
//        //Limpo a tabela, excluindo todas as linhas para depois mostrar os dados novamente
//        tmProdutos.setRowCount(0);
////        Iterable<Produto> listar = null;        
//
//        for (Produto c : listaProdutos) {
//            tmProdutos.addRow(new Object[]{c.getCodProd(), c.getpVenda(), c.getQuantProd(), c.getDescProduto(), c.getFabricante(), c.getNomeProduto()});
//        }
//
//        //Defino o tamanho para cada coluna
//        tblProduto.getColumnModel().getColumn(0).setPreferredWidth(50); //CodProduto
//        tblProduto.getColumnModel().getColumn(1).setPreferredWidth(200); //Preco
//        tblProduto.getColumnModel().getColumn(2).setPreferredWidth(100); // QtdEstoque
//        tblProduto.getColumnModel().getColumn(3).setPreferredWidth(300); // DescProduto
//        tblProduto.getColumnModel().getColumn(4).setPreferredWidth(300); // Fabricante
//        tblProduto.getColumnModel().getColumn(5).setPreferredWidth(300); // NomeProduto
//
//    }

    public void listarProdutos() {
        //lista toda a base de dados daquela tabela
        ArrayList<String[]> listaProdutos = ProdutoController.listarProdutos();

        DefaultTableModel tmProduto = new DefaultTableModel();
        tmProduto.addColumn("CodProd");
        tmProduto.addColumn("pVenda");
        tmProduto.addColumn("QuantProd");
        tmProduto.addColumn("DescProduto");
        tmProduto.addColumn("Fabricante");
        tmProduto.addColumn("NomeProduto");

        tblProduto.setModel(tmProduto);
        tmProduto.setRowCount(0);

        for (String[] item : listaProdutos) {
            tmProduto.addRow(item);

        }

        tblProduto.getColumnModel().getColumn(0).setPreferredWidth(10); //Cod
        tblProduto.getColumnModel().getColumn(0).setPreferredWidth(50); //pVenda
        tblProduto.getColumnModel().getColumn(0).setPreferredWidth(50); //QuantProd
        tblProduto.getColumnModel().getColumn(0).setPreferredWidth(50); //Desc
        tblProduto.getColumnModel().getColumn(0).setPreferredWidth(50); //Fabricante
        tblProduto.getColumnModel().getColumn(0).setPreferredWidth(50); //NomeProd
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CadastroProdutoView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodProduto;
    private javax.swing.JLabel lblConsulta;
    private javax.swing.JLabel lblDescProduto;
    private javax.swing.JLabel lblFabricante;
    private javax.swing.JLabel lblNomeProduto;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblQtdEstoque;
    private javax.swing.JTable tblProduto;
    private javax.swing.JTextField txtCampoConsulta;
    private javax.swing.JTextField txtCodProduto;
    private javax.swing.JTextField txtDescProduto;
    private javax.swing.JTextField txtFabricante;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQtdEstoque;
    // End of variables declaration//GEN-END:variables

}
