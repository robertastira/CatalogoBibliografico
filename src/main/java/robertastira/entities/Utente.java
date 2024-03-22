package robertastira.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Utente {
    @Column
    protected String nome;
    @Column
    protected String cognome;
    @Column
    protected LocalDate dataDiNascita;
    @Id
    @Column
    @GeneratedValue
    protected long numeroTessera;
    @OneToMany(mappedBy = "utente")
    private List<Prestito> prestitoList;

    public Utente(){}

    public Utente(String nome, String cognome, LocalDate dataDiNascita, long numeroTessera) {
        this.nome = nome;
        this.cognome=cognome;
        this.dataDiNascita=dataDiNascita;
        this.numeroTessera=numeroTessera;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public LocalDate getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(LocalDate dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public long getNumeroTessera() {
        return numeroTessera;
    }

    public void setNumeroTessera(long numeroTessera) {
        this.numeroTessera = numeroTessera;
    }

    @Override
    public String toString() {
        return "Utente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", dataDiNascita=" + dataDiNascita +
                ", numeroTessera=" + numeroTessera +
                '}';
    }
}
