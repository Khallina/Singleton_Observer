import javax.swing.*;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

public class Main extends JFrame{
    private Screen screen;
    private NumberGenerator numberGenerator;

    public Main() {
        screen = new Screen();
        add(screen);
        numberGenerator = new NumberGenerator();
        Thread t = new Thread(numberGenerator);
        t.start();
        numberGenerator.addProportyChangeListener(screen);
        Singleton s1 = Singleton.getInstance();

        Singleton.addObserver(Screen);
        Screen.createScreen;
    }

    public static void Main(String[] args){
        JFrame frame = new JFrame("Singleton Observer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 600);

        Main main = new Main();
        main.setSize(800, 600);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSURE);
        main.setVisible(true);

        Singleton s1 = singleton.getInstance();

        frame.setVisible(true);
    }
}
