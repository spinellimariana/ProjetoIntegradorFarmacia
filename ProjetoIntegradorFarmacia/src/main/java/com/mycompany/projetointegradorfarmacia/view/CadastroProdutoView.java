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

    public CadastroProdutoView(Produto p) {
        initComponents();
        this.objProduto = p;
        this.txtNomeProduto.setText(p.getNomeProduto());
        this.txtDescProduto.setText(p.getDescProduto());
        this.txtFabricante.setText(p.getFabricante());
        this.txtQtdEstoque.setText(String.valueOf(p.getQuantProd()));
        this.txtPreco.setText(String.valueOf(p.getpVenda()));
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
        btnAlterar = new javax.swing.JButton();
        btnPesquisarID = new javax.swing.JButton();
        txtCodProduto = new javax.swing.JTextField();
        txtQtdEstoque = new javax.swing.JTextField();
        lblDescProduto = new javax.swing.JLabel();
        txtDescProduto = new javax.swing.JTextField();
        lblFabricante = new javax.swing.JLabel();
        txtFabricante = new javax.swing.JTextField();
        lblPreco = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();
        txtPreco = new javax.swing.JTextField();
        btnPesquisarNome = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Rede Farmácia - Cadastro Produto");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Produto ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        lblCodProduto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCodProduto.setText("Código:");

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

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnPesquisarID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Zoom-icon.png"))); // NOI18N
        btnPesquisarID.setText("Pesquisar por ID");
        btnPesquisarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarIDActionPerformed(evt);
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

            },
            new String [] {
                "Código", "Produto", "Descrição", "Fabricante", "Qtd.", "Preço"
            }
        ));
        tblProduto.setName("TABELA PRODUTOS"); // NOI18N
        jScrollPane1.setViewportView(tblProduto);

        txtPreco.setName("PREÇO"); // NOI18N

        btnPesquisarNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Zoom-icon.png"))); // NOI18N
        btnPesquisarNome.setText("Pesquisar por nome");
        btnPesquisarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarNomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDescProduto)
                                    .addComponent(lblCodProduto)
                                    .addComponent(lblNomeProduto)
                                    .addComponent(lblQtdEstoque))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtQtdEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblPreco)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblFabricante)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnPesquisarID, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnPesquisarNome))
                                    .addComponent(txtDescProduto)
                                    .addComponent(txtNomeProduto)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCadastrar)
                                .addGap(18, 18, 18)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblCodProduto, lblNomeProduto});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterar, btnCadastrar, btnExcluir, btnLimpar});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnPesquisarID, btnPesquisarNome});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisarID)
                    .addComponent(lblCodProduto)
                    .addComponent(txtCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarNome))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomeProduto))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQtdEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPreco)
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblQtdEstoque)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFabricante)
                            .addComponent(txtFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescProduto)
                    .addComponent(txtDescProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnLimpar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblCodProduto, lblNomeProduto});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAlterar, btnCadastrar, btnExcluir, btnLimpar, btnPesquisarID, btnPesquisarNome});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtCodProduto, txtDescProduto, txtFabricante, txtNomeProduto, txtPreco, txtQtdEstoque});

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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
        txtDescProduto.setText("");
        txtFabricante.setText("");
        txtPreco.setText("");
        txtCodProduto.grabFocus();

        DefaultTableModel tbm = (DefaultTableModel) tblProduto.getModel();
        for (int i = tbm.getRowCount() - 1; i >= 0; i--) {
            tbm.removeRow(i);
        }
        listarProdutos();
    }//GEN-LAST:event_btnLimparMouseClicked

    private void btnPesquisarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarIDActionPerformed
        Validadora validar = new Validadora();
        validar.ValidarTexto(txtCodProduto);
        if (validar.hasErro()) {
            JOptionPane.showMessageDialog(this, validar.getMensagensErro());
        } else {

            int id = Integer.parseInt(txtCodProduto.getText());

            ArrayList<String[]> filtro = ProdutoController.filtroProduto(id);

            DefaultTableModel modelo = (DefaultTableModel) tblProduto.getModel();
            modelo.setRowCount(0);

            for (String[] item : filtro) {
                modelo.addRow(item);
            }

        }


    }//GEN-LAST:event_btnPesquisarIDActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

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

                boolean retorno = ProdutoController.Alterar(id, pVenda, quantProd, DescProduto, Fabricante, NomeProduto);

                if (retorno == true) {

                    JOptionPane.showMessageDialog(this, "Produto ALTERADO com sucesso!", "Produto Cadastrado", JOptionPane.INFORMATION_MESSAGE);
                    modoTela = "Criação";

                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao ALTERAR na base de dados\n",
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

                //int idProduto = Integer.parseInt(tblProduto.getModel().getValueAt(numeroLinha, 0).toString());
                int CodProd = Integer.parseInt(tblProduto.getModel().getValueAt(numeroLinha, 0).toString());
                String NomeProduto = tblProduto.getModel().getValueAt(numeroLinha, 1).toString();
                String DescProduto = tblProduto.getModel().getValueAt(numeroLinha, 2).toString();
                String Fabricante = tblProduto.getModel().getValueAt(numeroLinha, 3).toString();
                String quantProd = (tblProduto.getModel().getValueAt(numeroLinha, 4).toString());
                String pVenda = (tblProduto.getModel().getValueAt(numeroLinha, 5).toString());

                objProduto.setCodProd(CodProd);
                txtNomeProduto.setText(NomeProduto);
                txtDescProduto.setText(DescProduto);
                txtFabricante.setText(Fabricante);
                txtQtdEstoque.setText(quantProd);
                txtPreco.setText(pVenda);

                modoTela = "Alteração";

            }
    }//GEN-LAST:event_btnAlterarActionPerformed
    }

    private void txtCodProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodProdutoActionPerformed

    private void btnPesquisarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarNomeActionPerformed
        Validadora validar = new Validadora();
        validar.ValidarTexto(txtNomeProduto);

        if (validar.hasErro()) {
            JOptionPane.showMessageDialog(this, validar.getMensagensErro());
        } else {

            ArrayList<String[]> filtro = ProdutoController.filtroNome(txtNomeProduto.getText());
            DefaultTableModel modelo = (DefaultTableModel) tblProduto.getModel();
            modelo.setRowCount(0);

            for (String[] item : filtro) {
                modelo.addRow(item);
            }
        }

        tblProduto.getColumnModel().getColumn(0).setPreferredWidth(10);
        tblProduto.getColumnModel().getColumn(1).setPreferredWidth(50);
        tblProduto.getColumnModel().getColumn(2).setPreferredWidth(50);
        tblProduto.getColumnModel().getColumn(3).setPreferredWidth(50);
        tblProduto.getColumnModel().getColumn(4).setPreferredWidth(50);
        tblProduto.getColumnModel().getColumn(5).setPreferredWidth(50);
    }//GEN-LAST:event_btnPesquisarNomeActionPerformed

    public void listarProdutos() {
        //lista toda a base de dados daquela tabela
        ArrayList<String[]> listaProdutos = ProdutoController.listarProdutos();

        DefaultTableModel tmProduto = new DefaultTableModel();
        tmProduto.addColumn("ID");
        tmProduto.addColumn("Produto");
        tmProduto.addColumn("Descrição");
        tmProduto.addColumn("Fabricante");
        tmProduto.addColumn("Qtd");
        tmProduto.addColumn("Preço");

        tblProduto.setModel(tmProduto);
        tmProduto.setRowCount(0);

        for (String[] item : listaProdutos) {
            tmProduto.addRow(item);

        }

        tblProduto.getColumnModel().getColumn(0).setPreferredWidth(10);
        tblProduto.getColumnModel().getColumn(1).setPreferredWidth(50);
        tblProduto.getColumnModel().getColumn(2).setPreferredWidth(50);
        tblProduto.getColumnModel().getColumn(3).setPreferredWidth(50);
        tblProduto.getColumnModel().getColumn(4).setPreferredWidth(50);
        tblProduto.getColumnModel().getColumn(5).setPreferredWidth(50);
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
    private javax.swing.JButton btnPesquisarID;
    private javax.swing.JButton btnPesquisarNome;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodProduto;
    private javax.swing.JLabel lblDescProduto;
    private javax.swing.JLabel lblFabricante;
    private javax.swing.JLabel lblNomeProduto;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblQtdEstoque;
    private javax.swing.JTable tblProduto;
    private javax.swing.JTextField txtCodProduto;
    private javax.swing.JTextField txtDescProduto;
    private javax.swing.JTextField txtFabricante;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQtdEstoque;
    // End of variables declaration//GEN-END:variables

}
