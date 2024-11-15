import java.util.List;

public class PretAutre extends PostFactory {
    protected String titre;
    protected String description;
    protected boolean soutient; // like 
    protected List<User> publicUsers; 

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
