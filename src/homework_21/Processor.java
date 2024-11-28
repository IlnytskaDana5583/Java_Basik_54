package homework_21;

public class Processor extends Component{
    private double frequenz;

    public Processor(String brand, String model, double frequenz) {
        super(brand, model);
        this.frequenz = frequenz;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "frequenz=" + frequenz +
                '}';
    }

    public double getFrequenz() {
        return frequenz;
    }

    public void setFrequenz(double frequenz) {
        this.frequenz = frequenz;
    }
}
