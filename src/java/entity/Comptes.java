/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author julie
 */
@Entity
@Table(name = "comptes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Comptes.findAll", query = "SELECT c FROM Comptes c")
    , @NamedQuery(name = "Comptes.findByIdCompte", query = "SELECT c FROM Comptes c WHERE c.idCompte = :idCompte")
    , @NamedQuery(name = "Comptes.findByNom", query = "SELECT c FROM Comptes c WHERE c.nom = :nom")
    , @NamedQuery(name = "Comptes.findByPrenom", query = "SELECT c FROM Comptes c WHERE c.prenom = :prenom")
    , @NamedQuery(name = "Comptes.findByMail", query = "SELECT c FROM Comptes c WHERE c.mail = :mail")
    , @NamedQuery(name = "Comptes.findByMdp", query = "SELECT c FROM Comptes c WHERE c.mdp = :mdp")
    , @NamedQuery(name = "Comptes.findByProfilePicture", query = "SELECT c FROM Comptes c WHERE c.profilePicture = :profilePicture")
    , @NamedQuery(name = "Comptes.findByAdresse", query = "SELECT c FROM Comptes c WHERE c.adresse = :adresse")})
public class Comptes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Compte")
    private Integer idCompte;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Nom")
    private String nom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Prenom")
    private String prenom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Mail")
    private String mail;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Mdp")
    private String mdp;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "Presentation")
    private String presentation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Profile_Picture")
    private String profilePicture;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Adresse")
    private String adresse;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "comptes")
    private Collection<HistoriqueCommande> historiqueCommandeCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "comptes")
    private Collection<Note> noteCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCompte")
    private Collection<Avis> avisCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCompte")
    private Collection<Produit> produitCollection;

    public Comptes() {
    }

    public Comptes(Integer idCompte) {
        this.idCompte = idCompte;
    }

    public Comptes(Integer idCompte, String nom, String prenom, String mail, String mdp, String presentation, String profilePicture, String adresse) {
        this.idCompte = idCompte;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.mdp = mdp;
        this.presentation = presentation;
        this.profilePicture = profilePicture;
        this.adresse = adresse;
    }

    public Integer getIdCompte() {
        return idCompte;
    }

    public void setIdCompte(Integer idCompte) {
        this.idCompte = idCompte;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @XmlTransient
    public Collection<HistoriqueCommande> getHistoriqueCommandeCollection() {
        return historiqueCommandeCollection;
    }

    public void setHistoriqueCommandeCollection(Collection<HistoriqueCommande> historiqueCommandeCollection) {
        this.historiqueCommandeCollection = historiqueCommandeCollection;
    }

    @XmlTransient
    public Collection<Note> getNoteCollection() {
        return noteCollection;
    }

    public void setNoteCollection(Collection<Note> noteCollection) {
        this.noteCollection = noteCollection;
    }

    @XmlTransient
    public Collection<Avis> getAvisCollection() {
        return avisCollection;
    }

    public void setAvisCollection(Collection<Avis> avisCollection) {
        this.avisCollection = avisCollection;
    }

    @XmlTransient
    public Collection<Produit> getProduitCollection() {
        return produitCollection;
    }

    public void setProduitCollection(Collection<Produit> produitCollection) {
        this.produitCollection = produitCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCompte != null ? idCompte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Comptes)) {
            return false;
        }
        Comptes other = (Comptes) object;
        if ((this.idCompte == null && other.idCompte != null) || (this.idCompte != null && !this.idCompte.equals(other.idCompte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Comptes[ idCompte=" + idCompte + " ]";
    }
    
}
