package homework_26;

public class PairApp {
    public static void main(String[] args) {


        Pair<String> pair = new Pair<>("Guten Morgen","World");
        System.out.println(pair.toString());
        pair.swap();

        System.out.println("меняем местами:" + pair.getFirst() + "," + pair.getSecond());



    }
}
