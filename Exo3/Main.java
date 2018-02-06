package Exo3;

public class Main {
    public static void main(String[] args) {
        Etudiant moh = new Etudiant("amine","mino","5","15","blah");
        Enseignant mah = new Enseignant("la","yr","55","15","blah");
        for (int i = 0; i < 4; i++) {
            moh.ajouterMatiere(new Matiere( "nbf",10));
            mah.ajouterMatiere();
        }
    }
}
