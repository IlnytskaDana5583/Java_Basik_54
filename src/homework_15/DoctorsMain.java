package homework_15;

public class DoctorsMain {
    public static void main(String[] args) {

       Doctors doctors = new Doctors();


       doctors.treat();
       doctors.recipes();
       doctors.recommends();


     String doctorName = doctors.name;
        System.out.println("Имя доктора:" +doctorName);

        int doctorAge = doctors.age;
        System.out.println("Возвраст:" + doctorAge);

        System.out.println("=======================");


        Doctors doctors1 = new Doctors("Max");
        doctors1.recipes();

        System.out.println(doctors1.name);
        System.out.println(doctors1.age);
        System.out.println("================");
        doctors1.info();

        System.out.println("\n=============\n");

        Doctors doctors2 =new Doctors(" Peter ", "Zahnarzt");
        doctors2.info();

       System.out.println("\n==================\n");

       Doctors doctors3 = new Doctors("Markus", "Zahnarzt" ,45);
       doctors3.info();













    }
}
