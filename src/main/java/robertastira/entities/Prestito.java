package robertastira.entities;

import javax.swing.text.Element;
import java.time.LocalDate;

public class Prestito {
        protected Utente utente;
        protected ElementoBibliografico elementoBibliografico;
        protected LocalDate dataPrestito;
        protected LocalDate dataRestituzionePrevista;
        protected LocalDate dataRestituzioneEffettiva;

    public Prestito(Utente utente, ElementoBibliografico elementoBibliografico, LocalDate dataPrestito,LocalDate dataRestituzionePrevista, LocalDate dataRestituzioneEffettiva) {
        this.utente = utente;
        this.elementoBibliografico=elementoBibliografico;
        this.dataPrestito=dataPrestito;
        this.dataRestituzionePrevista=dataRestituzionePrevista;
        this.dataRestituzioneEffettiva=dataRestituzioneEffettiva;
    }

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
