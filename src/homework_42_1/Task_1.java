package homework_42_1;
/*Из списка целых чисел выделите те значения, которые больше 10; отсортируйте эти значения по значению последней цифры в числе и выведите результат на экране

 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



public class Task_1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,15,23,42,11,35,9,18,100);
        List<Integer> result = numbers.stream()
                .filter(n -> n > 10)
                .sorted(Comparator.comparingInt(n -> n % 10))
                .collect(Collectors.toList());
        System.out.println(result);


    }
}
