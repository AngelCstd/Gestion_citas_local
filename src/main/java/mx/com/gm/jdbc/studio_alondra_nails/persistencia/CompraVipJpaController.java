/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.jdbc.studio_alondra_nails.persistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import mx.com.gm.jdbc.studio_alondra_nails.logica.CompraVip;
import mx.com.gm.jdbc.studio_alondra_nails.persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author Angel Castañeda
 */
public class CompraVipJpaController implements Serializable {

    public CompraVipJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public CompraVipJpaController() {
    emf = Persistence.createEntityManagerFactory("STUDIO_ALONDRA_NAILS_PU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(CompraVip compraVip) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(compraVip);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(CompraVip compraVip) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            compraVip = em.merge(compraVip);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = compraVip.getId();
                if (findCompraVip(id) == null) {
                    throw new NonexistentEntityException("The compraVip with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            CompraVip compraVip;
            try {
                compraVip = em.getReference(CompraVip.class, id);
                compraVip.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The compraVip with id " + id + " no longer exists.", enfe);
            }
            em.remove(compraVip);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<CompraVip> findCompraVipEntities() {
        return findCompraVipEntities(true, -1, -1);
    }

    public List<CompraVip> findCompraVipEntities(int maxResults, int firstResult) {
        return findCompraVipEntities(false, maxResults, firstResult);
    }

    private List<CompraVip> findCompraVipEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(CompraVip.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public CompraVip findCompraVip(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(CompraVip.class, id);
        } finally {
            em.close();
        }
    }

    public int getCompraVipCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<CompraVip> rt = cq.from(CompraVip.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
