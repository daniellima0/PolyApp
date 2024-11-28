public class ServiceCours extends ServicePost{
    private String matiere;

    public ServiceCours(String titre, String description, String date, String adresse, int nb_personnes, String matiere ){
        super(titre, description,  date, adresse, nb_personnes);
        this.matiere=matiere;
    }

    // Getters
    public String getMatiere(){
        return this.matiere;
    }
}
