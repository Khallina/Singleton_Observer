import javax.swing.*;
import java.awt.Graphics;
import java.awt.Color;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class Screen extends JPanel implements PropertyChangeListener extends Observer {
    private int x, y;
    CircleBuilder circle = new CircleBuilder();
    BoxBuilder box = new BoxBuilder();

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(circle.x, circle.y, 50, 50);
        g.fillRect(box.x, box.y, 30, 30);
        //change it to circle and box builder methods
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        this.x = (Integer) evt.getNewValue();
        this.y = (Integer) evt.getNewValue();
        repaint();
    }

    @Override
    public void update(Observable s) {
        repaint();
    }
}
