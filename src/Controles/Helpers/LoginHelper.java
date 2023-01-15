
package Controles.Helpers;

import Modelos.Usuario;
import Telas.TelaLogin;


public class LoginHelper implements Helper {

    private final TelaLogin tela;

    public LoginHelper(TelaLogin tela) {
        this.tela = tela;     
    }
    
    
    // Pega os dados da tela
    public Usuario obeterUsuario () {
        
       String nome = tela.getTxtUsuario().getText();
       String senha = tela.getTxtSenha().getText();
       Usuario user = new Usuario(0, nome, senha);
       
       return user;
    }

    // Seta o user na tela
    public void setarUsuario (Usuario user) {
 
        String nome = user.getNome();
        String senha = user.getSenha(); 
        tela.getTxtUsuario().setText(nome);
        tela.getTxtSenha().setText(senha);
    }
    
    public void limparTela () {
        tela.getTxtUsuario().setText("");
        tela.getTxtSenha().setText("");
    }

    @Override
    public Object obterModelo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
