import java.util.List;

public class PretMaterielSport extends PretMaterielPost {
    protected String titre;
    protected String description;
    protected boolean soutient; // like 
    protected List<User> publicUsers; 
    protected String photo;
    protected String etat_final;
    protected String etat_initial;
    protected boolean wishlist; //On peut mettre un pret de matériel dans la wishlist

    // spécifique au matériel de sport :
    protected String taille;
    protected String sport;

    public PretMaterielSport(String titre, String description, boolean soutient, List<User> publicUsers, String photo, String etat_initial, String taille, String sport){
        super(titre, description, soutient, publicUsers, photo, etat_initial);
        this.taille=taille;
        this.sport=sport;
    }

    public String get_taille(){
        return this.taille;
    }

    public String get_sport(){
        return this.sport;
    }

}