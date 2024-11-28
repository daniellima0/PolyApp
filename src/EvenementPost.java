public class EvenementPost extends Post{
    private String date;
    private String adresse;
    private int nbPersonnes;

    public EvenementPost(String titre, String description, String date, String adresse, int nbPersonnes){
     super(titre, description);  
     this.date=date;
     this.adresse=adresse;
     this.nbPersonnes=nbPersonnes; 
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