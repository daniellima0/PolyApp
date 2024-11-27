import java.util.List;

public class PretVetement extends PretMaterielPost {
    protected String taille;

    public PretVetement(String titre, String description, boolean soutient, List<User> publicUsers, String photo, String etat_initial, String taille){
        super(titre, description, soutient, publicUsers, photo, etat_initial);
        this.taille=taille;
    }

    public String get_taille(){
        return this.taille;
    }

}