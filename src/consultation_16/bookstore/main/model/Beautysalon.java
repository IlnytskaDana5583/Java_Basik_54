package consultation_16.bookstore.main.model;

public class Beautysalon {
    public static int id;
    private String servicename;
    private double price;
    private int duration;


    public Beautysalon(String servicename, double price, int duration) {
        this.id = id++;
        this.servicename = servicename;
        this.price = price;
        this.duration = duration;


    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Beautysalon.id = id;
    }

    public String getServicename() {
        return servicename;
    }

    public void setServicename(String servicename) {
        this.servicename = servicename;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}



