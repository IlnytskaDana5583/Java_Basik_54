package lesson_24.interfases.flyers;

public abstract class Transport {
    int capacity;

    public Transport(int capacity) {
        this.capacity = capacity;
    }

    abstract void takePassenger();
    public  int countPassengers() {
        return capacity;
    }
}
