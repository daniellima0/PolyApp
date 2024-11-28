import java.util.Date;
import java.util.List;

public class EvenementPost extends Post{
    protected Date date;
    protected String adresse;
    protected int nb_personnes;

    public EvenementPost(String titre, String description, boolean soutient){
     super(titre, description, soutient);   
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

    // Getters and Setters
    public Date get_date(){
        return this.date;
    }

    public String get_adresse(){
        return this.adresse;
    }

    public int get_nb_personnes(){
        return this.nb_personnes;
    }

}