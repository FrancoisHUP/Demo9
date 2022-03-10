import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JPanel mainPanel;
    private JPanel myPanel;
    private JTextField textField;
    private JButton button = new JButton();
    private JTextPane textPane1;
    private JLabel label;

    public MainFrame(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setVisible(true);
        this.pack();

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == button) {
                    System.out.println("le boutton a ete press");
                    String text = textField.getText();
                    System.out.println(text);
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame jFrame = new MainFrame("Demo9");
    }


}
