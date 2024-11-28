package homework_20;

public class Fruits {
    public String name;
    public int quantity;

    public Fruits(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void toBuy() {
        System.out.println("Импортировали:" + name +  quantity + "тонн");

    }
    public String toString() {
        return name  + quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

