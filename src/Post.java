// Le pattern factory me paraît mal compris :
// - Il faut normalement dissocier les objets (Posts, Users...) des classes créatices
// - donc créer une interface PostFactory et UserFactory ainsi que leur descendants concrets
//   contenants les méthodes constructrices
//
// voir https://moodle.univ-smb.fr/pluginfile.php/111840/mod_resource/content/1/INFO732_CM2_DesignPatterns_2020.pdf pages 25-31
//
// La hiérarchisation des Posts et des Users en elle même est très bien.

abstract class Post {
    private String titre;
    private String description;
    private String lien; // Unique identifier for the post

    // Bien !
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

    public String toString(){
        return this.titre +" : "+ this.description;
    }
}
