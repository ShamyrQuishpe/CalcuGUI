import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new Calcu();
                frame.setSize(450,450);
                frame.setVisible(true);
            }
        });
    }
}