import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

public class Repository extends PropertyChangeSupport {
    private static Repository _instance; //change to array list?
    protected Repository() {}
    public static Repository getInstance() {
        if (_instance == null) {
            _instance = new Singleton();
        }
        return _instance;


        //add calls to circlebuilder and box builder here to get info
        //notifying();
    }
}
