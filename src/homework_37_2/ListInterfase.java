package homework_37_2;

import java.util.ArrayList;
import java.util.List;

public class ListInterfase {

    public List<Integer>findElements(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            if (list2.contains(list1.get(i))) {
                result.add(list1.get(i));
            }
        }

        return result;


    }

}