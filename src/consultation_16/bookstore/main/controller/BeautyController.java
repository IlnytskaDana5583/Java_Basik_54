package consultation_16.bookstore.main.controller;

import consultation_16.bookstore.main.model.Beautysalon;
import consultation_16.bookstore.main.repository.BeautyRepository;
import consultation_16.bookstore.main.service.BeautyService;

import java.util.ArrayList;
import java.util.Scanner;

public class BeautyController {
    private BeautyRepository beautyRepository;
    private BeautyService beautyService;

    public BeautyController() {
        beautyRepository = new BeautyRepository();
        beautyService = new BeautyService(beautyRepository);
    }

    public void doing() {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("1.Choose a service");
            System.out.println("2.Get info about the service");
            System.out.println("3.Delete service");
            System.out.println("4.Change service");
            System.out.println("5.Exit");


            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Choose a service...");
                    addBeautysalon(scanner);
                    break;

                case 2:
                    System.out.println("Get info about the service");
                    break;
                case 3:
                    System.out.println("Delete service");
                    break;
                case 4:
                    System.out.println("Change service");
                    break;
                case 5:
                    System.out.println("Exit");
                default:
                    System.out.println("Invalid choice.Please try again");

            }
        }
    }

    private void addBeautysalon(Scanner scanner) {

        System.out.println("Enter the servicename:");
        String servicename = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter price servicname");
        double price = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter duration service");
        int duration = scanner.nextInt();
        scanner.nextLine();

        Beautysalon beautysalon = new Beautysalon(servicename,125,90);
        beautyService.addServicename(beautysalon);
        System.out.println(beautysalon);



    }


    }


