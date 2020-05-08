/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author julie
 */
@Embeddable
public class HistoriqueCommandePK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "Id_Produit")
    private int idProduit;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id_Compte")
    private int idCompte;

    public HistoriqueCommandePK() {
    }

    public HistoriqueCommandePK(int idProduit, int idCompte) {
        this.idProduit = idProduit;
        this.idCompte = idCompte;
    }

    public int getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }

    public int getIdCompte() {
        return idCompte;
    }

    public void setIdCompte(int idCompte) {
        this.idCompte = idCompte;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idProduit;
        hash += (int) idCompte;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistoriqueCommandePK)) {
            return false;
        }
        HistoriqueCommandePK other = (HistoriqueCommandePK) object;
        if (this.idProduit != other.idProduit) {
            return false;
        }
        if (this.idCompte != other.idCompte) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.HistoriqueCommandePK[ idProduit=" + idProduit + ", idCompte=" + idCompte + " ]";
    }
    
}
