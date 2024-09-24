import Concrete.*;
import Facade.HomeInterface;
import Interface.HomeService;

import java.util.Scanner;

public class HomeApp {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        HomeInterface homeInterface = new HomeInterface();


        boolean toRun = true;

        while (toRun) {
            System.out.println("\nSelect option");
            System.out.println("[1] Turn On All");
            System.out.println("[2] Turn Of All");
            System.out.println("[3] Exit");
            System.out.print("Select an Option: ");
            Integer option = obj.nextInt();
            System.out.println();
            switch (option) {
                case 1:
                    homeInterface.turnOnAll();
                    break;
                case 2:
                    homeInterface.turnOffAll();
                    break;
                case 3:
                    System.out.println("Exit");
                    toRun = false;
                    break;
                default:
                    System.out.println("Invalid Option");
                    toRun = false;
                    break;
            }
        }


    }
}