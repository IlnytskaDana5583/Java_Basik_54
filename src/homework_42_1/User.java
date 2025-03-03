package homework_42_1;

import java.util.List;
import java.util.Optional;



/*Напишите метод findUserById(int id), который возвращает Optional<User>. Метод принимает List<User> и int id.

Если пользователь с заданным id существует в списке, вернуть Optional с пользователем, иначе вернуть Optional.empty().

Подсказка:
Используйте Optional.of(user) или Optional.empty().

 */


class User {
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;


    }
    public static Optional<User> findUserById(List<User> users, int id) {
        Optional<User> foundUser = users.stream()
                .filter(user -> user.getId() == id)
                .findFirst();

        return foundUser.isPresent() ? foundUser : Optional.empty();
    }

    public static void main(String[] args) {
        List<User> users = List.of(
                new User(1, "John"),
                new User(2, "Alice"),
                new User(3, "Bob")
        );
       Optional<User> user = findUserById(users, 3);

        System.out.println("User found:" + user.map(User::getName).orElse("not found"));
    }
}



