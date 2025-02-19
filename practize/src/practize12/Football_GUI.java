package practize12;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Football_GUI {
    private int milan_score = 0;
    private int madrid_score = 0;

    private final ArrayList<Shape> shapes = new ArrayList<>();
    private final DrawingPanel drawingPanel;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Football_GUI::new);
    }

    public Football_GUI() {
        JFrame GUI = new JFrame("Madrid/Milan");
        int width = 1024;
        int height = 768;
        GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI.setSize(width, height);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(width, height));
        GUI.add(layeredPane);

        drawingPanel = new DrawingPanel();
        Color customColor = new Color(205, 237, 100);
        drawingPanel.setBackground(customColor);
        drawingPanel.setBounds(0, 0, width, height);
        layeredPane.add(drawingPanel, Integer.valueOf(0));

        JPanel panel = new JPanel();
        panel.setOpaque(false);
        panel.setLayout(null);
        panel.setBounds(0, 0, width, height);
        layeredPane.add(panel, Integer.valueOf(1));

        JButton milan_button = new JButton("AC Milan");
        JButton madrid_button = new JButton("Real Madrid");

        milan_button.setPreferredSize(new Dimension(200, 50));
        madrid_button.setPreferredSize(new Dimension(200, 50));

        Font buttonFont = new Font("Courier", Font.BOLD, 25);
        milan_button.setFont(buttonFont);
        madrid_button.setFont(buttonFont);

        milan_button.setBackground(new Color(133, 0, 143));
        milan_button.setForeground(new Color(25, 212, 50));
        madrid_button.setBackground(new Color(133, 0, 143));
        madrid_button.setForeground(new Color(25, 212, 50));

        milan_button.setBounds(176, 500, 200, 90);
        madrid_button.setBounds(688, 500, 200, 90);

        panel.add(milan_button);
        panel.add(madrid_button);

        JLabel resLabel = new JLabel("Result: 0 X 0");
        resLabel.setFont(new Font("MS Gothic", Font.BOLD, 60));
        resLabel.setForeground(Color.RED);
        resLabel.setHorizontalAlignment(SwingConstants.CENTER);
        resLabel.setBounds(250, 100, width / 2, 80);

        JLabel lastScoreLabel = new JLabel("Last Goal: N/A");
        lastScoreLabel.setFont(new Font("MS Gothic", Font.BOLD, 44));
        lastScoreLabel.setForeground(new Color(128, 0, 128));
        lastScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lastScoreLabel.setBounds(100, 200, 700, 80);

        JLabel winLabel = new JLabel("Winner: DRAW");
        winLabel.setFont(new Font("MS Gothic", Font.BOLD, 40));
        winLabel.setForeground(new Color(0, 128, 0));
        winLabel.setHorizontalAlignment(SwingConstants.CENTER);
        winLabel.setBounds(148, 300, 700, 80);

        panel.add(resLabel);
        panel.add(lastScoreLabel);
        panel.add(winLabel);

        milan_button.addActionListener(_ -> {
            milan_score++;
            resLabel.setText("Result: " + milan_score + " X " + madrid_score);
            lastScoreLabel.setText("Last Scorer: AC Milan");
            updateWinner(winLabel);
            if (milan_score % 6 == 0) {
                drawShapes("triangle");
            }
        });

        madrid_button.addActionListener(_ -> {
            madrid_score++;
            resLabel.setText("Result: " + milan_score + " X " + madrid_score);
            lastScoreLabel.setText("Last Scorer: Real Madrid");
            updateWinner(winLabel);
            if (madrid_score % 6 == 0) {
                drawShapes("circle");
            }
        });

        GUI.pack();
        GUI.setVisible(true);
    }


    private void updateWinner(JLabel winLabel) {
        if (milan_score > madrid_score) {
            winLabel.setText("Winner: AC Milan");
        } else if (madrid_score > milan_score) {
            winLabel.setText("Winner: Real Madrid");
        } else {
            winLabel.setText("Winner: DRAW");
        }
    }

    private void drawShapes(String shapeType) {
        Random random = new Random();
        shapes.clear();
        for (int i = 0; i < 20; i++) {
            int x = random.nextInt(1024);
            int y = random.nextInt(768);
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            shapes.add(new Shape(x, y, shapeType, color));
        }
        drawingPanel.repaint();
    }

    class DrawingPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            for (Shape shape : shapes) {
                g2d.setColor(shape.color);
                if ("circle".equals(shape.type)) {
                    g2d.fillOval(shape.x, shape.y, 50, 50);
                } else if ("triangle".equals(shape.type)) {
                    int[] xPoints = {shape.x, shape.x + 25, shape.x - 25};
                    int[] yPoints = {shape.y, shape.y + 50, shape.y + 50};
                    g2d.fillPolygon(xPoints, yPoints, 3);
                }
            }
        }
    }

    static class Shape {
        int x, y;
        String type;
        Color color;

        public Shape(int x, int y, String type, Color color) {
            this.x = x;
            this.y = y;
            this.type = type;
            this.color = color;
        }
    }
}