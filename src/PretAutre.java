import java.util.List;

public class PretAutre extends PostFactory {
    public PretAutre(String titre, String description, boolean soutient, List<User> publicUsers){
        super(titre, description, soutient, publicUsers);
    }

    @Override
    public boolean hasPermission(User user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hasPermission'");
    }

    @Override
    public void createPost() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createPost'");
    } 

}
