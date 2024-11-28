import java.util.List;

abstract class Post {
    private String titre;
    private String description;
    private boolean soutient; // like
    private List<User> publicUsers;
    private String lien; // Unique identifier for the post

    private static int counter = 1; // Static counter to track the number of posts created

    public Post(String titre, String description, boolean soutient, List<User> publicUsers) {
        this.titre = titre;
        this.description = description;
        this.soutient = soutient;
        this.publicUsers = publicUsers;
        this.lien = generateLien(); // Generate and assign unique lien
    }

    private static String generateLien() {
        return "post#" + counter++;
    }

    // Abstract method for permission verification
    public abstract boolean hasPermission(User user);


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

    public boolean getSoutient() {
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
