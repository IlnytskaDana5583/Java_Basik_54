package homework_36.Task_1;

import java.util.Arrays;
import java.util.Comparator;

public class SportmanApp {
    public static void main(String[] args) {


        Sportsman[] sportmans = new Sportsman[3];

        sportmans[0] = new Sportsman("Vlad", 40, 3000);
        sportmans[1] = new Sportsman("Ivan", 20, 1000);
        sportmans[2] = new Sportsman("Petr", 30, 2000);

        System.out.println(Arrays.toString(sportmans));

        System.out.println("\n=====================\n");

        Arrays.sort(sportmans);
        System.out.println(Arrays.toString(sportmans));

        System.out.println("\n=====================\n");

        SportmanScore sportmanScore = new SportmanScore();
        Arrays.sort(sportmans, sportmanScore);
        System.out.println(Arrays.toString(sportmans));

        System.out.println("\n=====================\n");


        Arrays.sort(sportmans, new Comparator<Sportsman>() {
            @Override
            public int compare(Sportsman sportsman1, Sportsman sportsman2) {
                //  return Integer.compare(sportsman1.getAge(),sportsman2.getAge());

                return sportsman1.getAge() - sportsman2.getAge();
            }
        });

        System.out.println(Arrays.toString(sportmans));
    }
}