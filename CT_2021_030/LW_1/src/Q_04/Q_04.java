package Q_04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Q_04 {
    public static void main(String[] args) {
        // Creating a Date object
        Date today= new Date();
        // Creating a SimpleDateFormat object
        SimpleDateFormat sdf =new SimpleDateFormat("dd MMM yyyy");
        // Formatting and printing
        System.out.println(sdf.format(today));
    }
}
