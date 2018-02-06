package Exo3;

import java.util.ArrayList;

public class Etudiant extends Personne{

    String num,specialite;
    ArrayList<Matiere> matieres = new ArrayList<>();

    public Etudiant(String nom, String prenom, String cin, String num, String specialite) {
        super(nom, prenom, cin);
        this.num = num;
        this.specialite = specialite;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public void ajouterMatiere(Matiere m){
        matieres.add(m);
        System.out.println("Matiere ajouté pour: "+getNum());
    }
}
