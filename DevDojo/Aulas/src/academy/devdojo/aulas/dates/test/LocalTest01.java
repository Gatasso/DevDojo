package academy.devdojo.aulas.dates.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocalTest01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");
        Calendar calendar = Calendar.getInstance();
        DateFormat.getDateInstance(DateFormat.FULL,localeItaly);
    }
}
