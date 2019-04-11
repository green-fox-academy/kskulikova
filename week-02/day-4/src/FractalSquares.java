import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FractalSquares {

    public static void mainDraw(Graphics graphics) {
        graphics.setColor(Color.yellow);
        graphics.fillRect(0, 0, WIDTH, HEIGHT);
        int width = WIDTH;
        int height = HEIGHT;
        int startX = 0;
        int startY = 0;
        int endX = width;
        int endY = height;

        graphics.setColor(Color.black);
//        graphics.drawLine(width / 3, startY, width / 3, endY);
//        graphics.drawLine(width * 2 / 3, startY, width * 2 / 3, endY);
//
//        graphics.drawLine(startX, height / 3, endX, height / 3);
//        graphics.drawLine(startX, height * 2 / 3, endX, height * 2 / 3);

        drawFractals(startX, startY, endX, endY, width, height, graphics);
    }

    private static void drawFractals(int startX, int startY, int endX, int endY, int width, int height, Graphics graphics ){

        if (height > 5) {

            graphics.drawLine(startX + width / 3, startY, startX + width / 3, endY);
            graphics.drawLine(startX + width * 2 / 3, startY, startX + width * 2 / 3, endY);
//
            graphics.drawLine(startX, startY + height / 3, endX, startY + height / 3);
            graphics.drawLine(startX, startY + height * 2 / 3, endX, startY + height * 2 / 3);

            drawFractals(startX + width/3, startY, startX + width/3, startY + height/3, width/3, height/3, graphics);
//            drawFractals(startX; startY + height/3, startX, );
//            drawFractals();
//            drawFractals();

        }
}


    // Don't touch the code below
    static int WIDTH = 1320;
    static int HEIGHT = 1320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
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