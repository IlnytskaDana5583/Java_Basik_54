package homework_25;

/*//Laptop (подкласс Gadget):
Реализуйте метод diagnose() (например, проверка состояния жесткого диска и системы охлаждения).
Дополните метод repair() с учетом ремонта ноутбука (например, "Замена кулера завершена").

 */

public class Laptop extends Gadget{
    public Laptop(String ownerName, String model, double repairCost) {
        super(ownerName, model, repairCost);
    }

    @Override
    public void diagnose() {
        System.out.println("проверка состояния жесткого диска:" + model);

    }

    @Override
    public void repair() {
        System.out.println("замена кулера завершена:" + model);

    }
}
