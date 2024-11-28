package lesson_19;

public class ConstantDemo {

    public static final double PI = 3.141519;//Константа
    public static final int[] ints = new int[10];//НЕ константа,т.к. состояние(значения в масиве) могут быть изменены
    public static final String COUNTRY = "Germany";
    public static final String[] colors = {"red", "blue", "yellow"};//НЕ константа,т.к.значения в масиве можно перезаписать

    private final int x;//НЕ константа.т.к. значения переменно могут быть разными для разных обьектов

    public  ConstantDemo(int x) {
        this.x = x;
        colors[1] = "green";

    }
    public int getX() {
        return x;
    }

    public void showCountry() {
        System.out.println("My coutry is " + COUNTRY);
    }
}
