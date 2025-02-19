package fifth_one;

import javax.swing.*;
import java.awt.*;

public class FirstGui {
    // Переменные для хранения счета
    private int milanScore = 0;
    private int madridScore = 0;

    // Компоненты GUI
    private JLabel resultLabel;
    private JLabel lastScorerLabel;
    private JLabel winnerLabel;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(FirstGui::new);
    }

    public FirstGui() {
        JFrame frame = new JFrame("Soccer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        frame.setLocationRelativeTo(null);
        Color customColor = new Color(230, 230, 250);

        // Панель
        JPanel panel = new JPanel();
        panel.setBackground(customColor);
        panel.setPreferredSize(new Dimension(800, 600));
        panel.setLayout(null);

        JButton jButton1 = new JButton("AC Milan");
        JButton jButton2 = new JButton("Real Madrid");
        jButton1.setPreferredSize(new Dimension(100, 50));
        jButton2.setPreferredSize(new Dimension(100, 50));

        // Шрифты
        Font buttonFont = new Font("Arial", Font.BOLD, 20);
        jButton1.setFont(buttonFont);
        jButton2.setFont(buttonFont);

        // Кастомизация кнопок
        jButton1.setBackground(new Color(255, 127, 80));
        jButton1.setForeground(new Color(255, 215, 0));

        jButton2.setBackground(new Color(255, 127, 80));
        jButton2.setForeground(new Color(255, 215, 0));

        // Расстановка кнопок
        jButton1.setBounds(150, 400, 160, 70);
        jButton2.setBounds(450, 400, 160, 70);
        panel.add(jButton1);
        panel.add(jButton2);

        // Создание меток для результата и победителя
        resultLabel = createStyledLabel("Result: 0 X 0", new Font("Serif", Font.BOLD, 40), Color.RED);
        lastScorerLabel = createStyledLabel("Last Scorer: N/A", new Font("Serif", Font.BOLD, 24), new Color(128, 0, 128));
        winnerLabel = createStyledLabel("Winner: DRAW", new Font("Serif", Font.BOLD, 30), new Color(0, 128, 0));

        // Расположение меток
        resultLabel.setBounds(250, 50, 300, 40);
        lastScorerLabel.setBounds(250, 140, 300, 40);
        winnerLabel.setBounds(250, 230, 300, 40);

        // Добавление меток на панель
        panel.add(resultLabel);
        panel.add(lastScorerLabel);
        panel.add(winnerLabel);

        // Добавляем обработчики событий для кнопок с использованием лямбда-выражений
        jButton1.addActionListener(e -> {
            milanScore++;
            updateLabels("AC Milan");
        });

        jButton2.addActionListener(e -> {
            madridScore++;
            updateLabels("Real Madrid");
        });

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    // Метод для создания стилизованной метки
    private JLabel createStyledLabel(String text, Font font, Color color) {
        JLabel label = new JLabel(text);
        label.setFont(font);
        label.setForeground(color);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        return label;
    }

    // Метод для обновления меток
    private void updateLabels(String lastScorer) {
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);
        lastScorerLabel.setText("Last Scorer: " + lastScorer);
        updateWinnerLabel();
    }

    // Метод для обновления победителя
    private void updateWinnerLabel() {
        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (madridScore > milanScore) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }
}
