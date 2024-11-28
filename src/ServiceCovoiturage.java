
public class ServiceCovoiturage extends ServicePost{
    protected String adresseDepart;
    protected String adresseArrivee;
    protected String heureDepart;

    public ServiceCovoiturage(String titre, String description, String date, String adresse, int nb_personnes, String adresse_depart, String adresse_arrivee, String heure_depart){
        super(titre, description,  date, adresse, nb_personnes);
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

    public String getHeureDepart(){
        return this.heureDepart;
    }

}
