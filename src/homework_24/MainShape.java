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

        Shape[] shapes = new Shape[] {rectangle, triangle, circle};


        for (int i = 0; i < shapes.length; i++) {
            shapes[i].result();

            System.out.println("" + shapes);





            }


        }




        }


