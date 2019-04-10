import javax.swing.*;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 2 parameters:
        // An array of {x, y} points and graphics
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}


        int[][] arr = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
                {120, 100}, {85, 130}, {50, 100}};
        int[][] arr1 = {{10, 10}, {290, 10}, {290, 290}, {10, 290}};

        connectTheDots(arr, graphics);
        connectTheDots(arr1, graphics);

    }

    public static void connectTheDots(int[][] arr, Graphics graphics) {
        int[] xpoints = new int[arr.length];
        int[] ypoints = new int[arr.length];


        for (int i = 0; i < arr.length; i++) {
            xpoints[i] = arr[i][0];
            ypoints[i] = arr[i][1];
        }

        graphics.setColor(Color.GREEN);
        graphics.drawPolygon(xpoints, ypoints, arr.length);


    }


//        int xpoints[] = {25, 145, 25, 145, 25};
//        int ypoints[] = {25, 25, 145, 145, 25};
//        int npoints = 5;
//
//        graphics.drawPolygon(xpoints, ypoints, npoints);


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
