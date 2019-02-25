package Exo5;



import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Livre l1 = new Livre(125,"how to how","ana",false);
        Livre l2 = new Livre(1265,"how to nothing","ana howa",false);
        //  l1.addMotCles("how,to,how");
        //  l2.addMotCles("how,to,nothing");
        ArrayList<Adherent> listAdherent= new ArrayList<>();

        Adherent ad1 = new Adherent(12,"amine","amine","12/04/16","fi darna","0333");
        Adherent ad2 = new Adherent(15,"amine","amine","12/04/16","fi darna","0333");
        listAdherent.add(ad1);
        listAdherent.add(ad2);
        long datenow = new Date().getTime();
        boolean finish = false;

        do{
            ad1.emprenter(12, l1, datenow, datenow + 1000);
            ad2.emprenter(15, l1, datenow, datenow + 1000);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (!ad1.testIfRetard(new Date().getTime()) || !ad2.testIfRetard(new Date().getTime()))
            {
                finish = true;
            }
            ad2.testIfRetard(new Date().getTime());
        }
        while (finish == false);


        for (int i = 0; i < listAdherent.size(); i++) {
            for (int j = 0; j <listAdherent.get(i).listRetardater.size() ; j++) {
                System.out.println("Le numero de l'adherent retardater est : " + listAdherent.get(i).listRetardater);
            }
        }

        ad1.retourner(12,l1,new Date().getTime());


    }

}
