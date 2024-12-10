package homework_25;
/*Реализуйте два класса:
//Smartphone (подкласс Gadget):
Реализуйте метод diagnose() (например, проверка экрана и батареи).
метод repair() с учетом особенностей ремонта смартфона (например, "Замена экрана завершена").
//Laptop (подкласс Gadget):
Реализуйте метод diagnose() (например, проверка состояния жесткого диска и системы охлаждения).
Дополните метод repair() с учетом ремонта ноутбука
 */

public class Smartphone extends Gadget{
    public Smartphone(String ownerName, String model, double repairCost) {
        super(ownerName, model, repairCost);
    }


    @Override
    public void diagnose() {
        System.out.println("проверка экрана и батареи:" + model);

    }

    @Override
    public void repair() {
        System.out.println("замена экрана завершена:" + model);

    }
}
