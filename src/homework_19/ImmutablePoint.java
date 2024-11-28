package homework_19;

//•	Объявите final поля x и y типа int.
//•	Инициализируйте их через конструктор.
//•	Попытайтесь создать методы-сеттеры для изменения значений x и y.
//•	Объясните, почему значения полей не могут быть изменены после создания объекта.


public class ImmutablePoint {
    public final int x;
    public final int y;

    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //public  void setX(int x){
    //    this.x = x;
    }
    //Переменные отмеченны как final,поэтому даже программа не генерирует сеттеры,но даже если вручную вводить ,возикает ошибка

