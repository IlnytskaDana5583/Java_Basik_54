package homework_37;

import java.util.Arrays;
import java.util.List;

public class ListInterfaceApp {
    public static  void main(String[] args) {
        ListInterfase listInterfase = new ListInterfase();

        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        List<Integer> list2 = Arrays.asList(4,5,6,7,8);

        List<Integer> common = listInterfase.findElements(list1, list2);
        System.out.println("общие елементы: " + common);
                




    }
}
