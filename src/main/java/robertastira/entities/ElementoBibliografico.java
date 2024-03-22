package robertastira.entities;


import jakarta.persistence.*;

@Entity
@Table(name= "elemento-bibliografico")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
abstract public class ElementoBibliografico {
    @Id
    @Column
    @GeneratedValue
    @OneToMany(mappedBy = "elementoBibliografico-id")
    protected long isbn;
    @Column
    protected String titolo;
    @Column
    protected int annoPubblicazione;
    @Column
    protected long numeroPagine;

    public ElementoBibliografico(long isbn, String titolo, int annoPubblicazione, long numeroPagine) {
        this.isbn = isbn;
        this.titolo=titolo;
        this.annoPubblicazione=annoPubblicazione;
        this.numeroPagine=numeroPagine;
    }


    @Override
    public String toString() {
        return "ElementoBibliografico{" +
                "isbn=" + isbn +
                ", titolo='" + titolo + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", numeroPagine=" + numeroPagine +
                '}';
    }

    public long getIsbn() {
        return isbn;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public long getNumeroPagine() {
        return numeroPagine;
    }
}
