import java.util.Date;

public class ServicePost extends Post{
    private Date date;
    private String adresse;
    private int nbPersonnes;
    private boolean wishlist; //On peut mettre un pret de matériel dans la wishlist

    public ServicePost(String titre, String description, boolean soutient, Date date, String adresse, int nb_personnes){
        super(titre, description, soutient);
        this.date=date;
        this.nbPersonnes=nb_personnes;
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

    // Getters and Setters
    public Date getDate(){
        return this.date;
    }

    public String getAdresse(){
        return this.adresse;
    }

    public int getNbPersonnes(){
        return this.nbPersonnes;
    }

    public void setWishlist(boolean wishlist){
        this.wishlist=wishlist;
    }

    public boolean isInWishList(){
        return this.wishlist;
    }

}
