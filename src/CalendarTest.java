import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalendarTest {
    public static void main(String args[])
    {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        //minusDays 减去指定参数
        date = date.minusDays(today - 1);

        DayOfWeek weekday = date.getDayOfWeek();
        int weekdayVal = weekday.getValue();

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < weekdayVal; i++) {
            System.out.print("    ");
        }
        while (date.getMonthValue() == month)
        {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today) {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) {
                System.out.println();
            }

        }
    }

}
