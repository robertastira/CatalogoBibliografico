package robertastira.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.NoResultException;
import robertastira.entities.Rivista;

public class RivistaDao {
    private EntityManager em;


    public void RivistaDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Rivista rivista) {

        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(rivista);
        transaction.commit();
        System.out.println("Libro " + rivista.getTitolo() + " salvato correttamente!");
    }

    public Rivista findByIsbn(long isbn) {
        Rivista rivista = em.find(Rivista.class, isbn); // Primo parametro è la classe dell'entity, secondo è l'id da cercare
        return rivista;
    }

    public void findByIdAndDelete(long isbn) {
        Rivista found = this.findByIsbn(isbn);
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.remove(found);
        transaction.commit();
        System.out.println("Rivista con id " + found.getIsbn() + " eliminata correttamente!");

    }

    public Rivista findByYear(int annoPubblicazione) {
        Rivista rivista = em.find(Rivista.class, annoPubblicazione);
        return rivista;
    }

    public Rivista findByTitle(String titolo) {
        try {
            return em.createQuery("SELECT r FROM Rivista r WHERE r.titolo = :titolo", Rivista.class)
                    .setParameter("titolo", titolo)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
}

