public class InformationPost extends Post{
    public InformationPost(String titre, String description){
        super(titre, description);
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