
package Modelos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public abstract class Pessoa {
    
    
    // Propiedades - terão o campo de visibilidade como protegido, assim só a classe e sus filhos terão acesso  
    protected int id;
    protected String nome;
    protected char Sexo;
    protected Date data;
    protected String telefone;
    protected String email;
    protected String rg;

   
    // Construtor 1
    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    // Construtor 2
    public Pessoa(int id, String nome, char Sexo, String data, String telefone, String email, String rg) {
        this.id = id;
        this.nome = nome;
        this.Sexo = Sexo;
        
        try {
            this.data = new SimpleDateFormat("dd/MM/yyyy").parse(data);
        } catch (ParseException ex) {
            Logger.getLogger(Pessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.telefone = telefone;
        this.email = email;
        this.rg = rg;
    }
    
    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    } 
}
