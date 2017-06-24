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
public class Categorias {
    private int idCategoria;
    private String nomeCat;
    private String setorCat;

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
     * @return the nomeCat
     */
    public String getNomeCat() {
        return nomeCat;
    }

    /**
     * @param nomeCat the nomeCat to set
     */
    public void setNomeCat(String nomeCat) {
        this.nomeCat = nomeCat;
    }

    /**
     * @return the setorCat
     */
    public String getSetorCat() {
        return setorCat;
    }

    /**
     * @param setorCat the setorCat to set
     */
    public void setSetorCat(String setorCat) {
        this.setorCat = setorCat;
    }

    @Override
    public String toString() {
        return getNomeCat(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

