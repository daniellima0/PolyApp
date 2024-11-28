import java.util.ArrayList;
import java.util.List;

abstract class User {
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

    public abstract String getType(); //

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

    public List<Post> getWishList() {
        return wishList;
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

    public void setPostsAimees(List<Post> wishList) {
        this.wishList = wishList;
    }

}
