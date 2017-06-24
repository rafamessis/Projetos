/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author User
 */
public class Fornecedor extends Pessoa {
    private String site;
    public Fornecedor(String nome,String endereco,int cpf_cnpj,int codigo,int fone,int whatsapp,String site){
            super(nome, endereco, cpf_cnpj, codigo, fone, whatsapp);
            this.site=site;
    }

    /**
     * @return the site
     */
    public String getSite() {
        return site;
    }

    /**
     * @param site the site to set
     */
    public void setSite(String site) {
        this.site = site;
    }
}
