import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class CalculadoraApp {
    private Calculadora calc = new Calculadora();
    private JTextField num1, num2, resultado;

    public CalculadoraApp() {
        JFrame frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.setBackground(new Color(199, 225, 188));
        JPanel fieldsPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        fieldsPanel.setOpaque(false);

        fieldsPanel.add(new JLabel("Número 1:"));
        num1 = new JTextField();
        fieldsPanel.add(num1);

        fieldsPanel.add(new JLabel("Número 2:"));
        num2 = new JTextField();
        fieldsPanel.add(num2);

        fieldsPanel.add(new JLabel("Resultado:"));
        resultado = new JTextField();
        resultado.setEditable(false);
        resultado.setBackground(Color.WHITE);
        fieldsPanel.add(resultado);

        mainPanel.add(fieldsPanel, BorderLayout.CENTER);

        JPanel buttonsPanel = new JPanel(new GridLayout(1, 4, 10, 0));
        buttonsPanel.setOpaque(false);

        JButton btnSomar = new JButton("+");
        btnSomar.setBackground(new Color(165, 129, 161));
        btnSomar.setForeground(Color.BLACK);
        btnSomar.setFocusPainted(false);
        btnSomar.addActionListener(this::somar);
        buttonsPanel.add(btnSomar);

        JButton btnSubtrair = new JButton("-");
        btnSubtrair.setBackground(new Color(232, 128, 110));
        btnSubtrair.setForeground(Color.BLACK);
        btnSubtrair.setFocusPainted(false);
        btnSubtrair.addActionListener(this::subtrair);
        buttonsPanel.add(btnSubtrair);

        JButton btnMultiplicar = new JButton("×");
        btnMultiplicar.setBackground(new Color(78, 124, 158));
        btnMultiplicar.setForeground(Color.BLACK);
        btnMultiplicar.setFocusPainted(false);
        btnMultiplicar.addActionListener(this::multiplicar);
        buttonsPanel.add(btnMultiplicar);

        JButton btnDividir = new JButton("/");
        btnDividir.setBackground(new Color(193, 162, 106));
        btnDividir.setForeground(Color.BLACK);
        btnDividir.setFocusPainted(false);
        btnDividir.addActionListener(this::dividir);
        buttonsPanel.add(btnDividir);

        mainPanel.add(buttonsPanel, BorderLayout.SOUTH);

        frame.setContentPane(mainPanel);
        frame.setVisible(true);
    }

    private void somar(ActionEvent e) {
        if (lerNumeros()) {
            double res = calc.somar(Double.parseDouble(num1.getText()), Double.parseDouble(num2.getText()));
            resultado.setText(String.valueOf(res));
        }
    }

    private void subtrair(ActionEvent e) {
        if (lerNumeros()) {
            double res = calc.subtrair(Double.parseDouble(num1.getText()), Double.parseDouble(num2.getText()));
            resultado.setText(String.valueOf(res));
        }
    }

    private void multiplicar(ActionEvent e) {
        if (lerNumeros()) {
            double res = calc.multiplicar(Double.parseDouble(num1.getText()), Double.parseDouble(num2.getText()));
            resultado.setText(String.valueOf(res));
        }
    }

    private void dividir(ActionEvent e) {
        if (lerNumeros()) {
            try {
                double res = calc.dividir(Double.parseDouble(num1.getText()), Double.parseDouble(num2.getText()));
                resultado.setText(String.valueOf(res));
            } catch (ArithmeticException ex) {
                JOptionPane.showMessageDialog(null, "Divisão por zero não é permitida", "Erro", JOptionPane.ERROR_MESSAGE);
                resultado.setText("");
            }
        }
    }

    private boolean lerNumeros() {
        try {
            Double.parseDouble(num1.getText());
            Double.parseDouble(num2.getText());
            return true;
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Digite números válidos!", "Entrada inválida", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {}

        SwingUtilities.invokeLater(CalculadoraApp::new);
    }
}
