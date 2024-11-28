import java.util.List;

abstract class Post {
    protected String titre;
    protected String description;
    protected boolean soutient; // like
    protected List<User> publicUsers;
    protected String lien; // Unique identifier for the post

    private static int counter = 1; // Static counter to track the number of posts created

    public Post(String titre, String description, boolean soutient) {
        this.titre = titre;
        this.description = description;
        this.soutient = soutient;
        this.lien = generateLien(); // Generate and assign unique lien
    }

    private static String generateLien() {
        return "post#" + counter++;
    }

    public void PostEvent() {
        //TODO implement
    }
    
    public void PostListener() {
        //TODO implement
    }

    // Abstract method for permission verification
    public abstract boolean hasPermission(User user);


    // Example notification method (commented out in original code)
    // public void notifyListeners(NotificationEvent event){
    // for (notifyListeners listener : event.getListeners()){
    // listener.receiveNotif(event);
    // }
    // }

    // Getters and Setters
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isSoutient() {
        return soutient;
    }

    public void setSoutient(boolean soutient) {
        this.soutient = soutient;
    }

    public List<User> getPublicUsers() {
        return publicUsers;
    }

    public void setPublicUsers(List<User> publicUsers) {
        this.publicUsers = publicUsers;
    }

    public String getLien() {
        return lien;
    }

    public void setLien(String lien) {
        this.lien = lien;
    }
}
