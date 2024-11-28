package homework_20;

public class Circle extends Shape{
    public double radius;
    public static final double PI = 3.14159;


    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;

    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public void calculateArea() {
        double area = radius*radius*PI;
        System.out.println("Площадь круга:" + area);


    }

}

