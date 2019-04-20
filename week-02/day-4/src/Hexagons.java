import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Hexagons {

  static int WIDTH = 840;
  static int HEIGHT = 840;

  private static void mainDraw(Graphics graphics) {

    graphics.setColor(Color.black);
    int centerX = WIDTH / 2;
    int centerY = HEIGHT / 2;
    int radius = 320;

    drawHexagons(centerX, centerY, radius, graphics);

  }

  private static void drawHexagons(int centerX, int centerY, int r,
      Graphics graphics) {
    int[] x = new int[6];
    int[] y = new int[6];

    x[0] = centerX + (int) (Math.cos(0) * r);
    y[0] = centerY + (int) (Math.sin(0) * r);

    x[1] = centerX + (int) (Math.cos(1.0472) * r);
    y[1] = centerY + (int) (Math.sin(1.0472) * r);

    x[2] = centerX + (int) (Math.cos(2.0944) * r);
    y[2] = centerY + (int) (Math.sin(2.0944) * r);

    x[3] = centerX + (int) (Math.cos(3.14159) * r);
    y[3] = centerY + (int) (Math.sin(3.14159) * r);

    x[4] = centerX + (int) (Math.cos(4.18879) * r);
    y[4] = centerY + (int) (Math.sin(4.18879) * r);

    x[5] = centerX + (int) (Math.cos(5.23599) * r);
    y[5] = centerY + (int) (Math.sin(5.23599) * r);

    graphics.drawPolygon(x, y, 6);
    if (r > 20) {
      drawHexagons(centerX + (int) (Math.cos(0) * r / 2), centerY + (int) (Math.sin(0) * r / 2),
          r / 2, graphics);
      drawHexagons(centerX + (int) (Math.cos(2.0944) * r / 2),
          centerY + (int) (Math.sin(2.0944) * r / 2), r / 2, graphics);
      drawHexagons(centerX + (int) (Math.cos(4.18879) * r / 2),
          centerY + (int) (Math.sin(4.18879) * r / 2), r / 2, graphics);
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

