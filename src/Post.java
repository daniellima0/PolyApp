
abstract class Post {
    private String titre;
    private String description;
    private String lien; // Unique identifier for the post

    private static int counter = 1; // Static counter to track the number of posts created

    public Post(String titre, String description) {
        this.titre = titre;
        this.description = description;
        this.lien = generateLien(); // Generate and assign unique lien
    }

    private static String generateLien() {
        return "post#" + counter++;
    }

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
    public String getLien() {
        return lien;
    }

    public void setLien(String lien) {
        this.lien = lien;
    }
}
