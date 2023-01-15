
package Controles.Helpers;

// Interface com métodos que serão usados tanto na Agenda como no Login

public interface Helper {
    
    // Polimorfismo
    public abstract Object obterModelo(); // Retorna o tipo object para ser utilizado na Agenda, pois todas as classes do Java se originam de object 
    
    public abstract void limparTela();
    
}
