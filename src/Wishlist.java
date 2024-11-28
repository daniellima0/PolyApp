
import java.util.List;

public class Wishlist {
    User u;

    public Wishlist(User u){
        this.u=u;
    }
    public void wishlistApp(){
        System.out.println("Vous vous trouvez dans la wishlist");
        List<Post> wl=u.getWishList();
        
        for (Post p : wl) { 
            System.out.println(p.getTitre());
            System.out.println(p.getDescription());
        }
    }   
}
