package homework_27;

public class EnumSeaApp {

    public static void main(String[] args) {



        for (EnumSeasons enumSeasons : EnumSeasons.values()) {
            System.out.println("season:" + enumSeasons);
            System.out.println("average temperature:" + enumSeasons.getAverageT());
            System.out.println(enumSeasons.test());
            System.out.println("\n=====================================\n");


        }
    }
}
