package PatronesDeEstructuracion;
import java.util.List;
import java.util.ArrayList;
class MediaLibrary implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void newMediaReleased(String mediaTitle) {
        notifyObservers("New media released: " + mediaTitle);
    }
}