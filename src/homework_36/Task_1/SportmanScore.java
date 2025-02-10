package homework_36.Task_1;

import java.util.Comparator;


    public class SportmanScore implements Comparator<Sportsman> {
    @Override
    public int compare(Sportsman sportsman1, Sportsman sportsman2) {
        return sportsman1.getScore() - sportsman2.getScore();

   }
}
