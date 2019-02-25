package Exo3;

public class Enseignant extends Personne {
    String departement,specialite;
    Matiere[] matieres = new Matiere[3];
    int index = 0;

    public Enseignant(String nom, String prenom, String cin,String departement, String speStirng) {
        super(nom, prenom, cin);
        this.departement = departement;
        this.specialite = speStirng;
    }

    public void ajouterMatiere(){
        try {
            matieres[index] = new Matiere("matiere" + (index + 1), 5);
            System.out.println("matiere ajoute pour enseignant");
        }catch (Exception e){
            e.printStackTrace();
        }
        index++;
    }
}
