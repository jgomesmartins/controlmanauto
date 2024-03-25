package Entidade;


public class Usuario {
    
    private Integer ID;
    private String Login;
    private String Nome;
    private String Senha;

    public Usuario() {
        this.ID = -1;
        this.Login = "";
        this.Nome = "";
        this.Senha = "";
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
    
    
}
