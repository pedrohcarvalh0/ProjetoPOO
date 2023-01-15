
package Modelos.DAO;

import Modelos.Encomenda;
import java.util.ArrayList;


public class EncomendaDAO {
    
    /**
     * Insere um servico dentro do banco de dados
     * @param servico exige que seja passado um objeto do tipo servico
     */
    public void insert(Encomenda pedido){
        Banco.pedido.add(pedido);
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param pedido
     * @return 
     */
    public boolean update(Encomenda pedido){
        
        for (int i = 0; i < Banco.pedido.size(); i++) {
            if(idSaoIguais(Banco.pedido.get(i),pedido)){
                Banco.pedido.set(i, pedido);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do servico passado
     * @param servico
     * @return 
     */
    public boolean delete(Encomenda servico){
        for (Encomenda servicoLista : Banco.pedido) {
            if(idSaoIguais(servicoLista,servico)){
                Banco.pedido.remove(servicoLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os servicos do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Encomenda> selectAll(){
        return Banco.pedido;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param servico
     * @param servicoAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Encomenda servico, Encomenda servicoAComparar) {
        return servico.getId() ==  servicoAComparar.getId();
    }
    
}
