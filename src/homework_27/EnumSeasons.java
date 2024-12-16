package homework_27;
/*Task 1
Реализуйте Enum для определения четырех времен года с методами,
 возвращающими среднюю температуру для каждого времени года.
*/

public enum EnumSeasons {
    WINTER(5),
    SPRING(15),
    SUMMER(27),
    AUTUMN(18);

    private int averageT;

    public String test() {
        return String.format("%s - средняя температура:%d",
        this.name(),this.averageT);
    }


    EnumSeasons(int averageT) {
        this.averageT = averageT;
    }

    public int getAverageT() {
        return averageT;
    }

    public void setAverageT(int averageT) {
        this.averageT = averageT;
    }
}