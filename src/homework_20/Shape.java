package homework_20;
//Создайте программу, которая демонстрирует наследование с использованием классов геометрических фигур.
//Базовый класс Shape
//• Создайте класс Shape. • Добавьте поле name типа String, которое хранит название фигуры. • Создайте метод displayInfo(), который выводит на экран значение поля name.
//Класс Rectangle (Прямоугольник)
//• Создайте класс Rectangle, который наследуется от Shape. • Добавьте поля width и height типа double, которые хранят размеры прямоугольника. • Создайте метод setDimensions(double width, double height), который устанавливает значения полей width и height. • Создайте метод calculateArea(), который вычисляет и выводит площадь прямоугольника.
//Класс Circle (Круг)
//• Создайте класс Circle, который наследуется от Shape. • Добавьте поле radius типа double, которое хранит радиус круга. • Создайте метод setRadius(double radius), который устанавливает значение поля radius. • Создайте метод calculateArea(), который вычисляет и выводит площадь круга.
//Класс Main
//• В методе main создайте объекты классов Rectangle и Circle. • Установите значения для их полей с помощью соответствующих методов. • Установите имя фигуры, используя поле name, унаследованное от класса Shape. • Вызовите метод displayInfo() и методы вычисления площади для каждого объекта, чтобы вывести информацию о фигуре и ее площади
//•	Добавьте в класс Shape поле color типа String и метод setColor(String color).
//       •	Установите цвет для каждой фигуры и выведите эту информацию в методе displayInfo().



public class Shape {
    public String name;

    public Shape(String name) {
        this.name = name;
    }
    public void displayInfo() {
        System.out.println( "Название фигуры:" + name);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}