package practize22.n2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class CalculatorApp {
    public static void main(String[] args) {
        class CalculatorModel {
            public String evaluateRPN(String expression) {
                String[] tokens = expression.split("\\s+");
                Stack<Integer> stack = new Stack<>();
                try {
                    for (String token : tokens) {
                        if (token.matches("-?\\d+")) {
                            stack.push(Integer.parseInt(token));
                        } else {
                            int b = stack.pop();
                            int a = stack.pop();
                            switch (token) {
                                case "+" -> stack.push(a + b);
                                case "-" -> stack.push(a - b);
                                case "*" -> stack.push(a * b);
                                case "/" -> stack.push(a / b);
                                default -> throw new IllegalArgumentException("Invalid operator: " + token);
                            }
                        }
                    }
                    return stack.pop().toString();
                } catch (Exception e) {
                    return "Error";
                }
            }
        }

        class CalculatorView extends JFrame {
            private JTextField display = new JTextField();

            private final JButton[] buttons = {
                    new JButton("7"), new JButton("8"), new JButton("9"), new JButton("/"),
                    new JButton("4"), new JButton("5"), new JButton("6"), new JButton("-"),
                    new JButton("1"), new JButton("2"), new JButton("3"), new JButton("+"),
                    new JButton("0"), new JButton("."), new JButton("="), new JButton("*")
            };

            public CalculatorView() {
                setTitle("MyCalculator");
                setSize(450, 550);
                setDefaultCloseOperation(EXIT_ON_CLOSE);
                setLayout(new BorderLayout());

                display.setPreferredSize( new Dimension( 450, 80 ) );
                Font font1 = new Font(Font.DIALOG, Font.BOLD, 36);
                display.setFont(font1);
                display.setEditable(false);
                add(display, BorderLayout.NORTH);

                JPanel panel = new JPanel();
                panel.setLayout(new GridLayout(4, 4));
                for (JButton button : buttons) {
                    Font buttonFont = new Font("Courier", Font.BOLD, 25);
                    button.setFont(buttonFont);
                    panel.add(button);
                }
                add(panel, BorderLayout.CENTER);
            }

            public void setInput(String value) {
                display.setText(value);
            }

            public void addButtonListener(ActionListener listener) {
                for (JButton button : buttons) {
                    button.addActionListener(listener);
                }
            }
        }

        class CalculatorController {
            private final CalculatorModel model;
            private final CalculatorView view;

            public CalculatorController(CalculatorModel model, CalculatorView view) {
                this.model = model;
                this.view = view;

                view.addButtonListener(new ButtonListener());
            }

            class ButtonListener implements ActionListener {
                private final StringBuilder input = new StringBuilder();

                @Override
                public void actionPerformed(ActionEvent e) {
                    String command = ((JButton) e.getSource()).getText();
                    if ("=".equals(command)) {
                        String result = model.evaluateRPN(input.toString());
                        view.setInput(result);
                        input.setLength(0);
                    } else {
                        input.append(command).append(" ");
                        view.setInput(input.toString());
                    }
                }
            }
        }
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        new CalculatorController(model, view);

        view.setVisible(true);
    }
}