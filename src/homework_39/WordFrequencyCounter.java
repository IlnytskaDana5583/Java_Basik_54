package homework_39;

import java.util.HashMap;
import java.util.Map;

//Частотный словарь слов: Напишите метод, который принимает строку текста
// и возвращает Map<String, Integer>, где каждому слову соответствует количество его вхождений в текст.



public class WordFrequencyCounter {

    public static Map<String, Integer> countWords(String text) {
        Map<String, Integer> mapWord = new HashMap<>();

        text = text.toLowerCase();
        String[] words = text.replaceAll("[^a-zA-Za-яА-ЯёЁ0-9]", " ").split("\\s+");

        for (String word : words) {
            if (!word.isEmpty()) {
                mapWord.put(word, mapWord.getOrDefault(word, 0) + 1);
            }
        }
        return mapWord;


    }

    public  static void main(String[] args) {

        String text = "Програмирование - это интересно!Програмирование открывает новые возможности" ;




        Map<String,Integer> frequencyMap = countWords(text);
        System.out.println(frequencyMap);

    }
}
