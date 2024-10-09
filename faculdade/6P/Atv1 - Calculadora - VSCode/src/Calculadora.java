
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Calculadora extends JFrame implements ActionListener{
    private final JTextField display;
    private String num1 = "", num2 = "", operator = "";

    public Calculadora(){
        setTitle("Calculadora");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        //Display
        display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 32));
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        //Painel de botões
        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(4, 4, 10, 10));
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"            
        };
        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            extracted(button);
            painel.add(button);
        }
        add(painel, BorderLayout.CENTER);
    }

    private void extracted(JButton button) {
        button.addActionListener(this);
    }

    @Override

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if("0123456789.".contains(command)){
            if(operator.isEmpty()){
                num1 += command;
                display.setText(num1);
            }else{
                num2 += command;
                display.setText(num2);
            }
        }else if("/+-*".contains(command)){
            operator = command;
        }else if(command.equals("=")){
            double result = calculate(Double.parseDouble(num1), Double.parseDouble(num2), operator);
            display.setText(String.valueOf(result));
            num1 = String.valueOf(result);
            num2 = "";
            operator = "";
        }
    }

    public double calculate(double num1, double num2, String operator){
        return switch (operator) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> 0;
        };
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            Calculadora calc = new Calculadora();
            calc.setVisible(true);
        });
    }
}