package Q_07;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q_07 {
    public static void main(String[] args) {
        // Creating a Date object
        Date today= new Date();
        // Creating a SimpleDateFormat object
        SimpleDateFormat sdf =new SimpleDateFormat("hh:mm:ss a");
        // Creating a JFrame object
        JFrame frame = new JFrame();
        // Setting the window size, title and visible
        frame.setSize(400,200);
        frame.setTitle(sdf.format(today));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }
}
