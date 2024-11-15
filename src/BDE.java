// Concrete User Class: BDE
public class BDE implements User {
    private String nom;
    private String prenom;
    private String mail;
    /*  Additional attributes specific to exclusive BDE: */

    public BDE(String nom, String prenom, String mail){
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
    }

/* Getters and Setters: */
    @Override
    public String getInfoProfil() {
        return "BDE: Nom " + nom + " Prenom " + prenom + " Mail " + mail;
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


    // Additional BDE-specific fields and methods can be added here.
}
