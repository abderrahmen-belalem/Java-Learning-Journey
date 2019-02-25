package Exo2;

public class VoitureCompose {
    private int nbrPorte;
    private Vehicule car;

    public VoitureCompose(int nbrPorte, Vehicule car) {
        this.nbrPorte = nbrPorte;
        this.car = car;
    }

    public int getNbrPorte() {
        return nbrPorte;
    }

    public void setNbrPorte(int nbrPorte) {
        this.nbrPorte = nbrPorte;
    }

    public Vehicule getCar() {
        return car;
    }

    public void setCar(Vehicule car) {
        this.car = car;
    }
}
