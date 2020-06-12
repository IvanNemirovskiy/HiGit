package Workers.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI2 extends JFrame {
    private JButton button = new JButton("Press PLS");
    private JTextField input = new JTextField("", 6);
    private JLabel label = new JLabel("Enter Something");
    private JRadioButton radio = new JRadioButton("Kobe", true);
    private JRadioButton radio1 = new JRadioButton("MJ");
    private JCheckBox checkBox = new JCheckBox("Check", false);

    public SimpleGUI2() {
        super("SGUI2");
        this.setBounds(200, 200, 300, 500);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        container.add(input);
        container.add(label);

        container.add(button);
        ButtonGroup group = new ButtonGroup();
        group.add(radio);
        group.add(radio1);
        container.add(radio);
        container.add(radio1);
        container.add(checkBox);
        button.addActionListener(new output());
        container.add(button);
        getContentPane().setBackground(Color.YELLOW);



    }

    class output implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            String message1 = "";
            message1 += "Button was pressed\n";
            message1 += "Text is" + input.getText()+ "\n";
            message1 += radio.isSelected() ? "Radio #1\n " : "Radio #2\n " + "selected" + "\n";
            message1 += "Check Box is " + ((checkBox.isSelected()) ? "checked\n" : "unchecked\n" );
            JOptionPane.showMessageDialog(null,message1,"output", JOptionPane.PLAIN_MESSAGE );



        }
    }
}
