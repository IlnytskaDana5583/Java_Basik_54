package homework_20;

public class Apple extends Fruits{
    public  String sort;
    public  int year;

    public Apple(String name, int quantity, String sort, int year) {
        super(name, quantity);
        this.sort = sort;
        this.year = year;
    }
    public  void toSell() {
        System.out.println("Продажа:" + name);
    }

    public void toExport() {
        System.out.println("Закупка:" + name);
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
