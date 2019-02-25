package Exo2;

public class VoitureDerive extends Vehicule{
        private int nbrPorte;
    public VoitureDerive(boolean moteur, int vitesseMax, int nbrPorte) {
        super(moteur, vitesseMax);
        this.nbrPorte = nbrPorte;
    }

    @Override
    public String toString() {
        return "VoitureDerive: nbrPorte=" + nbrPorte + " moteur: "+super.toString();
    }
}
