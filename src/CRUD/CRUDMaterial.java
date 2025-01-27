package crud;

import dao.MaterialDAO;
import model.Material;
import java.sql.SQLException;
import java.util.List;

public class CRUDMaterial {

    private MaterialDAO materialDAO;

    public CRUDMaterial() {
        // Inicializa o MaterialDAO
        materialDAO = new MaterialDAO();
    }

    // Criar: Adiciona um novo material no banco de dados
    public void criarMaterial(Material material) {
        materialDAO.adicionarMaterial(material);
        System.out.println("Material criado com sucesso!");
    }

    // Ler: Lista os materiais com base em filtros (por exemplo, descrição ou categoria)
    public List<Material> listarMateriais(String descricao, String quantidade, String categoria) {
        try {
            return materialDAO.listarMateriais(descricao, quantidade, categoria);
        } catch (SQLException e) {
            System.out.println("Erro ao listar materiais: " + e.getMessage());
            return null;
        }
    }

    // Atualizar: Atualiza um material existente
    public void atualizarMaterial(Material material) {
        materialDAO.atualizarMaterial(material);
        System.out.println("Material atualizado com sucesso!");
    }

    // Excluir: Exclui um material pelo ID
    public void excluirMaterial(int id) {
        try {
            materialDAO.excluirMaterial(id);
            System.out.println("Material excluído com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao excluir material: " + e.getMessage());
        }
    }

    public void adicionarMaterial(Material material) {
        throw new UnsupportedOperationException("Not supported yet.");}

    public void listarMateriais() {
        throw new UnsupportedOperationException("Not supported yet.");}
}
