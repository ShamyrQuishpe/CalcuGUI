import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Calcu extends JFrame {
    private JPanel panelito;
    private JTextField val1;
    private JTextField val2;
    private JButton sumaButton;
    private JButton restaButton;
    private JButton multiplicaciónButton;
    private JButton raizButton;
    private JButton potenciaButton;
    private JButton divisionButton;
    private JButton tanButton;
    private JButton cosButton;
    private JButton senButton;
    private JButton porcentajeButton;
    private JButton button11;
    private JButton logaritmo10Button;
    private JButton borrarButton;
    private JButton cerrarButton;
    private JButton unirButton;


    public Calcu(){
        super("OPERACIONES");
        setContentPane(panelito);
        cerrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.exit(0);
            }
        });
        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                val1.setText("");
                val2.setText("");
            }
        });
        unirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre1 = val1.getText();
                String nombre2 = val2.getText();
                String resultado = nombre1 + nombre2;

                JOptionPane.showMessageDialog(null, "Su resultado es: " + resultado);
            }
        });

        sumaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Double valor1 = Double.parseDouble(val1.getText());
                    Double valor2 = Double.parseDouble(val2.getText());
                    JOptionPane.showMessageDialog(null, "Su resultado es: " + (valor1 + valor2));
                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, exception.getMessage());
                }
            }
        });

        restaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Double valor1 = Double.parseDouble(val1.getText());
                    Double valor2 = Double.parseDouble(val2.getText());
                    JOptionPane.showMessageDialog(null, "Su resultado es: " + (valor1 - valor2));
                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, exception.getMessage());
                }
            }
        });


        multiplicaciónButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Double valor1 = Double.parseDouble(val1.getText());
                    Double valor2 = Double.parseDouble(val2.getText());
                    JOptionPane.showMessageDialog(null, "Su resultado es: " + (valor1 * valor2));
                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, exception.getMessage());
                }
            }
        });

        divisionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Double valor1 = Double.parseDouble(val1.getText());
                    Double valor2 = Double.parseDouble(val2.getText());
                    if (valor2==0){
                        JOptionPane.showMessageDialog(null, "No existe divisiones para 0 ingrese otro numero");
                    }else {
                        JOptionPane.showMessageDialog(null, "Su resultado es: " + (valor1 / valor2));
                    }
                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, exception.getMessage());
                }
            }
        });
        potenciaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Double valor1 = Double.parseDouble(val1.getText());
                    Double valor2 = Double.parseDouble(val2.getText());
                    JOptionPane.showMessageDialog(null, "Su resultado es: " + Math.pow(valor1, valor2));
                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, exception.getMessage());
                }
            }
        });

        raizButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Double valor1 = Double.parseDouble(val1.getText());
                    Double valor2 = Double.parseDouble(val2.getText());
                    JOptionPane.showMessageDialog(null, "Su resultado 1 es: " + Math.sqrt(valor1) + "\nSu resultado 2 es: " + Math.sqrt(valor2));

                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, exception.getMessage());
                }
            }
        });

        senButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Double valor1 = Double.parseDouble(val1.getText());
                    Double valor2 = Double.parseDouble(val2.getText());
                    JOptionPane.showMessageDialog(null, "Su resultado 1 es: " + Math.sin(valor1) + "\nSu resultado 2 es: " + Math.sin(valor2));

                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, exception.getMessage());
                }
            }
        });

        cosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Double valor1 = Double.parseDouble(val1.getText());
                    Double valor2 = Double.parseDouble(val2.getText());
                    JOptionPane.showMessageDialog(null, "Su resultado 1 es: " + Math.cos(valor1) + "\nSu resultado 2 es: " + Math.cos(valor2));

                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, exception.getMessage());
                }
            }
        });

        tanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Double valor1 = Double.parseDouble(val1.getText());
                    Double valor2 = Double.parseDouble(val2.getText());
                    JOptionPane.showMessageDialog(null, "Su resultado 1 es: " + Math.tan(valor1) + "\nSu resultado 2 es: " + Math.tan(valor2));

                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, exception.getMessage());
                }
            }

        });

        logaritmo10Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Double valor1 = Double.parseDouble(val1.getText());
                    Double valor2 = Double.parseDouble(val2.getText());
                    JOptionPane.showMessageDialog(null, "Su resultado 1 es: " + Math.log10(valor1) + "\nSu resultado 2 es: " + Math.log10(valor2));

                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, exception.getMessage());
                }
            }
        });


        porcentajeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Double valor1 = Double.parseDouble(val1.getText());
                    Double valor2 = Double.parseDouble(val2.getText());
                    JOptionPane.showMessageDialog(null, "Su resultado es "+(valor1*(valor2/100.0)));

                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, exception.getMessage());
                }
            }
        });

    }
}
