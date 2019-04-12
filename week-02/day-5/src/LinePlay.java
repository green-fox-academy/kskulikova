import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    static int WIDTH = 560;
    static int HEIGHT = 560;

    public static void mainDraw(Graphics graphics) {
        int numberOfLines = 50;
        int stepX = WIDTH / numberOfLines;
        int stepY = HEIGHT / numberOfLines;

        int startXLeft = 3;
        int startYLeft = stepY * 2 + 3;

        int endXLeft = stepX + 3;
        int endYLeft = HEIGHT - 3;

        graphics.setColor(Color.green);
        drawLinesLeft(startXLeft, startYLeft, endXLeft, endYLeft, graphics, stepX, stepY);

        int startXRight = WIDTH - 3;
        int startYRight = HEIGHT - (stepY * 2 + 3);

        int endXRight = WIDTH - (stepX + 3);
        int endYRight = 3;

        graphics.setColor(Color.magenta);
        drawLinesRight(startXRight, startYRight, endXRight, endYRight, graphics, stepX, stepY);

    }

    private static void drawLinesLeft(int startX, int startY, int endX, int endY, Graphics graphics, int stepX, int stepY) {

        if (endX < WIDTH - stepX * 2) {

            graphics.drawLine(startX, startY, endX, endY);
            drawLinesLeft(startX, startY + stepY, endX + stepX, endY, graphics, stepX, stepY);
        }
    }

    private static void drawLinesRight(int startX, int startY, int endX, int endY, Graphics graphics,int stepX, int stepY) {

        if (endX > 40) {

            graphics.drawLine(startX, startY, endX, endY);
            drawLinesRight(startX, startY - stepY, endX - stepX, endY, graphics,stepX, stepY);
        }
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
//        jFrame.setLocationRelativeTo(null);
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