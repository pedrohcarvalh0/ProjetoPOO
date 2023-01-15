
package Modelos;

import java.util.Date;

public class Usuario extends Pessoa {
    
    // Propiedades
    private String senha;
    private String nivelAcesso;
    
    // Construtor 1
    public Usuario(int id, String nome, String senha) {
        super(id, nome);
        this.senha = senha;
    }

    // Construtor 2
    public Usuario(int id, String nome, char Sexo, String data, String telefone, String email, String rg, String senha, String nivelAcesso)  {   
        
        super(id, nome, Sexo, data, telefone, email, rg); //Construtor da classe pai
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }
    
    // Getter e Setters 

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
    
}
