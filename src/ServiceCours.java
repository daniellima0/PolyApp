import java.util.Date;
import java.util.List;

public class ServiceCours extends ServicePost{
    private String matiere;

    public ServiceCours(String titre, String description, boolean soutient, List<User> publicUsers, Date date, String adresse, int nb_personnes, String matiere ){
        super(titre, description, soutient, publicUsers, date, adresse, nb_personnes);
        this.matiere=matiere;
    }

    // Getters
    public String getMatiere(){
        return this.matiere;
    }
}
