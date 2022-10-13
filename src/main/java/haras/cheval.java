package haras;

public class cheval {
    //Paramètres
    private String nom;
    private int age;
    private int poids;
    private int vitesse;
    private double taille;


    //Acceseurs
    public String getNom(){
        return nom;
    }
    public int getAge(){
        return age;
    }
    public int getPoids(){
        return poids;
    }
    public int getVitesse(){
        return vitesse;
    }
    public double getTaille(){
        return taille;
    }

    //Modificateur

    public void setNom(String unNom){
        nom = unNom;
    }
    public void setAge(int unAge){
        age = unAge;
    }
    public void setPoids(int unPoids){
        poids = unPoids;
    }
    public void setVitesse(int uneVitesse){
        vitesse = uneVitesse;
    }
    public void setTaille(double uneTaille){
        taille = uneTaille;
    }

    //Méthodes
    private static void hennir(){
        System.out.println("Je hennis !");
    }
    public void courrir(){
        vitesse = 30;
    }
    public void trotter(){
        vitesse = 10;
    }
    public void arretter(){
        vitesse = 0;
        hennir();
    }
    public static void getcheval(){

    }
    public void setCheval(String unNom, int unAge, int unPoids, int uneVitesse, double uneTaille){
        nom = unNom;
        age = unAge;
        poids = unPoids;
        vitesse = uneVitesse;
        taille = uneTaille;
    }
    public String versChaine(){
        return "cheval " + nom + ", " + age + "ans, " + poids + "kg, " + taille + "m, vitesse " + vitesse + " km/h";
    }
    //Testpourmaj
}
