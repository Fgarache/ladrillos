import java.awt.*;


public class Cubo2 extends Canvas {
    public static final int SALTO = 100;
    public Cubo2() {
        setBackground(Color.black);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.blue);

        //angulos
        g.drawLine(100, 300, 340, 120);//1
        g.drawLine(700, 300, 940, 120);//2
        g.drawLine(700, 900, 940, 720);//3

        //cuadro
        g.drawLine(100, 300, 100, 900);//1 I
        g.drawLine(700, 300, 700, 900);//2 I


        //laterales
        g.drawLine(940, 720, 940, 120);


        for (int i = 20; i <= 650; i += 50) {
            //linea orizontal
            g.drawLine(100, 250 + i + 30, 700, 250 + i + 30);//1 _


            g.drawLine(100, 300, 700, 300);
            g.drawLine(120, 285, 720, 285);
            g.drawLine(140, 270, 740, 270);


            g.drawLine(700, 280+i, 940, 100+i);

        }

        for (int i = 30; i <= 300; i += 30) {
            for (int i3 = 40; i3 <= 600; i3 += 40) {
                //lineas frente



            }
        }

        g.setColor(Color.WHITE);

        dibujarFrente(g);
    }

    private void dibujarFrente(Graphics g) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                //lineas frente
               g.setColor(Color.GREEN);
               g.drawLine(150 + j * SALTO, 300 + i * SALTO, 150 + j * SALTO, 350 + i * SALTO);
               g.setColor(Color.CYAN);
               g.drawLine(100 + j * SALTO, 350 + i * SALTO, 100 + j * SALTO, 400 + i * SALTO);

                g.drawLine(720+i*20, 285*SALTO,720+i*20,335);
                g.drawLine(760, 255,760,305);
                g.drawLine(800, 225,800,275);

            }
        }
    }
}
