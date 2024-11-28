
import java.util.ArrayList;

public class NotificationService implements Observable {
    private final ArrayList<Observer> observers = new ArrayList<>();
    private NotificationEvent event;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public ArrayList<Observer> getObserver(){
        return observers;
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(event);
        }
    }

    public void createPostNotification(String message, Post p) {
        this.event = new NotificationEvent(message, NotificationEvent.NEW_POST, p);
        notifyObservers();
    }
}
