package robertastira.entities;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name= "elemento-bibliografico")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
abstract public class ElementoBibliografico { @Id
@Column
@GeneratedValue
protected long isbn;
    @Column
    protected String titolo;
    @Column
    protected int annoPubblicazione;
    @Column
    protected long numeroPagine;
    @OneToMany(mappedBy = "isbn")
    private List<ElementoBibliografico> elementoBibliograficoList;

    public ElementoBibliografico(long isbn, String titolo, int annoPubblicazione, long numeroPagine) {
        this.isbn = isbn;
        this.titolo=titolo;
        this.annoPubblicazione=annoPubblicazione;
        this.numeroPagine=numeroPagine;
    }

    public ElementoBibliografico(){}


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
