import java.awt.*;

public class Cuvo extends Canvas {
    public Cuvo() {
        setBackground(Color.red);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.blue);
        g.drawLine(10, 110, 10, 410);// "!"
        g.drawLine(310, 110, 310, 410);// "!"
        g.drawLine(410, 10, 410, 310);// "!"
        g.drawLine(10, 110, 110, 10);// "/"


        g.setColor(Color.WHITE);

        //lineas del cuadro


        for (int i = 10; i <= 310; i += 10) {
            //linea orizontal
            g.drawLine(10, 100 + i, 310, 100 + i);
            g.drawLine(10 + i, 110 - i, 310 + i, 110 - i);
            g.drawLine(310, 100 + i, 410, i);

        }


        for (int i = 10; i <= 155; i += 10) {
            for (int mas20 = 20; mas20 <= 300; mas20 += 20) {
                //lineas frente
                g.drawLine(10 + mas20, 90 + i + i, 10 + mas20, 100 + i + i);
                g.drawLine(mas20, 100 + i + i, mas20, 110 + i + i);





            }

        }
        for (int i = 10; i <= 155; i += 10) {
            for (int mas20 = 20; mas20 <= 300; mas20 += 20) {
                //lineas arriba

                g.drawLine(120, 20, 130, 10);
                g.drawLine(100, 40, 110, 30);
                g.drawLine(80, 60, 90, 50);
                g.drawLine(60, 80, 70, 70);


                g.drawLine(80 + mas20, 30, 90 + mas20, 20);


                g.drawLine(310 + i, 110 - i, 310 + i, 120 - i);

            }
        }
    }
}