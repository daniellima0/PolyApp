import java.util.List;

public class PretMaterielSport extends PretMaterielPost {
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