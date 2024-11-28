package homework_20;

public class Pear extends Fruits {
    public int imp;

    public Pear(String name, int quantity, int imp) {
        super(name, quantity);
        this.imp = imp;
    }
    public  void toImp() {
        System.out.println("Експортировали:" + quantity + "тонн");
    }

    public int getImp() {
        return imp;
    }

    public void setImp(int imp) {
        this.imp = imp;
    }
}