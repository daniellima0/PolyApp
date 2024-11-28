import java.util.Date;

public class ServicePost extends Post{
    protected Date date;
    protected String adresse;
    protected int nb_personnes;
    protected boolean wishlist; //On peut mettre un pret de matériel dans la wishlist

    public ServicePost(String titre, String description, boolean soutient, Date date, String adresse, int nb_personnes){
        super(titre, description, soutient);
        this.date=date;
        this.nb_personnes=nb_personnes;
    }

    @Override
    public boolean hasPermission(User user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hasPermission'");
    }

    // Getters and Setters
    public Date get_date(){
        return this.date;
    }

    public String get_adresse(){
        return this.adresse;
    }

    public int get_nb_personnes(){
        return this.nb_personnes;
    }

    public void set_wishlist(boolean wishlist){
        this.wishlist=wishlist;
    }

}
