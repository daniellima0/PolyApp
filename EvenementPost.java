import java.util.List;

public class EvenementPost extends PostFactory{

    public EvenementPost(String titre, String description, boolean soutient, List<User> publicUsers){
     super(titre, description, soutient, publicUsers);   
    }


    @Override
    public boolean hasPermission(User user){
        for (User u : publicUsers){
            if (u.equals(user)){
                return true;
            }
        }
        return false;
    }


    @Override
    public void createPost(){
        // see exactually what to do 
    }






}