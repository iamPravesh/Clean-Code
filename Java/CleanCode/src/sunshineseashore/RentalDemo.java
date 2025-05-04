package sunshineseashore;

import java.util.Scanner;

public class RentalDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rental rental1 = getRentalFromUser(scanner, 1);
        Rental rental2 = getRentalFromUser(scanner, 2);
        Rental rental3 = getRentalFromUser(scanner, 3);

        displayRentalDetails(rental1, 1);
        displayRentalDetails(rental2, 2);
        displayRentalDetails(rental3, 3);

        Rental longerRental1 = getLongerRental(rental1, rental2);
        displayLongerRental(longerRental1, "Rental 1", "Rental 2");

        Rental longerRental2 = getLongerRental(rental1, rental3);
        displayLongerRental(longerRental2, "Rental 1", "Rental 3");

        Rental longerRental3 = getLongerRental(rental2, rental3);
        displayLongerRental(longerRental3, "Rental 2", "Rental 3");
    }

    public static Rental getRentalFromUser(Scanner scanner, int rentalNumber) {
        System.out.println("Enter rental details for Rental " + rentalNumber + ":");
        System.out.print("Enter hours: ");
        int hours = scanner.nextInt();
        System.out.print("Enter minutes: ");
        int minutes = scanner.nextInt();
        return new Rental(hours, minutes);
    }

    public static void displayRentalDetails(Rental rental, int rentalNumber) {
        System.out.println("\nRental " + rentalNumber + " Details:");
        System.out.println("Time: " + rental.getTimeAsString());
        System.out.println("Total Price: $" + rental.getPrice());
    }

    public static Rental getLongerRental(Rental rental1, Rental rental2) {
        return rental1.getTotalTimeInMinutes() >= rental2.getTotalTimeInMinutes() ? rental1 : rental2;
    }

    public static void displayLongerRental(Rental longerRental, String rental1Name, String rental2Name) {
        System.out.println("\nThe longer rental between " + rental1Name + " and " + rental2Name + " is:");
        System.out.println("Time: " + longerRental.getTimeAsString());
        System.out.println("Total Price: $" + longerRental.getPrice());
    }
}
