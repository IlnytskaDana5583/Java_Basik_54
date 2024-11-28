package homework15;

public class Doctor {
    String name;
    String describe;
    int experienceYears;

    public  Doctor(String doctorName){
        name = doctorName;
    }
    public Doctor(){

    }
    public Doctor(String doctorName,String describe){
        name = doctorName;
        this.describe = describe;
    }
    public Doctor(String name,String describe,int experienceYears){
        this(name,describe);
        this.experienceYears = experienceYears;

    }



    public void tread() {
        System.out.println("Я вылечиваю");
    }

    public void recommends() {
        System.out.println("Я даю рекоменации");
    }

    public void recipes() {
        System.out.println("Я выписываю рецепты");
    }
    public void info(){
        System.out.printf("Mein Name %s, Spezialist: %s, Meine Erfahrung: %d\n", name,describe,experienceYears);}



}




