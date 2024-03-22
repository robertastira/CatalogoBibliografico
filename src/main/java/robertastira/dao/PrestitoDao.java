package robertastira.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import robertastira.entities.Prestito;
import robertastira.entities.Rivista;
import robertastira.entities.Utente;

public class PrestitoDao {
    private EntityManager em;

    public void PrestitoDao(EntityManager em) {
        this.em = em;
    }


    public Prestito findByUtente(Utente utente) {
        Prestito prestito = em.find(Prestito.class, utente); // Primo parametro è la classe dell'entity, secondo è l'id da cercare
        return prestito;
    }


}
