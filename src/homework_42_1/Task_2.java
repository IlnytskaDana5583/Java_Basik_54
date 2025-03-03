package homework_42_1;
/*Имеется список строк. Используя Stream API, найдите строку с минимальной длиной.

 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Task_2 {
    public static void main(String[] args) {
        List<String> strings = List.of("Dog","Bear","Parrot","Elephant");
       String min = strings.stream()
               .min(Comparator.comparingInt(String::length))
               .orElse("Default");
        System.out.println(min);









    }
}
