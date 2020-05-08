/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author julie
 */
@Entity
@Table(name = "historique_commande")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HistoriqueCommande.findAll", query = "SELECT h FROM HistoriqueCommande h")
    , @NamedQuery(name = "HistoriqueCommande.findByIdProduit", query = "SELECT h FROM HistoriqueCommande h WHERE h.historiqueCommandePK.idProduit = :idProduit")
    , @NamedQuery(name = "HistoriqueCommande.findByIdCompte", query = "SELECT h FROM HistoriqueCommande h WHERE h.historiqueCommandePK.idCompte = :idCompte")
    , @NamedQuery(name = "HistoriqueCommande.findByDate", query = "SELECT h FROM HistoriqueCommande h WHERE h.date = :date")})
public class HistoriqueCommande implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HistoriqueCommandePK historiqueCommandePK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @JoinColumn(name = "Id_Compte", referencedColumnName = "Id_Compte", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Comptes comptes;
    @JoinColumn(name = "Id_Produit", referencedColumnName = "Id_Produit", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Produit produit;

    public HistoriqueCommande() {
    }

    public HistoriqueCommande(HistoriqueCommandePK historiqueCommandePK) {
        this.historiqueCommandePK = historiqueCommandePK;
    }

    public HistoriqueCommande(HistoriqueCommandePK historiqueCommandePK, Date date) {
        this.historiqueCommandePK = historiqueCommandePK;
        this.date = date;
    }

    public HistoriqueCommande(int idProduit, int idCompte) {
        this.historiqueCommandePK = new HistoriqueCommandePK(idProduit, idCompte);
    }

    public HistoriqueCommandePK getHistoriqueCommandePK() {
        return historiqueCommandePK;
    }

    public void setHistoriqueCommandePK(HistoriqueCommandePK historiqueCommandePK) {
        this.historiqueCommandePK = historiqueCommandePK;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Comptes getComptes() {
        return comptes;
    }

    public void setComptes(Comptes comptes) {
        this.comptes = comptes;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (historiqueCommandePK != null ? historiqueCommandePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistoriqueCommande)) {
            return false;
        }
        HistoriqueCommande other = (HistoriqueCommande) object;
        if ((this.historiqueCommandePK == null && other.historiqueCommandePK != null) || (this.historiqueCommandePK != null && !this.historiqueCommandePK.equals(other.historiqueCommandePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.HistoriqueCommande[ historiqueCommandePK=" + historiqueCommandePK + " ]";
    }
    
}
