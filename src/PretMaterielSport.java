public class PretMaterielSport extends PretMaterielPost {
    protected String taille;
    protected String sport;

    public PretMaterielSport(String titre, String description, String photo, String etat_initial, String taille, String sport){
        super(titre, description,  photo, etat_initial);
        this.taille=taille;
        this.sport=sport;
    }

    public String getTaille(){
        return this.taille;
    }

    public String getSport(){
        return this.sport;
    }

}