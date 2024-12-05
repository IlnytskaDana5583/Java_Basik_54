package testhome;

public class Person {
    String name;
    String nachname;
    int age;
    double zrist;
    String prof;


    String getFullName(){
        return  name + " " + nachname;
    }
    String getFullInfo() {
        return getFullName() + "(вік: " + age + "; зріст: " + zrist + ")";
    }
}
