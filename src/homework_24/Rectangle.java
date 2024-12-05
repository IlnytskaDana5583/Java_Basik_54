package homework_24;

public class Rectangle extends Shape {
    public double width ;
    public double height ;
    public Rectangle() {

    }


    @Override
    public void result() {
        width  = 5.0;
        height = 3.0;
        double calculateR = width * height;
        double calculaterR1 = 2 *(width * height);




        System.out.println("площадь прямоугольника:" +calculateR);
        System.out.println("Периметр прямоугольника:" + calculaterR1);




    }

    @Override
    public void getArea() {

    }

    @Override
    public void getPerimeter() {

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}