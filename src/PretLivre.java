public class PretLivre extends PretMaterielPost {
    private String titre_livre;
    private String auteur;

    public PretLivre(String titre, String description, boolean soutient, String photo, String etat_initial, String titre_livre, String auteur){
        super(titre, description, soutient, photo, etat_initial);
        this.titre_livre=titre_livre;
        this.auteur=auteur;
    }

    public String getTitreLivre(){
        return this.titre_livre;
    }

    public String getAuteur(){
        return this.auteur;
    }
}