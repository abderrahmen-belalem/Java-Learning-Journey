package Exo2;

public class Main {
    public static void main(String[] args) {
        VoitureCompose v = new VoitureCompose(4,new Vehicule(true,50));
        System.out.println(v.getCar().toString());
    }
}
