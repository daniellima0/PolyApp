import java.util.List;

public class PretLogement extends PretMaterielPost {
    protected String adresse;
    protected String dureeLocation;

    public PretLogement(String titre, String description, boolean soutient, List<User> publicUsers, String photo, String etat_initial, String adresse, String duree_location){
        super(titre, description, soutient, publicUsers, photo, etat_initial);
        this.adresse=adresse;
        this.dureeLocation=duree_location;
    }

    // Getters and Setters
    public String get_adresse(){
        return this.adresse;
    }

    public void setAdresse(String adresse){
        this.adresse=adresse;
    }

    public String getDureeLocation(){
        return this.dureeLocation;
    }

    public void setDureeLocation(String duree_location){
        this.dureeLocation=duree_location;
    }
}