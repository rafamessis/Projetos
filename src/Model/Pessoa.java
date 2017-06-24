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
public class Pessoa {
    protected String nome,endereco;
    protected int cpf_cnpj,codigo,fone,whatsapp;
    Pessoa(String nome,String endereco,int cpf_cnpj,int codigo,int fone,int whatsapp){
        this.nome=nome;
        this.endereco=endereco;
        this.cpf_cnpj=cpf_cnpj;
        this.codigo=codigo;
        this.fone=fone;
        this.whatsapp=whatsapp;
    }
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the cpf_cnpj
     */
    public int getCpf_cnpj() {
        return cpf_cnpj;
    }

    /**
     * @param cpf_cnpj the cpf_cnpj to set
     */
    public void setCpf_cnpj(int cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the fone
     */
    public int getFone() {
        return fone;
    }

    /**
     * @param fone the fone to set
     */
    public void setFone(int fone) {
        this.fone = fone;
    }

    /**
     * @return the whatsapp
     */
    public int getWhatsapp() {
        return whatsapp;
    }

    /**
     * @param whatsapp the whatsapp to set
     */
    public void setWhatsapp(int whatsapp) {
        this.whatsapp = whatsapp;
    }
    
}
