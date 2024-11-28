
public class PretMaterielPost extends Post {
    protected String photo;
    protected String etat_final;
    protected String etat_initial;
    protected boolean wishlist; //On peut mettre un pret de matériel dans la wishlist

    public PretMaterielPost(String titre, String description, boolean soutient, String photo, String etat_initial){
        super(titre, description, soutient);
        this.etat_initial=etat_initial;
        this.photo=photo;
        this.etat_final=null;
        this.wishlist=false;
    }

    @Override
    public boolean hasPermission(User user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hasPermission'");
    }

    public String get_etat_initial(){
        return this.etat_initial;
    }

    public String get_photo(){
        return this.photo;
    }

    public void set_etat_final(String etat_retour){
        this.etat_final=etat_retour;
    }

    public void set_wishlist(boolean wishlist){
        this.wishlist=wishlist;
    }

}