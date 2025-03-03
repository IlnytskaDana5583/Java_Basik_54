package homework_42_1;
/*Имеется список целых чисел.
Необходимо отфильтровать этот список, оставив только чётные числа, затем каждое число умножить на 2, и собрать результат в новый список
*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task_3 {
    public static void main(String[] args) {
        List<Integer> intNumbers = Arrays.asList(20,35,45,60,120,53,150,40);
        List<Integer> result = intNumbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
