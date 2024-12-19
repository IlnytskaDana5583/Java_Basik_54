package lesson_27.enums.days;

public class DayApp {

    public static void main(String[] args) {


        for (Day day : Day.values()) {
            System.out.println("day:" + day);
            System.out.println("day.getRussian()day" + day.getRussianName());




        }

    }
}
