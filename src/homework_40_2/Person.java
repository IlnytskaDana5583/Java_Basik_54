package homework_40_2;
/*Task 3
Дан список Person с полями name, age, city. Используйте Stream API для фильтрации людей, которые старше определенного возраста и проживают в определенном городе, а затем соберите их в список.

Например, старше 25 лет и проживающих в городе "Berlin"

 */

import java.util.List;
import java.util.stream.Collectors;

public class Person {
    String name;
    int age;
    String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", 25, "New York"),
                new Person("Alice", 30, "Berlin"),
                new Person("Bob", 22, "Paris"),
                new Person("Eve", 28, "Berlin"),
                new Person("Charlie", 35, "Berlin")
        );

        List<Person> result  = people.stream()
                .filter(p -> p.age > 25 && p.city.equals("Berlin"))
                .collect(Collectors.toList());
        System.out.println(result);




    }




}
