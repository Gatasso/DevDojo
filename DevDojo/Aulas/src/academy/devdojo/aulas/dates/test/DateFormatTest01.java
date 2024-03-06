package academy.devdojo.aulas.dates.test;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        DateFormat[] df = new DateFormat[7];
        df[0] = DateFormat.getInstance(); // 05/03/2024 19:09
        df[1] = DateFormat.getDateInstance(); // 5 de mar. de 2024
        df[2] = DateFormat.getDateTimeInstance(); // 5 de mar. de 2024 19:09:22
        df[3] = DateFormat.getDateInstance(DateFormat.SHORT); // 05/03/2024
        df[4] = DateFormat.getDateInstance(DateFormat.MEDIUM); // 5 de mar. de 2024
        df[5] = DateFormat.getDateInstance(DateFormat.LONG); // 5 de março de 2024
        df[6] = DateFormat.getDateInstance(DateFormat.FULL); // terça-feira, 5 de março de 2024

        for (DateFormat dft: df) {
            System.out.println(dft.format(calendar.getTime()));
        }
    }
}
