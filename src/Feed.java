import java.util.ArrayList;
import java.util.List;

public class Feed {
    private final List<NotificationListener> listeners = new ArrayList<>();

    public void feedApp(){
        //A METTRE A JOUR
        System.out.println("Vous vous trouvez dans le feed");

    }

    public void addListener(NotificationListener listener) {
        listeners.add(listener);
    }

    public void removeListener(NotificationListener listener) {
        listeners.remove(listener);
    }

    public void notifyListeners(String message) {
        NotificationEvent event = new NotificationEvent(message);
        for (NotificationListener listener : listeners) {
            listener.receiveNotif(event);
        }
    }

    public void addPost(String post) {
        //A METTRE A JOUR

        // Logique pour ajouter un post dans le feed
        System.out.println("Nouveau post ajouté : " + post);
        notifyListeners("Nouveau post dans le feed : " + post);
    }
}

