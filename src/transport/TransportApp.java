package transport;

public class TransportApp {
    public static void main(String[] args) {
        Bus  bus = new Bus("Bus-X1",2021,10);
        System.out.println(bus.toString());

        bus.start();
        bus.stop();

        System.out.println("bus.getModel():" + bus.getModel());
        System.out.println("bus.getCapacity():" + bus.getCapacity());

        System.out.println("\n=======================\n");

        Train train = new Train("Train",2024,4,15);

        System.out.println(train.toString());
        System.out.println(train.getModel());
        System.out.println(train.getYear());



        System.out.println("train capacity:" + train.getCapacity());
        train.getCountWagons();
        System.out.println("train capacity:" + train.getCapacity());
        train.getCountWagons();
        System.out.println("train capacity:" + train.getCapacity());

        System.out.println("\n=========================\n");


        Bus bus1 = new Bus("Bus -B2",2024,3);
        System.out.println(bus1.takePassengers());
        System.out.println("2.===================");
        System.out.println(bus1.takePassengers());
        System.out.println("3.==================");
        System.out.println(bus1.takePassengers());
        System.out.println("4.===================");
        System.out.println(bus1.takePassengers());

        System.out.println("count:" + bus1.getCountPassengers());

        System.out.println(bus1.dropPassengers());

        System.out.println("1." + bus1.dropPassengers());
        System.out.println("2." + bus1.dropPassengers());
        System.out.println("3." + bus1.dropPassengers());
        System.out.println("4." + bus1.dropPassengers());
        System.out.println("count:" + bus1.getCountPassengers());


        System.out.println("\n=========================\n");


    }
}
