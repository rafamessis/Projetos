/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author andre
 */
public class Clientes extends Pessoa {
     private double limiteCredito;
     public Clientes(String nome,String endereco,String cpf_cnpj,String codigo,String fone,String whatsapp,String site){
            super(nome, endereco, cpf_cnpj, codigo, fone, whatsapp);
            this.limiteCredito = limiteCredito;
    }

    public Clientes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the limiteCredito
     */
    public double getLimiteCredito() {
        return limiteCredito;
    }

    /**
     * @param limiteCredito the limiteCredito to set
     */
    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    
}
