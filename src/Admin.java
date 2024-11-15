// Concrete User Class: Admin
public class Admin implements User {
    private String nom;
    private String prenom;
    private String mail;
/*  Additional attributes specific to exclusive admin: */
    private String metier;

    
    public Admin(String nom, String prenom, String mail, String metier) {
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.metier = metier;
    }
/* Getters and Setters: */
    @Override
    public String getInfoProfil() {
        return "Admin: Nom " + nom + " Prenom " + prenom + " Mail " + mail + " Metier " + metier;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public String getPrenom() {
        return prenom;
    }

    @Override
    public String getMail() {
        return mail;
    }

    // Additional Admin-specific methods can be added here.
}
