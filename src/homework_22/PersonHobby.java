package homework_22;

public class PersonHobby extends Person {

    @Override
    public void run() {
        int speed = 15;
        System.out.println("Человек-любитель пробегает:" + speed + "км/ч");
        rest();
    }
    @Override
    public void rest() {
        int restT = 10;
        System.out.println("Время отдыха у любителя:" + restT +"минут");
    }


    }

