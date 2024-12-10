package homework_25;
/*
//Создайте класс Workshop, который выполняет:
Метод processRepair(Gadget gadget), который:
Проводит диагностику устройства.
Ремонтирует устройство.
Выводит информацию о завершении ремонта и его стоимости.
*/

public class Workshop {
    void  proceRepair(Gadget gadget){

        gadget.diagnose();
        gadget.repair();
        System.out.println("Клиент:" + gadget.ownerName );

        System.out.println(" цена ремонта:" + gadget.getRepairCost());

    }



}
