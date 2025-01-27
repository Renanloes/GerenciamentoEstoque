package dao;

import Model.Usuario;

import dao.ConexaoBanco;
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class UsuarioDAO {

    // Método para realizar login
    public Usuario logar(String nome, String senha) {
        String sql = "SELECT * FROM usuarios WHERE nome = ? AND senha = ?";
        try (Connection connection = ConexaoBanco.getConexao();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, senha);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Usuario(
                            rs.getInt("id"),
                            rs.getString("nome"),
                            rs.getString("senha"),
                            rs.getString("cargo"));
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao fazer login: " + e.getMessage());
        }
        return null;
    }

    // Método para cadastrar usuário
    public void cadastrarUsuario(Usuario usuario) {
        String sql = "INSERT INTO usuarios (nome, senha, cargo) VALUES (?, ?, ?)";
        try (Connection connection = ConexaoBanco.getConexao();
             PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getSenha());
            ps.setString(3, usuario.getCargo());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar usuário: " + e.getMessage());
        }
    }

    // Método para listar usuários
    public ArrayList<Usuario> listarUsuarios() {
        String sql = "SELECT * FROM usuarios";
        ArrayList<Usuario> usuarios = new ArrayList<>();

        try (Connection connection = ConexaoBanco.getConexao();
             PreparedStatement ps = connection.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Usuario usuario = new Usuario(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("senha"),
                        rs.getString("cargo"));
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar usuários: " + e.getMessage());
        }
        return usuarios;
    }

    // Método para remover usuário
    public void removerUsuario(int id) {
        String sql = "DELETE FROM usuarios WHERE id = ?";
        try (Connection connection = ConexaoBanco.getConexao();
             PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuário removido com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao remover usuário: " + e.getMessage());
        }
    }

    // Método para atualizar senha
    public void atualizarSenha(int id, String novaSenha) {
        String sql = "UPDATE usuarios SET senha = ? WHERE id = ?";
        try (Connection connection = ConexaoBanco.getConexao();
             PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, novaSenha);
            ps.setInt(2, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Senha atualizada com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar senha: " + e.getMessage());
        }
    }

    // Método de salvar (não implementado)
    public void salvar(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
