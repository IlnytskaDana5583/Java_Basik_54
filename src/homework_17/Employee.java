package homework_17;
//Написать класс Employee(Работник)
//У него должны быть поля имя, возраст, зарплата
//Инкапсулировать класс.
//Написать метод info()выводящей информации о работнике.

public class Employee {
    private String name;
    private int age;
    private int salary;

    public Employee(String name,int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void info() {
        System.out.printf("I am %s, My Age %d, My Salary%d", name,age,salary);
    }


    }



