package lesson_28.persons.test;

import lesson_28.persons.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PersonTest {

    Person person;
    String startEmail = "jon@test.com";
    String startPassword = "querty1Q1";

    @BeforeEach
    void  setUp() {
        person = new Person(startEmail,startPassword);
    }

    @Test
    void testValidEmailSet() {    //тестирование установки валидного емейла
        String validEmail = "valid@test.com";

        person.setEmail(validEmail);

        assertEquals(validEmail,person.getEmail());//проверить что у него не остался старий емейл
        assertNotEquals(startEmail,person.getEmail());// неожидаемый емейл заменен на ожидаемый
    }

    /*1.Берем невалидный емейл
      2.Устанавливаем его сеттером персону
      3. ожидаемый результат -invalidемейл установлен не будет
      4.
     */
    //не устанавливаются не инвалидные емейлы

    //testmail.net
    //test@@.net
    @ParameterizedTest
    @MethodSource("invalidEmailData")
    void testInvalidEmailSet(String invalidEmail) {
        person.setEmail(invalidEmail);
        assertNotEquals(invalidEmail,person.getEmail());
        assertEquals(startEmail,person.getEmail());

    }
       static Stream<String> invalidEmailData() {
        return Stream.of(
                "testmail.net",
                        "test@@mail.net",
                "test@mai@l.com",
                "fdg@hjjk,k."
        );
    }
    @Test
    void testValidPasswordSet() {
        String validPassword = "validPass1$";

        person.setPassword(validPassword);
        assertEquals(validPassword,person.getPassword());
        assertNotEquals(startPassword,person.getPassword());
    }

    @ParameterizedTest
    @MethodSource("invalidPasswordData")
    void testInvalidPasswordSet(String invalidPassword) {
        person.setPassword(invalidPassword);
        assertNotEquals(invalidPassword,person.getPassword());
        assertEquals(startPassword,person.getPassword());
    }



    static Stream<String> invalidPasswordData() {
        return Stream.of(
                "validPass1",
                "valid",
                "123"
        );
    }

    }














