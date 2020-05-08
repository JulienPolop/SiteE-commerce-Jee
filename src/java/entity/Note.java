/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author julie
 */
@Entity
@Table(name = "note")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Note.findAll", query = "SELECT n FROM Note n")
    , @NamedQuery(name = "Note.findByIdProduit", query = "SELECT n FROM Note n WHERE n.notePK.idProduit = :idProduit")
    , @NamedQuery(name = "Note.findByIdCompte", query = "SELECT n FROM Note n WHERE n.notePK.idCompte = :idCompte")
    , @NamedQuery(name = "Note.findByValeur", query = "SELECT n FROM Note n WHERE n.valeur = :valeur")})
public class Note implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected NotePK notePK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Valeur")
    private int valeur;
    @JoinColumn(name = "Id_Compte", referencedColumnName = "Id_Compte", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Comptes comptes;
    @JoinColumn(name = "Id_Produit", referencedColumnName = "Id_Produit", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Produit produit;

    public Note() {
    }

    public Note(NotePK notePK) {
        this.notePK = notePK;
    }

    public Note(NotePK notePK, int valeur) {
        this.notePK = notePK;
        this.valeur = valeur;
    }

    public Note(int idProduit, int idCompte) {
        this.notePK = new NotePK(idProduit, idCompte);
    }

    public NotePK getNotePK() {
        return notePK;
    }

    public void setNotePK(NotePK notePK) {
        this.notePK = notePK;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
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
        hash += (notePK != null ? notePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Note)) {
            return false;
        }
        Note other = (Note) object;
        if ((this.notePK == null && other.notePK != null) || (this.notePK != null && !this.notePK.equals(other.notePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Note[ notePK=" + notePK + " ]";
    }
    
}
