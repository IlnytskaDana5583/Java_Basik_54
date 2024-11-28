package transport;

public class Bus extends  Vehicle {

    //А     В - наследуеться от класса В
    //
    private int capacity;//вместимость
    private int countPassengers;//кол во пассажиров

    public Bus(String model, int year, int capacity) {
        super(model, year);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    //взять на борт одного пассажира
    public boolean takePassengers() {
        //проверка.есть ли свободное место
        if (countPassengers < capacity) {
            countPassengers++;
            System.out.println("Пассажир зашел в автобус:" + model);
            return true;
        }
        //по сути пишу блок else
        System.out.printf("В автбусе %s боьше нет мест.Сейчас %d пассажиров\n",
                this.getModel(), countPassengers);
        return false;
    }

    //высадка пассажиров
    public boolean dropPassengers() {
        if (countPassengers > 0) {
            countPassengers--;
            System.out.println("Пассажир вышел из автобуса:" + model);
            return true;
        }
        System.out.printf("В автобусе больше нет пассажиров\n", model);
        return false;


    }

}
