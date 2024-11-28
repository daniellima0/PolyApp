public class Admin extends User {
    private String metier;

    public Admin(String nom, String prenom, String mail, String metier) {
        super(nom, prenom, mail);
        this.metier = metier;
    }

    public String getType(){
        return "Admin";
    }

    // Getters et Setters
    public String getMetier() {
        return metier;
    }
}
