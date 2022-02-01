import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    public Ventana () {

        Canvas lienzo = new Canvas();
        Graphics g = lienzo.getGraphics();
        setBackground(Color.red);
        setSize(640, 480);
        setLocation(500, 300);
        add(new Lines());
        setVisible(true);




    }
}
