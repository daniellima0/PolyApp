public class PretAutre extends Post {
    private String photo;
    private String etatInitial;
    public PretAutre(String titre, String description, String photo, String etat_initial ){
        super(titre, description);
        this.photo=photo;
        this.etatInitial=etat_initial;
    }

    @Override
    public boolean hasPermission(User user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hasPermission'");
    }


}
