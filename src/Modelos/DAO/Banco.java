/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.DAO;

import Modelos.Agendamento;
import Modelos.Cliente;
import Modelos.Encomenda;
import Modelos.Usuario;
import java.util.ArrayList;

/**
 *
 * @author tiago
 */
public class Banco {
    
    public static ArrayList<Usuario> usuario;
    public static ArrayList<Cliente> cliente;
    public static ArrayList<Encomenda> pedido;
    public static ArrayList<Agendamento> agendamento;
    
    
    public static void inicia(){
    
        //Instancia os Objetos
        usuario = new ArrayList<Usuario>();
        cliente = new ArrayList<Cliente>();
        pedido = new ArrayList<Encomenda>();
        agendamento = new ArrayList<Agendamento>();
        
        //criando elementos
        
        Usuario usuario1 = new Usuario(1, "Pedro", 'M', "25/05/2002", "(74)98838-1530", "pedrocarvalho.comp@gmail.com", "68530955518", "Pedro", "administrador");
        Usuario usuario2 = new Usuario(2, "estagiario", 'M', "09/05/1996", "30212122", "estagiario@barbershop.com", "451244123", "estagiario", "funcionario");
         
        Cliente cliente1 = new Cliente(1, "Maria Eduarda", 'F', "30/01/1995", "30212126", "dudamar.h607@gmail.com", "5142487", "Rua jaboti 35 Canudos NH",  "93300012");
        Cliente cliente2 = new Cliente(2, "Judite Oliveira", 'F', "30/08/1994", "30212127", "juditeoliveirapet@gmail.com", "5142487745", "Rua campo bom 78 Centro NH",  "93300045");
        Cliente cliente3 = new Cliente(3, "Pedro Henrique", 'M', "25/05/2002", "30212128", "pedrohenrique@gmail.com", "78451458", "Rua Tres Irmaos 30 Vila Nova - NH",  "933007496");
        Cliente cliente4 = new Cliente(4, "Ana Clara Martins", 'F', "20/08/1995", "30212130", "clara34456@gmail.com", "2745487", "Rua Lombardi 40 Canudos NH",  "93300748");
        Cliente cliente5 = new Cliente(5, "Cristiano Ronaldo", 'M', "13/09/1992", "30212131", "ronaldonassar@gmail.com", "4742487", "Rua pedro quaresma 784 Canudos Belgica",  "933000847");
        Cliente cliente6 = new Cliente(6, "Matilde Pereira", 'F', "17/08/1994", "302122324", "matuidipet@gmail.com", "78512457", "Rua champions 10 Kephas Franca",  "933000782");
        Cliente cliente7 = new Cliente(7, "Marta de Souza", 'F', "25/03/1993", "302121292", "martasouzapet@gmail.com", "4658237314", "Rua tesla 215 Canudos NH",  "93352012");
        Cliente cliente8 = new Cliente(8, "Neymar Junior", 'M', "04/03/1990", "302121451", "melhordomundo@gmail.com", "8475123687", "Rua hyrule 32 Canudos NH",  "9334714747");
        Cliente cliente9 = new Cliente(9, "Peter Parker da Silva", 'M', "09/02/1998", "302121189", "spidermamn@gmail.com", "74595142487", "Rua floresta 12 Canudos NH",  "9330046364");
        Cliente cliente10 = new Cliente(10, "Felipe Luis", 'M', "12/06/1999", "3021212478", "felipeluispet@gmail.com", "845713647", "Rua marechal 1023 Canudos NH",  "933000874");
        
       
        //public Encomenda(int id, String pedido, float valor, String descricao) {
        
        Encomenda tipo1 = new Encomenda(1, "Meio cento (até 2 sabores)", 45F);
        Encomenda tipo2 = new Encomenda(2, "Um cento (até 4 sabores)", 90F);
        Encomenda tipo3 = new Encomenda(3, "Um cento e meio (até 4 sabores)", 150F);
        Encomenda tipo4 = new Encomenda(4, "Dois centos (4 ou + sabores)", 200F);
        Encomenda tipo5 = new Encomenda(5, "Outros", 00F);
       
        

        Agendamento agendamento1 = new Agendamento(1, cliente1, tipo1, 45, "21/01/2023 09:30", "50 beijinhos");
        Agendamento agendamento2 = new Agendamento(2, cliente3, tipo2, 90, "25/05/2023 10:00", "50 beijinhos - 50 oreo");
        Agendamento agendamento3 = new Agendamento(3, cliente4, tipo3, 150, "14/07/2018 10:30", "150 romeu e julieta");
        
        //Adiciona Elementos na lista
        usuario.add(usuario1);
        usuario.add(usuario2);
        
        cliente.add(cliente1);
        cliente.add(cliente2);
        cliente.add(cliente3);
        cliente.add(cliente4);
        cliente.add(cliente5);
        cliente.add(cliente6);
        cliente.add(cliente7);
        cliente.add(cliente8);
        cliente.add(cliente9);
        cliente.add(cliente10);
        
        pedido.add(tipo1);
        pedido.add(tipo2);
        pedido.add(tipo3);
        pedido.add(tipo4);
        pedido.add(tipo5);
    
        
        agendamento.add(agendamento1);
        agendamento.add(agendamento2);
        agendamento.add(agendamento3);
        
    }
    
    
}
