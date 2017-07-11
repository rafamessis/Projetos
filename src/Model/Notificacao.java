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
public class Notificacao {
    private int produtoId;
    private int quantidade;
    private String descricao;
    private int qtdeMin;

    /**
     * @return the produtoId
     */
    public int getProdutoId() {
        return produtoId;
    }
    public int getQuantidade(){
        return quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdeMin() {
        return qtdeMin;
    }

    public void setQtdeMin(int qtdeMin) {
        this.qtdeMin = qtdeMin;
    }

    public void setProdutoId(int produtoId) {
        this.produtoId = produtoId;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
    
    
}
