
package Controles.Helpers;

import Modelos.Agendamento;
import Modelos.Cliente;
import Modelos.Encomenda;
import Telas.Agenda;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

// Formatação dos dados que serão exibidos na agenda
// - os dados serão tratados e formatados antes de serem enviados ao model

public class AgendaHelper implements Helper {
    
    private final Agenda view;

    public AgendaHelper(Agenda view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
        
        // MODEL DA TABELA 
        DefaultTableModel tblAgendamentos = (DefaultTableModel) view.getTbTabela().getModel();
        tblAgendamentos.setNumRows(0);
       
        // Percorrer a Lista Preenchendo a tabela (for it)
        for (Agendamento agendamento : agendamentos) {
            
            tblAgendamentos.addRow(new Object[] {
                
                agendamento.getId(), 
                agendamento.getCliente().getNome(),
                agendamento.getPedido().getPedido(),
                agendamento.getValor(),
                agendamento.getDataFormated(),
                agendamento.getDescricao()
      
            });
        }
    }

    
    public void preencherClientes(ArrayList<Cliente> clientes) {
        
       DefaultComboBoxModel txtCliente = (DefaultComboBoxModel) view.getTxtCliente().getModel();
       
       // Percorrer a Lista Preenchendo a tabela (for it)
        for (Cliente cliente : clientes) {
            
            txtCliente.addElement(cliente); // Adição do cliente na forma de objeto
            
        }
    }

    public void preencherEncomendas(ArrayList<Encomenda> encomendas) {
           
        DefaultComboBoxModel txtPedido = (DefaultComboBoxModel) view.getTxtPedido().getModel();
        
        // Percorrer a Lista Preenchendo a tabela (for it)
        for (Encomenda encomenda : encomendas) {
            
            txtPedido.addElement(encomenda); // Adição de pedido na forma de objeto
        }
    }

    public Encomenda obterEncomenda() {
        return (Encomenda) view.getTxtPedido().getSelectedItem();
    }
    
    public Cliente obterCliente() {
        return (Cliente) view.getTxtCliente().getSelectedItem();
    }

    public void definirValor(float valor) {
        view.getTxtValor().setText(valor + "");
    }

    // Pegando os dados da view para tranformar num agendamento e armazenar no banco
    @Override
    public Agendamento obterModelo() {
        
        String idString = view.getTxtId().getText();
        int id = Integer.parseInt(idString);
        
        Cliente cliente = obterCliente();
        
        Encomenda encomenda = obterEncomenda();
        
        String valorString = view.getTxtValor().getText();
        float valor = Float.parseFloat(valorString);
        
        String data = view.getTxtData().getText();
        
        String descricao = view.getTxtDescricao().getText();
       
        // Criando um agendanmento com todos os dados a cima
        Agendamento agendamento = new Agendamento(id, cliente, encomenda, valor, data, descricao);
        return agendamento;
    }

    // Será executada após cada agendamento ser realizado
    
    @Override
    public void limparTela() {
        view.getTxtId().setText("");
        view.getTxtData().setText("");
        view.getTxtData().setText("");
    }
    
}
