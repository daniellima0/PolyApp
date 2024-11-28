import java.util.ArrayList;
import java.util.List;

public abstract class User implements Observer{
    private String nom;
    private String prenom;
    private String mail;
    private List<Message> messagesRecus;
    private List<PostFactory> wishList;

    public User(String nom, String prenom, String mail) {
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.messagesRecus = new ArrayList<>();
        this.wishList = new ArrayList<>();
    }

    public void getInfoProfil() {
        System.out.println("Nom:" + nom);
        System.out.println("Prenom:" + prenom);
        System.out.println("Mail:" + mail);
    }

    // Getters and Setters
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getMail() {
        return mail;
    }

    public List<Message> getMessagesRecus() {
        return messagesRecus;
    }

    public void likePost(PostFactory post) { 
        addToWishlist(post); 
    } 
    
    private void addToWishlist(PostFactory post) { 
        this.wishList.add(post); 
        System.out.println(this.nom + " a ajouté le post à la wishlist : " + post); 
    }
   
    @Override 
    public void update(NotificationEvent event) {
        if (event.getType().equals("MESSAGE")){
            System.out.println(this.nom + " a reçu un message"); 
            this.messagesRecus.add(new Message (event.getMessage()));
        }else if (event.getType().equals("POST")){
            PostFactory post = (PostFactory) event.getPost(); 
            System.out.println(this.nom + " a reçu une notification de nouveau post : " + post); 
        }

    }

    public List<PostFactory> getWishList() {
        for (int i=0; i<wishList.size();i++){
            this.wishList.get(i).toString();
        }
        return this.wishList;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setMessagesRecus(List<Message> messagesRecus) {
        this.messagesRecus = messagesRecus;
    }

    public void setPostsAimees(List<PostFactory> wishList) {
        this.wishList = wishList;
    }
}
    
