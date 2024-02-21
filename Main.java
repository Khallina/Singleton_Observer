import javax.swing.*;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

public class Main extends JFrame {
    public static void Main(String[] args){
        Jframe frame = new JFrame("Singleton Observer");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSURE);

        Screen screen = new Screen();
        frame.add(screen);
        Thread t = new Thread(screen);
        t.start();
        Repository s1 = Repository.getInstance();
        Repository.addObserver(Screen);
        Screen.addPropertyChangeListener(screen);
        //screen.createScreen

        frame.setVisible(true);
    }
}
