package Exo4;

public class Personne {
    private String nom;
    private String prenom;
    private int numCarte;
    Compte compte;

    public int getId() {
        return id;
    }

    public Personne(String nom, String prenom, int numCarte, int id,int somme) {
        this.nom = nom;
        this.prenom = prenom;
        this.numCarte = numCarte;
        this.id = id;
        compte= new Compte(id,somme);
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;

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

    public int getNumCarte() {
        return numCarte;
    }

    public void setNumCarte(int numCarte) {
        this.numCarte = numCarte;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    void deposer(int somme)
    {
      compte.setSomme( compte.getSomme() + somme);
    }
    void retirer(int somme)
    {
        compte.setSomme(compte.getSomme() - somme);
    }
    void consulter()
    {
        System.out.println("la somme " + compte.getSomme());
    }

}
