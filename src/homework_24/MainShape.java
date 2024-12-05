package homework_24;

public class MainShape {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.result();


        Triangle triangle = new Triangle();
        triangle.result();

        Circle circle = new Circle();
        circle.result();

        System.out.println("\n================================\n");


        Shape[] shapes = new Shape[] {new Rectangle(),new Triangle(), new Circle()};


        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Schape" + i + ":" );





        }


    }
}









