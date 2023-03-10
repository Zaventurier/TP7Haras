package haras;

public class Main {
    public static void main(String[] args) {
        Cheval monCheval = new Cheval("Stewball", 3, 1.50f, 500, 0);
        Jockey jockey = new Jockey("Gomez", "Garrett", monCheval);

        /*System.out.println("Le jockey s'appelle " + jockey.getNom());
        System.out.println("son cheval s'appelle " + jockey.getNomCheval());
        Cheval chev = jockey.getUnCheval();
        System.out.println("description de son cheval " + chev.versChaine());*/

        //System.out.println(jockey.versChaine());

        jockey.allerAuTrot();
        System.out.println(jockey.versChaine());

        jockey.galoper();
        System.out.println(jockey.versChaine());

        jockey.arreter();
        System.out.println(jockey.versChaine());

    }
}
