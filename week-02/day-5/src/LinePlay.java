import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    static int WIDTH = 560;
    static int HEIGHT = 560;

    public static void mainDraw(Graphics graphics) {

        int startXLeft = 0;
        int startYLeft = 80;

        int endXLeft = 40;
        int endYLeft = 560;
        graphics.setColor(Color.green);
        drawLinesLeft(startXLeft, startYLeft, endXLeft, endYLeft, graphics);
    }

    private static void drawLinesLeft(int startX, int startY, int endX, int endY, Graphics graphics) {

        if (endX < 560) {

            graphics.drawLine(startX, startY, endX, endY);
            drawLinesLeft(startX, startY + 40, endX + 40, endY, graphics);
        }
    }

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