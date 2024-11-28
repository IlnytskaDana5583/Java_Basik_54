package homework_21;

public class Demonstration {
    public static void main(String[] args) {
        Processor processor = new Processor("YOP","GAT",1500);
        Memory memory = new Memory("TPO","M-5",14);
        Storage storage = new Storage("ROX","T-7",24);

        System.out.println(processor);
        System.out.println(memory);
        System.out.println(storage);
        Computer computer = new Computer(processor,memory,storage);
        System.out.println(computer );
        processor.getBrand();


    }
}
