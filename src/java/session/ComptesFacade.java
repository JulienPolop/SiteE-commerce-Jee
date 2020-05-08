/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.Comptes;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import javax.ejb.Stateless;
import javax.faces.validator.Validator;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;

/**
 *
 * @author julie
 */
@Stateless
public class ComptesFacade extends AbstractFacade<Comptes> {

    @PersistenceContext(unitName = "LaBoutiqueDuTerroirPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ComptesFacade() {
        super(Comptes.class);
    }
    
    public List<Comptes> findByMail(String email)
    {
        List<Comptes> results = em.createNamedQuery("Comptes.findByMail").setParameter("mail", email).getResultList();
        return results;
    }
    
    public void createAccount(String name,String firstName, String Email, String mdp, String adress){
        
        Query q = em.createNativeQuery("INSERT INTO `la_boutique_du_terroir`.`comptes` (`Nom`, `Prenom`, `Mail`, `Mdp`, `Presentation`, `Profile_Picture`, `Adresse`) VALUES (`?Nom`, `?Prenom`, `?Mail`, `?Mdp`, `?Presentation`, `?Profile_Picture`, `?Adresse`)");
        q.setParameter("Nom", name);
        q.setParameter("Prenom", firstName);
        q.setParameter("Mail", Email);
        q.setParameter("Mdp", mdp);
        q.setParameter("Presentation", "");
        q.setParameter("Profile_Picture", "Jfab.png");
        q.setParameter("Adresse", adress);
        q.executeUpdate();
        


    }
    
}
