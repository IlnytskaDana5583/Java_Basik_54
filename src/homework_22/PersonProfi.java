package homework_22;

public class PersonProfi extends Person{

    public void run() {
        int speed = 25;
        System.out.println("Человек-профи пробегает:" + speed + "км/ч");
        rest();
    }

    public void rest() {
        int restT = 5;
        System.out.println("Время отдыха:" + restT + "минут");
    }
}
