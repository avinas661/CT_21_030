package Q5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MyFrame extends JFrame {

    public MyFrame() {
        setSize(400, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.green);



        JButton pushbutton = new JButton("OFF");
        pushbutton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pushbutton.getText().equals("OFF")){
                    getContentPane().setBackground(Color.red);
                    pushbutton.setText("ON");
                }else {
                    getContentPane().setBackground(Color.GREEN);
                    pushbutton.setText("OFF");
                }

            }
        });


        add(pushbutton);
        setLayout(null);
        pushbutton.setBounds(100,100,100,30);


    }

}
