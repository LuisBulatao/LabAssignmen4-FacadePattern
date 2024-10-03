import Concrete.*;
import Facade.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        FrontDesk helper = new FrontDesk();

        boolean stopper = false;

        do {
            System.out.println("1. Request Vehicle Park");
            System.out.println("2. Request Clean Room");
            System.out.println("3. Request Luggage Carts");
            System.out.println("4. Exit");

            System.out.print("Please Choose a Number: ");
            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter plate number to park/pick-up your car: ");
                    String plateNumber = scan.nextLine();
                    helper.pickUpVehicle(plateNumber);
                    break;
                case 2:
                    System.out.print("Enter room number to clean your room: ");
                    int roomNumber = scan.nextInt();
                    helper.cleanRoom(roomNumber);
                    break;
                case 3:
                    System.out.print("Enter how many luggage you have to request a cart: ");
                    int luggage = scan.nextInt();
                    helper.requestCart(luggage);
                    break;
                case 4:
                    stopper = true;
                    System.out.println("Thank you! Let me help again if you have a request!.");
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Please choose between 1-3");
            }

            if (!stopper) {
                System.out.println("Do you want to request another? (yes/no): ");
                String continueLoop = scan.next();
                stopper = continueLoop.equalsIgnoreCase("no");
            }

        } while (!stopper);
        scan.close();
    }
}
