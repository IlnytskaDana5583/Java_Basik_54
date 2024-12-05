package homework_24;

public class Triangle extends Shape {
    public double height;
    public double found;
    public Triangle() {

    }

    @Override
    public void result() {
        double height = 3.5;
        double found = 5.5;
        double calculaterR = (height * found)/2;
        double calculaterR1 = height + height + found;

        System.out.println("Площадь триугольника:" + calculaterR);
        System.out.println("Периметр триугольника:" + calculaterR1);

    }

    @Override
    public void getArea() {

    }

    @Override
    public void getPerimeter() {

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getFound() {
        return found;
    }

    public void setFound(double found) {
        this.found = found;
    }
}
