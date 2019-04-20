
import java.awt.geom.Line2D;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {

  private static int WIDTH = 840;
  private static int HEIGHT = 840;

  private static void mainDraw(Graphics2D g2) {

    int side = WIDTH;

    double leftX = 0;
    double leftY = 728;

    double upX = side / 2;
    double upY = 0;

    double rightY = 728;

    double stepX = side / 21;
    double stepY = Math.sqrt(3) * stepX / 2;

    drawLeft(leftX, leftY, upX, upY, g2, side, stepX, stepY);
    drawRight(upX, upY, (double) side, rightY, g2, stepX, stepY);
    drawHorizontal(leftX, leftY, (double) side, rightY, g2, side, stepX, stepY);

  }

  private static void drawLeft(double startX, double startY, double endX, double endY,
      Graphics2D graphics,
      double side, double stepX, double stepY) {

    Shape line = new Line2D.Double(startX, startY, endX, endY);

    graphics.draw(line);
    if (startX < side - stepX) {
      drawLeft(startX + stepX, startY, endX + stepX / 2, endY + stepY, graphics, side, stepX,
          stepY);
    }
  }

  private static void drawRight(double startX, double startY, double endX, double endY,
      Graphics2D graphics, double stepX, double stepY) {

    Shape line = new Line2D.Double(startX, startY, endX, endY);

    graphics.draw(line);
    if (endX > stepX) {
      drawRight(startX - stepX / 2, startY + stepY, endX - stepX, endY, graphics, stepX,
          stepY);
    }
  }

  private static void drawHorizontal(double startX, double startY, double endX, double endY,
      Graphics2D graphics,
      double side,
      double stepX, double stepY) {

    Shape line = new Line2D.Double(startX, startY, endX, endY);

    graphics.draw(line);
    if (startX < side / 2 - stepX / 2) {
      drawHorizontal(startX + stepX / 2, startY - stepY, endX - stepX / 2, endY - stepY, graphics,
          side,
          stepX, stepY);
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