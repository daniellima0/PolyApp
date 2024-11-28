
public class PretVetement extends PretMaterielPost {
    protected String taille;

    public PretVetement(String titre, String description, boolean soutient, String photo, String etat_initial, String taille){
        super(titre, description, soutient, photo, etat_initial);
        this.taille=taille;
    }

    public String getTaille(){
        return this.taille;
    }

}