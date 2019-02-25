package Exo4;

public class Main {
    public static void main(String[] args) {
        Banque b1 = new Banque("example of a banque","mybanque");
        b1.CreeCompte(12,5000);
        b1.consulter(0);
        b1.deposer(0,600);
        b1.consulter(0);
        b1.retitrer(0,60);
        b1.consulter(0);

    }
}
