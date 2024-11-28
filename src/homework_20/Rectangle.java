package homework_20;


public  class Rectangle extends Shape {

    public double width;
    public double height;


   public Rectangle(String name,double width,double height) {
       super(name);
       this.width = width;
       this.height = height;
   }
   public void setDimension(double width,double height) {
       this.width = width;
       this.height = height;
       calculateArea();

   }

    public void calculateArea() {
       double area  = width * height;
        System.out.println( "Площадь прямоугольника:" + area);


    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}










