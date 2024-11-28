public class InformationPost extends Post{
    public InformationPost(String titre, String description, boolean soutient){
        super(titre, description, soutient);
    }

    @Override
    public boolean hasPermission(User user){
        if (user.getType().equals("BDE") || user.getType().equals("Delegue") || user.getType().equals("Admin")){
            return true;
        }
        else{
            return false;
        }
    }


}