package practize5;

import javax.swing.*;
import java.awt.*;


public class Football_GUI {
    private int milan_score = 0;
    private int madrid_score = 0;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Football_GUI::new);
    }

    public Football_GUI() {
        JFrame GUI = new JFrame("Madrid/Milan");

        int width = 1024;
        int height = 768;

        GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI.setSize(width, height);
        Color customColor = new Color(205, 237, 100);

        JPanel panel = new JPanel();
        panel.setBackground(customColor);
        panel.setPreferredSize(new Dimension(width, height));
        panel.setLayout(null);

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
        resLabel.setBounds(250, 100, width/2, 80);

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
            if (milan_score > madrid_score) {
                winLabel.setText("Winner: AC Milan");
            } else if (madrid_score > milan_score) {
                winLabel.setText("Winner: Real Madrid");
            } else {
                winLabel.setText("Winner: DRAW");
            }
        });

        madrid_button.addActionListener(_ -> {
            madrid_score++;
            resLabel.setText("Result: " + milan_score + " X " + madrid_score);
            lastScoreLabel.setText("Last Scorer: Real Madrid");
            if (milan_score > madrid_score) {
                winLabel.setText("Winner: AC Milan");
            } else if (madrid_score > milan_score) {
                winLabel.setText("Winner: Real Madrid");
            } else {
                winLabel.setText("Winner: DRAW");
            }
        });

        GUI.getContentPane().add(panel);
        GUI.pack();
        GUI.setVisible(true);
    }
}
