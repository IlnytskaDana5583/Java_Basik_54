package homework_15;

public class
Doctors {

    String name;
    String which;
    int age;

    public Doctors(String doctorName){
        name = doctorName;
    }


    public Doctors(){

    }
    public Doctors(String doctorName,String which){
        name = doctorName;
        this.which = which;
    }

    public Doctors(String name,String which, int age){
        this.name = name;
        this.which = which;
        this.age = age;
    }

    public void treat() {
        System.out.println("Я вылечиваю");
    }

    public void recommends() {
        System.out.println("Я даю рекомендации");
    }

    public void recipes() {
        System.out.println("Я прописываю рецепты");

    }
    public void info(){
        System.out.printf("Я доктор %s,я врач %s, мой возраст:%d", name, which,age);
    }




}
