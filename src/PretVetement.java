import java.util.List;

public class PretVetement extends PretMaterielPost {
    protected String titre;
    protected String description;
    protected boolean soutient; // like 
    protected List<User> publicUsers; 
    protected String photo;
    protected String etat_final;
    protected String etat_initial;
    protected boolean wishlist; //On peut mettre un pret de matériel dans la wishlist

    // spécifique au vetement :
    protected String taille;

    public PretVetement(String titre, String description, boolean soutient, List<User> publicUsers, String photo, String etat_initial, String taille){
        super(titre, description, soutient, publicUsers, photo, etat_initial);
        this.taille=taille;

    }

    public String get_taille(){
        return this.taille;
    }

}