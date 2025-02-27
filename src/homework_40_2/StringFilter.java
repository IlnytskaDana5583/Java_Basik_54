package homework_40_2;

/*Дан список строк.

Используя Stream API, отфильтруйте строки, которые начинаются на определенную букву (например, "A") и отсортируйте их в алфавитном порядке.

Результат сохраните в новый список строк.
 */

import java.util.List;
import java.util.stream.Collectors;

public class StringFilter {

    public static List<String> filterString(List<String> strings, char firstLetter) {
        return strings.stream()
                .filter(s -> ! s.isEmpty() && s.charAt(0) == firstLetter)
                .sorted()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> words = List.of("Apple","Banana","Avocado","Cherry","Apricot");
        List<String> result = filterString(words, 'A');
        System.out.println(result);
    }

}

