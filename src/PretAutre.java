public class PretAutre extends PretMaterielPost {
    private String photo;
    private String etatInitial;
    private String etatFinal;

    public PretAutre(String titre, String description, String photo, String etat_initial ){
        super(titre, description, photo, etat_initial);
        this.photo=photo;
        this.etatInitial=etat_initial;
    }

    public String getPhoto(){
        return this.photo;
    }

    public String getEtatInitial(){
        return this.etatInitial;
    }

    public void setEtatFinal(String etat){
        this.etatFinal=etat;
    }

}
