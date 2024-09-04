import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc {
    private JPanel Calc;
    private JButton ACButton;
    private JButton equalls;
    private JButton Minus;
    private JButton divide;
    private JButton multiplie;
    private JTextField displayText;
    private JButton plus;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton a0Button;
    private JButton SquareRoot;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton a00Button;
    private JButton mod;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton Dot;

    private double firstNumber = 0;
    private double secondNumber = 0;
    private String operator = "";

    public Calc() {
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayText.setText(""); // Clear the text field

            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayText.setText(displayText.getText()+ a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayText.setText(displayText.getText()+ a8Button.getText());

            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayText.setText(displayText.getText()+a9Button.getText());
            }
        });

//4
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayText.setText(displayText.getText()+a4Button.getText());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayText.setText(displayText.getText()+a5Button.getText());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayText.setText(displayText.getText()+a6Button.getText());
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayText.setText(displayText.getText()+a1Button.getText());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayText.setText(displayText.getText()+a2Button.getText());

            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayText.setText(displayText.getText()+a3Button.getText());

            }
        });
        a00Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayText.setText(displayText.getText()+a00Button.getText());

            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayText.setText(displayText.getText()+ a0Button.getText());
            }
        });

        //-----------------------------------
        plus.addActionListener(new ActionListener() {//+
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber = Double.parseDouble(displayText.getText());
                operator = "+";
                displayText.setText("");// بيفضي الشاشة للاستقبال الرقم التاني
            }
        });
        equalls.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secondNumber = Double.parseDouble(displayText.getText());
                double result = 0;
                if (operator.equals("+")) {
                    result = firstNumber + secondNumber;
                } else if (operator.equals("-")) {
                    result = firstNumber - secondNumber;
                }  else if (operator.equals("*")) {
                    result = firstNumber * secondNumber;
                } else if (operator.equals("/")) {
                    result = firstNumber / secondNumber;
                } else if (operator.equals("%")) {
                    result = firstNumber % secondNumber;
                }
                displayText.setText(String.valueOf(result));
            }
        });
        Minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber = Double.parseDouble(displayText.getText());
                operator = "-";
                displayText.setText("");
            }
        });
        multiplie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber = Double.parseDouble(displayText.getText());
                operator = "*";
                displayText.setText("");
            }
        });
        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber = Double.parseDouble(displayText.getText());
                operator = "/";
                displayText.setText("");
            }
        });
        mod.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber = Double.parseDouble(displayText.getText());
                operator = "%";
                displayText.setText("");
            }
        });

        SquareRoot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber = Double.parseDouble(displayText.getText());
                operator = " √";
                displayText.setText(String.valueOf(Math.sqrt(firstNumber)));

            }

        });
        Dot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentText = displayText.getText();
                if (!currentText.contains(".")) { // تحقق من عدم وجود فاصلة عشرية مسبقاً
                    displayText.setText(currentText + ".");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calc");
        frame.setContentPane(new Calc().Calc);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
