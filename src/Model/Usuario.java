package Model;

public class Usuario {
    private int cod;
    private String usu;
    private String nome;
    private String pass;

    // Construtor vazio
    public Usuario(String nome1, String senha, String cargo) {}

    // Construtor com parâmetros
    public Usuario(int cod, String usu, String nome, String pass) {
        this.cod = cod;
        this.usu = usu;
        this.nome = nome;
        this.pass = pass;
    }

    // Getters e Setters
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getUsu() {
        return usu;
    }

    public void setUsu(String usu) {
        this.usu = usu;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getSenha() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getCargo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
