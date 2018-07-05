package pair2;

import javafx.util.Pair;

import java.time.LocalDate;

public class PairTest2 {
    public static void main(String[] args) {
        LocalDate[] birthdays = {
                LocalDate.of(1906, 12, 9),
                LocalDate.of(1815, 12, 9),
                LocalDate.of(1903, 12, 9),
                LocalDate.of(1910, 12, 9)
        };

        Pair<LocalDate, LocalDate> mm = ArrayAlg.minmax(birthdays);
        System.out.println("min = " + mm.getKey());
        System.out.println("max = " + mm.getValue());
    }
}
