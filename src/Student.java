// Concrete User Class: Student
public class Student implements User {
    private String nom;
    private String prenom;
    private String mail;
    /* Additional attributes specific to exclusive students: */
    private boolean isDelegate;
    private String promo;
    private int annee;
    /* private Post[] likes; */

    public Student(String nom, String prenom, String mail, String promo, int annee, boolean isDelegate) {
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.promo = promo;
        this.annee = annee;
        this.isDelegate = isDelegate;
    }

    /* Getters and Setters: */
    @Override
    public String getInfoProfil() {
        return "Student: Nom " + nom + " Prenom " + prenom + " Mail " + mail + " Promo " + promo + " Annee " + annee + " Delegue " + isDelegate;
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

    // Additional methods specific to Student can be added here.
}