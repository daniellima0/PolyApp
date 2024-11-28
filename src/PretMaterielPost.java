public class PretMaterielPost extends Post {
    private String photo;
    private String etatFinal;
    private String etatInitial;

    public PretMaterielPost(String titre, String description, String photo, String etat_initial){
        super(titre, description);
        this.etatInitial=etat_initial;
        this.photo=photo;
        this.etatFinal=null;
    }

    @Override
    public boolean hasPermission(User user) {
        if (user.getType().equals("Etudiant") || user.getType().equals("Delegue")){
            return true;
        }
        else{
            return false;
        }
    }

    public String getEtatInitial(){
        return this.etatInitial;
    }

    public String getPhoto(){
        return this.photo;
    }

    public void setEtatFinal(String etat_retour){
        this.etatFinal=etat_retour;
    }

}