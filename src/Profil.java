public class Profil {
    User u;

    public Profil(User u){
        this.u=u;
    }
    public void profilApp(){
        System.out.println("Vous vous trouvez dans le profil");
        if (u.getType().equals("Etudiant") || u.getType().equals("Delegue")){
            System.out.println("Profil étudiant");
            u.getInfoProfil();
        }

        if (u.getType().equals("BDE")){
            System.out.println("Profil BDE");
            u.getInfoProfil();
        }

        if (u.getType().equals("Admin")){
            System.out.println("Profil Administrateur");
            u.getInfoProfil();
        }
    }
    
}
