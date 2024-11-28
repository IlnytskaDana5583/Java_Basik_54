package homework15;

public class Teacher {
    String name;
    String predmet;
    int experience;

    public Teacher(String teacherName){
        name = teacherName;

    }
    public  Teacher(){

    }
    public Teacher(String teacherName,String predmet){
        name = teacherName;
        this.predmet = predmet;

    }
    public Teacher(String name,String predmet, int experience){
        this(name,predmet);
        this.experience = experience;
    }

    public void teach(){
        System.out.println("Я преподаю");
    }

    public void evaluate(){
        System.out.println("Я оцениваю");
    }

    public void info(){
        System.out.printf("Я учитель %s,преподаю %s, мой опыт %d лет\n", name, predmet,experience);
    }




    }

