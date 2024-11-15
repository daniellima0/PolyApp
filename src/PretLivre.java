import java.util.List;

public class PretLivre extends PretMaterielPost {
    protected String titre;
    protected String description;
    protected boolean soutient; // like 
    protected List<User> publicUsers; 
    protected String photo;
    protected String etat_final;
    protected String etat_initial;
    protected boolean wishlist; //On peut mettre un pret de matériel dans la wishlist

    // spécifique au livre :
    protected String titre_livre;
    protected String auteur;

    public PretLivre(String titre, String description, boolean soutient, List<User> publicUsers, String photo, String etat_initial, String titre_livre, String auteur){
        super(titre, description, soutient, publicUsers, photo, etat_initial);
        this.titre_livre=titre_livre;
        this.auteur=auteur;
    }

    public String get_titre_livre(){
        return this.titre_livre;
    }

    public String get_auteur(){
        return this.auteur;
    }
}