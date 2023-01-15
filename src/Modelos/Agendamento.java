
package Modelos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Agendamento {
    
    private int id;
    private Cliente cliente;
    private Encomenda pedido;
    private float valor;
    private Date data;
    private String descricao;
    
    // Construtor 1
    public Agendamento(int id, Cliente cliente, Encomenda pedido, float valor, String data) {
        this.id = id;
        this.cliente = cliente;
        this.pedido = pedido;
        this.valor = valor;
               
        try {
            // this.data = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(data);
            this.data = new SimpleDateFormat("dd/MM/yyyy").parse(data);
        } catch (ParseException ex) {
            Logger.getLogger(Agendamento.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    // Construtor 2 - que chama o construtor 1 (sobrecarga de construtor)
    public Agendamento (int id, Cliente cliente, Encomenda pedido, float valor, String data, String descricao) {
        this(id, cliente, pedido, valor, data);
        this.descricao = descricao;

    }
    
    // Getters e Setters 
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Encomenda getPedido() {
        return pedido;
    }

    public void setPedido(Encomenda pedido) {
        this.pedido = pedido;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }
    
    public String getDataFormated () {
        return new SimpleDateFormat ("dd/MM/yyyy").format(data);
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
}
