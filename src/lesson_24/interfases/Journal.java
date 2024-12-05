package lesson_24.interfases;

public class Journal implements Printable {
    private String name;
    private int number;

    public Journal(String name, int number) {
        this.name = name;
        this.number = number;
    }
    @Override
    public void print() {
        System.out.println("Journal" + name + " # " +number) ;
    }


    @Override
    public void defaultMethod() {
        System.out.println("Default method from Journal");
        //специфика обращения к интефейсу в качестве "super"
        //Printable.super.defaultMethod();
    }
}
