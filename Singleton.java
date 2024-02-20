import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

public class Singleton extends Observable {
    private static Singleton _instance;
    protected Singleton() {}
    public static Singleton getInstance() {
        if (_instance == null) {
            _instance = new Singleton();
        }
        return _instance;
        notifying();
    }
}
