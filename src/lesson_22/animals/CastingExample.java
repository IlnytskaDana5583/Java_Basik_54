package lesson_22.animals;

public class CastingExample {
    public static void main(String[] args) {
        //Восходящее и нисходящее преобразование
        //Восходящее -возможность присвоить переменнной типа предка ссылку на обьект потомка

        Cat cat = new Cat();
        Animal animal = cat;//Восходящее преобразование
        Animal animal1 = new Cat();//тип обьекта Cat автоматически преобразуется к типу Animal
        //Восх.преоб.безопасное,т.к.у родительского класса гарантировано
        //есть все методы родительского класса

        animal1.voice();


        System.out.println("\n=======================\n");
        Animal animal2 = new Dog();//неявное автоматическое преобразование
        Animal animal3 = new Hamster();

        Animal[] animals = new Animal[3];
        animals[0] = animal1;
        animals[1] = animal2;
        animals[2] = animal3;

        for (int i = 0; i < animals.length; i++) {
            animals[i].voice();
        }

        System.out.println("\n==============DownCasting===========\n");

        Cat catLink;

        Animal animalLink = new Cat();
        //animalLink.eat() на ссілке типа Animal метод eat() из класса Cat недоступен к вызову
        //animalLink.eat();не доступен
        catLink = (Cat) animalLink;//нисходщее явное преобразование типа ссылки. Не является безопасным
        catLink.eat();

        // double y = 10.50
        // int x = (int) y

        for (int i = 0; i < animals.length; i++) {
            Animal current = animals[i];
            System.out.println("sout: " + current);

            //getClass получить тип обьекта // .getSimpleName()
            System.out.println("getClass:" + current.getClass());
            //// instanceof - проверить, является ли объект экземпляром нужного подкласса
            // можно ли преобразовать объект к типу ссылки
            // можно ли присвоить ссылку на объект в переменную типа Cat
            if (animals[i] instanceof Cat) {
                System.out.println(i + "-й индекс можно безопасно привести к Cat");
                Cat tempCat = (Cat) animals[i]; // Не безопасное преобразование
                tempCat.eat();
            }

            System.out.println("=============\n");


        }


    }
}
