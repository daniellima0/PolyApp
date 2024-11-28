
public class PretLivre extends PretMaterielPost {
    private String titreLivre;
    private String auteur;

    public PretLivre(String titre, String description,  String photo, String etat_initial, String titre_livre, String auteur){
        super(titre, description, photo, etat_initial);
        this.titreLivre=titre_livre;
        this.auteur=auteur;
    }

    public String getTitreLivre(){
        return this.titreLivre;
    }

    public String getAuteur(){
        return this.auteur;
    }
}