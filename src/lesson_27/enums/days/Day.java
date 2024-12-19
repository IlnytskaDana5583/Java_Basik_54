package lesson_27.enums.days;

public enum Day {
    MODAY("ponedelnuk",1),
    TUESDAY("vtornik",2),
    WEDNESDAY("sreda",3),
    THURSDAY("cetverg",4),
    FRIDAY("pjtnica",5),
    SATURDAY("subbota",6),
    SUNDAY("voskresenie",7);

    private String russianName;
    private  int dayNumber;

    public  String testMethod() {
        return  String.format("%s -русский перевод: %s; номер дня недели: %d " ,
                this.name(),this.russianName,this.dayNumber);
    }


    Day(String russianName, int dayNumber) {
        this.russianName = russianName;
        this.dayNumber = dayNumber;

    }
    //конструктор может быть перегружен
    Day(String russianName) {
        this.russianName = russianName;
        this.dayNumber = 7;



    }


    public String getRussianName() {
        return russianName;
    }

    public void setRussianName(String russianName) {
        this.russianName = russianName;
    }

    public int getDayNumber() {
        return dayNumber;
    }

    public void setDayNumber(int dayNumber) {
        this.dayNumber = dayNumber;
    }
}


