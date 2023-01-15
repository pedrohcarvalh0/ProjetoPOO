
package Controles;

import Telas.Agenda;
import Telas.TelaMenu;

// Responsável por controlar a TelaMenu 
// - redirecionamento para outras telas
public class TelaMenuControle {
    
    private final TelaMenu tela;

    public TelaMenuControle(TelaMenu tela) {
        this.tela = tela;
    }
    
    // Métodos de navegação para outras telas
    
    public void NavegarParaAgenda () {
        
        Agenda agenda = new Agenda();
        agenda.setVisible(true);       
    }
    
}
