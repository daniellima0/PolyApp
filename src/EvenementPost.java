import java.util.Date;
import java.util.List;

public class EvenementPost extends Post{
    private Date date;
    private String adresse;
    private boolean wishlist;
    private int nbPersonnes;

    public EvenementPost(String titre, String description, boolean soutient){
     super(titre, description, soutient);   
    }

    @Override
    public boolean hasPermission(User user){
        if (user.getType().equals("BDE")){
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
        this.wishlist = wishlist;
    }

    public boolean isInWishList(){
        return this.wishlist;
    }

}