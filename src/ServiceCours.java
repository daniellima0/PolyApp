import java.util.Date;
import java.util.List;

public class ServiceCours extends ServicePost{
    protected String titre;
    protected String description;
    protected boolean soutient; // like 
    protected List<User> publicUsers; 
    protected Date date;
    protected String adresse;
    protected int nb_personnes;
    protected boolean wishlist; //On peut mettre un pret de matériel dans la wishlist

    // specifique aux cours :
    protected String matiere;


    public ServiceCours(String titre, String description, boolean soutient, List<User> publicUsers, Date date, String adresse, int nb_personnes, String matiere ){
        super(titre, description, soutient, publicUsers, date, adresse, nb_personnes);
        this.matiere = matiere;
    }

    public String get_matiere(){
        return this.matiere;
    }

}
