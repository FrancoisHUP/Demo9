import utils.MyFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame1 extends JFrame implements ActionListener {

    private JButton button;

    public MainFrame1() {
        MyFrame.buildCustomFrame(this);
        button = MyFrame.createSmallSizeButton("button !", 100, 50);
        JLabel label = MyFrame.createStandartLabel("label :", 100, 10);

        this.add(button);
        this.add(label);

        addListeners();
    }

    private void addListeners() {
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println(button.getText() + " pressed.");
        }
    }

    public static void main(String[] args) {
        JFrame myFrame = new MainFrame1();

    }
}

