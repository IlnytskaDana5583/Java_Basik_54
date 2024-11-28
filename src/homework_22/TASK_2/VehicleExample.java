package homework_22.TASK_2;

public class VehicleExample {
    public static void main(String[] args) {

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Motorcycle motorcycle = new Motorcycle();

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = car;
        vehicles[1] = bicycle;
        vehicles[2] = motorcycle;

        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].startEngine();
        }
    }
}