package haras;

import java.nio.channels.ClosedChannelException;
import java.util.Scanner;

public class UnCheval {
    public static void main(String[] args) {
        Cheval unCheval = new Cheval();

        String nom = "Stewball";
        int age = 3;
        int poids = 500;
        int vitesse = 0;
        double taille = 1.50;


        Cheval[] chevaux = new Cheval[8];

        chevaux[0] = new Cheval("Stewball", 3, 1.50f, 500, 0);
        chevaux[1] = new Cheval("Alezan", 4, 2.00f, 700, 0);
        chevaux[2] = new Cheval("Pony", 4, 1.80f, 600, 0);
        chevaux[3] = new Cheval("Neil", 1, 1.60f, 500, 0);
        chevaux[4] = new Cheval("Bonusdargent", 2, 1.80f, 500,1.20);
        chevaux[5] = new Cheval("Solilea", 3,1.70f,600,0);
        chevaux[6] = new Cheval("Red ghost", 2, 4.75f, 500,0);
        chevaux[7] = new Cheval("Montesquieu", 1,1.80f,550,0);

        unCheval.setCheval(nom, age, poids, vitesse, taille);
        System.out.println(unCheval.versChaine());
        unCheval.trotter();
        System.out.println(unCheval.versChaine());
        unCheval.courrir();
        System.out.println(unCheval.versChaine());
        unCheval.arretter();
        System.out.println(unCheval.versChaine());

        afficherChevaux(chevaux);
        lePlusGrand(chevaux);
        RechercherCheval(chevaux);
    }
    public static void afficherChevaux(Cheval[] leschevaux){
        for (int i = 0; i < leschevaux.length; i++) {
            System.out.println(leschevaux[i].getNom());
        }
    }
    public static void lePlusGrand(Cheval[] leschevaux){
        double tailleCheval = 0;
        for (int i = 0; i < leschevaux.length; i++) {
            if(leschevaux[i].getTaille() > tailleCheval){
                tailleCheval = leschevaux[i].getTaille();
            }
        }
        System.out.println(tailleCheval);
    }
    public static void RechercherCheval(Cheval[] leschevaux){
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir un nom :");
        String nomCheval = sc.next();
        for (int i = 0; i < leschevaux.length; i++) {
            if(leschevaux[i].getNom().equals(nomCheval)){
                System.out.println(leschevaux[i].getNom() + ", " + leschevaux[i].getAge() + ", " + leschevaux[i].getTaille() + ", " + leschevaux[i].getVitesse() + ", " + leschevaux[i].getPoids());
                break;
            }
        }
        System.out.println("Cheval introuvable !");
    }
}
