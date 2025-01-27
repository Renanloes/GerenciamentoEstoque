package Telas;

//import crud.CRUDMaterial;
import dao.MaterialDAO;
//import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Material;

public class CrudMaterial extends javax.swing.JFrame {

    private javax.swing.JFrame parentFrame; // Para referenciar a janela anterior
    private MaterialDAO materialDAO; // Instância do DAO para interagir com o banco de dados

    // Construtor modificado para receber a janela anterior (ListaMaterial)
    public CrudMaterial(javax.swing.JFrame parent) {
        initComponents();
        this.parentFrame = parent;
        this.materialDAO = new MaterialDAO(); // Inicializa o DAO
        setLocationRelativeTo(parent); // Centraliza o formulário
        parentFrame.setEnabled(false); // Desabilita a janela anterior
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jBFechar = new javax.swing.JButton();
        jBConfirmar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jCBMobilia = new javax.swing.JCheckBox();
        jCBComplemento = new javax.swing.JCheckBox();
        jCBTecido = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTFQuantia = new javax.swing.JTextField();
        jTFDescricao = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cadastro Material");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jBFechar.setText("Fechar");
        jBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFecharActionPerformed(evt);
            }
        });

        jBConfirmar.setText("Confirmar");
        jBConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConfirmarActionPerformed(evt);
            }
        });

        jLabel2.setText("Categoria");

        jCBMobilia.setText("Mobília");

        jCBComplemento.setText("Complementos");

        jCBTecido.setText("Tecidos");

        jLabel3.setText("Descrição");

        jLabel4.setText("Quantidade");

        jTFQuantia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFQuantiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBFechar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jCBTecido, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCBMobilia, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCBComplemento))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTFQuantia, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBFechar)
                    .addComponent(jBConfirmar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFQuantiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFQuantiaActionPerformed
        // Código adicional para evento se necessário
    }

    private void jBConfirmarActionPerformed() {

    }//GEN-LAST:event_jTFQuantiaActionPerformed

    private void jBConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConfirmarActionPerformed
        // Obtém os valores preenchidos
        String descricao = jTFDescricao.getText();
        String quantidadeStr = jTFQuantia.getText();
        String categoria = "";

        if (jCBMobilia.isSelected()) {
            categoria = "Mobília";
        } else if (jCBComplemento.isSelected()) {
            categoria = "Complementos";
        } else if (jCBTecido.isSelected()) {
            categoria = "Tecidos";
        }

        // Verifica campos obrigatórios
        if (descricao.isEmpty() || quantidadeStr.isEmpty() || categoria.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.");
            return;
        }

        try {
            int quantidade = Integer.parseInt(quantidadeStr);

            // Cria um objeto Material e salva no banco
            Material material = new Material(1, descricao, categoria, categoria);
            materialDAO.cadastrarMaterial(material);

            JOptionPane.showMessageDialog(this, "Material cadastrado com sucesso!");
            fecharJanela();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Quantidade inválida. Insira um número inteiro.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar material: " + ex.getMessage());
        }
    }//GEN-LAST:event_jBConfirmarActionPerformed

    private void jBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFecharActionPerformed
        this.setVisible(false);
        parentFrame.setEnabled(true);
        parentFrame.toFront();
    }//GEN-LAST:event_jBFecharActionPerformed

    private void fecharJanela() {
        this.setVisible(false);
        parentFrame.setEnabled(true);
        parentFrame.toFront();
    }

    public static void main(String[] args) {

        // Criação e exibição da tela CrudMaterial
        CrudMaterial crudMaterial = new CrudMaterial(null);
        crudMaterial.setVisible(true);
        
    }    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBConfirmar;
    private javax.swing.JButton jBFechar;
    private javax.swing.JCheckBox jCBComplemento;
    private javax.swing.JCheckBox jCBMobilia;
    private javax.swing.JCheckBox jCBTecido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFDescricao;
    private javax.swing.JTextField jTFQuantia;
    // End of variables declaration//GEN-END:variables
}
