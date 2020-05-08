/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.HistoriqueCommande;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author julie
 */
@Stateless
public class HistoriqueCommandeFacade extends AbstractFacade<HistoriqueCommande> {

    @PersistenceContext(unitName = "LaBoutiqueDuTerroirPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public HistoriqueCommandeFacade() {
        super(HistoriqueCommande.class);
    }
    
}
