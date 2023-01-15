
package Modelos;

import java.util.Date;


public class Cliente extends Pessoa {
    
    private String endereco;
    private String cep;

    // Construtor 1 
    public Cliente(int id, String nome, char Sexo, String data, String telefone, String email, String rg, String endereco, String cep) {
        super(id, nome, Sexo, data, telefone, email, rg); //Construtor da classe pai
        this.endereco = endereco;
        this.cep = cep;
    }

    // Construtor 2
    public Cliente(int id, String nome, String endereco, String cep) {
        
        super(id, nome); //Construtor da classe pai
        this.endereco = endereco;
        this.cep = cep;
    }
    
    // Getters e Setters

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    @Override
    public String toString() {
        return getNome();
    }
       
}
