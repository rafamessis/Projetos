/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Karina
 */
public class Estoque {
    
    private int produtoId;
    private int quantidade;
    private String ldescricao;
    private int qtdemin;

    public String getLdescricao() {
        return ldescricao;
    }

    public void setLdescricao(String ldescricao) {
        this.ldescricao = ldescricao;
    }

    public int getQtdemin() {
        return qtdemin;
    }

    public void setQtdemin(int qtdemin) {
        this.qtdemin = qtdemin;
    }
    

    public int getProdutoId() {
        return produtoId;
    }

    /**
     * @param produtoId the produtoId to set
     */
    public void setProdutoId(int produtoId) {
        this.produtoId = produtoId;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
