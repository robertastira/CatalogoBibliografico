package robertastira;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import robertastira.dao.LibroDAO;
import robertastira.dao.RivistaDao;
import robertastira.entities.Libro;
import robertastira.entities.Rivista;
import robertastira.entities.TipoRivista;

public class Application {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("catalogobibliografico");
    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        LibroDAO ud = new LibroDAO(em);
        //RivistaDao rd = new RivistaDao(em);

        Libro signoredeglianelli = new Libro("Signore Degli Anelli", 1955, 1364, "John R.R. Tolkien", "Romanzo");
        //Rivista vogue = new Rivista("Vogue", 2000, 25, TipoRivista.SETTIMANALE);

         //ud.save(signoredeglianelli);
        //ud.findByIdAndDelete(152);
        // ud.findByIdAndDelete(202);
       //ud.findByIdAndDelete(252);

        //rd.save(vogue);

ud.findByYear(1920);
ud.findByTitle("Titolo");

//non capisco perché mi da null ai libri, mi blocca tutto il resto

    }
}
