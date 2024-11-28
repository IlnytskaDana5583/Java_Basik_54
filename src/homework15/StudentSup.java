package homework15;

public class StudentSup {
    public static void main(String[] args) {
        Student student = new Student();

        student.rest();

        String studentName = student.name;

        String place = student.place;

        int age = student.age;


        Student student1 = new Student("Алекс","Университет",20);

        student1.info();

        System.out.println("====================================");

        Student student2 = new Student("Micha","College",18);
        student2.learn();
        student2.info();




    }
}
