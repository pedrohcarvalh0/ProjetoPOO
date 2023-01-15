
package Controles;

import Controles.Helpers.LoginHelper;
import Modelos.DAO.UsuarioDAO;
import Modelos.Usuario;
import Telas.TelaLogin;
import Telas.TelaMenu;

// Responsável por controlar o login na TelaLogin
// - verificação de senha e usuário


public class LoginControle {

    private final TelaLogin tela;
    private LoginHelper helper;

    public LoginControle(TelaLogin tela) {
        this.tela = tela;
        this.helper = new LoginHelper(tela);
  
    }
   
   // Verifica usuário e senha no banco de dados e caso sejam corretos a entrada então
   //  é permitida, redirecionando para tela de Menu  
    
   public void entrarNoSistema () {
       
       // Pegar um usuário da tela
       Usuario user = helper.obeterUsuario();
       
       // Pesquisa o usuário no banco de dados
       UsuarioDAO userDAO = new UsuarioDAO();
       Usuario userAutenticado = userDAO.selectPorNomeESenha(user);
       
       if (userAutenticado != null) {
           // Nevegar para o meu principal
           TelaMenu menu = new TelaMenu();
           menu.setVisible(true);
           this.tela.dispose();
       } else {
           tela.exibiMensagem("Usuário ou senha inválidos");
       }     
   }
}
