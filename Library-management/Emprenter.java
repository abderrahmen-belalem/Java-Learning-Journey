package Exo5;

import java.util.Date;

public class Emprenter {
    private int adherent;
    private Livre livre;
    private long dateDebut;
    private long dateFin;

    public Emprenter(int adherent, Livre livre, long dateDebut, long dateFin) {
        this.adherent = adherent;
        this.livre = livre;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    public int getAdherent() {
        return adherent;
    }

    public void setAdherent(int adherent) {
        this.adherent = adherent;
    }

    public Livre getLivre() {
        return livre;
    }

    public void setLivre(Livre livre) {
        this.livre = livre;
    }

    public long getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(long dateDebut) {
        this.dateDebut = dateDebut;
    }

    public long getDateFin() {
        return dateFin;
    }

    public void setDateFin(long dateFin) {
        this.dateFin = dateFin;
    }
}
