import java.awt.*;

public class Cubo1 extends Canvas {
    public Cubo1() {
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
            g.drawLine(310, 100 + i, 410, i);

            g.drawLine(10 + i / 3, 110 - i / 3, 310 + i / 3, 110 - i / 3);


            //g.drawLine(10 + i, 110 - i, 310 + i, 110 - i);

        }


        for (int i = 10; i <= 155; i += 10) {
            for (int mas20 = 20; mas20 <= 300; mas20 += 20) {
                //lineas frente
                g.drawLine(10 + mas20, 90 + i + i, 10 + mas20, 100 + i + i);
                g.drawLine(mas20, 100 + i + i, mas20, 110 + i + i);


                g.drawLine(320, 110, 320, 100);
                g.drawLine(330, 120, 320, 100);
                g.drawLine(10 + mas20, 90 + i + i, 10 + mas20, 100 + i + i);
                g.drawLine(mas20, 100 + i + i, mas20, 110 + i + i);

            }

        }


    }
}