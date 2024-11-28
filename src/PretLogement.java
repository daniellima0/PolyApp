import java.util.List;

public class PretLogement extends PretMaterielPost {
    protected String adresse;
    protected String duree_location;

    public PretLogement(String titre, String description, boolean soutient, List<User> publicUsers, String photo, String etat_initial, String adresse, String duree_location){
        super(titre, description, soutient, publicUsers, photo, etat_initial);
        this.adresse=adresse;
        this.duree_location=duree_location;
    }

    // Getters and Setters
    public String get_adresse(){
        return this.adresse;
    }

    public void set_adresse(String adresse){
        this.adresse=adresse;
    }

    public String get_duree_location(){
        return this.duree_location;
    }

    public void set_duree_location(String duree_location){
        this.duree_location=duree_location;
    }
}