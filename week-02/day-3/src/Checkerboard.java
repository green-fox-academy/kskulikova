import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        int counter = 0;

        for (int i = 0; i <= WIDTH - WIDTH / 8; i = i + WIDTH / 8) {
            counter++;
            for (int j = 0; j <= HEIGHT - HEIGHT / 8; j += HEIGHT / 8) {
                graphics.drawRect(j, i, HEIGHT / 8, HEIGHT / 8);
                if (counter % 2 != 0) {
                    graphics.fillRect(j, i, HEIGHT / 8, HEIGHT / 8);
                }
                counter++;
            }
        }
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