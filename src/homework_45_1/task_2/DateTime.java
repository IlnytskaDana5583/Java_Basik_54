package homework_45_1.task_2;
/*
Написать метод, принимающий список из нескольких дат типа LocalDate и возвращающий количество дней между самой ранней и поздней датами в этом списке
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DateTime {
    public static void main(String[] args) {


        List<LocalDate> dates = Arrays.asList(
                LocalDate.of(2025, 4, 25),
                LocalDate.of(2025, 4, 15),
                LocalDate.of(2025, 4, 10));


        LocalDate minDate = dates.stream().min(LocalDate::compareTo).orElseThrow();
        LocalDate maxDate = dates.stream().max(LocalDate::compareTo).orElseThrow();


        long daysBetween = ChronoUnit.DAYS.between(minDate, maxDate);
        System.out.println(daysBetween);


    }

}

