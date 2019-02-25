package Exo3;

public class Matiere {
    String intitule;
    int vh;

    public Matiere(String intitule, int vh) {
        this.intitule = intitule;
        this.vh = vh;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public int getVh() {
        return vh;
    }

    public void setVh(int vh) {
        this.vh = vh;
    }
}
