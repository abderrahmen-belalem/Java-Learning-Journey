package Exo4;

import java.util.ArrayList;
import java.util.Scanner;

public class Banque {
    private String address;
    private String nom;
    ArrayList<Compte> comptes= new ArrayList<>();
    ArrayList<Personne> personnes= new ArrayList<>();

    public Banque(String address, String nom) {
        this.address = address;
        this.nom = nom;
    }



    void supprimerCompte(int index)
    {
            comptes.remove(index);
    }
    void CreeCompte(int id,int somme)
    {
        if(comptes.size() < 1000)
        {

            Scanner sc = new Scanner(System.in);

            System.out.println("entrer nom");
            String nom  = sc.nextLine();
            System.out.println("entrer prenom ");
            String prenom = sc.nextLine();
            System.out.println("entrer numero carte");
            int numCarte = sc.nextInt();



           Compte c = new Compte(id,somme);
           personnes.add(new Personne(nom,prenom,numCarte,id,somme));
           comptes.add(c);
        }
        else{
            System.out.println("no more then 1000");
        }
    }
    void deposer(int index ,int somme)
    {
     comptes.get(index).setSomme(comptes.get(index).getSomme() + somme);
    }
    void retitrer(int index,int somme)
    {
        comptes.get(index).setSomme(comptes.get(index).getSomme() - somme);
    }
    void  consulter(int index)
    {

        System.out.println(comptes.get(index).getSomme());
    }
}
