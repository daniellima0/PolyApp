import java.util.ArrayList;
import java.util.List;

public abstract class User implements Observer{
    private String nom;
    private String prenom;
    private String mail;
    private List<Message> messagesRecus;
    private List<Post> wishList;

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

    public abstract String getType(); 

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

    public void likePost(Post post) { 
        addToWishlist(post); 
    } 
    
    public void addToWishlist(Post post) { 
        this.wishList.add(post); 
        System.out.println(this.nom + " a ajouté le post à la wishlist : " + post); 
    }
   
    @Override 
    public void update(NotificationEvent event) {
        if (event.getType().equals("MESSAGE")){
            System.out.println(this.nom + " a reçu un message"); 
            this.messagesRecus.add(new Message (event.getMessage()));
        }else if (event.getType().equals("POST")){
            Post post = (Post) event.getPost(); 
            System.out.println(this.nom + " a reçu une notification de nouveau post : " + post); 
        }

    }

    public void envoyerMessage (User destinataire, Message m){
        destinataire.update(new NotificationEvent(m.toString(), NotificationEvent.MESSAGE_RECEIVED));
    }

    public List<Post> getWishList() {
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

    public void setWishlist(List<Post> wishList) {
        this.wishList = wishList;
    }

}
    
