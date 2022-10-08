package haras;

public class UnCheval {
    public static void main(String[] args) {
        cheval unCheval = new cheval();

        String nom = "Stewball";
        int age = 3;
        int poids = 500;
        int vitesse = 0;
        double taille = 1.50;

        unCheval.setCheval(nom, age, poids, vitesse, taille);
        System.out.println(unCheval.versChaine());
    }
}
