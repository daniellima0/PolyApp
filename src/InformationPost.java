import java.util.List;

public class InformationPost extends PostFactory{
    public InformationPost(String titre, String description, boolean soutient, List<User> publicUsers){
        super(titre, description, soutient, publicUsers);
    }

    @Override
    public boolean hasPermission(User user){
        return publicUsers.contains(user);
    }

    @Override
    public void createPost(){
        System.out.println("Post created:" + titre);
    }
}