package practize15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MenuApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(MenuApp::new);
    }

    public MenuApp() {
        JFrame frame = new JFrame("Text Menu Editor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        JTextArea textArea = new JTextArea("This is the area you can write text.");
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        frame.add(buttonPanel, BorderLayout.NORTH);

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        saveItem.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(frame, "File saved!");
        });
        exitItem.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });

        JMenu editMenu = new JMenu("Edit");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem pasteItem = new JMenuItem("Paste");
        editMenu.add(copyItem);
        editMenu.add(cutItem);
        editMenu.add(pasteItem);

        copyItem.addActionListener((ActionEvent e) -> textArea.copy());
        cutItem.addActionListener((ActionEvent e) -> textArea.cut());
        pasteItem.addActionListener((ActionEvent e) -> textArea.paste());

        JMenu helpMenu = new JMenu("Help");
        JMenuItem aboutItem = new JMenuItem("About");
        helpMenu.add(aboutItem);

        aboutItem.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(frame, "Супер крутая приложуха на джаве");
        });

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
}
