
public class PretMaterielPost extends Post {
    protected String photo;
    protected String etatFinal;
    protected String etatInitial;
    protected boolean wishlist; //On peut mettre un pret de matériel dans la wishlist

    public PretMaterielPost(String titre, String description, boolean soutient,String photo, String etat_initial){
        super(titre, description, soutient);
        this.etatInitial=etat_initial;
        this.photo=photo;
        this.etatFinal=null;
        this.wishlist=false;
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

    public void setWishlist(boolean wishlist){
        this.wishlist=wishlist;
    }

    public boolean isInWishList(){
        return this.wishlist;
    }

}