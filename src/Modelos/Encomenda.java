
package Modelos;


// Classe usada para armazernar as informações referentes ao pedido

public class Encomenda {
    
    private int id;
    private String pedido;
    private float valor;
   
    // Construtor
    public Encomenda(int id, String pedido, float valor) {
        this.id = id;
        this.pedido = pedido;
        this.valor = valor;
    }

    // Getters e Setters
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return getPedido();
    }
}
