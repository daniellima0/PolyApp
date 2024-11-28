public class ServiceCovoiturage extends ServicePost{;
    private String adresseArrivee;
    private String heureDepart;

    public ServiceCovoiturage(String titre, String description, String date, String adresse, int nb_personnes, String adresse_arrivee, String heure_depart){
        super(titre, description, date, adresse, nb_personnes);
        this.adresseArrivee=adresse_arrivee;
        this.heureDepart=heure_depart;
    }

    // Getters
    public String getAdresseArrivee(){
        return this.adresseArrivee;
    }

    public String getHeureDepart(){
        return this.heureDepart;
    }

}
