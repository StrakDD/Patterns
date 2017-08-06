package behavioral.observer;

/**
 * Created by Denis Starovoitenko on 06.08.2017.
 */
public interface Observed {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();

}
