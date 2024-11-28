public class PretLivre extends PretMaterielPost {
    protected String titre_livre;
    protected String auteur;

    public PretLivre(String titre, String description, boolean soutient, String photo, String etat_initial, String titre_livre, String auteur){
        super(titre, description, soutient, photo, etat_initial);
        this.titre_livre=titre_livre;
        this.auteur=auteur;
    }

    public String get_titre_livre(){
        return this.titre_livre;
    }

    public String get_auteur(){
        return this.auteur;
    }
}