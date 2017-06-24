/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Hudson
 */
public class Vendas {
    private int idVenda;
    private String dataVenda;
    private int idCliente;
    private double valorTotal;
    private int idTipoVenda;
    private int idFormaPagto;

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getIdTipoVenda() {
        return idTipoVenda;
    }

    public void setIdTipoVenda(int idTipoVenda) {
        this.idTipoVenda = idTipoVenda;
    }

    public int getIdFormaPagto() {
        return idFormaPagto;
    }

    public void setIdFormaPagto(int idFormaPagto) {
        this.idFormaPagto = idFormaPagto;
    }
    
    
}
