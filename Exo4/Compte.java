package Exo4;

public class Compte {
    private int id;
    private int somme;

    public Compte(int id,int somme)
    {
        this.id = id;
        this.somme = somme;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSomme() {
        return somme;
    }

    public void setSomme(int somme) {
        this.somme = somme;
    }
}
