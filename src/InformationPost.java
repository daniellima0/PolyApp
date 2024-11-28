public class InformationPost extends Post{
    public InformationPost(String titre, String description, boolean soutient){
        super(titre, description, soutient);
    }

    @Override
    public boolean hasPermission(User user){
        return publicUsers.contains(user);
    }

}