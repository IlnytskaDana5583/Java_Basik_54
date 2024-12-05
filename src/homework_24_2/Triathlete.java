package homework_24_2;
//Создайте интерфейсы Swimmer и Runner с методами swim() и run() соответственно.
//Реализуйте класс Triathlete, который будет реализовывать оба интерфейса.
//Убедитесь, что класс Triathlete корректно выполняет действия, связанные с бегом и плаванием.

public class Triathlete implements Swimmer,Runner{


    @Override
    public void run() {
        System.out.println("Triathlet is  running");

    }

    @Override
    public void swim() {

        System.out.println("Triathlet is swimming");

    }

    public void  bycic() {
        System.out.println("Ride a bicycle");

    }
}
