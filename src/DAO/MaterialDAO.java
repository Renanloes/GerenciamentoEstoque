package dao;

import model.Material;
import dao.ConexaoBanco;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MaterialDAO {

    // Método para listar os materiais com filtro
    public List<Material> listarMateriais(String descricao, String quantidade, String categoria) throws SQLException {
        List<Material> materiais = new ArrayList<>();
        String query = "SELECT * FROM materiais WHERE descricao LIKE ? AND quantidade LIKE ? AND categoria LIKE ?";
        
        try (Connection conn = ConexaoBanco.getConexao();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            
            stmt.setString(1, "%" + descricao + "%");
            stmt.setString(2, "%" + quantidade + "%");
            stmt.setString(3, "%" + categoria + "%");
            
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Material material = new Material(1, descricao, categoria, categoria);
                material.setId(rs.getInt("id"));
                material.setCategoria(rs.getString("categoria"));
                material.setQuantidade(rs.getInt("quantidade"));
                material.setDescricao(rs.getString("descricao"));
                materiais.add(material);
            }
        }
        return materiais;
    }

    // Método para excluir um material
    public void excluirMaterial(int id) throws SQLException {
        String query = "DELETE FROM materiais WHERE id = ?";
        
        try (Connection conn = ConexaoBanco.getConexao();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
    
    // Método para cadastrar um material
    public void cadastrarMaterial(Material material) throws SQLException {
        String query = "INSERT INTO materiais (categoria, quantidade, descricao) VALUES (?, ?, ?)";
        
        try (Connection conn = ConexaoBanco.getConexao();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            
            stmt.setString(1, material.getCategoria());
            stmt.setInt(2, material.getQuantidade());
            stmt.setString(3, material.getDescricao());
            stmt.executeUpdate();
        }
    }

    public void adicionarMaterial(Material material) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void atualizarMaterial(Material material) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
