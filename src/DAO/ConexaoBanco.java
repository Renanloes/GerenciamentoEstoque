package dao;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author miguel_a_andrade
 */
public class ConexaoBanco {

    public Connection getConexao() {
        try {
            // Conexão com o banco de dados usando JDBC
            return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/palogin", "root", "YES");
        } catch (Exception e) {
            // Exibe uma mensagem de erro em caso de falha na conexão
            JOptionPane.showMessageDialog(null, "Erro de Conexão com o Banco");
          
            return null;
        }
    }
}
