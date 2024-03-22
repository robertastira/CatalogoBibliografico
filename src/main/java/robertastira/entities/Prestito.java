package robertastira.entities;

import jakarta.persistence.*;

import javax.swing.text.Element;
import java.time.LocalDate;

@Entity
@Table(name="prestiti")
public class Prestito {
@ManyToOne
@JoinColumn(name = "utente-id")
        protected Utente utente;
@ManyToOne
@JoinColumn(name="elementoBibliografico-id")
        protected ElementoBibliografico elementoBibliografico;
@Column
        protected LocalDate dataPrestito;
@Column
        protected LocalDate dataRestituzionePrevista;
@Column
        protected LocalDate dataRestituzioneEffettiva;

    public Prestito(Utente utente, ElementoBibliografico elementoBibliografico, LocalDate dataPrestito,LocalDate dataRestituzionePrevista, LocalDate dataRestituzioneEffettiva) {
        this.utente = utente;
        this.elementoBibliografico=elementoBibliografico;
        this.dataPrestito=dataPrestito;
        this.dataRestituzionePrevista=dataRestituzionePrevista;
        this.dataRestituzioneEffettiva=dataRestituzioneEffettiva;
    }

    @ManyToOne
    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public ElementoBibliografico getElementoBibliografico() {
        return elementoBibliografico;
    }

    public void setElementoBibliografico(ElementoBibliografico elementoBibliografico) {
        this.elementoBibliografico = elementoBibliografico;
    }

    public LocalDate getDataPrestito() {
        return dataPrestito;
    }

    public void setDataPrestito(LocalDate dataPrestito) {
        this.dataPrestito = dataPrestito;
    }

    public LocalDate getDataRestituzionePrevista() {
        return dataRestituzionePrevista;
    }

    public void setDataRestituzionePrevista(LocalDate dataRestituzionePrevista) {
        this.dataRestituzionePrevista = dataRestituzionePrevista;
    }

    public LocalDate getDataRestituzioneEffettiva() {
        return dataRestituzioneEffettiva;
    }

    public void setDataRestituzioneEffettiva(LocalDate dataRestituzioneEffettiva) {
        this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
    }

    @Override
    public String toString() {
        return "Prestito{" +
                "utente=" + utente +
                ", elementoBibliografico=" + elementoBibliografico +
                ", dataPrestito=" + dataPrestito +
                ", dataRestituzionePrevista=" + dataRestituzionePrevista +
                ", dataRestituzioneEffettiva=" + dataRestituzioneEffettiva +
                '}';
    }
}
