public class BDE extends User {
    public BDE(String nom, String prenom, String mail){
        super(nom, prenom, mail);
    }

    public String getType(){
        return "BDE";
    }
}
