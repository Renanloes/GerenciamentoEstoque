package Telas;

import Telas.CrudMaterial;
import dao.MaterialDAO;
import model.Material;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.List;
import javax.swing.table.TableColumnModel;

public class ListaMaterial extends javax.swing.JFrame {

    private MaterialDAO materialDAO;

    public ListaMaterial() {
        initComponents();
        materialDAO = new MaterialDAO();
    }

    private void listarMateriais() {
        // Obtém os valores dos filtros informados pelo usuário
    String descricao = jTFDescricao.getText();
    String quantidade = jTFQuantia.getText();
    String categoria = null;

    // Determina a categoria com base nas checkboxes selecionadas
    if (jCBMobilia.isSelected()) categoria = "Mobília";
    else if (jCBTecido.isSelected()) categoria = "Tecidos";
    else if (jCBComplemento.isSelected()) categoria = "Complementos";

    try {
        // Chama o método DAO para buscar os materiais no banco de dados usando os filtros
        List<Material> materiais = materialDAO.listarMateriais(descricao, quantidade, categoria);

        // Obtém o modelo da tabela para manipular os dados
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        // Limpa os dados existentes na tabela para exibir os novos resultados
        model.setRowCount(0);

        // Adiciona cada material retornado do banco como uma nova linha na tabela
        for (Material material : materiais) {
            model.addRow(new Object[]{
                material.getId(),         // ID do material
                material.getCategoria(),  // Categoria do material (Mobília, Tecidos, etc.)
                material.getQuantidade(), // Quantidade disponível
                material.getDescricao()   // Descrição do material
            });
        }
        ajustarTamanhoColunas();

        
    } catch (SQLException e) {
        // Exibe mensagem de erro caso ocorra uma falha ao listar materiais
        JOptionPane.showMessageDialog(this, "Erro ao listar materiais: " + e.getMessage());
    }
    }
    
    private void ajustarTamanhoColunas() {
    // Obtém o modelo das colunas da tabela para definir seus tamanhos
    TableColumnModel columnModel = jTable1.getColumnModel();

    // Define o tamanho preferido de cada coluna individualmente
    columnModel.getColumn(0).setPreferredWidth(50);  // Coluna 0: ID (largura 50 pixels)
    columnModel.getColumn(1).setPreferredWidth(100); // Coluna 1: Categoria (largura 100 pixels)
    columnModel.getColumn(2).setPreferredWidth(80);  // Coluna 2: Quantidade (largura 80 pixels)
    columnModel.getColumn(3).setPreferredWidth(200); // Coluna 3: Descrição (largura 200 pixels)

    // Impede o ajuste automático do tamanho das colunas (mantém os tamanhos fixos definidos acima)
    jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
}

    private void excluirMaterial() {
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            int idMaterial = (int) jTable1.getValueAt(selectedRow, 0); // Obtém o ID do material selecionado
            try {
                // Chama o método do DAO para excluir o material
                materialDAO.excluirMaterial(idMaterial);
                JOptionPane.showMessageDialog(this, "Material excluído com sucesso.");
                listarMateriais(); // Atualiza a lista de materiais
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Erro ao excluir material: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um material para excluir.");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTBCadastro = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jCBComplemento = new javax.swing.JCheckBox();
        jCBTecido = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTFQuantia = new javax.swing.JTextField();
        jTFDescricao = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jCBMobilia = new javax.swing.JCheckBox();
        jBListar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jBCadastro = new javax.swing.JButton();

        jTBCadastro.setText("Cadastrar");
        jTBCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBCadastroActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Categortia", "Quantidade", "Descrição"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Materiais");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jCBComplemento.setText("Complementos");

        jCBTecido.setText("Tecidos");

        jLabel3.setText("Descrição");

        jLabel4.setText("Quantidade");

        jTFQuantia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFQuantiaActionPerformed(evt);
            }
        });

        jLabel2.setText("Categoria");

        jCBMobilia.setText("Mobília");

        jBListar.setText("Listar");
        jBListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBListarActionPerformed(evt);
            }
        });

        jBExcluir.setText("Excluir");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jBCadastro.setText("Cadastrar");
        jBCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCBTecido, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCBMobilia, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCBComplemento))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTFQuantia, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTFDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jBExcluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBListar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jBCadastro)
                                .addGap(196, 196, 196)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCBMobilia)
                            .addComponent(jCBComplemento)
                            .addComponent(jCBTecido))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4)
                        .addComponent(jTFQuantia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jBCadastro)
                        .addGap(18, 18, 18)
                        .addComponent(jBListar)
                        .addGap(18, 18, 18)
                        .addComponent(jBExcluir))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFQuantiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFQuantiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFQuantiaActionPerformed

    private void jBListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBListarActionPerformed
        listarMateriais(); // Chama o método para listar materiais
    }//GEN-LAST:event_jBListarActionPerformed

    private void jTBCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBCadastroActionPerformed
        
    }//GEN-LAST:event_jTBCadastroActionPerformed

        
    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        excluirMaterial(); // Chama o método para excluir material selecionado
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jBCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastroActionPerformed
    CrudMaterial crudMaterial = new CrudMaterial(this); // Passa 'this' como o JFrame pai
    crudMaterial.setVisible(true);
    }//GEN-LAST:event_jBCadastroActionPerformed

    public static void main(String args[]) {
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaMaterial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastro;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBListar;
    private javax.swing.JCheckBox jCBComplemento;
    private javax.swing.JCheckBox jCBMobilia;
    private javax.swing.JCheckBox jCBTecido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jTBCadastro;
    private javax.swing.JTextField jTFDescricao;
    private javax.swing.JTextField jTFQuantia;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
