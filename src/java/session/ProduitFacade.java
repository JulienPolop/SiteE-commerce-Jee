/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.Produit;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author julie
 */
@Stateless
public class ProduitFacade extends AbstractFacade<Produit> {

    @PersistenceContext(unitName = "LaBoutiqueDuTerroirPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProduitFacade() {
        super(Produit.class);
    }
    
    public List<Produit> getMostRecents(){
        Query q = em.createNativeQuery("SELECT * FROM Produit ORDER BY Date DESC LIMIT 10", Produit.class);
        List<Produit> results = q.getResultList();
        return results;
    }
    
    public List<Produit> getMostFamous(){
        Query q = em.createNativeQuery("SELECT * FROM Produit ORDER BY Nombre_Vendu DESC LIMIT 10", Produit.class);
        List<Produit> results = q.getResultList();
        return results;
    }
    
}
