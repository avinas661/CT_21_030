package Q_05;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Q_05 {
    public static void main(String[] args) {
        // Creating a Date object
        Date today= new Date();
        // Creating a SimpleDateFormat object
        SimpleDateFormat sdf =new SimpleDateFormat("EEEE,MMM dd,yyyy");
        // Formatting and printing
        System.out.println(sdf.format(today));
    }
}
