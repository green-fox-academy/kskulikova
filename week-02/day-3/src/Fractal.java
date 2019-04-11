import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Fractal {
    public static void mainDraw(Graphics graphics) {

        graphics.setColor(Color.yellow);
        graphics.fillRect(0, 0, HEIGHT, WIDTH);

        graphics.setColor(Color.black);

        int h = HEIGHT;
        int w = WIDTH;
        int startX = 0;
        int startY = 0;

        makeFractal(startX, h, w, startY, graphics);
    }

    public static void makeFractal(int startX, int h, int w, int startY, Graphics graphics) {
        if (h >= 1) {

            drawLeftVerticalLine(w/3, startY, w / 3, h, graphics);

            graphics.drawLine(startX, h / 3, w, h / 3);
            graphics.drawLine(startX, h * 2 / 3, w, h * 2 / 3);

            graphics.drawLine(w / 3, startY, w / 3, h);
            graphics.drawLine(w * 2 / 3, startY, w * 2 / 3, h);

            startX /= 3;
            startY /= 3;


            makeFractal(startX + h / 3, h / 3, w / 3, startY + w / 3, graphics);
        }
    }

    void drawLeftVerticalLine(int startX, int endX, int startY, int endY, Graphics graphics) {
        if (startY - endY >= 1) {
            graphics.drawLine(startX, startY, endX, endY);

            drawLeftVerticalLine(startX + startX / 3, startX + startX / 3, startY, endY / 3, graphics);
            drawLeftVerticalLine(startX / 3, );
            drawLeftVerticalLine(startX / 3, );
            drawLeftVerticalLine(startX / 3, );

        }
    }


//        if (len >= 1) {
//            line(x,y,x+len,y);
//            y += 20;
//            cantor(x,y,len/3);
//            cantor(x+len*2/3,y,len/3);
//        }


    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Fractal.ImagePanel panel = new Fractal.ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}


