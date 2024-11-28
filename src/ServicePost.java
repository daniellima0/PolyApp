public class ServicePost extends Post{
    private String date;
    private String adresse;
    private int nbPersonnes;

    public ServicePost(String titre, String description,  String date, String adresse, int nb_personnes){
        super(titre, description);
        this.date=date;
        this.nbPersonnes=nb_personnes;
    }

    // Getters and Setters
    public String getDate(){
        return this.date;
    }

    public String getAdresse(){
        return this.adresse;
    }

    public int getNbPersonnes(){
        return this.nbPersonnes;
    }

}
