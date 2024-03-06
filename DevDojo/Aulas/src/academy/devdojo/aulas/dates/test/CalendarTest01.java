package academy.devdojo.aulas.dates.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        //é uma classe abstrata
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        Date date = c.getTime();
    }
}
