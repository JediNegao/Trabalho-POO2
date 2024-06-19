/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.ConexaoHibernate;
import dao.GenericDao;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import model.Cliente;
import model.Estadia;
import model.Item;
import model.ItemPedido;
import model.PedidoSQ;
import model.Quarto;

public class DomainManeger {

    private GenericDao genDao;

    public DomainManeger() throws ClassNotFoundException, SQLException {
        genDao = new GenericDao();

        ConexaoHibernate.getSessionFactory().openSession();
        //swxo

    }

    public List<Cliente> ListarCliente() {
        return genDao.listar(Cliente.class);
    }

    public List<Quarto> ListarQuarto() {
        return genDao.listar(Quarto.class);
    }
       public List<Estadia> ListarEstadia() {
        return genDao.listar(Estadia.class);
    }
     public List<ItemPedido> ListarPedido() {
        return genDao.listar(ItemPedido.class);
    }

    public int inserirCliente(String nome, String telefone, String email, String cpf) {
        Cliente cli = new Cliente(nome, telefone, email, cpf);
        genDao.inserir(cli);
        return cli.getIdCliente();

    }
    public void alterarCliente(int idCliente, String nome, String telefone, String email, String cpf) throws ClassNotFoundException, SQLException {

        Cliente cli = new Cliente(idCliente, nome, telefone, email, cpf);
        genDao.alterar(cli);
    }

    public void inserirQuarto(int numQuarto, String tipoQuarto, String cama, double valorDiaria) {
        Quarto qt = new Quarto(numQuarto, tipoQuarto, cama, valorDiaria);
        genDao.inserir(qt);
       

    }

    public void alterarQuarto(int numQuarto, String tipoQuarto, String cama, double valorDiaria) {
        Quarto qt = new Quarto(numQuarto, tipoQuarto, cama, valorDiaria);
        genDao.alterar(qt);
    }
    
    
    
    public int inserirEstadia (Cliente cli, Quarto qt, Date checkin, Date checkout){
        Estadia es = new Estadia(checkin, checkout, 0, 0, cli, qt);
        
        genDao.inserir(es);
       
        return es.getIdEstadia();
    }
     public void alterarEstadia(int idEstadia,Cliente cli, Quarto qt, Date checkin, Date checkout) {
       Estadia es = new Estadia(idEstadia,checkin, checkout, 0, 0, cli, qt);
        genDao.alterar(es);
    }
    public int inserirItemPedido( int qtdHamb, int qtdXburguer, int qtdOreo, int qtdRuffles, int qtdCoca, int qtdPepsi, int qtdDelValle, int qtdChampanhe, String extras, PedidoSQ pedidosq, Item item) {
        ItemPedido qt = new ItemPedido(qtdHamb,qtdXburguer,qtdOreo,qtdRuffles,qtdCoca,qtdPepsi,qtdDelValle,qtdChampanhe,extras,pedidosq,item);
        genDao.inserir(qt);
       return qt.getIdItemPedido();

    }

    // buscas 
    public Cliente buscarClientePorId(int idCliente) {
    return (Cliente) genDao.buscarPorId(Cliente.class, idCliente);
}
    public Quarto buscarQuartoPorId(int numQuarto) {
    return (Quarto) genDao.buscarPorId(Quarto.class,numQuarto );
}

    public void excluir(Object cli) throws SQLException, ClassNotFoundException {
        genDao.excluir(cli);
    }
}
