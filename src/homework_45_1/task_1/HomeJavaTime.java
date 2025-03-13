package homework_45_1.task_1;
/*Получить и вывести на экран:
текущую дату
текущий год, месяц и день
Создать дату, например Ваш день рождения и вывести на экран
Создать две даты и проверить на равенство
Получить и вывести на экран:
текущее время
текущее время + 3 часа
Создать дату:
которая на неделю позже сегодняшней
которая была на год раньше сегодняшней используя метод minus
которая на год позже сегодняшней
tomorrow и yesterday и проверить находятся ли они до или после сегодняшней


 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class HomeJavaTime {
    public static void main(String[] args) {

        LocalDate datenow = LocalDate.now();
        System.out.println("текущая дата:" +datenow);
        System.out.println("год:" + datenow.getYear());
        System.out.println("месяц:" + datenow.getMonth());
        System.out.println("день:" + datenow.getDayOfMonth());

        //создать дату
        LocalDate mydate = LocalDate.of(1983,5,5);
        System.out.println("Дата рождения:" + mydate);

        //на равенство
        LocalDate date1 = LocalDate.of(2025,5,5);
        LocalDate date2 = LocalDate.of(2024,5,5);
        System.out.println("Даты равны:" + date1.equals(date2));

        //текущее время
        LocalTime time = LocalTime.now();
        System.out.println("текущее время:" + time);
        System.out.println("текущее время + 3 часа:" + time.plusHours(3));

        //дата на неделю позже
        LocalDate weekLater = datenow.plusWeeks(1);
        System.out.println("дата через неделю:" + weekLater);

        //на год раньше чем сегоднешняя
        LocalDate yearBefore = datenow.minusYears(1);
        System.out.println("год назад от текущей даты:" + yearBefore);

        //на год позже сегодняшней
        LocalDate yearLater = datenow.plusYears(1);
        System.out.println("через год от текущей:" + yearLater);

        //Завтра и вчера
        LocalDate tomorrow = datenow.plusDays(1);
        LocalDate yesterday = datenow.minusDays(1);

        System.out.println("Завтра:" + tomorrow);
        System.out.println("Вчера:" + yesterday);

        boolean isAfter = tomorrow.isAfter(datenow);
        boolean isBefore = yesterday.isBefore(datenow);
        System.out.println("завтра после сегодня:" + isAfter);
        System.out.println("вчера до сегодня:" + isBefore);











    }
}
