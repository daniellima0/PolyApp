import java.util.Date;
import java.util.List;

public class ServiceCovoiturage extends ServicePost{
    protected String adresseDepart;
    protected String adresseArrivee;
    protected Date heureDepart;

    public ServiceCovoiturage(String titre, String description, boolean soutient, List<User> publicUsers, Date date, String adresse, int nb_personnes, String adresse_depart, String adresse_arrivee, Date heure_depart){
        super(titre, description, soutient, publicUsers, date, adresse, nb_personnes);
        this.adresseDepart=adresse_depart;
        this.adresseArrivee=adresse_arrivee;
        this.heureDepart=heure_depart;
    }

    // Getters
    public String getAdresseDepart(){
        return this.adresseDepart;
    }

    public String getAdresseArrivee(){
        return this.adresseArrivee;
    }

    public Date getHeureDepart(){
        return this.heureDepart;
    }

}
