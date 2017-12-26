package pl.testerzy;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataTestGenerator {

    public static String getTodayAndTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
}
