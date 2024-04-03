package mainnProject;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class timeSheetValidation {

    public static String formatDate(Date date) {
        DateFormat df = new SimpleDateFormat("dd-MMM-yyyy", Locale.getDefault());
        return df.format(date);
    }

    static boolean isSaturday(LocalDate localDate) {
        return localDate.getDayOfWeek() == DayOfWeek.SATURDAY;
    }

    static boolean isFriday(LocalDate localDate) {
        return localDate.getDayOfWeek() == DayOfWeek.FRIDAY;
    }
    
    public static boolean isPrecedingDate(String date1, String date2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        LocalDate localDate1 = LocalDate.parse(date1, formatter);
        LocalDate localDate2 = LocalDate.parse(date2, formatter);
        return localDate2.isBefore(localDate1);
    }

    public static void main(String[] args) throws ParseException {
        String[] tsweek1 = {"23-Mar-2024", "29-Mar-2024"}; // Corrected date format
        String[] tsweek2 = {"16-Mar-2024", "22-Mar-2024"};
        String[] tsweek3 = {"09-Mar-2024", "15-Mar-2024"};

        // Define the expected date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");

        // Parse the string date into a LocalDate object
        LocalDate w1sd = LocalDate.parse(tsweek1[0], formatter);
        LocalDate w1ed = LocalDate.parse(tsweek1[1], formatter);
        LocalDate w2sd = LocalDate.parse(tsweek2[0], formatter);
        LocalDate w2ed = LocalDate.parse(tsweek2[1], formatter);
        LocalDate w3sd = LocalDate.parse(tsweek3[0], formatter);
        LocalDate w3ed = LocalDate.parse(tsweek3[1], formatter);

        if (isFriday(w1ed) && isFriday(w2ed) && isFriday(w3ed) && isSaturday(w1sd) && isSaturday(w2sd) &&isSaturday(w3sd)) {
            System.out.println("All weeks passed");
        }
        else {
        	System.out.println("Not passed");
        }
        
        ////////////
        boolean isPreceding1 = isPrecedingDate(tsweek1[0], tsweek2[1]);
        boolean isPreceding2 = isPrecedingDate(tsweek2[0], tsweek3[1]);

        System.out.println("tsweek2[1] is preceding date of tsweek1[0]: " + isPreceding1);
        System.out.println("tsweek3[1] is preceding date of tsweek2[0]: " + isPreceding2);
        
        
    }
}
