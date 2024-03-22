package robertastira.dao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import robertastira.entities.Libro;

public class LibroDAO {

    private final EntityManager em;

    public LibroDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Libro libro) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(libro);
        transaction.commit();
        System.out.println("Libro " + libro.getTitolo() + " salvato correttamente!");
    }

    public Libro findByIsbn(long isbn) {
        Libro libro = em.find(Libro.class, isbn); // Primo parametro è la classe dell'entity, secondo è l'id da cercare
        return libro;
    }

    public void findByIdAndDelete(long isbn) {
        Libro found = this.findByIsbn(isbn);
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.remove(found);
        transaction.commit();
        System.out.println("Libro con id " + found.getIsbn() + " eliminato correttamente!");

    }

    public Libro findByAuthor(String autore) {
        Libro libro = em.find(Libro.class, autore);
        return libro;
    }

    public Libro findByYear(int annoPubblicazione) {
        Libro libro = em.find(Libro.class, annoPubblicazione);
        return libro;
    }

    public Libro findByTitle(String titolo) {
        Libro libro = em.find(Libro.class, titolo);
        return libro;
    }

}
