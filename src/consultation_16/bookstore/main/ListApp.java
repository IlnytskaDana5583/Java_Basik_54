package consultation_16.bookstore.main;

import consultation_16.bookstore.main.model.CategoryGoods;
import consultation_16.bookstore.main.model.Goods;

import java.util.ArrayList;

public class ListApp {
    public static void main(String[] args) {
        //міні хранилище
        int[] numberArray = new int[10];
        numberArray[0] = 24;
        numberArray[1] = 29;
        numberArray[2] = 31;

        String[] stringArray = new String[10];
        stringArray[0] = "Sergey";
        stringArray[1] = "Petr";
        stringArray[2] = "Ivan";

        // хранилище
        String[] goodArray = {"book", "pen", "pencil", "notebook"};
        ArrayList<Goods> goodsList = new ArrayList<>();

        //создание товаров в хранилище
        Goods goods1 = new Goods("Литовский", CategoryGoods.BREAD, 3.25);
        Goods goods2 = new Goods("Белоруский", CategoryGoods.BREAD, 3.15);
        Goods goods3 = new Goods("Французкий", CategoryGoods.BREAD, 2.95);


        //добавление товаров в хранилище
        goodsList.add(goods1);
        goodsList.add(goods2);
        goodsList.add(goods3);


        System.out.println(goodsList.size());
        for (Goods goods : goodsList) {
            System.out.println(goods);
        }
    }
}