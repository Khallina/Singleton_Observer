import java.beans PropertyChangeSupport;
public class BoxBuilder extends PropertyChangeSupport implements Runnable {
    private int x, y;

    public int BoxBuilder(); {
        super(new Object());
    }
    public void run() {
        while (true) {
            x+=10; if (x>100) x = 0;
            y+=10; if (y>100) y = 0;
            firePropertyChange("x", null, x);
            firePropertyChange("y", null, y);
            try {
                thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }
}
