import java.util.Date;

public class ServiceCovoiturage extends ServicePost{;
    private String adresseArrivee;
    private Date heureDepart;

    public ServiceCovoiturage(String titre, String description, boolean soutient, List<User> publicUsers, Date date, String adresse, int nb_personnes, String adresse_depart, String adresse_arrivee, Date heure_depart){
        super(titre, description, soutient, publicUsers, date, adresse, nb_personnes);
        this.adresseArrivee=adresse_arrivee;
        this.heureDepart=heure_depart;
    }

    // Getters
    public String getAdresseArrivee(){
        return this.adresseArrivee;
    }

    public Date getHeureDepart(){
        return this.heureDepart;
    }

}
