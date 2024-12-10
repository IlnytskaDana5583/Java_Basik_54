package homework_25;

/*У всех гаджетов должны быть:

Поля:
ownerName — имя владельца гаджета.
model — модель устройства.
repairCost — стоимость ремонта.
Конструктор для инициализации этих полей.
Реализацию метода getRepairCost(), который возвращает значение поля repairCost.
*/

public abstract class Gadget implements Repairable {
    protected String ownerName;
    protected String model;
    protected double repairCost;

    public Gadget(String ownerName, String model, double repairCost) {
        this.ownerName = ownerName;
        this.model = model;
        this.repairCost = repairCost;
    }

    @Override
    public double getRepairCost() {
        return repairCost;
    }
}