/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.ConexaoHibernate;
import dao.GenericDao;
import java.sql.SQLException;
import java.util.List;
import model.Cliente;


public class DomainManeger {
    private GenericDao genDao;
    
   public DomainManeger() throws ClassNotFoundException, SQLException {
        
        ConexaoHibernate.getSessionFactory().openSession();
        //swxo
        
   }
   
   public List<Cliente> ListarCliente(){
       return genDao.listar(Cliente.class);   }

  
}
