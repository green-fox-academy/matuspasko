import javax.swing .*;

import java.awt .*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;



        public class ColoredBbox {
            public static void mainDraw(Graphics graphics) {
                // Draw a box that has different colored lines on each edge.
                graphics.setColor(Color.red);
                graphics.drawLine(20,20,150,20);
                // draw a green vertical line to the canvas' middle.
                graphics.setColor(Color.green);
                graphics.drawLine(20,150, 150, 150 );
                graphics.setColor(Color.pink);
                graphics.drawLine(20, 20, 20, 150);
                graphics.setColor(Color.blue);
                graphics.drawLine(150, 20, 150, 150);
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


