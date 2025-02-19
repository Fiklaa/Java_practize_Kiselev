package practize16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TextEditor {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(TextEditor::new);
    }

    public TextEditor() {
        JFrame frame = new JFrame("Типо МС офис но круче");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLayout(new BorderLayout());

        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        textArea.setForeground(Color.BLACK);
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        JMenuBar menuBar = new JMenuBar();

        JMenu colorMenu = new JMenu("Цвет");
        JMenuItem blueColor = new JMenuItem("Синий");
        JMenuItem redColor = new JMenuItem("Красный");
        JMenuItem blackColor = new JMenuItem("Черный");

        blueColor.addActionListener((ActionEvent e) -> textArea.setForeground(Color.BLUE));
        redColor.addActionListener((ActionEvent e) -> textArea.setForeground(Color.RED));
        blackColor.addActionListener((ActionEvent e) -> textArea.setForeground(Color.BLACK));

        colorMenu.add(blueColor);
        colorMenu.add(redColor);
        colorMenu.add(blackColor);

        JMenu fontMenu = new JMenu("Шрифт");
        JMenuItem timesFont = new JMenuItem("Times New Roman");
        JMenuItem sansFont = new JMenuItem("MS Sans Serif");
        JMenuItem courierFont = new JMenuItem("Courier New");

        timesFont.addActionListener((ActionEvent e) -> textArea.setFont(new Font("Times New Roman", Font.PLAIN, 16)));
        sansFont.addActionListener((ActionEvent e) -> textArea.setFont(new Font("MS Sans Serif", Font.PLAIN, 16)));
        courierFont.addActionListener((ActionEvent e) -> textArea.setFont(new Font("Courier New", Font.PLAIN, 16)));

        fontMenu.add(timesFont);
        fontMenu.add(sansFont);
        fontMenu.add(courierFont);

        menuBar.add(colorMenu);
        menuBar.add(fontMenu);

        frame.setJMenuBar(menuBar);

        frame.setVisible(true);
    }
}
