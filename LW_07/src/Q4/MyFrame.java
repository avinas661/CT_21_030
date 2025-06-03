package Q4;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class MyFrame extends JFrame {

    public MyFrame() {
        setSize(400, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JTextField inputtitle = new JTextField();

        JButton pushbutton = new JButton("change title");
        pushbutton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setTitle(inputtitle.getText());
            }
        });

        add(inputtitle);
        add(pushbutton);

        setLayout(null);

        inputtitle.setBounds(50,50,200,30);
        pushbutton.setBounds(100,100,100,30);


    }

}
