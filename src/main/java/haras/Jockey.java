package haras;

/**
 * Classe représentant un Jockey des haras de Lamballe
 * @author Guillaume
 * @version 1.0
 */

public class Jockey {
    private String nom;
    private String prenom;
    //On déclare la variable unCheval de type Cheval
    private Cheval unCheval;

    /**
     * Constructeur de la classe Jockey
     * @param unNom
     * @param unPrenom
     * @param unCheval
     */
    public Jockey(String unNom, String unPrenom, Cheval unCheval){
        this.nom = unNom;
        this.prenom = unPrenom;
        this.unCheval = unCheval;
    }


    /**
     * Getteur de la variable nom
     * @return nom
     */

    public String getNom(){
        return this.nom;
    }

    /**
     * Getteur de la variable prenom
     * @return prenom
     */
    public String getPrenom(){
        return this.prenom;
    }

    /**
     * Getteur de la variable unCheval
     * @return unCheval
     */
    public Cheval getUnCheval(){
        return this.unCheval;
    }

    /**
     * Permet d'obtenir le nom du cheval
     * @return  unCheval.getNom()
     */

    public String getNomCheval(){
        return this.unCheval.getNom();
    }

    /**
     * Méthode permettant de récupérer les informations du Jckey + les informations du cheval
     * @return String
     */
    public String versChaine(){
        return "Jockey : " + nom + " " + prenom + " . Mon cheval est : " + unCheval.versChaine();
    }

    /**
     * Met le cheval au trot
     * @return void
     */

    public void allerAuTrot(){
        unCheval.trotter();
    }

    /**
     * Met un cheval au galop
     * @return void
     */

    public void galoper(){
        unCheval.courrir();
    }

    /**
     * Met un cheval à l'arrêt
     * @return void
     */

    public void arreter(){
        unCheval.arretter();
    }
}
