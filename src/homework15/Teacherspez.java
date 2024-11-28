package homework15;

public class Teacherspez {
    public static void main(String[] args) {

        Teacher  teacher = new Teacher();



        String teacherName = teacher.name;

        String teacherPredmet = teacher.predmet;

        int experienceAge = teacher.experience;

        Teacher teacher1 = new Teacher("Peter","Математику",5);
        teacher1.info();

        Teacher teacher2 = new Teacher(" Maksimilian","Deusch",10);
        teacher2.info();


    }
}
