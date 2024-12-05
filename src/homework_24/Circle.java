package homework_24;

public class Circle  extends Shape{
    double radius;
    public static final double PI = 3.14159;


    public Circle() {
    }

    @Override
    public void result() {
        double radius = 7.0;
        double calculaterR = radius * radius * PI;
        double сalculaterR1 = 2 * PI * radius;

        System.out.println("Площадь круга:" +calculaterR);
        System.out.println("Периметр круга:" + сalculaterR1);

    }


    @Override
    public void getArea() {

    }

    @Override
    public void getPerimeter() {

    }
}

