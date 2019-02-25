package Exo2;

public class Vehicule {
    private boolean moteur;
    private int vitesseMax;

    public Vehicule(boolean moteur, int vitesseMax) {
        this.moteur = moteur;
        this.vitesseMax = vitesseMax;
    }

    @Override
    public String toString() {
        return "Vehicule a" +
                "moteur=" + moteur +
                ", vitesseMax=" + vitesseMax;
    }
    public void vMax(){
        System.out.println(vitesseMax);
    }
}
