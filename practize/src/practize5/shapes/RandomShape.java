package practize5.shapes;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

class DrawATriangle extends JPanel {
    public void paintComponent(Graphics g) {
        int[] xPoints = {50, 100, 0};
        int[] yPoints = {0, 100, 100};
        g.drawPolygon(xPoints, yPoints, 3);
    }
}
public class RandomShape extends JPanel {
    private final Shape[] shapes;
    private static final int ROWS = 5;
    private static final int COLS = 4;

    public RandomShape() {
        setLayout(new GridBagLayout());

        Random rand = new Random();
        shapes = new Shape[ROWS * COLS];

        for (int i = 0; i < shapes.length; i++) {
            int choice = rand.nextInt(0, 3);
            Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));

            switch (choice) {
                case 0 -> {
                    int radius = rand.nextInt(50) + 10;
                    shapes[i] = new Krug(0, 0, radius, color);
                }
                case 1 -> {
                    int width = rand.nextInt(100) + 20;
                    int height = rand.nextInt(100) + 20;
                    shapes[i] = new Priamougolnik(0, 0, width, height, color);
                }
                case 2 -> {
                    int side = rand.nextInt(100) + 20;
                    shapes[i] = new Kvadrat(0, 0, side, color);
                }
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int panelWidth = getWidth();
        int panelHeight = getHeight();
        int cellWidth = panelWidth / COLS;
        int cellHeight = panelHeight / ROWS;

        for (int i = 0; i < shapes.length; i++) {
            int row = i / COLS;
            int col = i % COLS;
            int x = col * cellWidth + cellWidth / 4;
            int y = row * cellHeight + cellHeight / 4;
            shapes[i].setPosition(x, y);
            shapes[i].draw(g);
        }
    }

    public static void main(String[] args) {
        JFrame GUI = new JFrame("Random Shapes");
        RandomShape panel = new RandomShape();

        GUI.setLayout(new GridBagLayout());
        GridBagConstraints grid = new GridBagConstraints();
        grid.fill = GridBagConstraints.BOTH;
        grid.weightx = 1;
        grid.weighty = 1;

        panel.setBackground(new Color(250, 255, 207));
        GUI.add(panel, grid);
        GUI.setSize(new Dimension(700, 700));
        GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI.setVisible(true);
    }
}
