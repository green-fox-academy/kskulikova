import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {

  static int WIDTH = 560;
  static int HEIGHT = 560;

//    static int width = WIDTH;
//    static int height = HEIGHT;

  public static void mainDraw(Graphics graphics, int width, int height, int n) {
    width = WIDTH / n;
    height = HEIGHT / n;
    int numberOfLines = 25;
    int stepX = width / numberOfLines;
    int stepY = height / numberOfLines;

    for (int j = 0; j < n; j++) {
      for (int i = 0; i < n; i++) {
        int startXLeft = 3 + width * i;
        int startYLeft = stepY * 2 + 3 + height * j;

        int endXLeft = startXLeft + stepX + 3;
        int endYLeft = height - 3 + height * j;

        graphics.setColor(Color.green);
        drawLinesLeft(startXLeft, startYLeft, endXLeft, endYLeft, graphics, stepX, stepY, width, i);

        int startXRight = width - 3 + width * i;
        int startYRight = height - (stepY * 2 + 3) + height * j;

        int endXRight = width - (stepX + 3) + width * i;
        int endYRight = 3 + height * j;

        graphics.setColor(Color.magenta);
        drawLinesRight(startXRight, startYRight, endXRight, endYRight, graphics, stepX, stepY,
            width,
            i);
      }
    }
  }

  private static void drawLinesLeft(int startX, int startY, int endX, int endY, Graphics graphics,
      int stepX, int stepY, int width, int i) {

    if (endX < width - stepX * 2 + width * i) {

      graphics.drawLine(startX, startY, endX, endY);
      drawLinesLeft(startX, startY + stepY, endX + stepX, endY, graphics, stepX, stepY, width, i);
    }
  }

  private static void drawLinesRight(int startX, int startY, int endX, int endY, Graphics graphics,
      int stepX, int stepY, int width, int i) {

    if (endX > width * i + stepX) {

      graphics.drawLine(startX, startY, endX, endY);
      drawLinesRight(startX, startY - stepY, endX - stepX, endY, graphics, stepX, stepY, width, i);
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
      int n = 16;
      mainDraw(graphics, WIDTH, HEIGHT, (int) Math.sqrt(n));
    }
  }
}