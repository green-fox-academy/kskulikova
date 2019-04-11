import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FractalSquares {
    static int WIDTH = 810;
    static int HEIGHT = 810;

    public static void mainDraw(Graphics graphics) {
        graphics.setColor(Color.yellow);
        graphics.fillRect(0, 0, WIDTH, HEIGHT);
        int width = WIDTH;
        int height = HEIGHT;
        int startX = 0;
        int startY = 0;

        graphics.setColor(Color.black);
//        graphics.drawLine(width / 3, startY, width / 3, endY);
//        graphics.drawLine(width * 2 / 3, startY, width * 2 / 3, endY);
//
//        graphics.drawLine(startX, height / 3, endX, height / 3);
//        graphics.drawLine(startX, height * 2 / 3, endX, height * 2 / 3);

        drawFractals(startX, startY, width, height, graphics);
    }

    private static void drawFractals(int startX, int startY, int width, int height, Graphics graphics) {

        if (height > 5) {

            int oneThirdHeight = height / 3, twoThirdsHeight = 2 * height / 3;
            int oneThirdWidth = width / 3, twoThirdsWidth = 2 * width / 3;

            graphics.drawLine(startX + oneThirdWidth, startY, startX + oneThirdWidth, startY + height);
            graphics.drawLine(startX + twoThirdsWidth, startY, startX + twoThirdsWidth, startY + height);

            graphics.drawLine(startX, startY + oneThirdHeight, startX + width, startY + oneThirdHeight);
            graphics.drawLine(startX, startY + twoThirdsHeight, startX + width, startY + twoThirdsHeight);

            drawFractals(startX + oneThirdWidth, startY, oneThirdWidth, oneThirdHeight, graphics);
            drawFractals(startX, startY + oneThirdHeight, oneThirdWidth, oneThirdHeight, graphics);
            drawFractals(startX + oneThirdWidth, startY + twoThirdsHeight, oneThirdWidth, oneThirdHeight, graphics);
            drawFractals(startX + twoThirdsWidth, startY + oneThirdHeight, oneThirdWidth, oneThirdHeight, graphics);
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