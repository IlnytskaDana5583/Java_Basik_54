package homework_25;

public class GadgetApp {
    public static void main(String[] args) {

        Smartphone smartphone = new Smartphone("Peter","Samsung S12",125);
        Laptop laptop = new Laptop("Alex","Lenovo 490",200);

        Workshop workshop = new Workshop();
        workshop.proceRepair(smartphone);
        workshop.proceRepair(laptop);


    }
}
