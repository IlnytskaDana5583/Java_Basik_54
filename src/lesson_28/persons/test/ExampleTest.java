package lesson_28.persons.test;

import lesson_27.enums.days.Day;
import lesson_28.persons.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ExampleTest {

    //метод @ВЕ будет выполнятся перед каждым тестовым методом
    @BeforeEach
    void setUp() {
        System.out.println("Метод @ВЕ");
    }
    //@BE выполняется  после каждого тестового метода
    //@BALL метод выполниться один раз перед выполнение первого теста.требует static
    //@AfterEach после каждого тестового метода
    //@AfterAll метод выполнится только один раз после последнего теста.требует static
    //@Disable тест отключен.выполнять не требуется

    //указывает,что метод тестовий.таким образом JUnit знает
    // что этот метод нужно запустить во время теста
    @Test
    public void testAddition() {
        System.out.println("test Addition");

        int result = 2 + 2;

        //метод проверки утверждения
        //assertEquals(expected,actual)

        //Assertion - класс и у него static методы
        //СТАТИЧЕСКИЕ МЕТОДЫ-
        assertEquals(4, result);//проверяет равны ли значения
        assertNotEquals(9, result);//тест пройден если неожидаемый
        // результат не равен фактическому
        assertTrue(result >= 4);//проверяет что условие верно возвращает true
        assertFalse(result > 4);//проверяеет что условие ложно вовращает false
        assertNull(null);//проверяет что обьект равен null
        assertNotNull("String");//проверяет что обьект не равен null

    }

    @Disabled
    @Test
    public void emptyTest() {
        System.out.println("Empty test");
        //пустой тестовый метод считается успешно пройденим
        //т.к в методе нет ложного утверждения
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 5, 9, 11})   //@ValueSource - источник данних
    public void testNumber(int number) {
        System.out.println("number = " + number);
        assertTrue(number > 0);

    }

    @ParameterizedTest
    @ValueSource(strings = {"apple", "banane", "cherry"})
    public void testFruit(String fruit) {
        System.out.println("fruit = " + fruit);
        assertTrue(fruit.length() > 2);
    }

    // csv Comma-Separated-Value //формат данних - табличный(значения,разделенные запятой)
    //apple,1
    //banane,2
    @ParameterizedTest
    @CsvSource({"apple,1", "banane,2", "cherry,3"})
    //csv - источник(другой формат)
    void testWithCsvSource(String fruit, int rank) {
        System.out.println(fruit + " | " + (rank + 10));
        assertTrue(fruit.length() > 4 && rank > 0);

    }

    //Источник данных файл в формате CSV
    @ParameterizedTest
    @CsvFileSource(resources = "data.scv")
    void testWithCsvFileSource(String fruit, int rank, boolean flag) {
        System.out.println(fruit + " | " + rank + " | " + !flag);
        assertNotNull(fruit);
        assertTrue(rank > 0);

    }

    //Источник данных Enum
    @EnumSource(Day.class)
    @ParameterizedTest
    void testEnums(Day day) {
        System.out.println("day = " + day);
        assertNotNull(day);
    }

    //Источник данных - метод
    @ParameterizedTest
    @MethodSource("testDataString")
    public void testWithMethodSource(String argument) {
        System.out.println("argument =" + argument);
        assertNotNull(argument);
    }

    static Stream<String> testDataString() {
        return Stream.of("apple", "banane", "cherry");
    }

    static Stream<Integer> testInteger() {
        return Stream.of(1, 5, 6, 7, 8);
    }

    //arguments - работа с разними типами данних- обьединение разных наборов полей
    @ParameterizedTest
    @MethodSource("testDataArgument")
    void testMethodSource2(int value, int expected, boolean isEquels) {
        System.out.println(value + " | " + expected + " | " + isEquels);
        int result = value * value;
        assertEquals(isEquels, result == expected);

    }

    static Stream<Arguments> testDataArgument() {
        return Stream.of(               //создаем Stream
                Arguments.of(2, 4, true),//создаем Arguments
                Arguments.of(3, 9, true),
                Arguments.of(4, 15, false)
        );
    }
    @ParameterizedTest
    @MethodSource("testPersonData")
    void testPersonData(Person person,String email){
        System.out.println("person = "  + person);
        System.out.println("email =" + email);
        System.out.println("\n==========================\n");

    }
    static Stream<Arguments> testPersonData() {
        Person person = new Person("test@gmail.com","pass1Q!4");
        return Stream.of(
                Arguments.of(person,"new1234@gvail.com"),
                Arguments.of(new Person("invalid.email.com","password"),"email.test.com")
        );

    }




}