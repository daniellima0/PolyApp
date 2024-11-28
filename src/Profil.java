public class Profil {
    User u;

    public Profil(User u){
        this.u=u;
    }
    public void profilApp(){
        System.out.println("Vous vous trouvez dans le profil");
        System.out.println("L'utilisateur est : " + u.getPrenom()+" " +u.getNom());
        System.out.println("Son adresse mail " + u.getMail());
    }
    
}
