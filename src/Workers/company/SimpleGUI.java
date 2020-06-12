package Workers.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI extends JFrame {
    private JButton button = new JButton("Press");
    private JTextField input = new JTextField("", 5);
    private JLabel label = new JLabel("Input: ");
    private JRadioButton jrbutton = new JRadioButton("Radio #1");
    private JRadioButton jrbutton1 = new JRadioButton("Radio #2");
    private JCheckBox check = new JCheckBox("Check", false);

    public SimpleGUI() {
        super("Simple Example");
        this.setBounds(100, 100, 250, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        container.add(label);
        container.add(input);

        ButtonGroup group = new ButtonGroup();
        group.add(jrbutton);
        group.add(jrbutton1);
        container.add(jrbutton);
        jrbutton.setSelected(true);
        container.add(jrbutton1);
        container.add(check);
        button.addActionListener(new BEL());
        container.add(button);

    }

    class BEL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message = "";
            message += "Button was pressed\n";
            message += "Text is" + input.getText() + "\n";
            message += (jrbutton.isSelected() ? "Radio #1 " : "Radio #2 " ) + "is selected!" + "\n";
            message += "checkbox is " + ((check.isSelected()) ? "checked" : "unchecked\n");
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
