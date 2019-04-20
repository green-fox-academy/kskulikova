
import static javax.swing.JFrame.EXIT_ON_CLOSE;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EnvelopeStar {

  static int WIDTH = 560;
  static int HEIGHT = 560;

  public static void mainDraw(Graphics graphics, int width, int height) {

    graphics.setColor(Color.green);
    width = WIDTH / 2;
    height = HEIGHT / 2;
    int numberOfLines = 25;

    int stepX = width / numberOfLines;
    int stepY = height / numberOfLines;

    int startX = width;
    int startY = stepY * 2;

    int endX = startX - stepX;
    int endY = height;

    drawLines1(startX, startY, endX, endY, graphics, stepX, stepY);

    startY = stepY * 2;
    endX = startX + stepX;

    drawLines2(startX, startY, endX, endY, graphics, stepX, stepY, width);

    startY = height - stepY * 2 + height;
    endX = startX - stepX;

    drawLines3(startX, startY, endX, endY, graphics, stepX, stepY);

    endX = startX + stepX;

    drawLines4(startX, startY, endX, endY, graphics, stepX, stepY, width);

  }

  private static void drawLines1(int startX, int startY, int endX, int endY, Graphics graphics,
      int stepX, int stepY) {

    if (endX > stepX * 2) {

      graphics.drawLine(startX, startY, endX + stepX, endY);
      drawLines1(startX, startY + stepY, endX - stepX, endY, graphics, stepX, stepY);
    }
  }

  private static void drawLines2(int startX, int startY, int endX, int endY, Graphics graphics,
      int stepX, int stepY, int width) {

    if (endX < width * 2 - stepX * 2) {

      graphics.drawLine(startX, startY, endX, endY);
      drawLines2(startX, startY + stepY, endX + stepX, endY, graphics, stepX, stepY, width);
    }
  }

  private static void drawLines3(int startX, int startY, int endX, int endY, Graphics graphics,
      int stepX, int stepY) {

    if (endX > stepX) {

      graphics.drawLine(startX, startY, endX + stepX, endY);
      drawLines3(startX, startY - stepY, endX - stepX, endY, graphics, stepX, stepY);
    }
  }

  private static void drawLines4(int startX, int startY, int endX, int endY, Graphics graphics,
      int stepX, int stepY, int width) {

    if (endX < width * 2 - stepX) {

      graphics.drawLine(startX, startY, endX, endY);
      drawLines4(startX, startY - stepY, endX + stepX, endY, graphics, stepX, stepY, width);
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
      mainDraw(graphics, WIDTH, HEIGHT);
    }
  }
}
