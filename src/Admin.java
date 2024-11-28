public class Admin extends User {
    private String metier;

    public Admin(String nom, String prenom, String mail, String metier) {
        super(nom, prenom, mail);
        this.metier = metier;
    }

    public void getInfoProfil() {
        System.out.println("Nom : " + getNom());
        System.out.println("Prenom : " + getPrenom());
        System.out.println("Mail : " + getMail());
        System.out.println("Métier : " + getMetier());

    }

    public String getType(){
        return "Admin";
    }

    // Getters et Setters
    public String getMetier() {
        return metier;
    }
}
