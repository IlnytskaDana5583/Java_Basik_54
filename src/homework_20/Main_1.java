package homework_20;

public class Main_1 {
    public static void main(String[] args) {


        Apple apple = new Apple("Яблуко",500,"Golden",2024);
        System.out.println(apple.toString());
        apple.toBuy();

        System.out.println("\n===========================\n");


        Pear pear = new Pear("Груша:",300,200);
        pear.toBuy();

        pear.toImp();

    }
}
