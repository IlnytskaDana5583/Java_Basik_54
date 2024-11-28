package homework_19;

//- базовые арифметические операции: сложение, вычитание, умножение и деление (сделано в прошлом ДЗ)
//- Вычисление длины окружности и площади круга по ее радиусу
//- Статические методы для каждой математической операции, принимающие два аргумента и возвращающие результат операции ((сделано в прошлом ДЗ))
//- Методы для вычисления длины окружности и площади круга, принимающий радиус и возвращающий результат.
//- Константу (число Пи)


public class CalculatorStatik_1 {
    public static final double PI = 3.14159;
    public static double radius;


    public static double
    sum(double a, double b) {
        return a + b;
    }

    public static double
    diff(double a, double b) {
        return a - b;
    }

    public static double
    prod(double a, double b) {
        return a * b;
    }

    public static double
    quot(double a, double b) {
        return a / b;
    }

    public static double
    circum(double radius) {
        return 2 * PI * radius;
    }

    public static double
    area(double radius) {
        return PI * radius * radius;


}




    }
















