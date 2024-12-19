package lesson_27.enums;

public class AutoApp {
    public static void main(String[] args) {

        Color red = Color.RED;
        Auto auto = new Auto("Model,", Color.BLUE);
        System.out.println(auto);




        auto.setColor(red);
        System.out.println(auto);

        System.out.println("\n==========================================\n");


        //возвращает массив значений
        Color[] colors = Color.values();//возвращает массив значений

        for (Color currentColor : colors) {
            System.out.println(currentColor);
        }
        System.out.println("\n========================================\n");
        //возвращает enum по строковому имени
        Color color1 = Color.valueOf("RED");
        System.out.println( "color1: " + color1);
        System.out.println("\nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\n");
        //получить имя константи(строку)
        String name = Color.GREEN.name();
        System.out.println("name:" + name.toLowerCase());

        //получить порядковий номер константи(начиная с нуля)
        int ordinal = Color.BLUE.ordinal();
        System.out.println("original:" + ordinal);

        System.out.println("\n=======================================\n");
        switch (auto.getColor()) {
            case RED:
                System.out.println("zvet krasnui");
                break;
            case BLUE:
                System.out.println("xvet goluboi");
                break;
            case GREEN:
                System.out.println("zvet zelenui");
            default:
                System.out.println("drugoi");
        }
        System.out.println("\n==========================================\n");
        //enum безопасно сравнивать на равенство оператором ==

                auto.setColor(Color.BLUE);
                if ( auto.getColor() == Color.BLUE) {
                    System.out.println("sunii");

                }
            else  {
                    System.out.println("ne sunui");
                }

        }


    }

