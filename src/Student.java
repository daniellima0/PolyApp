public class Student extends User {
    private boolean estDelegue;
    private String promo;
    private int annee;

    public Student(String nom, String prenom, String mail, String promo, int annee, boolean estDelegue) {
        super(nom, prenom, mail);
        this.promo = promo;
        this.annee = annee;
        this.estDelegue = estDelegue;
    }

    @Override
    public void getInfoProfil() {
        System.out.println("Nom:" + getNom());
        System.out.println("Prenom:" + getPrenom());
        System.out.println("Mail:" + getMail());
        System.out.println("Promo:" + promo);
        System.out.println("Annee:" + annee);
        System.out.println("Is Delegate:" + estDelegue);
    }

    public String getType(){
        if (estDelegue) {
            return "Delegue";
        }
        else{
            return "Etudiant";
        }
    }

    // Getters and Setters
    public boolean getEstDelegue() {
        return estDelegue;
    }

    public String getPromo() {
        return promo;
    }

    public int getAnnee() {
        return annee;
    }

    public void setEstDelegue(boolean estDelegue) {
        this.estDelegue = estDelegue;
    }

    public void setPromo(String promo) {
        this.promo = promo;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }
}