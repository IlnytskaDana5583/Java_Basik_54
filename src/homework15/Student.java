package homework15;

public class Student {
    String name;
    String place;
    int age;

    public Student(String studentName){
        name = studentName;
    }
    public  Student(){

    }
    public Student(String studentName,String place){
        name = studentName;
        this.place = place;
    }
    public  Student(String name,String place,int age){
        this(name,place);
        this.age = age;

    }

    public void learn(){
        System.out.println("Я учусь");
    }
    public void rest(){
        System.out.println("Я отдыхаю");
    }

    public  void info(){
        System.out.printf("Я студент %s,место учебы %s, мой возраст %d лет\n", name,place,age);
    }

}
