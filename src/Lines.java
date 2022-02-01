import java.awt.*;

public class Lines extends Canvas {
    public Lines() {
        setBackground(Color.red);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.WHITE);

        //lineas del cuadro
        g.drawLine(10, 10, 10, 430);
        g.drawLine(630, 10, 630, 430);

        for (int mas30 = 10; mas30 <= 430; mas30 += 30) {
            //linea orizontal
            g.drawLine(10, mas30, 630, mas30);
        }

        for (int mas30 = 10; mas30 <= 200; mas30 += 30) {
            for (int mas50 = 10; mas50 <= 600; mas50 += 50) {
                //linea vertical1
                g.drawLine(mas50, -10 + mas30 * 2, mas50, 20 + mas30 * 2);
                //linea vertical2
                g.drawLine(30 + mas50, 20 + mas30 * 2, 30 + mas50, 50 + mas30 * 2);
            }
        }

    }
}
