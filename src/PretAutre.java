
public class PretAutre extends Post {
    public PretAutre(String titre, String description, boolean soutient){
        super(titre, description, soutient);
    }

    @Override
    public boolean hasPermission(User user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hasPermission'");
    }


}
