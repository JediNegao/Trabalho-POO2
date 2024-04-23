/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author 2022122760117
 */
public class Estadia {
    private int idEstadia;
    private Date checkin;
    private Date checkOut;
    private double valortotalSQ;
    private double valorTotalEstadia;
    private Cliente cliente;
    private Quarto quarto;

    public Estadia(int idEstadia, Date checkin, Date checkOut, double valortotalSQ, double valorTotalEstadia, Cliente cliente, Quarto quarto) {
        this.idEstadia = idEstadia;
        this.checkin = checkin;
        this.checkOut = checkOut;
        this.valortotalSQ = valortotalSQ;
        this.valorTotalEstadia = valorTotalEstadia;
        this.cliente = cliente;
        this.quarto = quarto;
    }

    public Estadia() {
    }

    public int getIdEstadia() {
        return idEstadia;
    }

    public void setIdEstadia(int idEstadia) {
        this.idEstadia = idEstadia;
    }

    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public double getValortotalSQ() {
        return valortotalSQ;
    }

    public void setValortotalSQ(double valortotalSQ) {
        this.valortotalSQ = valortotalSQ;
    }

    public double getValorTotalEstadia() {
        return valorTotalEstadia;
    }

    public void setValorTotalEstadia(double valorTotalEstadia) {
        this.valorTotalEstadia = valorTotalEstadia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }
    
    
    
}