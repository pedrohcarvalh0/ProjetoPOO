
package Controles;


import Controles.Helpers.AgendaHelper;
import Modelos.Agendamento;
import Modelos.Cliente;
import Modelos.DAO.AgendamentoDAO;
import Modelos.DAO.ClienteDAO;
import Modelos.DAO.EncomendaDAO;
import Modelos.Encomenda;
import Telas.Agenda;
import java.util.ArrayList;

// Responsável por controlar o que acontece na agenda
// - atualização das informações na tela
// - ações de agendamento

public class AgendaControle {
    
    private final Agenda view;
    private final AgendaHelper helper;

    public AgendaControle(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    
    // Funçoes de atualização: responsáveis por pegar as informações do banco de dados e exibir na teal
    
    public void atualizarTabela() {
        
        // Buscar lista com agendamentos do banco de dados
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
        
        
        // Exibir esta lista na view
        helper.preencherTabela(agendamentos);
    }
    
    public void atualizarCliente() {
        
        // Buscar Cliente no Banco de Dados
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();
                
        // Exibir Clientes na tela
        helper.preencherClientes(clientes); // toString será utilizado para chamar como nome!
    }
    
    public void atualizarPedido () {
        
        // Busca tipo de encomendas no banco de dados
        EncomendaDAO encomendaDAO = new EncomendaDAO();
        ArrayList<Encomenda> encomendas = encomendaDAO.selectAll();
        
        // Exibir tipos de encomendas na tela
        helper.preencherEncomendas(encomendas);
    }
    
    public void AtualizarValor() {
        
        //Atualiza valor de acordo com opção de encomenda escolhida
        Encomenda encomenda = helper.obterEncomenda();
        helper.definirValor(encomenda.getValor());
    }
    
    public void agendar() {
        
        // Buscar objeto agendamento da tela
        Agendamento agendamento = helper.obterModelo();
        
        // Insere e salva o Objeto no banco de dados
        new AgendamentoDAO().insert(agendamento);
        
        // Adicionar os elementos na tabela (com a função já feita)
        atualizarTabela();
        
        // Limpando a tela
        helper.limparTela();
    }
}
