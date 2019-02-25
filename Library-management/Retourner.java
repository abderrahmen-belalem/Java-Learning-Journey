package Exo5;

public class Retourner {
    private int adherent;
    private Livre livre;
    private long dateDebut;

    public Retourner(int adherent, Livre livre, long dateDebut) {
        this.adherent = adherent;
        this.livre = livre;
        this.dateDebut = dateDebut;
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

}
