import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.JFrame.isDefaultLookAndFeelDecorated;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.

        Color rainbowColors[] = {null, new Color(255, 0, 0), new Color(255, 127, 0),
                new Color(255, 255, 0), new Color(0, 255, 0), new Color(0, 0, 255),
                new Color(75, 0, 130), new Color(148, 0, 211)};
        int size = 240;
        for (int i = 1; i < 8; i++) {
            size -= 30;
            rainbowBox(size, rainbowColors[i], graphics);
        }
    }

    public static void rainbowBox(int size, Color color, Graphics graphics) {
        graphics.setColor(color);
        graphics.fillRect(WIDTH / 2 - size / 2, HEIGHT / 2 - size / 2, size, size);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

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