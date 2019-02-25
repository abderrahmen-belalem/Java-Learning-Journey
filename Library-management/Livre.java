package Exo5;

import java.util.ArrayList;

public class Livre {
 private int numro;
 private String tite;
 private String auteur;
 private boolean etat;


    public Livre(int numro, String tite, String auteur, boolean etat) {
        this.numro = numro;
        this.tite = tite;
        this.auteur = auteur;
        this.etat = etat;
    }

    public int getNumro() {
        return numro;
    }

    public void setNumro(int numro) {
        this.numro = numro;
    }

    public String getTite() {
        return tite;
    }

    public void setTite(String tite) {
        this.tite = tite;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }
}
