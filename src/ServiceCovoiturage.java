import java.util.Date;
import java.util.List;

public class ServiceCovoiturage extends ServicePost{
    protected String titre;
    protected String description;
    protected boolean soutient; // like 
    protected List<User> publicUsers; 
    protected Date date;
    protected String adresse;
    protected int nb_personnes;
    protected boolean wishlist; //On peut mettre un pret de matériel dans la wishlist

    // specifique au covoiturage :
    protected String adresse_depart;
    protected String adresse_arrivee;
    protected Date heure_depart;

    public ServiceCovoiturage(String titre, String description, boolean soutient, List<User> publicUsers, Date date, String adresse, int nb_personnes, String adresse_depart, String adresse_arrivee, Date heure_depart){
        super(titre, description, soutient, publicUsers, date, adresse, nb_personnes);
        this.adresse_depart = adresse_depart;
        this.adresse_arrivee=adresse_arrivee;
        this.heure_depart=heure_depart;
    }

    public String get_adresse_depart(){
        return this.adresse_depart;
    }

    public String get_adresse_arrivee(){
        return this.adresse_arrivee;
    }

    public Date get_heure_depart(){
        return this.heure_depart;
    }

}
