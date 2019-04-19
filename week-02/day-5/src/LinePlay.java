import static javax.swing.JFrame.EXIT_ON_CLOSE;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LinePlay {

  static int WIDTH = 310;
  static int HEIGHT = 310;

  public static void mainDraw(Graphics graphics) {
    int numberOfLines = 14;
    int stepX = WIDTH / numberOfLines;
    int stepY = HEIGHT / numberOfLines;

    int startXLeft = 2;
    int startYLeft = stepY * 2 + 2;

    int endXLeft = stepX + 2;
    int endYLeft = HEIGHT - 2;

    graphics.setColor(Color.green);
    drawLinesLeft(startXLeft, startYLeft, endXLeft, endYLeft, graphics, stepX, stepY);

    int startXRight = WIDTH - 2;
    int startYRight = HEIGHT - (stepY * 2 + 2);

    int endXRight = WIDTH - (stepX + 2);
    int endYRight = 2;

    graphics.setColor(Color.magenta);
    drawLinesRight(startXRight, startYRight, endXRight, endYRight, graphics, stepX, stepY);
  }

  private static void drawLinesLeft(int startX, int startY, int endX, int endY, Graphics graphics,
      int stepX, int stepY) {

    if (endX < WIDTH - stepX * 2) {

      graphics.drawLine(startX, startY, endX, endY);
      drawLinesLeft(startX, startY + stepY, endX + stepX, endY, graphics, stepX, stepY);
    }
  }

  private static void drawLinesRight(int startX, int startY, int endX, int endY, Graphics graphics,
      int stepX, int stepY) {

    if (endX > stepX) {

      graphics.drawLine(startX, startY, endX, endY);
      drawLinesRight(startX, startY - stepY, endX - stepX, endY, graphics, stepX, stepY);
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