/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Rafael
 */
public class Produto {

    public static void add(Produto produto) {
         
    }
    private int idProduto;
    private int codSKU;
    private int idCategoria;
    private int idFornecedor;
    private String nomeProd;
    private float precoCompra;
    private int qtdmin;

    /**
     * @return the idProduto
     */
    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }
    
    public int getQtdmin() {
        return qtdmin;
    }

    public void setQtdin(int qtdmin) {
        this.qtdmin = qtdmin;
    }
    
    public int getCodSKU() {
        return codSKU;
    }

    /**
     * @param codSKU the codSKU to set
     */
    public void setCodSKU(int codSKU) {
        this.codSKU = codSKU;
    }

    /**
     * @return the idCategoria
     */
    public int getIdCategoria() {
        return idCategoria;
    }

    /**
     * @param idCategoria the idCategoria to set
     */
    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    /**
     * @return the idFornecedor
     */
    public int getIdFornecedor() {
        return idFornecedor;
    }

    /**
     * @param idFornecedor the idFornecedor to set
     */
    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    /**
     * @return the nomeProd
     */
    public String getNomeProd() {
        return nomeProd;
    }

    /**
     * @param nomeProd the nomeProd to set
     */
    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    /**
     * @return the precoCompra
     */
    public float getPrecoCompra() {
        return precoCompra;
    }

    /**
     * @param precoCompra the precoCompra to set
     */
    public void setPrecoCompra(float precoCompra) {
        this.precoCompra = precoCompra;
    }

    @Override
    public String toString() {
        return getNomeProd() ; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

