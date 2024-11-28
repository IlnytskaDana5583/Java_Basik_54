package homework15;

public class Doctorspez {
    public static void main(String[] args) {

        Doctor doctor = new Doctor();

        String doctorName = doctor.name;
        String docdescreib = doctor.describe;


        System.out.println("============");

        Doctor doctor1 = new Doctor(" Doctor Schmidt","Zahnarzt",23);
        doctor1.tread();
        doctor1.recommends();
        doctor1.info();

        System.out.println("============");

        Doctor doctor2 = new Doctor("Doctor Paul","HNO",25);
        doctor2.recipes();
        doctor2.recommends();

        doctor2.info();

        System.out.println("======================");

        Doctor doctor3 = new Doctor("Doctor Fix","Hausarzt",30);
        doctor3.tread();
        doctor3.recipes();

        doctor3.info();













    }

}
