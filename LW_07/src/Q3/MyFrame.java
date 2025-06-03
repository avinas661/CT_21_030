package Q3;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class MyFrame extends JFrame {

    public MyFrame() {
        setSize(400, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton pushbutton = new JButton("click here");
        pushbutton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"You clicked!");
            }
        });

        add(pushbutton);




    }

}
