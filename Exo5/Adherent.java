package Exo5;

import java.util.ArrayList;
import java.util.Date;

public class Adherent {
    private int numero;
    private String nom;
    private String prenom;
    private String anner;
    private String address;
    private String tel;
    ArrayList<Emprenter> livresEmprenter = new ArrayList<>();
    ArrayList<Retourner> livresRtourner = new ArrayList<>();
    ArrayList<Integer> listRetardater = new ArrayList<>();

    public Adherent(int numero, String nom, String prenom, String anner, String address, String tel) {
        this.numero = numero;
        this.nom = nom;
        this.prenom = prenom;
        this.anner = anner;
        this.address = address;
        this.tel = tel;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAnner() {
        return anner;
    }

    public void setAnner(String anner) {
        this.anner = anner;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    void emprenter(int idAdherent, Livre livre, long dateDebut, long dateFin) {

        if(!livre.isEtat())
        {
            livresEmprenter.add(new Emprenter(idAdherent, livre, dateDebut, dateFin));
            livre.setEtat(true);
            System.out.println("Livre Emprenter !");
        }
        else{
            System.out.println("Livre deja emprenter");
        }


    }

    void retourner(int adherent, Livre livre, long date) {

        livresRtourner.add(new Retourner(adherent, livre, date));
        livre.setEtat(false);
    }

     boolean testIfRetard(long datenow) {
        for (int i = 0; i < livresEmprenter.size(); i++) {
            long s = livresEmprenter.get(i).getDateFin() - datenow;
            if (s < 0) {
                listRetardater.add(livresEmprenter.get(i).getAdherent());
                return false;
            }
        }
        return true;
    }


}
