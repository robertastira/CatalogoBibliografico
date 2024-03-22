package robertastira.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Libro extends ElementoBibliografico  {

    @Column
    private String autore;
    @Column
    private String genere;

    public Libro(String signoreDegliAnelli, int i, int i1, String s, String romanzo) {
        super();
    }

    public String getAutore() {
        return autore;
    }

    public String getGenere() {
        return genere;
    }
    public Libro(){}


    public Libro(long isbn, String titolo, int annoPubblicazione, long numeroPagine, String autore, String genere) {
        super(isbn, titolo, annoPubblicazione, numeroPagine);
        this.autore=autore;
        this.genere=genere;


    }

    @Override
    public String toString() {
        return "Libro{" +
                "autore='" + autore + '\'' +
                ", genere='" + genere + '\'' +
                ", isbn=" + isbn +
                ", titolo='" + titolo + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", numeroPagine=" + numeroPagine +
                '}';
    }
}