package robertastira;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import robertastira.dao.LibroDAO;
import robertastira.entities.Libro;

public class Application {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("catalogobibliografico");
    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        LibroDAO ud = new LibroDAO(em);

        Libro signoredeglianelli = new Libro("Signore Degli Anelli", 1955, 1364, "John R.R. Tolkien", "Romanzo");

     //ud.save(signoredeglianelli);

        //ud.findByIdAndDelete(152);
        //ud.findByIdAndDelete(202);
       //ud.findByIdAndDelete(252);

ud.findByYear(1920);
ud.findByTitle("Titolo");


    }
}
