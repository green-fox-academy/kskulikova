import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SuperHexagon {

  private static int WIDTH = 840;
  private static int HEIGHT = 840;

  private static void mainDraw(Graphics2D g2) {

    int mainCenterX = WIDTH / 2;
    int mainCenterY = HEIGHT / 2;

    int radius = 20;

    int centerX = mainCenterX - 3 * radius + (int) (3 * Math.cos(4.18879)) * radius;
    int centerY = mainCenterY - 3 * radius;

    drawHexagonOfHexagonsLeft(centerX, centerY, radius, g2, 4);

    centerX = mainCenterX + 4 * radius - (int) (3 * Math.cos(4.18879)) * radius;
    drawHexagonOfHexagonsRight(centerX, centerY, radius, g2, 4);
  }

  private static void drawHexagonOfHexagonsLeft(int centerX, int centerY, int r,
      Graphics graphics, int number) {
    drawHexagonLine(centerX, centerY, r, graphics, number);
    if (number < 7) {
      drawHexagonOfHexagonsLeft(centerX + r - (int) (Math.cos(4.18879) * r),
          centerY - (int) (Math.sin(1.0472) * r), r, graphics, number + 1);
    }
  }

  private static void drawHexagonOfHexagonsRight(int centerX, int centerY, int r,
      Graphics graphics, int number) {
    drawHexagonLine(centerX, centerY, r, graphics, number);
    if (number < 6) {
      drawHexagonOfHexagonsRight(centerX - r + (int) (Math.cos(4.18879) * r),
          centerY - (int) (Math.sin(1.0472) * r), r, graphics, number + 1);
    }
  }

  private static void drawHexagonLine(int centerX, int centerY, int r,
      Graphics graphics, int number) {
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

    if (number > 1) {
      drawHexagonLine(centerX, centerY + 2 * (int) (Math.sin(2.0944) * r), r, graphics, number - 1);
    }
  }


  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.add(panel);
    jFrame.setVisible(true);
    jFrame.pack();
  }

  static class ImagePanel extends JPanel {

    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      Graphics2D g2 = (Graphics2D) graphics;
      g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
          RenderingHints.VALUE_ANTIALIAS_ON);
      mainDraw(g2);
    }
  }
}
