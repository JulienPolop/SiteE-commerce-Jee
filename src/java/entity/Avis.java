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
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author julie
 */
@Entity
@Table(name = "avis")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Avis.findAll", query = "SELECT a FROM Avis a")
    , @NamedQuery(name = "Avis.findByIdAvis", query = "SELECT a FROM Avis a WHERE a.idAvis = :idAvis")
    , @NamedQuery(name = "Avis.findByDate", query = "SELECT a FROM Avis a WHERE a.date = :date")})
public class Avis implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Avis")
    private Integer idAvis;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "Texte")
    private String texte;
    @JoinColumn(name = "Id_Compte", referencedColumnName = "Id_Compte")
    @ManyToOne(optional = false)
    private Comptes idCompte;
    @JoinColumn(name = "Id_Produit", referencedColumnName = "Id_Produit")
    @ManyToOne(optional = false)
    private Produit idProduit;

    public Avis() {
    }

    public Avis(Integer idAvis) {
        this.idAvis = idAvis;
    }

    public Avis(Integer idAvis, Date date, String texte) {
        this.idAvis = idAvis;
        this.date = date;
        this.texte = texte;
    }

    public Integer getIdAvis() {
        return idAvis;
    }

    public void setIdAvis(Integer idAvis) {
        this.idAvis = idAvis;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public Comptes getIdCompte() {
        return idCompte;
    }

    public void setIdCompte(Comptes idCompte) {
        this.idCompte = idCompte;
    }

    public Produit getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(Produit idProduit) {
        this.idProduit = idProduit;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAvis != null ? idAvis.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Avis)) {
            return false;
        }
        Avis other = (Avis) object;
        if ((this.idAvis == null && other.idAvis != null) || (this.idAvis != null && !this.idAvis.equals(other.idAvis))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Avis[ idAvis=" + idAvis + " ]";
    }
    
}
