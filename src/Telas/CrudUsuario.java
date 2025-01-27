package Telas;

import Model.Usuario;
import dao.UsuarioDAO;
import javax.swing.*;

public class CrudUsuario extends javax.swing.JFrame {

    // Referência para a TelaLogin que abriu esta tela
    private final TelaLogin telaLogin;

    // Construtor da classe CrudUsuario
    public CrudUsuario(TelaLogin telaLogin) {
        this.telaLogin = telaLogin; // Armazena a referência para a TelaLogin
        initComponents(); // Inicializa os componentes gráficos da interface
        setLocationRelativeTo(null); // Centraliza a janela na tela
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBFechar = new javax.swing.JButton();
        jBConfirmar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jTFSenha = new javax.swing.JTextField();
        jCBFuncionario = new javax.swing.JCheckBox();
        jCBLider = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cadastro Usuário");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel2.setText("Nome");

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

        jLabel3.setText("Cargo");

        jLabel4.setText("Senha");

        jTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomeActionPerformed(evt);
            }
        });

        jCBFuncionario.setText("Funcionário");

        jCBLider.setText("Líder");

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                        .addComponent(jBConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTFNome)
                                    .addComponent(jTFSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCBFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCBLider, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBFuncionario)
                    .addComponent(jCBLider))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBFechar)
                    .addComponent(jBConfirmar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNomeActionPerformed

    private void jBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFecharActionPerformed
        telaLogin.setEnabled(true); // Reativa a TelaLogin
        this.dispose();            // Fecha a janela atual
    }//GEN-LAST:event_jBFecharActionPerformed

    private void jBConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConfirmarActionPerformed
        String nome = jTFNome.getText().trim();
        String senha = jTFSenha.getText().trim();
        String cargo = jCBFuncionario.isSelected() ? "Funcionário" : jCBLider.isSelected() ? "Líder" : null;

        if (nome.isEmpty() || senha.isEmpty() || cargo == null) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.");
            return;
        }

        // Criação do objeto Usuario
        Usuario usuario = new Usuario(nome, senha, cargo);

        // Criação do objeto UsuarioDAO
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        try {
            // Chama o método salvar do UsuarioDAO
            usuarioDAO.salvar(usuario);

            // Mensagem de sucesso
            JOptionPane.showMessageDialog(this, "Usuário cadastrado com sucesso!");

            // Fecha a tela e reativa a TelaLogin
            fecharTela();
        } catch (Exception e) {
            // Se ocorrer algum erro ao salvar, exibe a mensagem de erro
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar usuário: " + e.getMessage());
        }
    }//GEN-LAST:event_jBConfirmarActionPerformed

    // Método que é executado ao clicar no botão "Cadastrar"
    private void cadastrarUsuario() {
        String nome = jTFNome.getText().trim();
        String senha = jTFSenha.getText().trim();
        String cargo = jCBFuncionario.isSelected() ? "Funcionário" : jCBLider.isSelected() ? "Líder" : null;

        if (nome.isEmpty() || senha.isEmpty() || cargo == null) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.");
            return;
        }

        // Criação do objeto Usuario
        Usuario usuario = new Usuario(nome, senha, cargo);

        // Criação do objeto UsuarioDAO
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        try {
            // Chama o método salvar do UsuarioDAO
            usuarioDAO.salvar(usuario);

            // Mensagem de sucesso
            JOptionPane.showMessageDialog(this, "Usuário cadastrado com sucesso!");

            // Fecha a tela e reativa a TelaLogin
            fecharTela();
        } catch (Exception e) {
            // Se ocorrer algum erro ao salvar, exibe a mensagem de erro
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar usuário: " + e.getMessage());
        }
    }

    // Método para fechar a tela e reativar a TelaLogin
    private void fecharTela() {
        telaLogin.setEnabled(true);
        this.dispose();
    }

    public static void main(String[] args) {
        // Inicializa a tela CrudUsuario, passando `null` como referência de TelaLogin
        CrudUsuario crudUsuario = new CrudUsuario(null);
        crudUsuario.setVisible(true); // Torna a janela visível
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBConfirmar;
    private javax.swing.JButton jBFechar;
    private javax.swing.JCheckBox jCBFuncionario;
    private javax.swing.JCheckBox jCBLider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFSenha;
    // End of variables declaration//GEN-END:variables
}
