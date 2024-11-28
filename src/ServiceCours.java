import java.util.Date;

public class ServiceCours extends ServicePost{
    protected String matiere;

    public ServiceCours(String titre, String description, boolean soutient, Date date, String adresse, int nb_personnes, String matiere ){
        super(titre, description, soutient, date, adresse, nb_personnes);
        this.matiere = matiere;
    }

    // Getters
    public String get_matiere(){
        return this.matiere;
    }
}
