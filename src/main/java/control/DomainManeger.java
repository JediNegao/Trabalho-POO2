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

    public int inserirCliente(String nome, String telefone, String email, String cpf) {
        Cliente cli = new Cliente(nome, telefone, email, cpf);
        genDao.inserir(cli);
        return cli.getIdCliente();

    }

    public int inserirQuarto(int numQuarto, String tipoQuarto, String cama, double valorDiaria) {
        Quarto qt = new Quarto(numQuarto, tipoQuarto, cama, valorDiaria);
        genDao.inserir(qt);
        return qt.getNumQuarto();

    }

    public void alterarQuarto(int numQuarto, String tipoQuarto, String cama, double valorDiaria) {
        Quarto qt = new Quarto(numQuarto, tipoQuarto, cama, valorDiaria);
        genDao.alterar(qt);
    }

    public void alterarCliente(int idCliente, String nome, String telefone, String email, String cpf) throws ClassNotFoundException, SQLException {

        Cliente cli = new Cliente(idCliente, nome, telefone, email, cpf);
        genDao.alterar(cli);
    }

    public void excluir(Object cli) throws SQLException, ClassNotFoundException {
        genDao.excluir(cli);
    }
}
