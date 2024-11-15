import java.util.List;

public class InformationPost extends PostFactory{

    public InformationPost(String titre, String description, List<User> publicUsers){
        super(titre, description, publicUsers);
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