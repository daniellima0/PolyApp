import java.util.List;

public class abstract PostFactory{
    protected String titre;
    protected String description;
    protected boolean soutient; // like 
    protected List<User> publicUsers; 

    public PostFactory(String titre, String description, boolean soutient, List<User> publicUsers){
        this.this = titre;
        this.description = description;
        this.soutien = soutient;
        this.publicUsers = publicUsers;
    }

    //verification method
    public abstract boolean hasPermission(User user);
    
    public abstract void createPost();


    //notification method
  //  public void notifyListeners(NotificationEvent event){
   //     for (notifyListeners listener : event.getListeners()){
  //          listener.receiveNotif(event);
  //      }
 //   }

}